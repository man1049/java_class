package naver.tkdalswoals.a211029;

public class Matrix {

	public static void main(String[] args) {
		String[][] Matrix = {{"맹자","공자","소자"},{"김백산","태백산","소백산"}};
		
		
		int rows = Matrix.length;
		int cols = Matrix[0].length;
		
		for(int i = 0 ; i < rows ; i = i + 1) {
			for(int J = 0 ; J < cols ; J = J + 1) {
				System.out.print(Matrix[i][J]+" ");
			}
			System.out.println("");
		}
		for(int i = 0 ; i < cols ; i = i + 1) {
			for(int J = 0 ; J < rows ; J = J + 1) {
				System.out.print(Matrix[J][i]+" ");
			}
			System.out.println("");
		}
		
		
	}
}