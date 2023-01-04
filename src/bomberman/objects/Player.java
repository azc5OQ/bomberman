package bomberman.objects;

import javafx.scene.input.KeyCode;

import bomberman.enums.PlayerColor;
import bomberman.enums.PlayerState;
import bomberman.enums.MovementDirection;

public class Player {
    private boolean plantingBomb;
    private PlayerColor color;
    private PlayerState playerState;
    private MovementDirection movementDirection;
    private int bombCount;
    private int flameLength;
    private int speed;
    private int positionX;
    private int positionY;
    private int width;
    private int height;
    private KeyCode keyUp;
    private KeyCode keyDown;
    private KeyCode keyLeft;
    private KeyCode keyRight;
    private KeyCode plantBombKey;
    private int animationSpriteId;
    private int calculationWidth;
    private int calculationHeight;
    private int drawingOrder;
    private boolean keyUpPressed;
    private boolean keyDownPressed;
    private boolean keyLeftPressed;
    private boolean keyRightPressed;
    private Grid lastGridBombPlanted;
    private boolean isInMove;

    public Player() {
        this.movementDirection = MovementDirection.DOWN;
        this.animationSpriteId = 1;
        this.bombCount = 1;
        this.playerState = PlayerState.ALIVE;
        this.setInMove(false);
        this.flameLength = 3;
        this.speed = 3;
        this.isInMove = false;
    }

    public Grid getLastGridBombPlanted() {
        return this.lastGridBombPlanted;
    }

    public void setLastGridBombPlanted(Grid lastGridBombPlanted) {
        this.lastGridBombPlanted = lastGridBombPlanted;
    }

    public boolean isKeyUpPressed() {
        return this.keyUpPressed;
    }

    public void setKeyUpPressed(boolean keyUpPressed) {
        this.keyUpPressed = keyUpPressed;
    }

    public boolean isKeyDownPressed() {
        return this.keyDownPressed;
    }

    public void setKeyDownPressed(boolean keyDownPressed) {
        this.keyDownPressed = keyDownPressed;
    }

    public boolean isKeyLeftPressed() {
        return this.keyLeftPressed;
    }

    public void setKeyLeftPressed(boolean keyLeftPressed) {
        this.keyLeftPressed = keyLeftPressed;
    }

    public boolean isKeyRightPressed() {
        return this.keyRightPressed;
    }

    public void setKeyRightPressed(boolean keyRightPressed) {
        this.keyRightPressed = keyRightPressed;
    }

    public boolean isPlantingBomb() {
        return this.plantingBomb;
    }

    public void setPlantingBomb(boolean plantingBomb) {
        this.plantingBomb = plantingBomb;
    }

    public MovementDirection getMovementDirection() {
        return this.movementDirection;
    }

    public void setMovingDirection(MovementDirection movingDirection) {
        this.movementDirection = movingDirection;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isInMove() {
        return this.isInMove;
    }

    public void setInMove(boolean inMove) {
        this.isInMove = inMove;
    }

    public PlayerColor getColor() {
        return this.color;
    }

    public void setColor(PlayerColor color) {
        this.color = color;
    }

    public int getBombCount() {
        return this.bombCount;
    }

    public void setBombCount(int bombCount) {
        this.bombCount = bombCount;
    }

    public int getFlameLength() {
        return this.flameLength;
    }

    public void setFlameLength(int flameLength) {
        this.flameLength = flameLength;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPositionX() {
        return this.positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getAnimationSpriteId() {
        return this.animationSpriteId;
    }

    public void setAnimationSpriteId(int animationSpriteId) {
        this.animationSpriteId = animationSpriteId;
    }

    public PlayerState getPlayerState() {
        return this.playerState;
    }

    public void setPlayerState(PlayerState status) {
        this.playerState = status;
    }

    public KeyCode getKeyUp() {
        return this.keyUp;
    }

    public void setKeyUp(KeyCode keyUp) {
        this.keyUp = keyUp;
    }

    public KeyCode getKeyDown() {
        return this.keyDown;
    }

    public void setKeyDown(KeyCode keyDown) {
        this.keyDown = keyDown;
    }

    public KeyCode getKeyLeft() {
        return this.keyLeft;
    }

    public void setKeyLeft(KeyCode keyLeft) {
        this.keyLeft = keyLeft;
    }

    public KeyCode getKeyRight() {
        return this.keyRight;
    }

    public void setKeyRight(KeyCode keyRight) {
        this.keyRight = keyRight;
    }

    public int getCalculationWidth() {
        return this.calculationWidth;
    }

    public void setCalculationWidth(int calculationWidth) {
        this.calculationWidth = calculationWidth;
    }

    public int getCalculationHeight() {
        return this.calculationHeight;
    }

    public void setCalculationHeight(int calculationHeight) {
        this.calculationHeight = calculationHeight;
    }

    public int getDrawingOrder() {
        return this.drawingOrder;
    }

    public void setDrawingOrder(int drawingOrder) {
        this.drawingOrder = drawingOrder;
    }

    public KeyCode getPlantBombKey() {
        return this.plantBombKey;
    }

    public void setPlantBombKey(KeyCode plantBombKey) {
        this.plantBombKey = plantBombKey;
    }

    public void updateDrawingOrder() {

        switch (this.drawingOrder) {
            case 1:
                this.drawingOrder = 2;
                break;

            case 2:
                this.drawingOrder = 3;
                break;

            case 3:
                this.drawingOrder = 4;
                break;
        }
    }
}
