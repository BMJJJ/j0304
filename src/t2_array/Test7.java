package t2_array;
//[]하나 적으면 1차원 [행][열]2개면 2차원
public class Test7 {
	public static void main(String[] args) {
		int[][] atom = new int[3][4];
		
		for(int i =0; i<4; i++) {
			System.out.print(atom[0][i] + " / ");
		}
		System.out.println();
		
		for(int i =0; i<4; i++) {
			System.out.print(atom[1][i] + " / ");
		}
		System.out.println();
		
		for(int i =0; i<4; i++) {
			System.out.print(atom[2][i] + " / ");
		}
		System.out.println();
		System.out.println("==============");
		
		for(int i=0; i<3; i++ ) {
			for(int j=0; j<4; j++) {
				System.out.print (atom[i][j] + " / ");
			}
			System.out.println();
		}
	}
}
