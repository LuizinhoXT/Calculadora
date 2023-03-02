package Visao;
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

import logica.Controle;

public class Janela extends JFrame{
    Controle controle = new Controle();
    // criando duas variiáveis do tipo painel para comportar os elementos visuais da calculadora, atuando como containers.
    private JPanel tecladoNumerico = new JPanel();
    private JPanel visor = new JPanel();
    private JTextField display = new JTextField("0");
    

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
    JButton bt_quociente = new JButton("/");

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

    public Janela() {

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
        bt_pot.addActionListener(this::acaoBotaoPot);
        tecladoNumerico.add(adicionarBotao(bt_rad), gbcBotoes);
        bt_rad.addActionListener(this::acaoBotaoRad);
        tecladoNumerico.add(adicionarBotao(bt_C), gbcBotoes);
        bt_C.addActionListener(this::acaoBotaoC);
        tecladoNumerico.add(adicionarBotao(bt_bcs), gbcBotoes);
        bt_bcs.addActionListener(this::acaoBotaoBcs);
        
        tecladoNumerico.add(adicionarBotao(bt_resto), gbcBotoes);
        bt_resto.addActionListener(this::acaoBotaoResto);
        tecladoNumerico.add(adicionarBotao(bt_abrePar), gbcBotoes);
        bt_abrePar.addActionListener(this::acaoBotaoAbrePar);
        tecladoNumerico.add(adicionarBotao(bt_fechaPar), gbcBotoes);
        bt_fechaPar.addActionListener(this::acaoBotaofechaPar);
        tecladoNumerico.add(adicionarBotao(bt_quociente), gbcBotoes);
        bt_quociente.addActionListener(this::acaoBotaoQuociente);

        tecladoNumerico.add(adicionarBotao(bt_7), gbcBotoes);
        bt_7.addActionListener(this::acaoBotao7);
        tecladoNumerico.add(adicionarBotao(bt_8), gbcBotoes);
        bt_8.addActionListener(this::acaoBotao8);
        tecladoNumerico.add(adicionarBotao(bt_9), gbcBotoes);
        bt_9.addActionListener(this::acaoBotao9);
        tecladoNumerico.add(adicionarBotao(bt_multi), gbcBotoes);
        bt_multi.addActionListener(this::acaoBotaoMulti);

        tecladoNumerico.add(adicionarBotao(bt_4),gbcBotoes);
        bt_4.addActionListener(this::acaoBotao4);
        tecladoNumerico.add(adicionarBotao(bt_5), gbcBotoes);
        bt_5.addActionListener(this::acaoBotao5);
        tecladoNumerico.add(adicionarBotao(bt_6), gbcBotoes);
        bt_6.addActionListener(this::acaoBotao6);
        tecladoNumerico.add(adicionarBotao(bt_menos), gbcBotoes);
        bt_menos.addActionListener(this::acaoBotaoMenos);

        tecladoNumerico.add(adicionarBotao(bt_1), gbcBotoes);
        bt_1.addActionListener(this::acaoBotao1);
        tecladoNumerico.add(adicionarBotao(bt_2), gbcBotoes);
        bt_2.addActionListener(this::acaoBotao2);
        tecladoNumerico.add(adicionarBotao(bt_3), gbcBotoes);
        bt_3.addActionListener(this::acaoBotao3);
        tecladoNumerico.add(adicionarBotao(bt_mais), gbcBotoes);
        bt_mais.addActionListener(this::acaoBotaoMais);
        
        tecladoNumerico.add(adicionarBotao(bt_negati), gbcBotoes);
        bt_multi.addActionListener(this::acaoBotaoNegati);
        tecladoNumerico.add(adicionarBotao(bt_0), gbcBotoes);
        bt_0.addActionListener(this::acaoBotao0);
        tecladoNumerico.add(adicionarBotao(bt_virg), gbcBotoes);
        bt_virg.addActionListener(this::acaoBotaoVirg);
        tecladoNumerico.add(adicionarBotao(bt_igual), gbcBotoes);
        bt_igual.addActionListener(this::acaoBotaoIgual);
        
        // adicionando textField no visor, que funcionará como o display

        display.setBackground(new Color(10,10,10));
        display.setForeground(new Color(255,255,255));
        display.setFont(new Font("Arial",Font.BOLD, 40));
        display.setHorizontalAlignment(SwingConstants.RIGHT);

        visor.setLayout(layout);
        gbcTextField.fill = GridBagConstraints.BOTH;
        gbcTextField.gridx = 0;
        gbcTextField.gridy = 0;
        gbcTextField.weightx = 1.0;
        gbcTextField.weighty = 1.0;
        

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

        if(display.getText().equals("0")) {
            if(texto.equals(",") && display.getText().equals("0")){
                display.setText(display.getText().concat(texto));
            }else{
                display.setText(texto);
            }
            
        }else{
            if(texto.equals(",") && display.getText().contains(",")){
                
            }else{
                display.setText(display.getText().concat(texto));
            }          
        }    
    }

    
    private void acaoBotaoPot(ActionEvent e){
        digitar("^");

    } 
    private void acaoBotaoRad(ActionEvent e){
        digitar("√");
    } 
    private void acaoBotaoC(ActionEvent e){
        display.setText("0");
    } 
    private void acaoBotaoBcs(ActionEvent e){
        String memoria = display.getText();
        
        if(memoria.length() == 1){
            display.setText("0");
        }else{
            display.setText(memoria.substring(0, memoria.length() - 1));
        }
    } 
    private void acaoBotaoResto(ActionEvent e){
        digitar("%");
    } 
    private void acaoBotaoAbrePar(ActionEvent e){
        digitar("(");
    } 
    private void acaoBotaofechaPar(ActionEvent e){
        digitar(")");
    } 
    private void acaoBotaoQuociente(ActionEvent e){
        digitar("/");
    } 
    private void acaoBotao7(ActionEvent e){
        digitar("7");
        controle.receberValor("7");
    } 
    private void acaoBotao8(ActionEvent e){
        digitar("8");
        controle.receberValor("8");
    } 
    private void acaoBotao9(ActionEvent e){
        digitar("9");
        controle.receberValor("9");
    } 
    private void acaoBotaoMulti(ActionEvent e){
        digitar("x");
    } 
    private void acaoBotao4(ActionEvent e){
        digitar("4");
        controle.receberValor("4");
    } 
    private void acaoBotao5(ActionEvent e){
        digitar("5");
        controle.receberValor("5");
    } 
    private void acaoBotao6(ActionEvent e){
        digitar("6");
        controle.receberValor("6");
    } 
    private void acaoBotaoMenos(ActionEvent e){
        digitar("-");
    } 
    private void acaoBotao1(ActionEvent e){
        digitar("1");
        controle.receberValor("1");
    } 
    private void acaoBotao2(ActionEvent e){
        digitar("2");
        controle.receberValor("2");
    } 
    private void acaoBotao3(ActionEvent e){
        digitar("3");
        controle.receberValor("3");
    } 
    private void acaoBotaoNegati(ActionEvent e){
        digitar("+/-");
    } 
    private void acaoBotao0(ActionEvent e){
        digitar("0");
        controle.receberValor("0");
    } 
    private void acaoBotaoVirg(ActionEvent e){
        digitar(",");
    } 
    private void acaoBotaoIgual(ActionEvent e){
        display.setText(String.valueOf(controle.executarOperaçao()));
    }
    private void acaoBotaoMais(ActionEvent actionevent1) {
        digitar("+");
        controle.definirOperacao("+");
        
    }

}