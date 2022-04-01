public class Bmi {
    public void bmiCalculator(){
        double height = 1.65;
        double weight = 57;
        double bmi = weight/(height*height);
        System.out.println("Chỉ số BMI: " + bmi);
    }

    public void bmiCalculator2(double height, double weight){
        double bmi2 = weight/(height*height);
        System.out.println("Chỉ số BMI: " + bmi2);
    }

    public double bmiCalculator3(double height, double weight){
        double bmi = weight/(height*height);
        return bmi;
    }

//    public void result(double bmi){
//        if(bmi <= 18.5){
//            System.out.println("Gầy");
//        }else if (bmi >= 18.5 & bmi <= 24.5){
//            System.out.println("Bình thường");
//        }else{
//            System.out.println("Béo");
//        }
//    }

    public String result(double bmi){
        String rs = "";
        if(bmi <= 18.5){
            rs = "Gầy";
        }else if (bmi >= 18.5 & bmi <= 24.5){
            rs = "Bình thường";
        }else{
            rs = "Thừa cân";
        }

        return rs;
    }
}
