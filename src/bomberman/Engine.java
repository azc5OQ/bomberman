package bomberman;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import bomberman.enums.PlayerState;
import bomberman.enums.GridType;
import bomberman.enums.PlayerColor;
import bomberman.enums.ItemType;
import bomberman.enums.GameLevelType;
import bomberman.enums.MovementDirection;

import bomberman.objects.Bomb;
import bomberman.objects.Grid;
import bomberman.objects.Player;

public class Engine {

    private Sprites sprites;
    private GameLevelType levelType;
    private Game game;
    private Image groundSprite;
    private Image wallSprite;
    private Image breakableWallSprite;
    private Image breakableWallExplodedSprite1;
    private Image breakableWallExplodedSprite2;
    private Image breakableWallExplodedSprite3;
    private Image breakableWallExplodedSprite4;
    private Image breakableWallExplodedSprite5;
    private Image breakableWallExplodedSprite6;
    private Image breakableWallExplodedSprite7;
    private GridManager gridManager;
    private LevelManager levelManager;

    
    public Engine(Game game, GridManager gridManager, LevelManager levelManager) {
        this.game = game;
        this.gridManager = gridManager;
        this.levelManager = levelManager;
        this.sprites = new Sprites();
    }
    
    public void setLevelType(GameLevelType levelType) {
        this.levelType = levelType;

        switch (levelType) {
            case CLASSIC:
                this.groundSprite = this.sprites.getClassicGroundSprite();
                this.wallSprite = this.sprites.getWallBlockSprite();
                this.breakableWallSprite = this.sprites.getWallBreakableClassicLevelSprite();
                this.breakableWallExplodedSprite1 = this.sprites.getWallBreakableClassicLevelExplodedSprite1();
                this.breakableWallExplodedSprite2 = this.sprites.getWallBreakableClassicLevelExplodedSprite2();
                this.breakableWallExplodedSprite3 = this.sprites.getWallBreakableClassicLevelExplodedSprite3();
                this.breakableWallExplodedSprite4 = this.sprites.getWallBreakableClassicLevelExplodedSprite4();
                this.breakableWallExplodedSprite5 = this.sprites.getWallBreakableClassicLevelExplodedSprite5();
                this.breakableWallExplodedSprite6 = this.sprites.getWallBreakableClassicLevelExplodedSprite6();
                this.breakableWallExplodedSprite7 = this.sprites.getWallBreakableClassicLevelExplodedSprite7();
                break;


            case WATER:
                this.groundSprite = this.sprites.getGroundWaterSprite1();
                this.wallSprite = this.sprites.getWaterLevelWallSprite();
                this.breakableWallSprite = this.sprites.getWallBreakableWaterLevelSprite();
                this.breakableWallExplodedSprite1 = this.sprites.getWallBreakableWaterLevelExplodedSprite1();
                this.breakableWallExplodedSprite2 = this.sprites.getWallBreakableWaterLevelExplodedSprite2();
                this.breakableWallExplodedSprite3 = this.sprites.getWallBreakableWaterLevelExplodedSprite3();
                this.breakableWallExplodedSprite4 = this.sprites.getWallBreakableWaterLevelExplodedSprite4();
                this.breakableWallExplodedSprite5 = this.sprites.getWallBreakableWaterLevelExplodedSprite5();
                this.breakableWallExplodedSprite6 = this.sprites.getWallBreakableWaterLevelExplodedSprite6();
                this.breakableWallExplodedSprite7 = this.sprites.getWallBreakableWaterLevelExplodedSprite7();
                break;
        }

        switch (levelType) {
            case CLASSIC:
                this.levelManager.createClassicLevel();
                break;

            case WATER:
                this.levelManager.createWaterLevel();
                break;
        }
    }

