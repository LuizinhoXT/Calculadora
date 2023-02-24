

public class App {
    public static void main(String[] args){
        new Janela();
        
    }
}

/* 
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class App {

    public static void main(String[] args) {
        
        // Criando uma janela
        JFrame frame = new JFrame("Exemplo GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Criando um layout com GridBagLayout
        GridBagLayout layout = new GridBagLayout();
        frame.setLayout(layout);
        
        // Criando os botões
        JButton[] botoes = new JButton[12];
        for (int i = 0; i < 12; i++) {
            botoes[i] = new JButton("Botão " + (i + 1));
        }
        
        // Adicionando os botões ao layout
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;
        for (int i = 0; i < 12; i++) {
            constraints.gridx = i % 4;
            constraints.gridy = i / 4;
            layout.setConstraints(botoes[i], constraints);
            frame.add(botoes[i]);
        }
        
        // Configurando a janela
        frame.pack();
        frame.setVisible(true);
    }
}
*/
