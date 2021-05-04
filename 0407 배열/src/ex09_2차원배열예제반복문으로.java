
public class ex09_2차원배열예제반복문으로 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25

		int cnt = 21;
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				array[i][k] = cnt;
				cnt++;
			}
		}

		System.out.println(array[4][4]);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k <array[0].length; k++) {
				System.out.print(array[k][i] + "\t");
			}
			
			System.out.println();
			
			
		}

	}

}
