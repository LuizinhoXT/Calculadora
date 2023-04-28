package logica;

import javax.security.auth.Subject;

public class Funcoes{
    

    public long adicao(long a, long b){
        long parcela = a + b;

        return parcela;
    }
    public long multiplicacao(long a, long b){
        long produto = a * b;

        return produto;
    }
    public long quociente(long a, long b){
        long quociente = a / b;

        return quociente;
    }
    public long subtracao(long a, long b){
        long restante = a - b;

        return restante;
    }

}