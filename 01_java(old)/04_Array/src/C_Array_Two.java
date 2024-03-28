public class C_Array_Two {
	public static void main(String[] args) {
		/*
		 * [2차원 배열] : 자료형이 같은 1차원 배열의 묶음으로 배열 안에 다른 배열이 존재한다.
		 *              2차원 배열은 할당된 공간마다 인덱스 번호를 두개 부여한다.
		 *              [앞 번호는 몇번째 1차원 배열인지(행), 뒷 번호는 1차원 배열의 몇번째인지(열)]
		 *              
		 * [2차원 배열 선언] : 1차원 배열의 묶음을 참조하는 2차원의 배열 참조변수를 생성.
		 *                  자료형 배열명 [][];
		 *                  자료형[][] 배열명;
		 * 1차원 배열의 참조변수 묶음 먼저 생성 가능 => 배열명 = new 자료형[m][];
		 */
		
		// 2차원 배열 생성
//		int[][] arr;
		 /* 
		  * 2차원 배열 할당 : 실제 n크기의 1차원 배열 m개를 만들어서 참조
		  * arr = new 자로형[3][4]; / 배열명[0] = new int[4]; 배열명[1] = new int[4] 배열명[2] = new int[4]
		  */
//		int m, n;
//		m = 3; n = 4;
//		arr = new int[m][n];
//		arr = new int[m][];
//		arr[0] = new int[4];
//		arr[1] = new int[4];
//		arr[2] = new int[4];
		// 배열 선언과 동시에 할당(생성과 동시에 크기 지정)
//		int[][] tmp = new int[5][5]; // 5크기의 1차원 배열 5개를 가진 2차원 배열 생성
		/*
		 * 값 대입 : 배열명[배열순번][인덱스] = 값;
		 */
//		arr[0][0] = 1;
//		arr[1][1] = 2;
//		arr[2][3] = 3;
		
		// 3행 3열짜리 문자열 배열을 선언 및 할당하고 인덱스 0행0열부터 2행2열까지 차례대로 접근하여
		// (행, 열)값을 저장한 후 출력하세요
		
		String[][] arr = new String[3][3];
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = "(" + row + ", " + col + ")";
			}
		}
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
}
