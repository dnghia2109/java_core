import java.util.Arrays;

public class TestSystem {
    public static void main(String[] args) {
        int[] array = demo_array.createArray();
        int[] arr = new int[8];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 9;
        arr[4] = 2;
        arr[5] = 0;
        arr[6] = 8;
        arr[7] = 1;

        System.out.println("Số phần tử có trong mảng: " + arr.length);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }

//        int count = 0;
//        for (int i = 0; i < arr.length; i++){
//
//            if(arr[i] == 2){
//                System.out.println("Phần tử có giá trị = 2 ở vị trí: " + (i+1));
//            }
//
//            if(arr[i] % 2 == 0){
//                count++;
//            }
//        }
//        System.out.println("Số phần tử là số chẵn: " + count);
//
//        int max = arr[0], min = arr[0];
//        for (int i = 0 ; i < arr.length; i++){
//            if (arr[i] > max ){
//                max = arr[i];
//            }
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Phần tử lớn nhất có giá trị: " + max);
//        System.out.println("Phần tử bé nhất có giá trị: " + min);
//
//        // Sắp xếp tăng dần:
//        for (int i = 0 ; i < arr.length; i++){
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("Mảng sau khi sắp xếp tăng dần: ");
//        for (int i = 0 ; i < arr.length; i++){
//            System.out.print(arr[i] +"\t");
//        }


//
//        String[] arr1 = new String[5];
//        arr1[0] = "Lai";
//        arr1[1] = "Duy";
//        arr1[2] = "Nghia";
//        arr1[4] = "Lai1";
//        arr1[3] = "Lai2";
//        for (int i = 0; i < arr1.length; i++){
//            System.out.print(arr1[i] + "\t");
//        }
//
//        String[] name = {"Nghĩa", "Hiệp", "Đạt"};
//        for (int i = 0; i < name.length; i++){
//            System.out.println(name[i]);
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số ptu của mảng: ");
//        int n = sc.nextInt();
//        double[] point = new double[n];
//
//        for (int i = 0; i < point.length; i++){
//            System.out.printf("\nNhập phần tử thứ %d: ",(i+1));
//            point[i] = sc.nextDouble();
//        }
//        for (int i = 0; i < point.length; i++){
//            System.out.print( point[i] + "\t");
//        }


//        String str = "Hello World";
//        //Cắt chuỗi trả về dữ liệu dưới dạng mảng
//        String[] s = str.split(" "); // Có thể thay ở regex " " = \\s
//        System.out.println("Trong chuỗi có số từ: " + s.length);
//        for (int i = 0; i < s.length; i++){
//            System.out.println(s[i]);
//        }

//        // FOR EACH
//        System.out.println("Dùng for each");
//        for(int i : arr){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//        }

//        Arrays.sort(arr);
//        System.out.println("Mảng sau khi sắp xếp: ");
//        for (int i : arr) {
//            System.out.println(i);
//        }

        int[] copy = Arrays.copyOf(arr, 10);
        System.out.println("Mảng sao chép: ");
        for (int i: copy) {
            System.out.println(i);
        }

        String s = Arrays.toString(copy);
        System.out.println(s);
    }

}
