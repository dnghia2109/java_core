import java.util.Scanner;

public class demo_array {
    public static void main(String[] args) {
        int[] array = createArray();
        showArray(array);
        System.out.println("Phần tử lớn nhất: " + max(array));
    }

    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d :", (i + 1));
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }


}
