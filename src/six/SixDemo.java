package six;

public class SixDemo {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.setDirector("Tarantino");
        movie1.setTitle("Djan");
        movie1.setReview(9);
        System.out.println(movie1.getDirector());
        System.out.println(movie1.counter);

       int review = movie1.getReview();

        Movie movie2 = new Movie();
        movie2.setDirector("Steven Spilberg");
        movie2.setTitle("E.T.");
        movie2.setReview(88);
        System.out.println(movie2.getDirector());
        System.out.println(movie2.counter);

        Movie movie3 = new Movie( "nicija zemlja");
        System.out.println(movie3.getTitle());
        System.out.println(movie3.counter);



    }
}
