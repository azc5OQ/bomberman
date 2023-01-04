package bomberman;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import bomberman.enums.GameLevelType;
import bomberman.enums.PlayerColor;
import bomberman.enums.PlayerState;
import bomberman.objects.Bomb;
import bomberman.objects.Player;

public class Game {

    private int numberOfPlayers;
    private int arenaWidth;
    private int arenaHeight;
    private int playersAlive;
    private Engine engine;
    private GraphicsContext graphicsContext;
    private ArrayList<Player> players;
    private ArrayList<Bomb> bombs;
    private Player winner;
    private boolean isGameRunning;
    private GameAnimationTimer gameAnimationTimer;
    private long gameTick = 0;
    private GridManager gridManager;
    private LevelManager levelManager;
    private boolean isPaused;

    public Game() {
        this.gameAnimationTimer = new GameAnimationTimer(this);
        this.bombs = new ArrayList<Bomb>();
        this.players = new ArrayList<Player>();
        this.gridManager = new GridManager();
        this.levelManager = new LevelManager(this.gridManager);
        this.engine = new Engine(this, this.gridManager, this.levelManager);
    }

    public void reset() {
        this.players.clear();
        this.bombs.clear();
        this.winner = null;
        this.gridManager.getGrids().clear();
        this.gameAnimationTimer.stop();
    }

    public long getGameTick() {
        return this.gameTick;
    }

    public void setGraphicsContext(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setArenaWidth(int arenaWidth) {
        this.arenaWidth = arenaWidth;
    }

    public void setArenaHeight(int arenaHeight) {
        this.arenaHeight = arenaHeight;
    }

    public boolean isGameRunning() {
        return this.isGameRunning;
    }

    public void setGameRunning(boolean gameRunning) {
        this.isGameRunning = gameRunning;
    }

    public int getPlayersAlive() {
        return this.playersAlive;
    }

    public void setPlayersAlive(int playersAlive) {
        this.playersAlive = playersAlive;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void createPlayers(int numberOfPlayers) {
        this.playersAlive = numberOfPlayers;
        Player player1 = new Player();
        player1.setPositionX(32);
        player1.setPositionY(32);
        player1.setWidth(34);
        player1.setHeight(44);
        player1.setPlantBombKey(KeyCode.ENTER);
        player1.setKeyRight(KeyCode.RIGHT);
        player1.setKeyDown(KeyCode.DOWN);
        player1.setKeyUp(KeyCode.UP);
        player1.setKeyLeft(KeyCode.LEFT);
        player1.setColor(PlayerColor.WHITE);
        player1.setDrawingOrder(1);
        player1.setCalculationWidth(28);
        player1.setCalculationHeight(28);
        this.players.add(player1);

        Player player2 = new Player();
        player2.setPositionX(544);
        player2.setPositionY(32);
        player2.setWidth(34);
        player2.setHeight(44);
        player2.setPlantBombKey(KeyCode.Q);
        player2.setKeyRight(KeyCode.D);
        player2.setKeyDown(KeyCode.S);
        player2.setKeyUp(KeyCode.W);
        player2.setKeyLeft(KeyCode.A);
        player2.setColor(PlayerColor.BLUE);
        player2.setDrawingOrder(2);
        player2.setCalculationWidth(28);
        player2.setCalculationHeight(28);
        this.players.add(player2);

        if (numberOfPlayers > 2) {
            Player player3 = new Player();
            player3.setPositionX(32);
            player3.setPositionY(524);
            player3.setWidth(34);
            player3.setHeight(44);
            player3.setPlantBombKey(KeyCode.U);
            player3.setKeyRight(KeyCode.L);
            player3.setKeyDown(KeyCode.K);
            player3.setKeyUp(KeyCode.I);
            player3.setKeyLeft(KeyCode.J);
            player3.setColor(PlayerColor.GREEN);
            player3.setDrawingOrder(3);
            player3.setCalculationWidth(28);
            player3.setCalculationHeight(28);
            this.players.add(player3);
        }

        if (numberOfPlayers > 3) {
            Player player4 = new Player();
            player4.setPositionX(544);
            player4.setPositionY(524);
            player4.setWidth(34);
            player4.setHeight(44);
            player4.setPlantBombKey(KeyCode.R);
            player4.setKeyRight(KeyCode.H);
            player4.setKeyDown(KeyCode.G);
            player4.setKeyUp(KeyCode.T);
            player4.setKeyLeft(KeyCode.F);
            player4.setPlayerState(PlayerState.ALIVE);
            player4.setColor(PlayerColor.YELLOW);
            player4.setDrawingOrder(4);
            player4.setCalculationWidth(28);
            player4.setCalculationHeight(28);
            this.players.add(player4);
        }
    }

    public void handleKeyPressed(KeyEvent event) {
        this.engine.handleKeyPressed(event, this.players);
    }

    public void handleKeyReleased(KeyEvent event) {
        this.engine.handleKeyReleased(event, this.players);
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public void setPaused(boolean paused) {
        this.isPaused = paused;
    }

    public void startGame() {
        this.isGameRunning = true;
        this.gameAnimationTimer.start();
    }

    private void updateObjects() {
        this.engine.updatePlayers(this.players, this.bombs);
        this.engine.updateBombs(this.bombs, this.players);
        this.engine.updateBreakableWalls();
    }

    private void drawObjects() {
        this.graphicsContext.clearRect(0, 0, 620, 620);
        this.engine.drawGround(this.graphicsContext);
        this.engine.drawWalls(this.graphicsContext);
        this.engine.drawBreakableWalls(this.graphicsContext);
        this.engine.drawBombs(this.graphicsContext, this.bombs);
        this.engine.drawArenaBorders(this.graphicsContext);
        this.engine.drawPlayers(this, this.graphicsContext, this.players);
    }

    public void setLevel(GameLevelType levelType) {
        this.engine.setLevelType(levelType);
    }

    private class GameAnimationTimer extends AnimationTimer {
        private Game game;
        private long previousTimestamp;

        GameAnimationTimer(Game game) {
            this.game = game;
        }

        @Override
        public void handle(long timestamp) { //nanosekundy
            if ((this.previousTimestamp + 16666666) > timestamp) {
                return; //60fps
            }

            if (this.game.isPaused()) {
                Font font = new Font("Consolas", 50);
                this.game.graphicsContext.setFont(font);
                this.game.graphicsContext.setFill(Color.BLACK);
                this.game.graphicsContext.fillText("game paused", this.game.arenaWidth / 2 - 120, this.game.arenaHeight / 2, 450);

                return;
            }

            if (this.game.isGameRunning) {
                this.previousTimestamp = timestamp;
                this.game.updateObjects();
                this.game.drawObjects();
                this.game.gameTick++;

                if (this.game.gameTick == Long.MAX_VALUE) {
                    this.game.gameTick = 0;
                }
            } else {
                Font font = new Font("Consolas", 40);
                this.game.graphicsContext.setFont(font);
                this.game.graphicsContext.setFill(Color.BLACK);
                this.game.graphicsContext.fillText("game over", this.game.arenaWidth / 2 - 100, this.game.arenaHeight / 2, 450);

                if (this.game.winner != null) {
                    this.game.graphicsContext.fillText(this.game.winner.getColor().toString() + " player is winner ", this.game.arenaWidth / 2 - 250, this.game.arenaHeight / 2 + 50, 550);
                }
            }
        }
    }
}
