package HomeWorks.HomeWork39;

import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Movie> Movies;
    private String MoviesList;
    public Model() {
        this.MoviesList = "Movies.txt";
        this.Movies = LoadData();
    }
    public void AddMovie(Map DictMovie){
        Movie movie = new Movie(DictMovie);
        Movies.put((String) DictMovie.get("название"), movie);
    }

    public Collection getAllMovies(){
        return Movies.values();
    }

    public Map getSingleMovie(String UserMovie){
        Movie movie = this.Movies.get(UserMovie);
        Map<String, String> DictMovie = new LinkedHashMap<>();
        DictMovie.put("название", movie.getNameMovie());
        DictMovie.put("жанр", movie.getGenre());
        DictMovie.put("режиссер", movie.getDirector());
        DictMovie.put("год выпуска", movie.getYearOfIssue());
        DictMovie.put("длительность", movie.getDuration());
        DictMovie.put("студия", movie.getStudio());
        DictMovie.put("актеры", movie.getActors());
        return DictMovie;
    }

    public Movie removeMovie(String NameMovie){
        return Movies.remove(NameMovie);
    }

    public void SaveData(){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.MoviesList))){
            objectOutputStream.writeObject(this.Movies);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
    public LinkedHashMap LoadData(){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(this.MoviesList))) {
            return (LinkedHashMap) objectInputStream.readObject();
        } catch (Exception exception){
           return new LinkedHashMap<>();
        }
    }
}
class Movie implements Serializable {
    private String NameMovie;
    private String Genre;
    private String Director;
    private String YearOfIssue;
    private String Duration;
    private String Studio;
    private String Actors;

    public Movie(Map DictMovie) {
        this.NameMovie = (String) DictMovie.get("название");
        this.Genre = (String) DictMovie.get("жанр");
        this.Director = (String) DictMovie.get("режиссер");
        this.YearOfIssue = (String) DictMovie.get("год выпуска");
        this.Duration = (String) DictMovie.get("длительность");
        this.Studio = (String) DictMovie.get("студия");
        this.Actors = (String) DictMovie.get("актеры");
    }

    public String getNameMovie() {
        return NameMovie;
    }

    public String getGenre() {
        return Genre;
    }

    public String getDirector() {
        return Director;
    }

    public String getYearOfIssue() {
        return YearOfIssue;
    }

    public String getDuration() {
        return Duration;
    }

    public String getStudio() {
        return Studio;
    }

    public String getActors() {
        return Actors;
    }

    @Override
    public String toString() {
        return this.NameMovie;
    }
}
