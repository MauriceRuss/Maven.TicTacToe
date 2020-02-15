package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] tttBoard;

    public Board(Character[][] matrix) {
        this.tttBoard = matrix;

    }

    public Boolean checkVert(Character Z) {
        for (int q = 0; q < 3; q++) {
            if (tttBoard[0][q] == Z && tttBoard[1][q] == Z && tttBoard[2][q] == Z) {
                return true;
            }
        }
        return false;
    }

    public Boolean checkHor(Character Z) {
        for (int q = 0; q < 3; q++) {
            if (tttBoard[q][0] == Z && tttBoard[q][1] == Z && tttBoard[q][2] == Z) {
                return true;
            }
        }
        return false;
    }

    public Boolean checkDiag(Character Z) {
        if ((tttBoard[0][0] == Z) && (tttBoard[1][1] == Z) && (tttBoard[2][2] == Z)) {
            return true;
        } else if ((tttBoard[0][2] == Z) && (tttBoard[1][1] == Z) && (tttBoard[2][0] == Z)) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfX() {
        if (checkVert('X') || checkHor('X') || checkDiag('X')) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if (checkVert('O') || checkHor('O') || checkDiag('O')) {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if (checkVert('X') || checkHor('X') || checkDiag('X')) {
            return false;
        } else if (checkVert('O') || checkHor('O') || checkDiag('O')) {
            return false;
        }
        return true;
    }

    public String getWinner() {
        String result = "";
        if (checkVert('X') || checkHor('X') || checkDiag('X')) {
            result ="X";
        } else if (checkVert('O') || checkHor('O') || checkDiag('O')) {
            result = "O";
        }
        return result;
    }

}

