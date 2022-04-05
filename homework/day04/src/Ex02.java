import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println("\nMảng ban đầu:");
        showArray(array);
        System.out.println("\nMảng sau khi cộng:");
        plusNumber(array);
        showArray(array);
    }
    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", (i + 1));
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

    public static void plusNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arr[i]++;
            }
        }
    }
}
