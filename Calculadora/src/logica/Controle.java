package logica;

public class Controle extends Funcoes{
    private long memPrincipal = 0;
    
    private long memSecundaria;
    private long resultado;
    
    boolean somar;
    boolean subtrair;
    boolean multiplicar;
    boolean dividir;
    
    public void limparMemorias(){
        setMemSecundaria(0);
        setMemPrincipal(0);
        setResultado(0);
    }
    public void definirOperacao(String operacao){
        setMemSecundaria(getMemPrincipal());
        System.out.println("valor da memória cundaria modificado");
        /*if(operacao.equals("-")){
            setSubtrair(true);
            setMemPrincipal(0);            
        }*/
        switch (operacao){
            case "+":
            setSomar(true);
            setMemPrincipal(0);
            break;
            case "/":
            setDividir(true);
            setMemPrincipal(0);
            break;
            case "x":
            setMultiplicar(true);
            setMemPrincipal(0);
            break;
            case "-":
            setSubtrair(true);
            setMemPrincipal(0);
            break;

        }
    }
    
    public long executarOperaçao(){
        if(isSomar() == true){
            setResultado(adicao(getMemPrincipal(), getMemSecundaria()));   
            System.out.println("somou  "+ getResultado());
        }else if(isDividir() == true){
            //precisa programar a parte das divisões.
        }else if(isMultiplicar() == true){
            setResultado(multiplicacao(getMemPrincipal(), getMemSecundaria()));   
            System.out.println("multiplicou  "+ getResultado());
        }else if(isSubtrair()==true){
            setResultado(subtracao(getMemSecundaria(),getMemPrincipal()));   
            System.out.println("subtraiu  "+ getResultado());
        }

        
        
        return this.resultado;
    }
    
    public void receberValor(String texto){
        if(getMemPrincipal() == 0){
            setMemPrincipal(Integer.parseInt(texto));
            System.out.println("valor na memória na condição 1 caao o valor do display for zero:  "+getMemPrincipal());
        }else{
            String aux = String.valueOf(getMemPrincipal());
            System.out.println("valor da aux caso caso o valor nao for zero: " + aux);
            setMemPrincipal(Integer.parseInt(aux.concat(texto)));
            System.out.println("valor na memoria caso o valor nao for zero: " + getMemPrincipal());
        }
    }
    
    
    public boolean isSubtrair() {
        return subtrair;
    }
    public void setSubtrair(boolean subtrair) {
        this.subtrair = subtrair;
    }
    public boolean isMultiplicar() {
        return multiplicar;
    }
    public void setMultiplicar(boolean multiplicar) {
        this.multiplicar = multiplicar;
    }
    
    
    public boolean isDividir() {
        return dividir;
    }
    public void setDividir(boolean dividir) {
        this.dividir = dividir;
    }
    public long getMemSecundaria() {
        return memSecundaria;
    }
    public void setMemSecundaria(long memSecundaria) {
        this.memSecundaria = memSecundaria;
    }
    public long getResultado() {
        return resultado;
    }    
    public void setResultado(long resultado) {
        this.resultado = resultado;
    }
    
    public boolean isSomar() {
        return somar;
    }
    public void setSomar(boolean somar) {
        this.somar = somar;
    }
    public long getMemPrincipal() {
        return memPrincipal;
    }
    public void setMemPrincipal(long memPrincipal) {
        this.memPrincipal = memPrincipal;
    }
}
