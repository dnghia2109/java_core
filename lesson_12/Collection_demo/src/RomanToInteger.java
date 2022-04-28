import java.util.Arrays;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIIIV";
        int[] arr = stringToArray(s);
        System.out.println(Arrays.toString(arr));
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s){
        int[] arr = stringToArray(s);
        int sum = 0;
        for (int i = arr.length - 1; i >=0; i-- ){
            if (i - 1 >= 0 && (arr[i] > arr[i-1])){
                sum += arr[i]-arr[i-1];
                i--;
            }else {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int[] stringToArray(String s){
        int[] temp = new int[s.length()];

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            switch (ch){
                case 'I':
                    temp[i] = 1;
                    break;
                case 'V':
                    temp[i] = 5;
                    break;
                case 'X':
                    temp[i] = 10;
                    break;
                case 'L':
                    temp[i] = 50;
                    break;
                case 'C':
                    temp[i] = 100;
                    break;
                case 'D':
                    temp[i] = 500;
                    break;
                case 'M':
                    temp[i] = 1000;
                    break;
            }
        }

        return temp;
    }
}