    public void drawGround(GraphicsContext gc) {
        ArrayList<Grid> grounds = this.gridManager.getGridsByType(GridType.GROUND);
        for (Grid grid : grounds) {
            if (grid.isContainsItems()) {
                switch (grid.getItemType()) {
                    case SPEED:
                        gc.drawImage(this.sprites.getSpeedPowerUpSprite(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
                        break;
                    case FLAME:
                        grid.setTicksSinceLastBlink(grid.getTicksSinceLastBlink() + 1);
                        if (grid.getTicksSinceLastBlink() > 20) {
                            grid.setTicksSinceLastBlink(0);
                            if (grid.getBlinkSpriteId() == 0) {
                                grid.setBlinkSpriteId(1);
                            } else {
                                grid.setBlinkSpriteId(0);
                            }
                        }
                        if (grid.getBlinkSpriteId() == 0) {
                            gc.drawImage(this.sprites.getFlamePowerUpSprite(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
                        } else {
                            gc.drawImage(this.sprites.getFlamePowerUpSprite2(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
                        }
                        break;

                    case BOMB:
                        grid.setTicksSinceLastBlink(grid.getTicksSinceLastBlink() + 1);
                        if (grid.getTicksSinceLastBlink() > 20) {
                            grid.setTicksSinceLastBlink(0);
                            if (grid.getBlinkSpriteId() == 0) {
                                grid.setBlinkSpriteId(1);
                            } else {
                                grid.setBlinkSpriteId(0);
                            }
                        }
                        if (grid.getBlinkSpriteId() == 0) {
                            gc.drawImage(this.sprites.getBombPowerUpSprite(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
                        } else {
                            gc.drawImage(this.sprites.getBombPowerUpSprite2(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
                        }
                        break;
                }
            } else {
                gc.drawImage(this.groundSprite, grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
            }
        }
    }

    public void drawArenaBorders(GraphicsContext gc) {
        ArrayList<Grid> arenaBorders = this.gridManager.getGridsByType(GridType.ARENA_BORDER);
        for (Grid grid : arenaBorders) {

            if (grid.getIdX() == 0) {
                gc.drawImage(this.sprites.getArenaLeftWallSprite(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
            } else if (grid.getIdX() == 18) {
                gc.drawImage(this.sprites.getArenaRightWallSprite(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
            }

            if (grid.getIdY() == 0) {
                gc.drawImage(this.sprites.getArenaUpperWallSprite(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
            } else if (grid.getIdY() == 18) {
                gc.drawImage(this.sprites.getArenaDownWallSprite(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
            }

            if (grid.getIdX() == 0 && grid.getIdY() == 0) {
                gc.drawImage(this.sprites.getArenaUpperLeftCornerSprite(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
            } else if (grid.getIdX() == 18 && grid.getIdY() == 0) {
                gc.drawImage(this.sprites.getArenaUpperRightCornerSprite(), grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
            }
        }
    }

    public void drawWalls(GraphicsContext gc) {
        ArrayList<Grid> walls = this.gridManager.getGridsByType(GridType.WALL);
        for (Grid grid : walls) {
            gc.drawImage(this.wallSprite, grid.getStartPositionX(), grid.getStartPositionY(), grid.getEndPositionX() - grid.getStartPositionX(), grid.getEndPositionY() - grid.getStartPositionY());
        }
    }

    private void drawSinglePlayer(Player player, GraphicsContext gc) {
        Image currentPlayerSprite1 = null; //pohyby hraca
        Image currentPlayerSprite2 = null;
        Image currentPlayerSprite3 = null;
        Image currentPlayerSprite4 = null;
        Image currentPlayerSprite5 = null;
        Image currentPlayerSprite6 = null;
        Image currentPlayerSprite7 = null;
        Image currentPlayerSprite8 = null;
        Image currentPlayerSprite9 = null;
        Image currentPlayerSprite10 = null;
        Image currentPlayerSprite11 = null;
        Image currentPlayerSprite12 = null;
        Image currentPlayerSprite13 = null; //smrt hraca
        Image currentPlayerSprite14 = null;
        Image currentPlayerSprite15 = null;
        Image currentPlayerSprite16 = null;
        Image currentPlayerSprite17 = null;
        Image currentPlayerSprite18 = null;
        Image currentPlayerSprite19 = null;
        Image currentPlayerSprite20 = null;

        //sprity sa vyberu, podla toho aky hrac sa ma vykreslit

        switch (player.getColor()) {
            case BLUE:
                currentPlayerSprite1 = this.sprites.getBluePlayerSprite1();
                currentPlayerSprite2 = this.sprites.getBluePlayerSprite2();
                currentPlayerSprite3 = this.sprites.getBluePlayerSprite3();
                currentPlayerSprite4 = this.sprites.getBluePlayerSprite4();
                currentPlayerSprite5 = this.sprites.getBluePlayerSprite5();
                currentPlayerSprite6 = this.sprites.getBluePlayerSprite6();
                currentPlayerSprite7 = this.sprites.getBluePlayerSprite7();
                currentPlayerSprite8 = this.sprites.getBluePlayerSprite8();
                currentPlayerSprite9 = this.sprites.getBluePlayerSprite9();
                currentPlayerSprite10 = this.sprites.getBluePlayerSprite10();
                currentPlayerSprite11 = this.sprites.getBluePlayerSprite11();
                currentPlayerSprite12 = this.sprites.getBluePlayerSprite12();
                currentPlayerSprite13 = this.sprites.getBluePlayerSprite13();
                currentPlayerSprite14 = this.sprites.getBluePlayerSprite14();
                currentPlayerSprite15 = this.sprites.getBluePlayerSprite15();
                currentPlayerSprite16 = this.sprites.getBluePlayerSprite16();
                currentPlayerSprite17 = this.sprites.getBluePlayerSprite17();
                currentPlayerSprite18 = this.sprites.getBluePlayerSprite18();
                currentPlayerSprite19 = this.sprites.getBluePlayerSprite19();
                currentPlayerSprite20 = this.sprites.getBluePlayerSprite20();
                break;

            case YELLOW:
                currentPlayerSprite1 = this.sprites.getYellowPlayerSprite1();
                currentPlayerSprite2 = this.sprites.getYellowPlayerSprite2();
                currentPlayerSprite3 = this.sprites.getYellowPlayerSprite3();
                currentPlayerSprite4 = this.sprites.getYellowPlayerSprite4();
                currentPlayerSprite5 = this.sprites.getYellowPlayerSprite5();
                currentPlayerSprite6 = this.sprites.getYellowPlayerSprite6();
                currentPlayerSprite7 = this.sprites.getYellowPlayerSprite7();
                currentPlayerSprite8 = this.sprites.getYellowPlayerSprite8();
                currentPlayerSprite9 = this.sprites.getYellowPlayerSprite9();
                currentPlayerSprite10 = this.sprites.getYellowPlayerSprite10();
                currentPlayerSprite11 = this.sprites.getYellowPlayerSprite11();
                currentPlayerSprite12 = this.sprites.getYellowPlayerSprite12();
                currentPlayerSprite13 = this.sprites.getYellowPlayerSprite13();
                currentPlayerSprite14 = this.sprites.getYellowPlayerSprite14();
                currentPlayerSprite15 = this.sprites.getYellowPlayerSprite15();
                currentPlayerSprite16 = this.sprites.getYellowPlayerSprite16();
                currentPlayerSprite17 = this.sprites.getYellowPlayerSprite17();
                currentPlayerSprite18 = this.sprites.getYellowPlayerSprite18();
                currentPlayerSprite19 = this.sprites.getYellowPlayerSprite19();
                currentPlayerSprite20 = this.sprites.getYellowPlayerSprite20();
                break;

            case WHITE:
                currentPlayerSprite1 = this.sprites.getWhitePlayerSpriteOne();
                currentPlayerSprite2 = this.sprites.getWhitePlayerSprite2();
                currentPlayerSprite3 = this.sprites.getWhitePlayerSprite3();
                currentPlayerSprite4 = this.sprites.getWhitePlayerSprite4();
                currentPlayerSprite5 = this.sprites.getWhitePlayerSprite5();
                currentPlayerSprite6 = this.sprites.getWhitePlayerSprite6();
                currentPlayerSprite7 = this.sprites.getWhitePlayerSprite7();
                currentPlayerSprite8 = this.sprites.getWhitePlayerSprite8();
                currentPlayerSprite9 = this.sprites.getWhitePlayerSprite9();
                currentPlayerSprite10 = this.sprites.getWhitePlayerSprite10();
                currentPlayerSprite11 = this.sprites.getWhitePlayerSprite11();
                currentPlayerSprite12 = this.sprites.getWhitePlayerSprite12();
                currentPlayerSprite13 = this.sprites.getWhitePlayerSprite13();
                currentPlayerSprite14 = this.sprites.getWhitePlayerSprite14();
                currentPlayerSprite15 = this.sprites.getWhitePlayerSprite15();
                currentPlayerSprite16 = this.sprites.getWhitePlayerSprite16();
                currentPlayerSprite17 = this.sprites.getWhitePlayerSprite17();
                currentPlayerSprite18 = this.sprites.getWhitePlayerSprite18();
                currentPlayerSprite19 = this.sprites.getWhitePlayerSprite19();
                currentPlayerSprite20 = this.sprites.getWhitePlayerSprite20();
                break;

            case GREEN:
                currentPlayerSprite1 = this.sprites.getGreenPlayerSprite1();
                currentPlayerSprite2 = this.sprites.getGreenPlayerSprite2();
                currentPlayerSprite3 = this.sprites.getGreenPlayerSprite3();
                currentPlayerSprite4 = this.sprites.getGreenPlayerSprite4();
                currentPlayerSprite5 = this.sprites.getGreenPlayerSprite5();
                currentPlayerSprite6 = this.sprites.getGreenPlayerSprite6();
                currentPlayerSprite7 = this.sprites.getGreenPlayerSprite7();
                currentPlayerSprite8 = this.sprites.getGreenPlayerSprite8();
                currentPlayerSprite9 = this.sprites.getGreenPlayerSprite9();
                currentPlayerSprite10 = this.sprites.getGreenPlayerSprite10();
                currentPlayerSprite11 = this.sprites.getGreenPlayerSprite11();
                currentPlayerSprite12 = this.sprites.getGreenPlayerSprite12();
                currentPlayerSprite13 = this.sprites.getGreenPlayerSprite13();
                currentPlayerSprite14 = this.sprites.getGreenPlayerSprite14();
                currentPlayerSprite15 = this.sprites.getGreenPlayerSprite15();
                currentPlayerSprite16 = this.sprites.getGreenPlayerSprite16();
                currentPlayerSprite17 = this.sprites.getGreenPlayerSprite17();
                currentPlayerSprite18 = this.sprites.getGreenPlayerSprite18();
                currentPlayerSprite19 = this.sprites.getGreenPlayerSprite19();
                currentPlayerSprite20 = this.sprites.getGreenPlayerSprite20();
                break;
        }

        switch (player.getPlayerState()) {
            case ALIVE:
                switch (player.getMovementDirection()) {
                    case DOWN:
                        if (player.getAnimationSpriteId() == 1) {
                            gc.drawImage(currentPlayerSprite1, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        } else if (player.getAnimationSpriteId() == 2) {
                            gc.drawImage(currentPlayerSprite2, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        } else if (player.getAnimationSpriteId() == 3) {
                            gc.drawImage(currentPlayerSprite3, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        }
                        break;

                    case RIGHT:
                        if (player.getAnimationSpriteId() == 1) {
                            gc.drawImage(currentPlayerSprite4, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        } else if (player.getAnimationSpriteId() == 2) {
                            gc.drawImage(currentPlayerSprite5, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        } else if (player.getAnimationSpriteId() == 3) {
                            gc.drawImage(currentPlayerSprite6, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        }
                        break;

                    case LEFT:
                        if (player.getAnimationSpriteId() == 1) {
                            gc.drawImage(currentPlayerSprite7, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        } else if (player.getAnimationSpriteId() == 2) {
                            gc.drawImage(currentPlayerSprite8, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        } else if (player.getAnimationSpriteId() == 3) {
                            gc.drawImage(currentPlayerSprite9, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        }
                        break;

                    case UP:
                        if (player.getAnimationSpriteId() == 1) {
                            gc.drawImage(currentPlayerSprite10, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        } else if (player.getAnimationSpriteId() == 2) {
                            gc.drawImage(currentPlayerSprite11, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        } else if (player.getAnimationSpriteId() == 3) {
                            gc.drawImage(currentPlayerSprite12, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                        }
                        break;
                }

                if (this.levelType == GameLevelType.WATER) {

                    gc.drawImage(this.sprites.getPlayerStandingInWaterSprite1(), player.getPositionX(), player.getPositionY() + player.getHeight() - 6, player.getWidth(), 6);

                    if (player.isInMove()) {
                        if (player.getAnimationSpriteId() == 1) {
                            gc.drawImage(this.sprites.getPlayerRunningInWaterSprite1(), player.getPositionX(), player.getPositionY() + player.getHeight() - 12, player.getWidth(), 8);
                        } else if (player.getAnimationSpriteId() == 2) {
                            gc.drawImage(this.sprites.getPlayerRunningInWaterSprite2(), player.getPositionX(), player.getPositionY() + player.getHeight() - 12, player.getWidth(), 8);
                        } else if (player.getAnimationSpriteId() == 3) {
                            gc.drawImage(this.sprites.getPlayerRunningInWaterSprite3(), player.getPositionX(), player.getPositionY() + player.getHeight() - 12, player.getWidth(), 8);
                        }
                    }
                }
                break;

            case DYING:
                if (player.getAnimationSpriteId() == 1) {
                    gc.drawImage(currentPlayerSprite13, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                } else if (player.getAnimationSpriteId() == 2) {
                    gc.drawImage(currentPlayerSprite14, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                } else if (player.getAnimationSpriteId() == 3) {
                    gc.drawImage(currentPlayerSprite15, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                } else if (player.getAnimationSpriteId() == 4) {
                    gc.drawImage(currentPlayerSprite16, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                } else if (player.getAnimationSpriteId() == 5) {
                    gc.drawImage(currentPlayerSprite17, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                } else if (player.getAnimationSpriteId() == 6) {
                    gc.drawImage(currentPlayerSprite18, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                } else if (player.getAnimationSpriteId() == 7) {
                    gc.drawImage(currentPlayerSprite19, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                } else if (player.getAnimationSpriteId() == 8) {
                    gc.drawImage(currentPlayerSprite20, player.getPositionX(), player.getPositionY(), player.getWidth(), player.getHeight());
                }

                break;
        }
    }

    public void drawPlayers(Game game, GraphicsContext graphicsContext, ArrayList<Player> players) {

        //hraci sa kreslia v poradi. Poradie sa meni podla toho, ktory hrac sa pohne prv.
        //aby hrac ktory sa pohne, sa na obrazovke vykreslil prioritne pred hracom ktory sa nehybe
        for (int currentDrawingOrder = 4; currentDrawingOrder > 0; currentDrawingOrder--) {
            for (Player player : players) {
                if (player.getDrawingOrder() == currentDrawingOrder && player.getColor() == PlayerColor.WHITE) {
                    this.drawSinglePlayer(players.get(0), graphicsContext);
                } else if (player.getDrawingOrder() == currentDrawingOrder && player.getColor() == PlayerColor.BLUE) {
                    this.drawSinglePlayer(players.get(1), graphicsContext);
                } else if (player.getDrawingOrder() == currentDrawingOrder && player.getColor() == PlayerColor.GREEN) {
                    this.drawSinglePlayer(players.get(2), graphicsContext);
                } else if (player.getDrawingOrder() == currentDrawingOrder && player.getColor() == PlayerColor.YELLOW) {
                    this.drawSinglePlayer(players.get(3), graphicsContext);
                }
            }
        }
    }

    public void drawBombs(GraphicsContext gc, ArrayList<Bomb> bombs) {
        for (Bomb bomb : bombs) {
            if (bomb.isExploding()) {

                //pre vyklreslenie explozie bomby sa pouzije viacero plamenov, aby mala nejaku uroven

                Image flameEndLeftSprite = null;
                Image flameEndRightSprite = null;
                Image flameEndUpSprite = null;
                Image flameEndDownSprite = null;
                Image explosionCenterSprite = null;
                Image flameHorizontalSprite = null;
                Image flameVerticalSprite = null;

                if (bomb.getExplodingBombSprite() == 0 || bomb.getExplodingBombSprite() == 4) {
                    flameEndLeftSprite = this.sprites.getFlameEndLeftSprite4();
                    flameEndRightSprite = this.sprites.getFlameEndRightSprite4();
                    flameEndUpSprite = this.sprites.getFlameEndUpSprite4();
                    flameEndDownSprite = this.sprites.getFlameEndDownSprite4();
                    explosionCenterSprite = this.sprites.getExplosionFlameSprite5();
                    flameVerticalSprite = this.sprites.getVerticalFlameSprite4();
                    flameHorizontalSprite = this.sprites.getHorizontalFlameSprite4();
                } else if (bomb.getExplodingBombSprite() == 1 || bomb.getExplodingBombSprite() == 5) {
                    flameEndLeftSprite = this.sprites.getFlameEndLeftSprite3();
                    flameEndRightSprite = this.sprites.getFlameEndRightSprite3();
                    flameEndUpSprite = this.sprites.getFlameEndUpSprite3();
                    flameEndDownSprite = this.sprites.getFlameEndDownSprite3();
                    explosionCenterSprite = this.sprites.getExplosionFlameSprite3();
                    flameVerticalSprite = this.sprites.getVerticalFlameSprite3();
                    flameHorizontalSprite = this.sprites.getHorizontalFlameSprite3();
                } else if (bomb.getExplodingBombSprite() == 2 || bomb.getExplodingBombSprite() == 6) {
                    flameEndLeftSprite = this.sprites.getFlameEndLeftSprite2();
                    flameEndRightSprite = this.sprites.getFlameEndRightSprite2();
                    flameEndUpSprite = this.sprites.getFlameEndUpSprite2();
                    flameEndDownSprite = this.sprites.getFlameEndDownSprite2();
                    explosionCenterSprite = this.sprites.getExplosionFlameSprite2();
                    flameVerticalSprite = this.sprites.getVerticalFlameSprite2();
                    flameHorizontalSprite = this.sprites.getHorizontalFlameSprite2();
                } else if (bomb.getExplodingBombSprite() == 3 || bomb.getExplodingBombSprite() == 7) {
                    flameEndLeftSprite = this.sprites.getFlameEndLeftSprite1();
                    flameEndRightSprite = this.sprites.getFlameEndRightSprite1();
                    flameEndUpSprite = this.sprites.getFlameEndUpSprite1();
                    flameEndDownSprite = this.sprites.getFlameEndDownSprite1();
                    explosionCenterSprite = this.sprites.getExplosionFlameSprite1();
                    flameVerticalSprite = this.sprites.getVerticalFlameSprite1();
                    flameHorizontalSprite = this.sprites.getHorizontalFlameSprite1();
                }

                if (this.game.getGameTick() % 15 == 0) {
                    bomb.setExplodingBombSprite(bomb.getExplodingBombSprite() + 1);
                }

                //vykreslenie centra vybuchu bomby

                gc.drawImage(explosionCenterSprite, bomb.getPositionX(), bomb.getPositionY(), bomb.getWidth(), bomb.getHeight());
                Grid foundGrid1 = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX(), bomb.getPositionY());
                if (foundGrid1 != null) {
                    foundGrid1.setBombExplodedInGrid(true);
                    foundGrid1.setBombInGrid(false);
                    foundGrid1.setBomb(null);
                }

                //horny plamen

                for (int x = 1; x < bomb.getFlameLength(); x++) {

                    //skontrolovat ci zme na konci, ak ano, nakreslit koncovy plamen

                    if (x >= bomb.getFlameLengthForSingleExplosionUp()) {
                        break;
                    }

                    if (x + 1 == bomb.getFlameLength()) {
                        //zistime ci plamen zsahuje stenu
                        Grid foundGrid = this.gridManager.getWallByXPositionAndYPosition(bomb.getPositionX(), bomb.getPositionY() - bomb.getHeight() * x);
                        if (foundGrid != null) {
                            if (foundGrid.getGridType() == GridType.BREAKABLE_WALL) {
                                foundGrid.setWallBeingDestroyed(true);
                            }
                            break;
                        }

                        //ak sa plamen dotkne inej bomby, mala by explodovat aj ta
                        foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX(), bomb.getPositionY() - (bomb.getHeight() * x));
                        if (foundGrid != null) {
                            foundGrid.setBombExplodedInGrid(true);
                            foundGrid.setContainsItems(false);
                            if (foundGrid.isBombInGrid()) {
                                foundGrid.getBomb().setTimeToExplode(1);
                                break;
                            }
                        }

                        gc.drawImage(flameEndUpSprite, bomb.getPositionX(), bomb.getPositionY() - (bomb.getHeight() * x), bomb.getWidth(), bomb.getHeight());
                        break;
                    }

                    //skontrolvoat ci plamen nezasahuje stenu. Ak ako, ukoncit kreslenie plamena

                    Grid foundGrid = this.gridManager.getWallByXPositionAndYPosition(bomb.getPositionX(), bomb.getPositionY() - bomb.getHeight() * x);
                    if (foundGrid != null) {
                        if (foundGrid.getGridType() == GridType.BREAKABLE_WALL) {
                            foundGrid.setWallBeingDestroyed(true);
                        }
                        break;
                    }

                    foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX(), bomb.getPositionY() - (bomb.getHeight() * x));
                    if (foundGrid != null) {
                        foundGrid.setBombExplodedInGrid(true);
                        foundGrid.setContainsItems(false);
                        if (foundGrid.isBombInGrid()) {
                            foundGrid.getBomb().setTimeToExplode(1);
                            bomb.setFlameLengthForSingleExplosionUp(x);
                            break;
                        }
                    }

                    gc.drawImage(flameVerticalSprite, bomb.getPositionX(), bomb.getPositionY() - (bomb.getWidth() * x), bomb.getWidth(), bomb.getHeight());
                }

                //dolny plamen

                for (int x = 1; x < bomb.getFlameLength(); x++) {

                    if (x >= bomb.getFlameLengthForSingleExplosionDown()) {
                        break;
                    }

                    //skontrolovat ci zme na konci, ak ano, nakreslit koncovy plamen

                    if (x + 1 == bomb.getFlameLength()) {

                        //zisti sa ci plamen zasahuje do steny
                        Grid foundGrid = this.gridManager.getWallByXPositionAndYPosition(bomb.getPositionX(), bomb.getPositionY() + bomb.getHeight() * x);
                        if (foundGrid != null) {
                            if (foundGrid.getGridType() == GridType.BREAKABLE_WALL) {
                                foundGrid.setWallBeingDestroyed(true);
                            }
                            break;
                        }

                        //ak sa plamen dotkne inej bomby, mala by explodovat aj ta
                        foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX(), bomb.getPositionY() + (bomb.getHeight() * x));
                        if (foundGrid != null) {
                            if (foundGrid.isBombInGrid()) {
                                foundGrid.getBomb().setTimeToExplode(1);
                                break;
                            }
                        }

                        //ak nie, ziska sa grid pre bombu a nastavi sa v nom ze bomba exploduje
                        foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX(), bomb.getPositionY() + (bomb.getHeight() * x));
                        if (foundGrid != null) {
                            foundGrid.setBombExplodedInGrid(true);
                            foundGrid.setContainsItems(false);
                        }

                        gc.drawImage(flameEndDownSprite, bomb.getPositionX(), bomb.getPositionY() + (bomb.getHeight() * x), bomb.getWidth(), bomb.getHeight());
                        break;
                    }

                    //zisti sa ci plamen zasahuje stenu
                    Grid foundGrid = this.gridManager.getWallByXPositionAndYPosition(bomb.getPositionX(), bomb.getPositionY() + bomb.getHeight() * x);
                    if (foundGrid != null) {
                        if (foundGrid.getGridType() == GridType.BREAKABLE_WALL) {
                            foundGrid.setWallBeingDestroyed(true);
                        }
                        break;
                    }

                    //zisi sa , ci plamen zasiahol inu bombu
                    foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX(), bomb.getPositionY() + (bomb.getHeight() * x));
                    if (foundGrid != null) {
                        foundGrid.setBombExplodedInGrid(true);
                        foundGrid.setContainsItems(false);
                        if (foundGrid.isBombInGrid()) {
                            foundGrid.getBomb().setTimeToExplode(1);
                            bomb.setFlameLengthForSingleExplosionDown(x);
                            break;
                        }
                    }

                    gc.drawImage(flameVerticalSprite, bomb.getPositionX(), bomb.getPositionY() + (bomb.getHeight() * x), bomb.getWidth(), bomb.getHeight());
                }

                //lavy plamen
                for (int x = 1; x < bomb.getFlameLength(); x++) {

                    //skontrolovat ci zme na konci, ak ano, nakreslit koncovy plamen

                    if (x >= bomb.getFlameLengthForSingleExplosionLeft()) {
                        break;
                    }

                    if (x + 1 == bomb.getFlameLength()) {

                        //zistime ci plamen zasahuje stenu
                        Grid foundGrid = this.gridManager.getWallByXPositionAndYPosition(bomb.getPositionX() - bomb.getHeight() * x, bomb.getPositionY());
                        if (foundGrid != null) {
                            if (foundGrid.getGridType() == GridType.BREAKABLE_WALL) {
                                foundGrid.setWallBeingDestroyed(true);
                            }
                            break;
                        }

                        //ak sa plamen dotkne inej bomby, mala by explodovat aj ta
                        foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX() - (bomb.getHeight() * x), bomb.getPositionY());
                        if (foundGrid != null) {
                            foundGrid.setBombExplodedInGrid(true);
                            foundGrid.setContainsItems(false);
                            if (foundGrid.isBombInGrid()) {
                                foundGrid.getBomb().setTimeToExplode(1);
                                bomb.setFlameLengthForSingleExplosionLeft(x);
                                break;
                            }
                        }

                        gc.drawImage(flameEndLeftSprite, bomb.getPositionX() - (bomb.getHeight() * x), bomb.getPositionY(), bomb.getWidth(), bomb.getHeight());
                        break;
                    }

                    //zisti sa ci zasahuje do steny
                    Grid foundGrid = this.gridManager.getWallByXPositionAndYPosition(bomb.getPositionX() - bomb.getHeight() * x, bomb.getPositionY());
                    if (foundGrid != null) {
                        if (foundGrid.getGridType() == GridType.BREAKABLE_WALL) {
                            foundGrid.setWallBeingDestroyed(true);
                        }
                        break;
                    }


                    foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX() - (bomb.getHeight() * x), bomb.getPositionY());
                    if (foundGrid != null) {
                        foundGrid.setBombExplodedInGrid(true);
                        foundGrid.setContainsItems(false);
                        if (foundGrid.isBombInGrid()) {
                            foundGrid.getBomb().setTimeToExplode(1);
                            bomb.setFlameLengthForSingleExplosionLeft(x);
                            break;
                        }
                    }

                    gc.drawImage(flameHorizontalSprite, bomb.getPositionX() - (bomb.getHeight() * x), bomb.getPositionY(), bomb.getWidth(), bomb.getHeight());
                }

                //pravy plamen
                for (int x = 1; x < bomb.getFlameLength(); x++) {

                    //skontrolovat ci zme na konci, ak ano, nakreslit koncovy plamen

                    if (x >= bomb.getFlameLengthForSingleExplosionRight()) {
                        break;
                    }

                    if (x + 1 == bomb.getFlameLength()) {

                        //zisti sa ci plamen zasahuje do stenu

                        Grid foundGrid = this.gridManager.getWallByXPositionAndYPosition(bomb.getPositionX() + bomb.getHeight() * x, bomb.getPositionY());
                        if (foundGrid != null) {
                            if (foundGrid.getGridType() == GridType.BREAKABLE_WALL) {
                                foundGrid.setWallBeingDestroyed(true);
                            }
                            break;
                        }

                        //ak sa plamen dotkne inej bomby, mala by explodovat aj ta
                        foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX() + (bomb.getHeight() * x), bomb.getPositionY());
                        if (foundGrid != null) {
                            foundGrid.setContainsItems(false);
                            foundGrid.setBombExplodedInGrid(true);
                            if (foundGrid.isBombInGrid()) {
                                foundGrid.getBomb().setTimeToExplode(1);
                                break;
                            }
                        }

                        gc.drawImage(flameEndRightSprite, bomb.getPositionX() + (bomb.getHeight() * x), bomb.getPositionY(), bomb.getWidth(), bomb.getHeight());
                        break;
                    }

                    //skontroluej sa ci plamen zasahuje stenu
                    Grid foundGrid = this.gridManager.getWallByXPositionAndYPosition(bomb.getPositionX() + bomb.getHeight() * x, bomb.getPositionY());
                    if (foundGrid != null) {
                        if (foundGrid.getGridType() == GridType.BREAKABLE_WALL) {
                            foundGrid.setWallBeingDestroyed(true);
                        }
                        break;
                    }

                    foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX() + (bomb.getHeight() * x), bomb.getPositionY());
                    if (foundGrid != null) {
                        foundGrid.setBombExplodedInGrid(true);
                        foundGrid.setContainsItems(false);
                        if (foundGrid.isBombInGrid()) {
                            foundGrid.getBomb().setTimeToExplode(1);
                            bomb.setFlameLengthForSingleExplosionRight(x);
                            break;
                        }
                    }

                    gc.drawImage(flameHorizontalSprite, bomb.getPositionX() + (bomb.getHeight() * x), bomb.getPositionY(), bomb.getWidth(), bomb.getHeight());
                }
            } else {
                if (bomb.getCurrentSpriteId() == 1) {
                    gc.drawImage(this.sprites.getBombSprite1(), bomb.getPositionX(), bomb.getPositionY(), bomb.getWidth(), bomb.getHeight());
                } else if (bomb.getCurrentSpriteId() == 2) {
                    gc.drawImage(this.sprites.getBombSprite2(), bomb.getPositionX(), bomb.getPositionY(), bomb.getWidth(), bomb.getHeight());
                } else if (bomb.getCurrentSpriteId() == 3) {
                    gc.drawImage(this.sprites.getBombSprite3(), bomb.getPositionX(), bomb.getPositionY(), bomb.getWidth(), bomb.getHeight());
                }
            }
        }
    }

    public void updateBreakableWalls() {
        ArrayList<Grid> breakableWalls = this.gridManager.getGridsByType(GridType.BREAKABLE_WALL);
        for (Grid breakableWall : breakableWalls) {
            if (!breakableWall.isWallBeingDestroyed()) {
                continue;
            }
            if (this.game.getGameTick() % 7 == 0) {
                breakableWall.setDestructionState(breakableWall.getDestructionState() + 1);
            }

            //ak stena uz do-explodovala, odtrani sa z gridu
            if (breakableWall.getDestructionState() == 7) {
                breakableWall.setGridType(GridType.GROUND);
            }
        }
    }

    public void drawBreakableWalls(GraphicsContext gc) {

        ArrayList<Grid> breakableWalls = this.gridManager.getGridsByType(GridType.BREAKABLE_WALL);

        for (Grid breakableWall : breakableWalls) {
            if (!breakableWall.isWallBeingDestroyed()) {
                gc.drawImage(this.breakableWallSprite, breakableWall.getStartPositionX(), breakableWall.getStartPositionY(), breakableWall.getWidth(), breakableWall.getHeight());
            } else {
                //este pred exploziou nareslit ground
                gc.drawImage(this.groundSprite, breakableWall.getStartPositionX(), breakableWall.getStartPositionY(), breakableWall.getWidth(), breakableWall.getHeight());
                if (breakableWall.getDestructionState() == 0) {
                    gc.drawImage(this.breakableWallExplodedSprite1, breakableWall.getStartPositionX(), breakableWall.getStartPositionY(), breakableWall.getWidth(), breakableWall.getHeight());
                } else if (breakableWall.getDestructionState() == 1) {
                    gc.drawImage(this.breakableWallExplodedSprite2, breakableWall.getStartPositionX(), breakableWall.getStartPositionY(), breakableWall.getWidth(), breakableWall.getHeight());
                } else if (breakableWall.getDestructionState() == 2) {
                    gc.drawImage(this.breakableWallExplodedSprite3, breakableWall.getStartPositionX(), breakableWall.getStartPositionY(), breakableWall.getWidth(), breakableWall.getHeight());
                } else if (breakableWall.getDestructionState() == 3) {
                    gc.drawImage(this.breakableWallExplodedSprite4, breakableWall.getStartPositionX(), breakableWall.getStartPositionY(), breakableWall.getWidth(), breakableWall.getHeight());
                } else if (breakableWall.getDestructionState() == 4) {
                    gc.drawImage(this.breakableWallExplodedSprite5, breakableWall.getStartPositionX(), breakableWall.getStartPositionY(), breakableWall.getWidth(), breakableWall.getHeight());
                } else if (breakableWall.getDestructionState() == 5) {
                    gc.drawImage(this.breakableWallExplodedSprite6, breakableWall.getStartPositionX(), breakableWall.getStartPositionY(), breakableWall.getWidth(), breakableWall.getHeight());
                } else if (breakableWall.getDestructionState() == 6) {
                    gc.drawImage(this.breakableWallExplodedSprite7, breakableWall.getStartPositionX(), breakableWall.getStartPositionY(), breakableWall.getWidth(), breakableWall.getHeight());
                }
            }
        }
    }

    public void updateBombs(ArrayList<Bomb> bombs, ArrayList<Player> players) {

        for (Bomb bomb : bombs) {
            /*
             * aby sme limitovali ako rychlo sa bude updatovat animacia bomby ktora sa chysta vybuchnut,
             * pouzijeme modulo na staticku hodnotu z triedy Main, 'gameTick'.
             */

            if (!bomb.isExploding()) {
                if (this.game.getGameTick() % 8 == 0) {
                    if (bomb.getCurrentSpriteId() == 1) {
                        bomb.setCurrentSpriteId(2);
                    } else if (bomb.getCurrentSpriteId() == 2) {
                        bomb.setCurrentSpriteId(3);
                    } else if (bomb.getCurrentSpriteId() == 3) {
                        bomb.setCurrentSpriteId(1);
                    }
                }
                bomb.setTimeToExplode(bomb.getTimeToExplode() - 1);
                if (bomb.getTimeToExplode() == 0) {
                    bomb.setExploding(true);
                    bomb.setFlameLengthForSingleExplosionLeft(bomb.getFlameLength());
                    bomb.setFlameLengthForSingleExplosionRight(bomb.getFlameLength());
                    bomb.setFlameLengthForSingleExplosionDown(bomb.getFlameLength());
                    bomb.setFlameLengthForSingleExplosionUp(bomb.getFlameLength());
                }
            } else {
                //cas ktory zaberie samotna explozia
                //System.out.println("explodujem");
                bomb.setTimeOfExplosion(bomb.getTimeOfExplosion() - 1);
            }
        }

        boolean isBombDeletedInLoop = true;

        //pokial nenastane situacia, ze sa v for cykle nezname ani jedna bomba,
        //while cyklus bude stale prechazdat cez bomby a pripadne ich mazat
        while (isBombDeletedInLoop && bombs.size() > 0) {
            isBombDeletedInLoop = false;
            for (int x = 0; x < bombs.size(); x++) {

                if (!bombs.get(x).isExploding()) {
                    continue;
                }

                if (bombs.get(x).getTimeOfExplosion() > 0) {
                    // System.out.println("bomba.. prave explduje");
                    for (Player player : players) {

                        //System.out.println(player.getColor().toString() + "player is dead");
                        if (player.getPlayerState() != PlayerState.ALIVE) {
                            continue;
                        }

                        Grid foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, player.getPositionX() + player.getWidth() / 2, player.getPositionY() + player.getHeight() / 2);
                        if (foundGrid == null) {
                            continue;
                        }

                        if (!foundGrid.isBombExplodedInGrid()) {
                            continue;
                        }

                        player.setPlayerState(PlayerState.DYING);
                        player.setAnimationSpriteId(1);

                    }
                }

                //ak uz bomba ukonzila svoju exploziu, zmazat
                if (bombs.get(x).getTimeOfExplosion() <= 0) {

                    for (Player player : players) {
                        //ked bomba exploduje, hracovi co ju polozil znova umoznit ukaldat dalsie bomby

                        if (player.getColor().equals(bombs.get(x).getOwner())) {
                            player.setBombCount(player.getBombCount() + 1);
                        }
                    }
                    try {

                        //zmazanie bomby
                        //pre zmazanie bomby, je tiez potrebne zmazat z gridov informaciu, ze bomba
                        //v nich prave exploduje, nestaci iba prestat exploziu vykreslovat
                        //je teda potrebne najst gridy bomb, kde bomba explodovala a nastavit v nich urcitu vlastnost tak aby uz neexplodovali

                        Grid foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bombs.get(x).getPositionX(), bombs.get(x).getPositionY());
                        //System.out.println("grid X" + foundGrid.getIdX() + " Y: " + foundGrid.getIdY());
                        //System.out.println("trying to remove bomb " + x + " from arraylist");
                        foundGrid.setBombExplodedInGrid(false);

                        //nechcem pristupovat k bombe cex index x
                        Bomb bomb = bombs.get(x);

                        //zmaze sa horny plamen
                        for (int i = 1; i < bomb.getFlameLength(); i++) {
                            //skontrolovat ci zme na konci, ak ano, nakreslit koncovy plamen
                            if (i + 1 == bomb.getFlameLength()) {
                                foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.WALL, bomb.getPositionX(), bomb.getPositionY() - bomb.getHeight() * i);
                                if (foundGrid != null) {
                                    break;
                                }

                                foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX(), bomb.getPositionY() - (bomb.getHeight() * i));
                                if (foundGrid != null) {
                                    foundGrid.setBombExplodedInGrid(false);
                                }
                                break;
                            }
                            //skontrolvoat ci plamen nezasahuje stenu. Ak ako, ukoncit kreslenie plamena
                            foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.WALL, bomb.getPositionX(), bomb.getPositionY() - bomb.getHeight() * i);
                            if (foundGrid != null) {
                                break;
                            }

                            foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX(), bomb.getPositionY() - (bomb.getHeight() * i));
                            if (foundGrid != null) {
                                foundGrid.setBombExplodedInGrid(false);
                            }
                        }

                        //zmaze sa dolny plamen
                        for (int i = 1; i < bomb.getFlameLength(); i++) {
                            //skontrolovat ci zme na konci, ak ano, nakreslit koncovy plamen
                            if (i + 1 == bomb.getFlameLength()) {

                                //zisti sa ci plamen zasahuje do stenu
                                foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.WALL, bomb.getPositionX(), bomb.getPositionY() + bomb.getHeight() * i);
                                if (foundGrid != null) {
                                    break;
                                }

                                //ak nie, ziska sa grid pre bombu a nastavi sa v nom ze bomba exploduje
                                foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX(), bomb.getPositionY() + (bomb.getHeight() * i));
                                if (foundGrid != null) {
                                    foundGrid.setBombExplodedInGrid(false);
                                }

                                break;
                            }
                            foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.WALL, bomb.getPositionX(), bomb.getPositionY() + bomb.getHeight() * i);
                            if (foundGrid != null) {
                                break;
                            }
                            foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX(), bomb.getPositionY() + (bomb.getHeight() * i));
                            if (foundGrid != null) {
                                foundGrid.setBombExplodedInGrid(false);
                            }
                        }

                        //zmaze sa lavy plamen
                        for (int i = 1; i < bomb.getFlameLength(); i++) {
                            //skontrolovat ci zme na konci, ak ano, nakreslit koncovy plamen
                            if (i + 1 == bomb.getFlameLength()) {
                                foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.WALL, bomb.getPositionX() - bomb.getHeight() * i, bomb.getPositionY());
                                if (foundGrid != null) {
                                    break;
                                }

                                foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX() - (bomb.getHeight() * i), bomb.getPositionY());
                                if (foundGrid != null) {
                                    foundGrid.setBombExplodedInGrid(false);
                                }

                                break;
                            }

                            //zisti sa ci zasahuje do steny
                            foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.WALL, bomb.getPositionX() - bomb.getHeight() * i, bomb.getPositionY());
                            if (foundGrid != null) {
                                break;
                            }

                            //nastavi sa ze v gride exploduje bomba, ak sa grid najde
                            foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX() - (bomb.getHeight() * i), bomb.getPositionY());
                            if (foundGrid != null) {
                                foundGrid.setBombExplodedInGrid(false);
                            }
                        }

                        //zmaze sa pravy plamen
                        for (int i = 1; i < bomb.getFlameLength(); i++) {
                            //skontrolovat ci zme na konci, ak ano, nakreslit koncovy plamen
                            if (i + 1 == bomb.getFlameLength()) {
                                foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.WALL, bomb.getPositionX() - bomb.getHeight() * i, bomb.getPositionY());
                                if (foundGrid != null) {
                                    break;
                                }

                                //ak nie, ziska sa grid pre bombu a nastavi sa v nom ze bomba exploduje
                                foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX() + (bomb.getHeight() * i), bomb.getPositionY());
                                if (foundGrid != null) {
                                    foundGrid.setBombExplodedInGrid(false);
                                }

                                break;
                            }

                            //skontroluej sa ci plamen zasahuje stenu
                            foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.WALL, bomb.getPositionX() + bomb.getHeight() * i, bomb.getPositionY());
                            if (foundGrid != null) {
                                break;
                            }

                            //nastavi sa ze v gride exploduje bomba, ak sa grid najde
                            foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, bomb.getPositionX() + (bomb.getHeight() * i), bomb.getPositionY());
                            if (foundGrid != null) {
                                foundGrid.setBombExplodedInGrid(false);
                            }
                        }

                        bombs.remove(x);
                        isBombDeletedInLoop = true;
                        //
                        break;  //po odstraneni bomby ukoncit cyklus, zmena poctu prvkou v cykle ktory by sa dalej vykonaval sposoby exceptions
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println(x + " removed");
                }
            }
        }
    }

    public void updatePlayers(ArrayList<Player> players, ArrayList<Bomb> bombs) {

        ArrayList<Grid> walls = this.gridManager.getGridsByType(GridType.WALL);
        walls.addAll(this.gridManager.getGridsByType(GridType.BREAKABLE_WALL));

        for (Player player : players) {
            if (player.getPlayerState() == PlayerState.DYING) {
                if (this.game.getGameTick() % 15 == 0) {
                    if (player.getAnimationSpriteId() == 8) {
                        player.setPlayerState(PlayerState.DEAD);
                        this.game.setPlayersAlive(this.game.getPlayersAlive() - 1);
                        if (this.game.getPlayersAlive() <= 1) {
                            this.game.setGameRunning(false);
                            for (Player player1 : players) {
                                if (player1.getPlayerState() == PlayerState.ALIVE) {
                                    this.game.setWinner(player1);
                                }
                            }
                        }
                    } else {
                        player.setAnimationSpriteId(player.getAnimationSpriteId() + 1);
                    }
                }
                continue;
            }

            // za beh hraca sa pocita aj to, ked jeho animationState nema hodnotu 1
            if (player.isInMove() || player.getAnimationSpriteId() != 1) {
                //znova, ako v pripade bomby, animaciu behu hraca spomalit pouzitim modula
                if (this.game.getGameTick() % 5 == 0) {
                    if (player.getAnimationSpriteId() == 1) {
                        player.setAnimationSpriteId(2);
                    } else if (player.getAnimationSpriteId() == 2) {
                        player.setAnimationSpriteId(3);
                    } else if (player.getAnimationSpriteId() == 3) {
                        player.setAnimationSpriteId(1);
                    }
                }

                //skontrolujeme ci hrac zobral nejaky item

                Grid currentGridOfPlayer = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, player.getPositionX() + player.getWidth() / 2, player.getPositionY() + player.getHeight() / 2);
                if (currentGridOfPlayer != null) {
                    if (currentGridOfPlayer.isContainsItems()) {
                        if (currentGridOfPlayer.getItemType() == ItemType.FLAME) {
                            currentGridOfPlayer.setContainsItems(false);
                            player.setFlameLength(player.getFlameLength() + 1);
                        } else if (currentGridOfPlayer.getItemType() == ItemType.BOMB) {
                            currentGridOfPlayer.setContainsItems(false);
                            player.setBombCount(player.getBombCount() + 1);
                        } else if (currentGridOfPlayer.getItemType() == ItemType.SPEED) {
                            currentGridOfPlayer.setContainsItems(false);
                            if (player.getSpeed() < 4) {
                                player.setSpeed(player.getSpeed() + 1);
                            }
                        }
                    }
                }

                boolean isPlayerAllowedToMove = true;

                //zablokovanie pohybu hraca ak by chcel prejst cez bombu alebo stenu areny

                if (player.getMovementDirection() == MovementDirection.UP) {
                    int rozdiel = player.getHeight() - player.getCalculationHeight();
                    int yPlayerPosition = player.getPositionY() + rozdiel - player.getSpeed() - 3;
                    Grid foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.ARENA_BORDER, player.getPositionX(), yPlayerPosition);
                    Grid foundGrid1 = this.gridManager.getGridContainingBombByXPositionAndYPosition(player.getPositionX(), yPlayerPosition);
                    if (foundGrid1 == player.getLastGridBombPlanted()) {
                        foundGrid1 = null;
                    }
                    if (foundGrid != null || foundGrid1 != null) {
                        isPlayerAllowedToMove = false;
                    }
                } else if (player.getMovementDirection() == MovementDirection.DOWN) {
                    int yPlayerPosition = player.getPositionY() + player.getHeight();
                    Grid foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.ARENA_BORDER, player.getPositionX(), yPlayerPosition);
                    Grid foundGrid1 = this.gridManager.getGridContainingBombByXPositionAndYPosition(player.getPositionX(), yPlayerPosition);
                    if (foundGrid1 == player.getLastGridBombPlanted()) {
                        foundGrid1 = null;
                    }
                    if (foundGrid != null || foundGrid1 != null) {
                        isPlayerAllowedToMove = false;
                    }
                } else if (player.getMovementDirection() == MovementDirection.LEFT) {
                    int rozdiel = player.getHeight() - player.getCalculationHeight();
                    int yPlayerPosition = player.getPositionY() + rozdiel;
                    int xPlayerPosition = player.getPositionX() - player.getSpeed();
                    Grid foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.ARENA_BORDER, xPlayerPosition, yPlayerPosition);
                    Grid foundGrid1 = this.gridManager.getGridContainingBombByXPositionAndYPosition(xPlayerPosition, yPlayerPosition);
                    if (foundGrid1 == player.getLastGridBombPlanted()) {
                        foundGrid1 = null;
                    }
                    if (foundGrid != null || foundGrid1 != null) {
                        isPlayerAllowedToMove = false;
                    }
                } else if (player.getMovementDirection() == MovementDirection.RIGHT) {
                    int rozdiel = player.getHeight() - player.getCalculationHeight();
                    int yPlayerPosition = player.getPositionY() + rozdiel;
                    int xPlayerPosition = player.getPositionX() + player.getCalculationWidth();
                    Grid foundGrid = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.ARENA_BORDER, xPlayerPosition, yPlayerPosition);
                    Grid foundGrid1 = this.gridManager.getGridContainingBombByXPositionAndYPosition(xPlayerPosition, yPlayerPosition);
                    if (foundGrid1 == player.getLastGridBombPlanted()) {
                        foundGrid1 = null;
                    }
                    if (foundGrid != null || foundGrid1 != null) {
                        isPlayerAllowedToMove = false;
                    }
                }

                //ked sa bomba ulozi, ak vobec(ale to sa tu nekontroluje) ma byt hracovy umoznene cez nu prechazdat, z casti.
                //akonahle sa ale od bomby dostatocne vzdiali, uz sa ma s bombou narabat akoby ju ulozil nepriatel, a teda hracovy nema byt umoznene cez nu prejst. Jeho pohyb zablokuje

                Grid currentGrid1 = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, player.getPositionX(), player.getPositionY() - 25);
                Grid currentGrid2 = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, player.getPositionX(), player.getPositionY() + 60);
                Grid currentGrid3 = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, player.getPositionX() - 30, player.getPositionY() + player.getHeight() / 2);
                Grid currentGrid4 = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, player.getPositionX() + 60, player.getPositionY() + player.getHeight() / 2);

                //ide o to, zmazat informaciu z hraca o tom, kde ulozil bombu posledne.
                //v inej podmienke sa kontroluje to, ci sucasny grid je zaroven gridom v ktorom hrac ulozil bombu. Ak ano, bomba sa ignoruje.
                //Ked ale sucasny grid nebude gridom, v ktorom hrac ulozil bombu, bomba v gride uz bude brana ako prekazka
                //Na to, aby hrac uz cez bombu ktoru ulozil nemohol prejst, sa informacia o gride v ktorom ulozil bombu posledne, musi z player objektu odstradnit

                if (currentGrid1 == player.getLastGridBombPlanted()) {
                    player.setLastGridBombPlanted(null);
                } else if (currentGrid2 == player.getLastGridBombPlanted()) {
                    player.setLastGridBombPlanted(null);
                } else if (currentGrid3 == player.getLastGridBombPlanted()) {
                    player.setLastGridBombPlanted(null);
                } else if (currentGrid4 == player.getLastGridBombPlanted()) {
                    player.setLastGridBombPlanted(null);
                }

                Grid targetGrid = null; //grid kde sa pripadne hrac presunie
                Grid foundWall = null;
                int targetYPosition = 0;
                int targetXPosition = 0;

                //predosly kod zabezpecoval aby sa hrac nepresiel cez miesto kde je ulozena bomba alebo cez hranica areny
                //tento zabecpecuje to, aby sa hrac nepresiel cez stenu
                for (Grid wall : walls) {
                    if (player.getMovementDirection() == MovementDirection.UP || player.getMovementDirection() == MovementDirection.DOWN) {
                        Grid ground = null;

                        if (player.getMovementDirection() == MovementDirection.UP) {
                            int rozdiel = player.getHeight() - player.getCalculationHeight();
                            int yPlayerPosition = player.getPositionY() + rozdiel - player.getSpeed() - 3;

                            ground = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, player.getPositionX() + player.getWidth() / 2, yPlayerPosition);
                        } else if (player.getMovementDirection() == MovementDirection.DOWN) {
                            ground = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, player.getPositionX() + player.getWidth() / 2, player.getPositionY() + player.getHeight() + player.getSpeed());
                        }
                        if (ground == null) {
                            foundWall = this.gridManager.getWallByXPosition(player.getPositionX() + wall.getWidth() / 2);
                            if (foundWall != null) {
                                isPlayerAllowedToMove = false;
                            }
                        }
                    } else if (player.getMovementDirection() == MovementDirection.RIGHT || player.getMovementDirection() == MovementDirection.LEFT) {
                        Grid ground = null;

                        //najprv sa zisti ci je vobec v blizkosti hraca nejaka stena, v smere ktorym sa chce pohnut hrac.
                        //ak nieje v jeho smere pohybu v tesnej blizkosti ziadna stena, kontroly pre koliziu hraca zo stenou sa preskocia

                        if (player.getMovementDirection() == MovementDirection.RIGHT) {
                            ground = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, player.getPositionX() + player.getWidth() + player.getSpeed(), player.getPositionY() + player.getHeight() / 2);
                        } else if (player.getMovementDirection() == MovementDirection.LEFT) {
                            ground = this.gridManager.getGridByTypeByXPositionAndYPosition(GridType.GROUND, player.getPositionX() - player.getSpeed(), player.getPositionY() + player.getHeight() / 2);
                        }

                        if (ground == null) {
                            //skontroluj ci sa hrac moze pohnut do prava alebo lava, ak sa castou hlavy dotyka hornej steny
                            //ak hej jeho pozicia sa neskor normalizuje

                            //skontrolovat, ci hrac siaha so svojou y poziciou do y pozicie nejakej steny + vyseku samotnej vysky tej steny (podelene 1.5 aby sa ziskala cast vysky tej steny)

                            int positionY = (int)(player.getPositionY() + wall.getHeight() / 1.5);
                            foundWall = this.gridManager.getWallByYPosition(positionY);
                            if (foundWall != null) {
                                isPlayerAllowedToMove = false;
                            }

                            foundWall = this.gridManager.getWallByYPosition(player.getPositionY());

                            if (foundWall != null) {

                                boolean firstCondition = (player.getPositionY() + player.getHeight() >= foundWall.getStartPositionY());
                                boolean secondCondition = (player.getPositionY() + player.getHeight() / 2.0) < foundWall.getEndPositionY();

                                if (firstCondition && secondCondition) {
                                    isPlayerAllowedToMove = false;
                                } else {
                                    targetGrid = this.gridManager.getGridByTypeAndYPosition(GridType.GROUND, foundWall.getEndPositionY() + foundWall.getHeight() / 2);
                                }
                            } else {
                                foundWall = this.gridManager.getWallByYPosition(player.getPositionY() + player.getHeight());
                                if (foundWall != null) {
                                    boolean firstCondition = ((player.getPositionY() + player.getHeight()) > (foundWall.getStartPositionY() + foundWall.getHeight() / 2));
                                    if (firstCondition) {
                                        isPlayerAllowedToMove = false;
                                    } else {
                                        targetGrid = this.gridManager.getGridByTypeAndYPosition(GridType.GROUND, foundWall.getStartPositionY() - foundWall.getHeight() / 2);
                                    }
                                }
                            }

                            //ak sa stale mozme pohnut do prava, zistit kde sa nachazda y pozicia kde sa chceme pohnut

                        } else {
                            targetGrid = ground;
                        }
                        if (targetGrid != null && isPlayerAllowedToMove) {
                            targetYPosition = targetGrid.getEndPositionY();
                        }
                    }
                }

                if (isPlayerAllowedToMove) {
                    if (player.getMovementDirection() == MovementDirection.LEFT) {
                        player.setPositionX(player.getPositionX() - player.getSpeed());
                        int difference = targetYPosition - player.getPositionY() - player.getHeight();

                        if (difference < 0) {
                            player.setPositionY(player.getPositionY() - 1);
                        } else if (difference > 0) {
                            player.setPositionY(player.getPositionY() + 1);
                        }
                    } else if (player.getMovementDirection() == MovementDirection.RIGHT) {
                        player.setPositionX(player.getPositionX() + player.getSpeed());
                        int difference = targetYPosition - player.getPositionY() - player.getHeight();

                        if (difference < 0) {
                            player.setPositionY(player.getPositionY() - 1);
                        } else if (difference > 0) {
                            player.setPositionY(player.getPositionY() + 1);
                        }
                    } else if (player.getMovementDirection() == MovementDirection.UP) {
                        Grid foundGrid = this.gridManager.getGridByXPosition(player.getPositionX() + player.getCalculationWidth() / 2);
                        if (foundGrid != null) {
                            player.setPositionY(player.getPositionY() - player.getSpeed());

                            int rozdiel = foundGrid.getEndPositionX() - player.getPositionX() - player.getCalculationWidth() - 4;
                            if (rozdiel > 0) {
                                player.setPositionX(player.getPositionX() + 1);
                            } else if (rozdiel < 0) {
                                player.setPositionX(player.getPositionX() - 1);
                            }
                        }
                    } else if (player.getMovementDirection() == MovementDirection.DOWN) {
                        Grid foundGrid = this.gridManager.getGridByXPosition(player.getPositionX() + player.getCalculationWidth() / 2);
                        if (foundGrid != null) {
                            player.setPositionY(player.getPositionY() + player.getSpeed());

                            int rozdiel = foundGrid.getEndPositionX() - player.getPositionX() - player.getCalculationWidth() - 4;
                            if (rozdiel > 0) {
                                player.setPositionX(player.getPositionX() + 1);
                            } else if (rozdiel < 0) {
                                player.setPositionX(player.getPositionX() - 1);
                            }
                        }
                    }
                }
            }

            if (player.isPlantingBomb()) {
                if (player.getBombCount() > 0) {
                    Grid foundGrid = this.gridManager.findPositionForBomb(player.getPositionX() + player.getCalculationWidth() / 2, player.getPositionY() + player.getCalculationHeight());
                    if (foundGrid != null) {
                        Bomb bomb = new Bomb();
                        bomb.setTimeToExplode(120);
                        bomb.setTimeOfExplosion(20);
                        bomb.setWidth(32);
                        bomb.setHeight(32);
                        bomb.setFlameLength(player.getFlameLength());
                        bomb.setCurrentSpriteId(1);
                        bomb.setOwner(player.getColor());
                        player.setBombCount(player.getBombCount() - 1);
                        foundGrid.setBombInGrid(true);
                        foundGrid.setBomb(bomb);
                        player.setLastGridBombPlanted(foundGrid);
                        bomb.setPositionX(foundGrid.getStartPositionX());
                        bomb.setPositionY(foundGrid.getStartPositionY());
                        bombs.add(bomb);
                    }
                }
                player.setPlantingBomb(false);
            }
        }
    }

    public void handleKeyPressed(KeyEvent event, ArrayList<Player> players) {
        for (Player player : players) {
            if (player.getPlayerState() == PlayerState.DEAD) {
                continue;
            }
            if (player.getKeyLeft() == event.getCode()) {
                player.setMovingDirection(MovementDirection.LEFT);
                player.setInMove(true);
                player.setKeyLeftPressed(true);
                if (player.getDrawingOrder() != 1) {
                    player.setDrawingOrder(1);
                    if (player.getColor() == PlayerColor.WHITE) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.BLUE) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.GREEN) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.YELLOW) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            }
                        }
                    }
                }
            }
            if (player.getKeyRight() == event.getCode()) {
                player.setMovingDirection(MovementDirection.RIGHT);
                player.setInMove(true);
                player.setKeyRightPressed(true);
                if (player.getDrawingOrder() != 1) {
                    player.setDrawingOrder(1);
                    if (player.getColor() == PlayerColor.WHITE) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.BLUE) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.GREEN) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.YELLOW) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            }
                        }
                    }
                }
            }
            if (player.getKeyDown() == event.getCode()) {
                player.setMovingDirection(MovementDirection.DOWN);
                player.setInMove(true);
                player.setKeyDownPressed(true);
                if (player.getDrawingOrder() != 1) {
                    player.setDrawingOrder(1);
                    if (player.getColor() == PlayerColor.WHITE) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.BLUE) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.GREEN) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.YELLOW) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            }
                        }
                    }
                }
            }
            if (player.getKeyUp() == event.getCode()) {
                player.setMovingDirection(MovementDirection.UP);
                player.setInMove(true);
                player.setKeyUpPressed(true);
                if (player.getDrawingOrder() != 1) {
                    player.setDrawingOrder(1);
                    if (player.getColor() == PlayerColor.WHITE) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    }
                    if (player.getColor() == PlayerColor.BLUE) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.GREEN) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.YELLOW) {
                                value.updateDrawingOrder();
                            }
                        }
                    } else if (player.getColor() == PlayerColor.YELLOW) {
                        for (Player value : players) {
                            if (value.getColor() == PlayerColor.BLUE) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.GREEN) {
                                value.updateDrawingOrder();
                            } else if (value.getColor() == PlayerColor.WHITE) {
                                value.updateDrawingOrder();
                            }
                        }
                    }
                }
            }
            if (player.getPlantBombKey() == event.getCode() && player.getPlayerState() == PlayerState.ALIVE) {
                player.setPlantingBomb(true);
            }

        }
    }

    public void handleKeyReleased(KeyEvent event, ArrayList<Player> players) {
        for (Player player : players) {
            if (player.getPlayerState() == PlayerState.DEAD) {
                continue;
            }
            KeyCode c = event.getCode();

            if (player.getKeyLeft() == event.getCode()) {
                player.setKeyLeftPressed(false);
            } else if (player.getKeyRight() == event.getCode()) {
                player.setKeyRightPressed(false);
            } else if (player.getKeyDown() == event.getCode()) {
                player.setKeyDownPressed(false);
            } else if (player.getKeyUp() == event.getCode()) {
                player.setKeyUpPressed(false);
            }

            if (player.getPlantBombKey() == event.getCode()) {
                player.setPlantingBomb(false);
            }

            if (player.isKeyUpPressed()) {
                player.setMovingDirection(MovementDirection.UP);
            } else if (player.isKeyDownPressed()) {
                player.setMovingDirection(MovementDirection.DOWN);
            } else if (player.isKeyLeftPressed()) {
                player.setMovingDirection(MovementDirection.LEFT);
            } else if (player.isKeyRightPressed()) {
                player.setMovingDirection(MovementDirection.RIGHT);
            } else {
                player.setInMove(false);
            }
        }
    }
}

