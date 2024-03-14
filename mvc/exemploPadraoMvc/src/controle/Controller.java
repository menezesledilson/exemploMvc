package controle;

import modelo.Model;
import visual.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    Model model ;
    View view;

    public Controller (Model aModel, View aView){

        model = aModel;
        view = aView;

        view.setButtonBehavior(new ActionListener() { //Gerencia a ação do botão na view
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(view.getA()); //pega a primeira entrada
                double b = Double.parseDouble(view.getB()); //pega a segunda entrada

                model.setNumeros(a,b); //envia os dados para o model

                model.compute(); // executa algo com os dados
                double solution = model.getOutput(); // retorna um resultado
                view.setSolution(String.valueOf(solution)); // atualiza os dados na view
            }
        });
    }

}
