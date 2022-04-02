public class demo_matrix {
    public static void main(String[] args) {
//        int[][] arr = new int[3][3];

        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

            }
        }
    }
}
