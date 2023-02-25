import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Janela extends JFrame{
    // criando duas variiáveis do tipo painel para comportar os elementos visuais da calculadora, atuando como containers.
    private JPanel tecladoNumerico = new JPanel();
    private JPanel visor = new JPanel();
    private JTextField display = new JTextField();
    

    // objetivo do tipo GridBagLayout que pode ser organizado dinamicamente de acordo com constraints
    GridBagLayout layout = new GridBagLayout();

    // contraints que vão definir as regras de posicionamento dos containers
    GridBagConstraints gbcVisor = new GridBagConstraints();
    GridBagConstraints gbcTecladoNumerico = new GridBagConstraints();
    GridBagConstraints gbcTextField = new GridBagConstraints();

    
    // constraint que define a regra de posicionamento dos botoes dentor do container "tecladoNumerico"
    GridBagConstraints gbcBotoes = new GridBagConstraints();
    
    // variáveis para controlar o posicionamentos dos botões
    private int ctrlCol = 0;
    private int ctrlRow = 0; 

    // variável do tipo Dimension que limita o quando a janela pode ser diminuida.
    Dimension redimensionamentoMinimo = new Dimension(340, 480);
    

    // Botoes
    JButton bt_pot = new JButton("pot");
    JButton bt_rad = new JButton("rad");
    JButton bt_C = new JButton("C");
    JButton bt_bcs = new JButton("<-");

    JButton bt_resto = new JButton("%");
    JButton bt_abrePar = new JButton("(");
    JButton bt_fechaPar = new JButton(")");
    JButton bt_quociente = new JButton("+");

    JButton bt_multi = new JButton("x");
    JButton bt_menos = new JButton("-");
    JButton bt_mais = new JButton("+");
    JButton bt_igual = new JButton("=");

    JButton bt_7 = new JButton("7");
    JButton bt_8 = new JButton("8");
    JButton bt_9 = new JButton("9");

    JButton bt_4 = new JButton("4");
    JButton bt_5 = new JButton("5");
    JButton bt_6 = new JButton("6");

    JButton bt_1 = new JButton("1");
    JButton bt_2 = new JButton("2");
    JButton bt_3 = new JButton("3");

    JButton bt_negati = new JButton("-/+");
    JButton bt_0 = new JButton("0");
    JButton bt_virg = new JButton(",");

    Janela() {

        // definindo elementos que vão compor a visualização da janela
        setTitle("Frapuchino com cobertura de chocolate");
        setSize(340, 480);
        getContentPane().setBackground(new Color(90, 30, 52));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(layout);

        // definição da cor de fundo dos containers

        tecladoNumerico.setBackground(new Color(171, 171, 171));
        visor.setBackground(new Color(10, 10, 10));

        //utilizando as variáveis  weightx, weighty e Fill, é possivle não ter a necessidade de definir um tamnho para cada container individualmente. Apenas controlando a proporção de preenchimento vertical e horizontal dos containers, é possivel deixar com aparencia de ccalculadora, com espaço para entradas e visor.

        // contraints para definir as regras de posicionamento do visor
        gbcVisor.gridx = 0;
        gbcVisor.gridy = 0;  
        gbcVisor.weighty = 1.4; 
        gbcVisor.weightx = 1.4;
        gbcVisor.fill = GridBagConstraints.BOTH;
        gbcVisor.insets = new Insets(3, 0, 3, 0);

        // contraints para definir as regras de posicionamento do tecladoNumerico
        gbcTecladoNumerico.gridx = 0;
        gbcTecladoNumerico.gridy = 1;
        gbcTecladoNumerico.weighty = 2;
        gbcTecladoNumerico.weightx = 2;
        gbcTecladoNumerico.fill = GridBagConstraints.BOTH;
        gbcTecladoNumerico.insets = new Insets(3, 0, 3, 0);

        // definindo o tamanho minimo de redimensionamento da janela
        setMinimumSize(redimensionamentoMinimo);

        // adicionando o visor e declado numerico dentro da janela de acordo com as regras das duas constraints, que foram definidas anteriormente.
        add(visor, gbcVisor);
        add(tecladoNumerico, gbcTecladoNumerico);

        // definindo o layoutManager do container tecladoNumerico com um novo GridBagLayout
        tecladoNumerico.setLayout(new GridBagLayout());

        // adicionando os botões de acordo de acordo com as constraints de posicionamento, definidas dentro do método adicionarBotão. Vá até o metodo se quiser saber mais sobre o código.
        tecladoNumerico.add(adicionarBotao(bt_pot), gbcBotoes);
        bt_pot.addActionListener(this::teste);
        tecladoNumerico.add(adicionarBotao(bt_rad), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_C), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_bcs), gbcBotoes);
        
        tecladoNumerico.add(adicionarBotao(bt_resto), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_abrePar), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_fechaPar), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_quociente), gbcBotoes);

        tecladoNumerico.add(adicionarBotao(bt_7), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_8), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_9), gbcBotoes);

        tecladoNumerico.add(adicionarBotao(bt_multi), gbcBotoes);

        tecladoNumerico.add(adicionarBotao(bt_4),gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_5), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_6), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_menos), gbcBotoes);

        tecladoNumerico.add(adicionarBotao(bt_1), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_2), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_3), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_mais), gbcBotoes);
        
        tecladoNumerico.add(adicionarBotao(bt_negati), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_0), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_virg), gbcBotoes);
        tecladoNumerico.add(adicionarBotao(bt_igual), gbcBotoes);
        
        // adicionando textField no visor, que funcionará como o display

        visor.setLayout(layout);
        gbcTextField.fill = GridBagConstraints.BOTH;
        gbcTextField.gridx = 0;
        gbcTextField.gridy = 0;
        gbcTextField.weightx = 1.0;
        gbcTextField.weighty = 1.0;

        display.setBackground(new Color(10,10,10));
        display.setForeground(new Color(255,255,255));
        display.setFont(new Font("Arial",Font.BOLD, 40));
        display.setHorizontalAlignment(SwingConstants.RIGHT);

        visor.add(display, gbcTextField);
        
        


        // definindo a visibilidade da janela como verdadeira se não ela não aparece
        setVisible(true);
    }

    private Component adicionarBotao(JButton componente) {
        // constraints para controlar o posizionamento dos botões, gerando um layout em grade, nesse caso, uma grade 4x6.

        gbcBotoes.gridx = ctrlCol; // essa é variável de controle da geração de colunas variando de 1 a 4 ou seja, sempre terá 4 colunas.
        gbcBotoes.gridy = ctrlRow; // essa é a variável de controle da geração de linhas, variando de 1 a 6, e trá no máximo 6 linha.
        gbcBotoes.weightx = 1;
        gbcBotoes.weighty = 2;
        
        // ctrlCol tempre irá incrementar enquanto a variável for maior ou igual à zero, porém, quando essa chegar a 4, crrtRow vai se imprementado e ctrlCou vai ser zerado, reiniciando a contagem de 4 colunas, porém, adicionando na linha de baixo.

        // estrutura de decisão para controlar a variação do numero de colunas e linhas.
        if(ctrlCol >= 0){
            ctrlCol++;         
            if(ctrlCol == 4){
                ctrlRow++; 
                ctrlCol = 0;
            }
        }
        
        // regra que define o preenchimento vertical e horizontal, BOTH.
        gbcBotoes.fill = GridBagConstraints.BOTH;
        
        // regra que define um objeto que aumenta a distancia de todos os lados do botal em 4 pixels.

        gbcBotoes.insets =  new Insets(3, 3, 3, 3);

        // retorno do objeto.
        return componente;
    }
    
    private void digitar(String texto){
        display.setText(texto);
    }

    public void teste(ActionEvent e){
        System.out.println("fui clickado");
    } 
}