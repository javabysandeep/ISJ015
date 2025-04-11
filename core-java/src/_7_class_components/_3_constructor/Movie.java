package _7_class_components._3_constructor;

public class Movie {
    int id;
    String title;
    String genre;
    int year;
    String director;
    int rating;

    Movie() {
        System.out.println("zero param constructor");
    }

    Movie(int id, String title, String genre, int year, String director, int rating) {
       /*
        //assigning local variable to local variable
        id = id;
        title = title;
        genre = genre;
        year = year;
        director = director;
        rating = rating;*/


        //assigning local variable to instance variable
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.rating = rating;

    }
}
