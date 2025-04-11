package _7_class_components._3_constructor;

public class Demo2This {
    public static void main(String[] args) {
        Movie movie = new Movie(101, "Chhava", "Action", 2025, "Vicky", 4);
        System.out.println("Movie details:");
        System.out.println(movie.id + "\t" + movie.title + "\t" + movie.director + "\t" + movie.year + "\t" + movie.rating + "\t" + movie.genre);
    }
}
