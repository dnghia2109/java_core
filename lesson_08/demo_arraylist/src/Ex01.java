import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            listNumber.add(i);
        }

        int count = 0;
        for (int i : listNumber){
            if (i%2 == 0){
                System.out.println(i + "\t");
                count++;
            }
        }
        System.out.println("Số phần tử chẵn: " + count);

//        for (int i = 0; i < listNumber.size(); i++){
//            if (listNumber.get(i) % 2 == 0){
//                System.out.println("Các phần tử chẵn:" + listNumber.get(i));
//
//            }else {
//                System.out.println("Các phần tử lẻ:" + listNumber.get(i));
//
//            }
//        }
    }




}
