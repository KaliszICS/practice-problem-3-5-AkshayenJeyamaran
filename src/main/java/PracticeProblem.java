public class PracticeProblem {
	public static void main(String args[]) {
    	}
	public static int searchMazeMoves(String[][] arr) {
		int curRow = arr.length - 1; 
		int curCol = 0; 
        return dfsHelper(arr, curRow, curCol);
	}
	public static int dfsHelper(String[][] arr, int curRow, int curCol) {
        if (curRow < 0 || curCol >= arr[0].length) {
            return -1;
        }
        if (arr[curRow][curCol].equals("F")) {
            return 0;
        }
        int up = dfsHelper(arr, curRow - 1, curCol);
        int right = dfsHelper(arr, curRow, curCol + 1);
        if (up == -1 && right == -1) {
            return -1; }
        else if (up == -1) {
            return right + 1; }
        else if (right == -1) {
            return up + 1; }
        return (Math.min(up, right)) + 1;
    }
    public static int noOfPaths(String[][] arr) {
		int curRow = arr.length - 1; 
		int curCol = 0; 
        return dfsHelper2(arr, curRow, curCol);
	}
	public static int dfsHelper2(String[][] arr, int curRow, int curCol) {
        if (curRow < 0 || curCol >= arr[0].length) {
            return 0;
        }
        if (arr[curRow][curCol].equals("F")) {
            return 1;
        }
        int up = dfsHelper2(arr, curRow - 1, curCol);
        int right = dfsHelper2(arr, curRow, curCol + 1);
        return (up + right);
    }
}