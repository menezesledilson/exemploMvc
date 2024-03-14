package visual;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField a, b;
    private JLabel solution;
    private JButton button;

    public View() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(a = new JTextField(8));
        add(new JLabel("+"));
        add(b = new JTextField(8));
        add(solution = new JLabel(" "));
        add(button = new JButton("calcula"));

        pack();

        //Centraliza a janela na tela
        setLocationRelativeTo(null);
        setVisible(true);
    }
    // Métodos getters para recuperar as informações

    public String getA() {
        return a.getText();
    }

    public String getB() {
        return b.getText();
    }

    // Métodos setterrs para atualizar as informações

    public void setSolution(String result){
        solution.setText(result);
    }
    // Quem gerencia a ação do botão é o controller

    public void setButtonBehavior(ActionListener botaoBehavior) {
        button.addActionListener(botaoBehavior);
    }
}
