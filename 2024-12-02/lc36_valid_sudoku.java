public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = 9;
        int column = 9;

        HashSet set = new HashSet<>();

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            char num = board[i][j];

            if (num != '.') {
                if (!set.add(num + "row" + i) || !set.add(num + "col" + j) || !set.add(num + "box" + i/3 + j/3))
                return false;
            }
        }
    }

    return true;
        
    }

}