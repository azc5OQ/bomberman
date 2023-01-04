package bomberman;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

import bomberman.enums.GameLevelType;

public class GameWindow extends Application {

    private Scene scene;
    private Pane root;
    private Canvas gameCanvas;
    private Game game;

    public void init(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.root = new Pane();
        this.scene = new Scene(this.root);

        primaryStage.setScene(this.scene);
        primaryStage.setResizable(false);
        primaryStage.setWidth(668);
        primaryStage.setHeight(708);
        primaryStage.show();

        WindowOnCloseHandler windowOnCloseHandler = new WindowOnCloseHandler();
        primaryStage.setOnCloseRequest(windowOnCloseHandler);

        this.game = new Game();

        KeyPressedEventHandler keyPressedEventHandler = new KeyPressedEventHandler(this.game, this);
        KeyReleasedEventHandler keyReleasedEventHandler = new KeyReleasedEventHandler(this.game);

        this.scene.addEventHandler(KeyEvent.KEY_PRESSED, keyPressedEventHandler);
        this.scene.addEventHandler(KeyEvent.KEY_RELEASED, keyReleasedEventHandler);

        this.chooseLevel();
    }

    public void chooseNumberOfPlayers() {
        this.root.getChildren().clear();

        Label playerCountLabel = new Label("player count");

        playerCountLabel.setLayoutX(this.scene.getWidth() / 2);
        playerCountLabel.setLayoutY(this.scene.getHeight() / 2 - 100);

        Button twoPlayersButton = new Button("2 players");
        Button threePlayersButton = new Button("3 players");
        Button fourPlayersButton = new Button("4 players");

        twoPlayersButton.setLayoutX(this.scene.getWidth() / 2);
        threePlayersButton.setLayoutX(this.scene.getWidth() / 2);
        fourPlayersButton.setLayoutX(this.scene.getWidth() / 2);
        twoPlayersButton.setLayoutY(this.scene.getHeight() / 2);
        threePlayersButton.setLayoutY(this.scene.getHeight() / 2 + 50);
        fourPlayersButton.setLayoutY(this.scene.getHeight() / 2 + 100);

        ChoosePlayerButtonCountOnClick twoPlayersButtonOnClick = new ChoosePlayerButtonCountOnClick(this, 2);
        ChoosePlayerButtonCountOnClick threePlayersButtonOnClick = new ChoosePlayerButtonCountOnClick(this, 3);
        ChoosePlayerButtonCountOnClick fourPlayersButtonOnClick = new ChoosePlayerButtonCountOnClick(this, 4);

        twoPlayersButton.setOnAction(twoPlayersButtonOnClick);
        threePlayersButton.setOnAction(threePlayersButtonOnClick);
        fourPlayersButton.setOnAction(fourPlayersButtonOnClick);

        this.root.getChildren().addAll(playerCountLabel, twoPlayersButton, threePlayersButton, fourPlayersButton);
    }

    public void chooseLevel() {
        this.root.getChildren().clear();

        Label chooseLevelLabel = new Label("choose level");

        chooseLevelLabel.setLayoutX(this.scene.getWidth() / 2);
        chooseLevelLabel.setLayoutY(this.scene.getHeight() / 2 - 100);

        Button buttonClassicLevel = new Button("classic");
        Button buttonWaterLevel = new Button("water");

        buttonClassicLevel.setLayoutX(this.scene.getWidth() / 2);
        buttonWaterLevel.setLayoutX(this.scene.getWidth() / 2);
        buttonClassicLevel.setLayoutY(this.scene.getHeight() / 2);
        buttonWaterLevel.setLayoutY(this.scene.getHeight() / 2 + 50);

        ChooseLevelButtonOnClick chooseLevelButtonOnClickOnClick1 = new ChooseLevelButtonOnClick(this, this.game, GameLevelType.CLASSIC);
        ChooseLevelButtonOnClick chooseLevelButtonOnClickOnClick2 = new ChooseLevelButtonOnClick(this, this.game, GameLevelType.WATER);

        buttonClassicLevel.setOnAction(chooseLevelButtonOnClickOnClick1);
        buttonWaterLevel.setOnAction(chooseLevelButtonOnClickOnClick2);

        this.root.getChildren().addAll(chooseLevelLabel, buttonClassicLevel, buttonWaterLevel);
    }

    public void startGame(int numberOfPlayers) {
        this.root.getChildren().clear();

        this.game.setNumberOfPlayers(numberOfPlayers);

        this.gameCanvas = new Canvas();
        this.gameCanvas.setWidth(608);
        this.gameCanvas.setHeight(608);
        this.gameCanvas.setLayoutX(20);
        this.gameCanvas.setLayoutY(20);
        this.root.getChildren().add(this.gameCanvas);

        this.game.setArenaWidth((int)(this.gameCanvas.getWidth()));
        this.game.setArenaHeight((int)this.gameCanvas.getHeight());

        this.game.setGraphicsContext(this.gameCanvas.getGraphicsContext2D());
        this.game.createPlayers(numberOfPlayers);
        this.game.startGame();
    }

    private class KeyPressedEventHandler implements EventHandler<KeyEvent> {
        private Game game;
        private GameWindow gameWindow;
        KeyPressedEventHandler(Game game, GameWindow gameWindow) {
            this.game = game;
            this.gameWindow = gameWindow;
        }

        @Override
        public void handle(KeyEvent event) {
            if (this.game.isGameRunning()) {
                if (event.getCode() == KeyCode.P) {
                    this.game.setPaused(!this.game.isPaused());
                }
                this.game.handleKeyPressed(event);
            } else {
                if (event.getCode() == KeyCode.TAB) {
                    this.game.reset();
                    this.gameWindow.chooseLevel();
                }
            }
        }
    }

    private class KeyReleasedEventHandler implements EventHandler<KeyEvent> {
        private Game game;
        KeyReleasedEventHandler(Game game) {
            this.game = game;
        }

        @Override
        public void handle(KeyEvent event) {
            this.game.handleKeyReleased(event);
        }
    }

    private class WindowOnCloseHandler implements EventHandler<WindowEvent> {

        @Override
        public void handle(WindowEvent t) {
            Platform.exit();
            System.exit(0);
        }
    }

    private class ChooseLevelButtonOnClick implements EventHandler<ActionEvent> {

        private Game game;
        private GameLevelType levelType;
        private GameWindow gameWindow;

        ChooseLevelButtonOnClick(GameWindow gameWindow, Game game, GameLevelType levelType) {
            this.game = game;
            this.levelType = levelType;
            this.gameWindow = gameWindow;
        }

        @Override
        public void handle(ActionEvent t) {
            this.game.setLevel(this.levelType);
            this.gameWindow.chooseNumberOfPlayers();
        }
    }

    private class ChoosePlayerButtonCountOnClick implements EventHandler<ActionEvent> {

        private GameWindow gameWindow;
        private int numberOfPlayers;

        ChoosePlayerButtonCountOnClick(GameWindow gameWindow, int numberOfPlayers) {
            this.gameWindow = gameWindow;
            this.numberOfPlayers = numberOfPlayers;
        }

        @Override
        public void handle(ActionEvent t) {
            this.gameWindow.startGame(this.numberOfPlayers);
        }
    }
}