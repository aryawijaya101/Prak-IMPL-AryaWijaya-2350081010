package LatihanCleanCode.MeaningfulNames;

import java.util.ArrayList;
import java.util.List;

public class MeaningfulNames {

    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED_STATUS = 4;

    private int[][] gameBoard;

    public MeaningfulNames(int[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<>();

        for (int[] cell : gameBoard) {
            if (cell[STATUS_VALUE] == FLAGGED_STATUS) {
                flaggedCells.add(cell);
            }
        }

        return flaggedCells;
    }
}
