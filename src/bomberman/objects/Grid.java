package bomberman.objects;

import java.util.ArrayList;

import bomberman.enums.GridType;
import bomberman.enums.ItemType;

public class Grid {
    private int startPositionX;
    private int startPositionY;
    private int endPositionX;
    private int endPositionY;
    private int xGridID;
    private int yGridID;
    private ArrayList<Integer> xPositions;
    private ArrayList<Integer> yPositions;
    private GridType gridType;
    private boolean isBombExplodedInGrid;
    private boolean isBombInGrid;
    private Bomb bomb;
    private boolean containsItems;
    private long ticksSinceLastBlink;
    private int destructionState;
    private int blinkSpriteId;
    private boolean isWallBeingDestroyed;
    private ItemType itemType;

    //int numberOfExplosionsInGrid
    //da sa zvysovat a znizovat, ak by som chcel preciznejsie odstranovat plamene z explodovanych bomb

    public Grid(int xGridID, int yGridID) {
        this.xGridID = xGridID;
        this.yGridID = yGridID;
        this.xPositions = new ArrayList<Integer>();
        this.yPositions = new ArrayList<Integer>();
        this.updatePositions();
        this.destructionState = 0;
    }

    public long getTicksSinceLastBlink() {
        return this.ticksSinceLastBlink;
    }

    public void setTicksSinceLastBlink(long ticksSinceLastBlink) {
        this.ticksSinceLastBlink = ticksSinceLastBlink;
    }

    public Bomb getBomb() {
        return this.bomb;
    }

    public void setBomb(Bomb bomb) {
        this.bomb = bomb;
    }

    public boolean isBombExplodedInGrid() {
        return this.isBombExplodedInGrid;
    }

    public void setBombExplodedInGrid(boolean bombExplodedInGrid) {
        this.isBombExplodedInGrid = bombExplodedInGrid;
    }

    public int getHeight() {
        return this.endPositionY - this.startPositionY;
    }

    public int getWidth() {
        return this.endPositionX - this.startPositionX;
    }

    public int getStartPositionX() {
        return this.startPositionX;
    }

    public int getStartPositionY() {
        return this.startPositionY;
    }

    public int getEndPositionX() {
        return this.endPositionX;
    }

    public int getEndPositionY() {
        return this.endPositionY;
    }

    public ArrayList<Integer> getXPositions() {
        return this.xPositions;
    }

    public ArrayList<Integer> getYPositions() {
        return this.yPositions;
    }

    public int getIdX() {
        return this.xGridID;
    }

    public int getIdY() {
        return this.yGridID;
    }

    public boolean isContainsItems() {
        return this.containsItems;
    }

    public void setContainsItems(boolean containsItems) {
        this.containsItems = containsItems;
    }

    public int getBlinkSpriteId() {
        return this.blinkSpriteId;
    }

    public void setBlinkSpriteId(int blinkSpriteId) {
        this.blinkSpriteId = blinkSpriteId;
    }

    public ItemType getItemType() {
        return this.itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    private void updatePositions() {
        /*táto metóda ma úlohu pradiť gridu všetky X a Y súradnice ktoré mu patria.*/
        this.startPositionX = this.xGridID * 32;
        this.endPositionX = (this.xGridID + 1) * 32;

        this.startPositionY = this.yGridID * 32;
        this.endPositionY = (this.yGridID + 1) * 32;

        this.xPositions.clear();
        this.yPositions.clear();

        int xPositionsCount = this.endPositionX - this.startPositionX;
        int yPositionsCount = this.endPositionY - this.startPositionY;

        for (int x = 0; x < xPositionsCount; x++) {
            this.xPositions.add(this.startPositionX + x);
        }

        for (int x = 0; x < yPositionsCount; x++) {
            this.yPositions.add(this.startPositionY + x);
        }
    }

    public int getDestructionState() {
        return this.destructionState;
    }

    public void setDestructionState(int destructionState) {
        this.destructionState = destructionState;
    }

    public boolean isWallBeingDestroyed() {
        return this.isWallBeingDestroyed;
    }

    public void setWallBeingDestroyed(boolean wallBeingDestroyed) {
        this.isWallBeingDestroyed = wallBeingDestroyed;
    }

    public GridType getGridType() {
        return this.gridType;
    }

    public void setGridType(GridType gridType) {
        this.gridType = gridType;
    }

    public boolean isBombInGrid() {
        return this.isBombInGrid;
    }

    public void setBombInGrid(boolean bombInGrid) {
        this.isBombInGrid = bombInGrid;
    }

}