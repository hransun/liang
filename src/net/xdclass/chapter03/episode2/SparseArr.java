package net.xdclass.chapter03.episode2;

public class SparseArr {
    public static void main(String[] args) {
        //创建一个原始的数组9X9，0表示的是没有旗子，1表示黑棋，2表示白棋
        int[][] arr = new int[9][9];
        arr[1][1] = 1;
        arr[1][2] = 1;
        arr[2][3] = 2;
        arr[4][5] = 2;
        System.out.println("original 2d matrix:");
        for (int[] a : arr) {
            for (int data : a) {
                System.out.printf("%d \t",data);

            }
            System.out.println();
        }
        System.out.println("sparse matrix is:");
        int[][] sparArr = arrToSpar(arr);
        for (int[] a: sparArr) {
            for (int data : a) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        System.out.println("original arr is:");
        int[][]  convertArr = sparToArr(sparArr);
        for (int[] a: convertArr) {
            for (int data: a) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        System.out.println("spar trans to original arr");

    }

    private static int[][] arrToSpar(int[][] arr) {
        // how many total non-0 elements
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) {
                    cnt++;
                }
            }
        }
        // create a spar array
        int[][] sparArr = new int[cnt+1][3];
        sparArr[0][0] = arr.length;
        sparArr[0][1] = arr[0].length;
        sparArr[0][2] = cnt;

        int idx = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) {
                    sparArr[idx][0] = i;
                    sparArr[idx][1] = j;
                    sparArr[idx][2] = arr[i][j];
                    idx++;
                }
            }
        }
        return sparArr;
    }

    private static int[][] sparToArr(int[][] sparArr) {
        int row = sparArr[0][0];
        int col = sparArr[0][1];
        int[][] arr =  new int[row][col];
        for (int i = 1; i < sparArr.length; i++) {
            int r = sparArr[i][0];
            int c = sparArr[i][1];
            arr[r][c] = sparArr[i][2];
        }
        return arr;
    }
}
