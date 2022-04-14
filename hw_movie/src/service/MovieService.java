package service;

import model.Movie;

import java.util.Scanner;

public class MovieService {
    public Movie inputMovie(){
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();

        System.out.println("- Nhập ID: ");
        movie.setId(sc.nextLine());

        System.out.println("- Nhập tiêu đề:");
        movie.setTitle(sc.nextLine());

        System.out.println("- Nhập thể loại:");
        movie.setCategory(sc.nextLine());

        System.out.println("- Nhập đạo diễn:");
        movie.setDirector(sc.nextLine());

        System.out.println("Nhập ngày công chiếu: ");
        movie.setPremiereDay(sc.nextLine());

        System.out.println("- Nhập thời lượng: ");
        movie.setTime(Integer.parseInt(sc.nextLine()));



        return movie;
    }

    public void showMovie(Movie[] arrMovie){
        for (Movie i : arrMovie){
            System.out.println(i);
        }
    }

    public void searchByName(Movie[] arrMovie, String searchName){
        for (Movie i : arrMovie){
            if (i.getTitle().contains(searchName)){
                System.out.println(i);
            }
        }
    }


}
