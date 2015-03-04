package graphics;

public class Transformations {

	public static int[][] multMatrices(int[][] x, int[][] y) {
		
		int[][] retval = new int[x.length][y[0].length];
		for(int i = 0; i < retval.length; i++) {
			for(int j = 0; j < retval[0].length; j++) {
				retval[i][j] = rowByCol(x, y, i, j);
			}
		}
		return retval;
	}
	
	public static int rowByCol(int[][] x, int[][] y, int xrow, int ycol) {

		int[] col = new int[y.length]; 
		int[] row = x[xrow];
		int retval = 0;
		
		for(int i = 0; i < y.length; i++) {
			col[i] = y[i][ycol]; 
		}
		
		for(int i = 0; i < row.length; i++) {
			retval += row[i]*col[i];
		}
		return retval;
	}
	
	public static void project(Node node) {
		
	}
}