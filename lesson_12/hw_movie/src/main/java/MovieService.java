import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class MovieService {
    public void showMovie(ArrayList<Movie> list){
        for (Movie movie : list){
            System.out.println(movie);
        }
    }

    public ArrayList<Movie> getListMovie(){
        Gson gson = new Gson();
        ArrayList<Movie> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
            list = gson.fromJson(reader, type);
        }catch (FileNotFoundException e){
            System.out.println("Không tìm thấy file.");
        }
        return list;
    }

    // Sắp xếp phim theo tên
    public void sortByTitle(ArrayList<Movie> list){
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }


    // Sắp xếp phim theo thời lượng
    public void sortByLength(ArrayList<Movie> list){
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getLength() > o2.getLength() ? 1 : -1;
            }
        });
    }

    // Sắp xếp phim theo lượt xem
    public void sortByView(ArrayList<Movie> list){
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView() > o2.getView() ? 1 : -1;
            }
        });
    }

    // Đếm mỗi thể loại có bao nhiêu bộ phim
    public void quantityMovieByCategory(ArrayList<Movie> list){
        Map<String, Integer> map = new HashMap<>();
        for (Movie movie : list){
            for (String movieCategory : movie.getCategory()){
                if (map.containsKey(movieCategory)){
                    map.put(movieCategory, map.get(movieCategory) + 1);
                }else {
                    map.put(movieCategory, 1);
                }
            }
        }
        System.out.println(map);
    }


}
