public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
           movie.watchMovie();
           Adventure time = (Adventure) Movie.getMovie("A", "Jaws");
           time.watchMovie();
           Object comedy = Movie.getMovie("c", "Airplane");
           comedy.watchMovie();
           //aaaaaa
    }
    
}
