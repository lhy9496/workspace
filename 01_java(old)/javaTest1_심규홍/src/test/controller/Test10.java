package test.controller;

public class Test10 {

    public static void main(String[] args) {
        int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
        int[] copyAr = new int[array.length * array[0].length]; // 1차원 배열 크기 설정

        int count = 0; // copyAr 배열에 값 추가할 때 사용할 인덱스 변수

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int value = array[i][j];
                boolean isDuplicate = false;

                // 중복값 체크
                for (int k = 0; k < count; k++) {
                    if (copyAr[k] == value) {
                        isDuplicate = true;
                        break;
                    }
                }

                // 중복된 값이 아니라면 copyAr 배열에 추가
                if (!isDuplicate && value % 3 == 0) {
                    copyAr[count] = value;
                    count++;
                }
            }
        }

        // 결과 출력
        System.out.print("copyAr : ");
        for (int k = 0; k < count; k++) {
            System.out.print(copyAr[k] + " ");
        }
    }
}