package HomeWorks.HomeWork39;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    public String waitAnswer(){
        System.out.println("===== Редактирование данных каталога фильмов =====");
        System.out.println("1 - Добавление фильма");
        System.out.println("2 - Каталог фильмов");
        System.out.println("3 - Просмотр определенного фильма");
        System.out.println("4 - Удаление фильма");

        System.out.println("q - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String UserAnswer = scanner.nextLine();
        System.out.println("==============================================");
        System.out.println();
        return UserAnswer;
    }
    public Map AddUserMovies(){
        Map<String, String> DictMovie = new LinkedHashMap<>();
        DictMovie.put("название", "");
        DictMovie.put("жанр", "");
        DictMovie.put("режиссер", "");
        DictMovie.put("год выпуска", "");
        DictMovie.put("длительность", "");
        DictMovie.put("студия", "");
        DictMovie.put("актеры", "");

        System.out.println("===== Добавление фильма =====");
        DictMovie.forEach((key, value) -> {
            System.out.println("Введите " + key + " фильма");
            DictMovie.put(key, scanner.nextLine());
        });
        System.out.println("==============================================");
        System.out.println();
        return DictMovie;
    }

    public void ShowAllMovies(Collection Movies){
        System.out.println("===== Каталог фильмов =====");
        Movies.forEach((element) -> {
            System.out.println(element);
        });
        System.out.println("===========================");
        System.out.println();
    }

    public String getUserMovie(){
        System.out.println("===== Ввод названия фильма =====");
        System.out.print("Введите название фильма: ");
        String UserMovie = scanner.nextLine();
        System.out.println("================================");
        System.out.println();
        return UserMovie;
    }

    public void ShowSingleMovie(Map Movie){
        System.out.println("===== Просмотр фильма =====");
        Movie.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        System.out.println("===========================");
        System.out.println();
    }

    public void ShowIncorrectNameError(String UserMovie){
        System.out.println("===== |Ошибка| =====");
        System.out.println("Фильма с названием " + UserMovie + " не существует");
        System.out.println("====================");
        System.out.println();
    }

    public void RemoveSingleName(Movie movie){
        System.out.println("===== Удаление фильма =====");
        System.out.println("Фильм " + movie + " - был удален");
        System.out.println("===========================");
        System.out.println();
    }

    public void ShowIncorrectAnswerError(String Answer){
        System.out.println("===== |Ошибка| =====");
        System.out.println("Варианта " + Answer + " не существует");
        System.out.println("=====================");
        System.out.println();
    }
}
