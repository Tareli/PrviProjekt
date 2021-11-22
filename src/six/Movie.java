package six;

public class Movie {
    public static int counter =0;
    private String title;
    private String director;
    //1-10
    private   int review;

    public Movie(){
        System.out.println("konstruktor se pozvao");
        counter++;

    }
    public Movie( String title){
        this.title = title;
        System.out.println("konstruktor sa jednim parametrom se pozvao");
        counter++;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        if (review>=1 && review<=10){
            this.review = review;
        }

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


}
