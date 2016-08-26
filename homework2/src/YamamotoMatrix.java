/**
 * An implementation of the Matrix ADT. Provides four basic operations over an
 * immutable type.
 *
 * @author Shinya Yamamoto
 * @version (version)
 */
public class YamamotoMatrix implements Matrix {

	//TODO: implement interface.
	int[][] data;

	//Constractor
	YamamotoMatrix(int[][] data) {
		this.data = data;
	}

	public int getElement(int y, int x) {
		return data[y][x];
	}

	public int getRows() {
		return data.length;
	}

	public int getColumns() {
		if(data.length > 0) {
			return data[0].length;
		} else {
			return 0;
		}
	}

	public Matrix scale(int scalar) {
		int [][] newData = new int[getRows()][getColumns()];
		for(int y = 0; y < getRows(); y++){
			for(int x = 0; x < getColumns(); x++) {
				newData[y][x] = getElement(y,x) * scalar;
			}
		}
		Matrix new_matrix = new YamamotoMatrix(newData);
		return new_matrix;
	}

	public Matrix plus(Matrix other) {
		int [][] newData = new int[getRows()][getColumns()];
		for(int y = 0; y < getRows(); y++){
			for(int x = 0; x < getColumns(); x++) {
				newData[y][x] = getElement(y,x) + other.getElement(y,x);
			}
		}
		Matrix new_matrix = new YamamotoMatrix(newData);
		return new_matrix;
	}

	public Matrix minus(Matrix other) {
		int [][] newData = new int[getRows()][getColumns()];
		for(int y = 0; y < getRows(); y++){
			for(int x = 0; x < getColumns(); x++) {
				newData[y][x] = getElement(y,x) - other.getElement(y,x);
			}
		}
		Matrix new_matrix = new YamamotoMatrix(newData);
		return new_matrix;
	}

	@Override public boolean equals(Object other) {

		Matrix matrix;

		if (!(other instanceof Matrix)) {
			return false;
		} else {
			matrix = (Matrix) other;
		}

		if(getRows() != matrix.getRows()) {
			return false;
		}

		if(getColumns() != matrix.getColumns()) {
			return false;
		}

		for(int y = 0; y < getRows(); y++){
			for(int x = 0; x < getColumns(); x++) {
				if(getElement(y,x) != (matrix.getElement(y,x))) {
					return false;
				}
			}
		}
		return true;
	}

	@Override public String toString() {
		String returnStr = "";
		if(getRows()>0 && getColumns() > 0) {
			for(int y = 0; y < getRows(); y++){
				for(int x = 0; x < getColumns(); x++) {
					returnStr += getElement(y,x) + " ";
				}
				returnStr += "\n";
			}
		} else {
			returnStr = "[]";
		}

		return returnStr;
	}
	/**
	 * Entry point for matrix testing.
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		int[][] data1 = new int[0][0];
		int[][] data2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] data3 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};

		Matrix m1 = new YamamotoMatrix(data1);
		Matrix m2 = new YamamotoMatrix(data2);
		Matrix m3 = new YamamotoMatrix(data3);

		System.out.println("m1 --> Rows: " + m1.getRows() + " Columns: " + m1.getColumns());
		System.out.println("m2 --> Rows: " + m2.getRows() + " Columns: " + m2.getColumns());
		System.out.println("m3 --> Rows: " + m3.getRows() + " Columns: " + m3.getColumns());

        //TODO: reference issues
		//check for reference issues
		System.out.println("m2 -->\n" + m2);
		data2[1][1] = 101;
		System.out.println("m2 -->\n" + m2);

		//test equals
		System.out.println("m2==null: " + m2.equals(null));             //false
		System.out.println("m3==\"MATRIX\": " + m2.equals("MATRIX"));   //false
		System.out.println("m2==m1: " + m2.equals(m1));                 //false
		System.out.println("m2==m2: " + m2.equals(m2));                 //true
		System.out.println("m2==m3: " + m2.equals(m3));                 //false

		//test operations (valid)
		System.out.println("2 * m2:\n" + m2.scale(2));
		System.out.println("m2 + m3:\n" + m2.plus(m3));
		System.out.println("m2 - m3:\n" + m2.minus(m3));

		//test operations (invalid)
		//System.out.println("m1 + m2" + m1.plus(m2));
		//System.out.println("m1 - m2" + m1.minus(m2));
	}
}