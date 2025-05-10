import java.util.ArrayList;
public class ex01 {
    public static void main(String[] args) {
        ArrayList<String> movie = new ArrayList<>();
        movie.add("The Beautiful Mind");
        movie.add("Zootopia");
        movie.add("The Imitation Game");
        movie.add("Thor");
        movie.add("Iron Man");
        for (int i = 0; i < movie.size(); i++) {
            System.out.println(movie.get(i));
        }
    }
}
