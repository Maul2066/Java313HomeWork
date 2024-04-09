package HomeWorks.HomeWork39;

import java.util.Collection;
import java.util.Map;

public class Controller {
    private Model SetModel;
    private View UserInterface;

    public Controller() {
        this.SetModel = new Model();
        this.UserInterface = new View();
    }

    public void Process (){
        String Answer = "";
        while (!Answer.equals("q")){
            Answer = this.UserInterface.waitAnswer();
            CheckAnswer(Answer);
        }
    }

    public void CheckAnswer (String Answer){
        if (Answer.equals("1")){
            Map Movies = this.UserInterface.AddUserMovies();
            this.SetModel.AddMovie(Movies);
        } else if (Answer.equals("2")){
            Collection Movies = this.SetModel.getAllMovies();
            this.UserInterface.ShowAllMovies(Movies);
        } else if (Answer.equals("3")){
            String NameMovie = this.UserInterface.getUserMovie();
            try {
                Map Movie = this.SetModel.getSingleMovie(NameMovie);
                this.UserInterface.ShowSingleMovie(Movie);
            } catch (NullPointerException exception){
                this.UserInterface.ShowIncorrectNameError(NameMovie);
            }
        } else if (Answer.equals("4")) {
            String NameMovie = this.UserInterface.getUserMovie();
            Movie name = this.SetModel.removeMovie(NameMovie);
            this.UserInterface.RemoveSingleName(name);
        } else if (Answer.equals("q")) {
            this.SetModel.SaveData();
        } else {
            this.UserInterface.ShowIncorrectAnswerError(Answer);
        }
    }
}
