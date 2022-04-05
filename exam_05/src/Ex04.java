public class Ex04 {
    public static void main(String[] args) {

        System.out.println("\n 4.1: 10 số nguyên tố đầu tiên là: ");
        int a = 10, count = 0, start = 2;
        while (count < a){
            if (Ex03.isPrimeNumber(start)) {
                System.out.print("\t" + start + " ");
                count++;
            }
            start++;
        }

        System.out.println("\n 4.2: Các số nguyên tố nhỏ hơn 10");
        for(int i = 0; i < 10; i++){
            if (Ex03.isPrimeNumber(i)){
                System.out.print("\t" + i + " ");
            }
        }
    }

}
