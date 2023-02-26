package logica;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Controle extends Funcoes{
    int memoria;
    int numero;
    int resultado;
    
    boolean somar;
    
    boolean adicao;
    
    public void definirOperacao(String operacao){
        this.numero = memoria;
        if(operacao.equals("+")){
            somar = true;
            this.numero = memoria;        
        }
    }

    public int executarOperaçao(){
        if(somar == true){
            resultado = adicao(numero, memoria);    
            System.out.println("chegou");
        }
        
        return resultado;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int valor) {
        this.memoria = valor;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getResultado() {
        return resultado;
    }
    
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
