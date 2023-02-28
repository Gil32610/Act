import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Movie theMovie = new Adventure("Juno");
        // theMovie.watchMovie();
        // Movie movie = Movie.getMovie("Scienc", "Star Wars");
        // movie.watchMovie();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter Type( A for Adventure, C for comedy, " +
           "S for Science Fiction, or Q to Quit): " );
           String type = s.nextLine();
           if("Qq".contains(type)){
            break;
           }
           System.out.println("Enter movie title: ");
           String title = s.nextLine();
           Movie movie = Movie.getMovie(type, title);
           movie.watchMovie();
        }
    }
}
