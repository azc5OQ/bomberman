package bomberman.objects;

import bomberman.enums.PlayerColor;

public class Bomb {
    private int positionX;
    private int positionY;
    private int width;
    private int height;
    private int flameLength;
    private int flameLengthForSingleExplosionUp;
    private int flameLengthForSingleExplosionDown;
    private int flameLengthForSingleExplosionLeft;
    private int flameLengthForSingleExplosionRight;
    private PlayerColor owner;
    private int currentlyUsedSpriteId;
    private int timeToExplode;
    private int timeOfExplosion; //cas ktory zaberie samotna explozia bomby
    private boolean isExploding;
    private int explodingBombSprite;


    public Bomb() {
        this.explodingBombSprite = 0;
        this.isExploding = false;
    }

    public boolean isExploding() {
        return this.isExploding;
    }

    public void setExploding(boolean exploding) {
        this.isExploding = exploding;
    }

    public int getTimeOfExplosion() {
        return this.timeOfExplosion;
    }

    public void setTimeOfExplosion(int timeOfExplosion) {
        this.timeOfExplosion = timeOfExplosion;
    }

    public int getFlameLength() {
        return this.flameLength;
    }

    public void setFlameLength(int flameLength) {
        this.flameLength = flameLength;
    }

    public PlayerColor getOwner() {
        return this.owner;
    }

    public void setOwner(PlayerColor owner) {
        this.owner = owner;
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

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCurrentSpriteId() {
        return this.currentlyUsedSpriteId;
    }

    public void setCurrentSpriteId(int animationState) {
        this.currentlyUsedSpriteId = animationState;
    }

    public int getTimeToExplode() {
        return this.timeToExplode;
    }

    public void setTimeToExplode(int timeToExplode) {
        this.timeToExplode = timeToExplode;
    }

    public int getExplodingBombSprite() {
        return this.explodingBombSprite;
    }

    public void setExplodingBombSprite(int explodingBombSprite) {
        this.explodingBombSprite = explodingBombSprite;
    }

    public int getFlameLengthForSingleExplosionUp() {
        return this.flameLengthForSingleExplosionUp;
    }

    public void setFlameLengthForSingleExplosionUp(int flameLengthForSingleExplosionUp) {
        this.flameLengthForSingleExplosionUp = flameLengthForSingleExplosionUp;
    }

    public int getFlameLengthForSingleExplosionDown() {
        return this.flameLengthForSingleExplosionDown;
    }

    public void setFlameLengthForSingleExplosionDown(int flameLengthForSingleExplosionDown) {
        this.flameLengthForSingleExplosionDown = flameLengthForSingleExplosionDown;
    }

    public int getFlameLengthForSingleExplosionLeft() {
        return this.flameLengthForSingleExplosionLeft;
    }

    public void setFlameLengthForSingleExplosionLeft(int flameLengthForSingleExplosionLeft) {
        this.flameLengthForSingleExplosionLeft = flameLengthForSingleExplosionLeft;
    }

    public int getFlameLengthForSingleExplosionRight() {
        return this.flameLengthForSingleExplosionRight;
    }

    public void setFlameLengthForSingleExplosionRight(int flameLengthForSingleExplosionRight) {
        this.flameLengthForSingleExplosionRight = flameLengthForSingleExplosionRight;
    }
}
