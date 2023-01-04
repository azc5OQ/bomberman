package bomberman;


import java.util.ArrayList;

import bomberman.enums.GridType;
import bomberman.objects.Grid;

public class GridManager {
    private ArrayList<Grid> grids;

    public ArrayList<Grid> getGrids() {
        return this.grids;
    }

    public void setGrids(ArrayList<Grid> grids) {
        this.grids = grids;
    }

    public Grid getGridByYPosition(int positionY) {
        Grid result = null;
        for (Grid grid : this.grids) {
            ArrayList<Integer> yPositions = grid.getYPositions();
            if (yPositions.contains(positionY)) {
                result = grid;
                break;
            }
        }
        return result;
    }

    public Grid getGridByTypeAndYPosition(GridType type, int positionY) {
        Grid result = null;
        for (Grid grid : this.grids) {
            if (grid.getGridType() != type) {
                continue;
            }
            ArrayList<Integer> yPositions = grid.getYPositions();
            if (yPositions.contains(positionY)) {
                result = grid;
                break;
            }
        }
        return result;
    }

    public ArrayList<Grid> getMarkedGrids() {
        ArrayList<Grid> result = new ArrayList<>();

        for (Grid grid : this.grids) {
            result.add(grid);
        }
        return result;
    }

    public ArrayList<Grid> getGridsWithActiveExplosion() {
        ArrayList<Grid> result = new ArrayList<>();
        for (Grid grid : this.grids) {
            if (grid.isBombExplodedInGrid()) {
                result.add(grid);
            }
        }
        return result;
    }

    public Grid getGridByTypeAndXPosition(GridType type, int positionX) {
        Grid result = null;
        for (Grid grid : this.grids) {
            if (grid.getGridType() != type) {
                continue;
            }
            if (grid.getXPositions().contains(positionX)) {
                result = grid;
                break;
            }
        }
        return result;
    }

    //navráti sa prvý Grid ktorý vyhovuje Podmienke
    public Grid getGridByTypeByXPositionAndYPosition(GridType type, int positionX, int positionY) {
        Grid result = null;
        for (Grid grid : this.grids) {
            if (grid.getGridType() != type) {
                continue;
            }

            if (grid.getXPositions().contains(positionX) && grid.getYPositions().contains(positionY)) {
                result = grid;
                break;
            }
        }
        return result;
    }

    public Grid getGridByXIdAndYId(int xGridId, int yGridId) {
        Grid result = null;
        for (Grid grid : this.grids) {

            if (grid.getIdX() == xGridId && grid.getIdY() == yGridId) {
                result = grid;
                break;
            }
        }
        return result;
    }

    public Grid getGridContainingBombByXPositionAndYPosition(int positionX, int positionY) {
        Grid result = null;
        for (Grid grid : this.grids) {
            if (!grid.isBombInGrid()) {
                continue;
            }
            //ArrayList<Integer> xPositions = grid.getXPositions();
            //ArrayList<Integer> yPositions = grid.getYPositions();

            if (grid.getXPositions().contains(positionX) && grid.getYPositions().contains(positionY)) {
                result = grid;
                break;
            }
        }
        return result;
    }

    public Grid getWallByYPosition(int positionY) {
        Grid result = null;

        for (Grid grid : this.grids) {
            if (grid.getGridType() == GridType.BREAKABLE_WALL || grid.getGridType() == GridType.WALL) {
                if (grid.getYPositions().contains(positionY)) {
                    result = grid;
                    break;
                }
            }
        }
        return result;
    }

    public Grid getWallByXPosition(int positionX) {
        Grid result = null;

        for (Grid grid : this.grids) {
            if (grid.getGridType() == GridType.BREAKABLE_WALL || grid.getGridType() == GridType.WALL) {
                if (grid.getXPositions().contains(positionX)) {
                    result = grid;
                    break;
                }
            }
        }
        return result;
    }

    public Grid getWallByXPositionAndYPosition(int positionX, int positionY) {
        Grid result = null;

        for (Grid grid : this.grids) {
            if (grid.getGridType() == GridType.BREAKABLE_WALL || grid.getGridType() == GridType.WALL) {
                if (grid.getXPositions().contains(positionX) && grid.getYPositions().contains(positionY)) {
                    result = grid;
                    break;
                }
            }
        }
        return result;
    }

    public ArrayList<Grid> getGridsByType(GridType type) {
        ArrayList<Grid> result = new ArrayList<Grid>();

        for (Grid grid : this.grids) {
            if (grid.getGridType() == type) {
                result.add(grid);
            }
        }
        return result;
    }


    public Grid getGridByXPosition(int positionX) {
        Grid result = null;
        for (Grid grid : this.grids) {
            if (grid.getXPositions().contains(positionX)) {
                result = grid;
                break;
            }
        }
        return result;
    }

    public Grid findPositionForBomb(int positionX, int positionY) {
        Grid foundGrid = null;
        for (Grid grid : this.grids) {
            if (grid.getGridType() != GridType.GROUND) {
                continue;
            }

            if (grid.getXPositions().contains(positionX) && grid.getYPositions().contains(positionY)) {
                if (grid.isBombInGrid()) {
                    break;
                }
                foundGrid = grid;
                break;
            }
        }
        return foundGrid;
    }
}