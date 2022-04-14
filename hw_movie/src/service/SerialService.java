package service;

import model.Serial;

import java.util.Scanner;

public class SerialService {
    public Serial inputSerial(){
        Scanner sc = new Scanner(System.in);
        Serial serial = new Serial();

        System.out.println("- Nhập ID: ");
        serial.setId(sc.nextLine());

        System.out.println("- Nhập tiêu đề:");
        serial.setTitle(sc.nextLine());

        System.out.println("- Nhập thể loại:");
        serial.setCategory(sc.nextLine());

        System.out.println("- Nhập đạo diễn:");
        serial.setDirector(sc.nextLine());

        System.out.println("Nhập ngày công chiếu: ");
        serial.setPremiereDay(sc.nextLine());

        System.out.println("- Nhập số tập:");
        serial.setEpisode(Integer.parseInt(sc.nextLine()));

        System.out.println("- Nhập thời lượng trung bình: ");
        serial.setAvrTime(Integer.parseInt(sc.nextLine()));

        return serial;
    }

    public void showSerial(Serial[] arrSerial){
        for(Serial i : arrSerial){
            System.out.println(i);
        }
    }

    public void getSerialByName(Serial[] arrSerial, String searchSerial){
        for(Serial i : arrSerial){
            if(i.getTitle().contains(searchSerial)){
                System.out.println(i);
            }
        }
    }
}
