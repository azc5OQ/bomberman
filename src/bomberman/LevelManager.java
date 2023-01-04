package bomberman;

import bomberman.enums.GridType;
import bomberman.enums.ItemType;
import bomberman.objects.Grid;
import java.util.ArrayList;

public class LevelManager {

    private GridManager gridManager;

    public LevelManager(GridManager gridManager) {
        this.gridManager = gridManager;
    }

    public void createClassicLevel() {

        ArrayList<Grid> grids = new ArrayList<Grid>();
        int xGridCount = 19;
        int yGridCount = 19;

        for (int x = 0; x < xGridCount; x++) {
            for (int y = 0; y < yGridCount; y++) {
                Grid grid = new Grid(x, y);
                //ak grid splina podmienku, bude z neho okraj areny
                if (x == 0 || ((x + 1) == xGridCount) || y == 0 || ((y + 1) == yGridCount)) {
                    grid.setGridType(GridType.ARENA_BORDER);
                } else if ((x % 2 == 0) && ((x + 1) != xGridCount) && (y % 2 == 0) && ((y + 1) != yGridCount)) {
                    grid.setGridType(GridType.WALL);
                }
                grids.add(grid);
            }
        }

        for (Grid grid : grids) {
            //grid ktory nemal ziadnty typ bude typu ground
            if (grid.getGridType() == null) {
                grid.setGridType(GridType.GROUND);
            }
        }

        //vygenerovanie znicitelnychstien

        ArrayList<Grid> breakableWalls = new ArrayList<Grid>();

        for (int x = 0; x < 370; x++) {
            int xGridId = (int)((Math.random() * (19 - 1)) + 1);
            int yGridId = (int)((Math.random() * (19 - 1)) + 1);

            Grid grid = new Grid(xGridId, yGridId);
            grid.setGridType(GridType.BREAKABLE_WALL);
            breakableWalls.add(grid);
        }


        for (int x = 0; x < 40; x++) {
            int xGridId = (int)((Math.random() * (19 - 1)) + 1);
            int yGridId = (int)((Math.random() * (19 - 1)) + 1);

            Grid grid = new Grid(xGridId, yGridId);
            grid.setGridType(GridType.BREAKABLE_WALL);
            breakableWalls.add(grid);
        }

        this.gridManager.setGrids(grids);

        //vygenerovane steny sa nakopiruju do gridManagera

        for (Grid grid : breakableWalls) {
            Grid foundGrid = this.gridManager.getGridByXIdAndYId(grid.getIdX(), grid.getIdY());
            if (foundGrid.getGridType() == GridType.GROUND) {
                foundGrid.setGridType(GridType.BREAKABLE_WALL);
            }
        }

        //znicitelne steny sa odstrania z priestoru kde sa spawne hrac, aby im bol umozneny minimalny pohyb
        this.gridManager.getGridByXIdAndYId(1, 1).setGridType(GridType.GROUND);
        this.gridManager.getGridByXIdAndYId(1, 2).setGridType(GridType.GROUND);
        this.gridManager.getGridByXIdAndYId(2, 1).setGridType(GridType.GROUND);

        this.gridManager.getGridByXIdAndYId(16, 1).setGridType(GridType.GROUND);
        this.gridManager.getGridByXIdAndYId(17, 1).setGridType(GridType.GROUND);
        this.gridManager.getGridByXIdAndYId(17, 2).setGridType(GridType.GROUND);

        this.gridManager.getGridByXIdAndYId(1, 16).setGridType(GridType.GROUND);
        this.gridManager.getGridByXIdAndYId(1, 17).setGridType(GridType.GROUND);
        this.gridManager.getGridByXIdAndYId(2, 17).setGridType(GridType.GROUND);

        this.gridManager.getGridByXIdAndYId(17, 16).setGridType(GridType.GROUND);
        this.gridManager.getGridByXIdAndYId(17, 17).setGridType(GridType.GROUND);
        this.gridManager.getGridByXIdAndYId(16, 17).setGridType(GridType.GROUND);

        //do niektorych znicitelnych stien pridat itemy
        for (int x = 0; x < 30; x++) {

            int xGridId = (int)((Math.random() * (19 - 1)) + 1);
            int yGridId = (int)((Math.random() * (19 - 1)) + 1);
            int randomItem = (int)((Math.random() * (3 - 0)) + 0);

            Grid grid = this.gridManager.getGridByXIdAndYId(xGridId, yGridId);
            if (grid.getGridType() != GridType.BREAKABLE_WALL) {
                continue;
            }

            this.addItem(xGridId, yGridId, ItemType.values()[randomItem]);
        }
    }

    public void createWaterLevel() {
        ArrayList<Grid> grids = new ArrayList<Grid>();
        int xGridCount = 19;
        int yGridCount = 19;

        for (int x = 0; x < xGridCount; x++) {
            for (int y = 0; y < yGridCount; y++) {
                Grid grid = new Grid(x, y);
                //ak grid splina podmienku, bude z neho okraj areny
                if (x == 0 || ((x + 1) == xGridCount) || y == 0 || ((y + 1) == yGridCount)) {
                    grid.setGridType(GridType.ARENA_BORDER);
                }

                if ((x > 2 && x < 5) || (x > 13 && x < 16)) {
                    if (y > 3 && y < 15) {
                        grid.setGridType(GridType.BREAKABLE_WALL);
                    }
                }

                if ((x > 2 && x < 14)) {
                    if ((y > 4 && y < 8 ) || (y > 10 && y < 14)) {
                        grid.setGridType(GridType.BREAKABLE_WALL);
                    }
                }

                grids.add(grid);
            }
        }

        for (Grid grid : grids) {
            //grid ktory nemal ziadnty typ bude typu ground
            if (grid.getGridType() == null) {
                grid.setGridType(GridType.GROUND);

                if (grid.getIdX() == 3 && grid.getIdY() == 2) {
                    grid.setGridType(GridType.WALL);
                } else if (grid.getIdX() == 4 && grid.getIdY() == 3) {
                    grid.setGridType(GridType.WALL);
                }

                //pridanie itemov do stredu mapy
            }
        }

        this.gridManager.setGrids(grids);

        this.addItem(7, 8, ItemType.BOMB);
        this.addItem(13, 8, ItemType.FLAME);
        this.addItem(9, 9, ItemType.BOMB);
        this.addItem(5, 10, ItemType.FLAME);
        this.addItem(9, 10, ItemType.BOMB);
        this.addItem(10, 10, ItemType.FLAME);
        this.addItem(11, 10, ItemType.FLAME);
        this.addItem(7, 9, ItemType.FLAME);
        this.addItem(8, 9, ItemType.BOMB);
        this.addItem(12, 8, ItemType.SPEED);
        this.addItem(8, 8, ItemType.SPEED);
        this.addItem(10, 8, ItemType.BOMB);
        this.addItem(6, 8, ItemType.FLAME);
        this.addItem(13, 10, ItemType.FLAME);
        this.addItem(13, 9, ItemType.SPEED);
        this.addItem(12, 9, ItemType.BOMB);
        this.addItem(11, 9, ItemType.SPEED);
        this.addItem(6, 9, ItemType.BOMB);

    }

    private void addItem(int xGridId, int yGridId, ItemType itemType) {
        for (Grid grid : this.gridManager.getGrids()) {
            if (xGridId == grid.getIdX() && yGridId == grid.getIdY()) {
                grid.setContainsItems(true);
                grid.setItemType(itemType);
            }
        }
    }
}
