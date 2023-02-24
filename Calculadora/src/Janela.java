import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.w3c.dom.Text;

public class Janela extends JFrame {
    JPanel tecladoNumerico = new JPanel();
    JPanel visor = new JPanel();
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints gbcVisor = new GridBagConstraints();
    GridBagConstraints gbcTecladoNumerico = new GridBagConstraints();
    GridBagConstraints gbcBotoes = new GridBagConstraints();
    Dimension redimensionamentoMinimo = new Dimension(340,480);
    
    //Botoes
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
    JButton bt_8 = new JButton("9");
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

 

    Janela(){                   
        setTitle("Frapuchino com cobertura de chocolate");
        setSize(340,480);
        getContentPane().setBackground(new Color(90,30,52));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(layout);
        
        
        //tecladoNumerico.setBounds(0,150,340,400);
        //tecladoNumerico.setSize(340,400);
        tecladoNumerico.setBackground(new Color(171, 171, 171));
        
        //visor.setBounds(0,0,340,150);
        //visor.setSize(340,150);
        visor.setBackground(new Color(10,10,10));
        
        //contraints para visor
        
        gbcVisor.gridx = 0;
        gbcVisor.gridy = 0;
        gbcVisor.weighty = 1.4;
        gbcVisor.weightx = 1.4;
        gbcVisor.fill = GridBagConstraints.BOTH;
        gbcVisor.insets = new Insets(3,0,3,0);
        
        //constraints para teclado numerico
        gbcTecladoNumerico.gridx = 0;
        gbcTecladoNumerico.gridy = 1;
        gbcTecladoNumerico.weighty = 2;
        gbcTecladoNumerico.weightx = 2;
        gbcTecladoNumerico.fill = GridBagConstraints.BOTH;
        gbcTecladoNumerico.insets = new Insets(3,0,3,0);
        
        
        setMinimumSize(redimensionamentoMinimo);
        
        add(visor, gbcVisor);
        add(tecladoNumerico, gbcTecladoNumerico);
        
        tecladoNumerico.setLayout(new GridBagLayout());
        adicionarBotao(bt_pot);
        setVisible(true);
    }

    public void adicionarBotao(JButton componente){

        gbcBotoes.gridx = 0;
        gbcBotoes.gridy = 0;
        gbcBotoes.weightx = 1;
        gbcBotoes.weighty = 1;

        gbcBotoes.fill = GridBagConstraints.BOTH;

        add(componente);
    }
    
}