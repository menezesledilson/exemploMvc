import controle.Controller;
import modelo.Model;
import visual.View;


public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        new Controller(model, view);

    }

}