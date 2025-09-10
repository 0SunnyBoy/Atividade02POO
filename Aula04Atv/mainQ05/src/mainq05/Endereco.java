package mainq05;
public class Endereco {
    private String rua;
    private int numero;

    public Endereco(String rua, int numer) {
        this.rua = rua;
        this.numero = numer;
    }

    public String getRua() {
        return rua;
    }
    public int getNumero() {
        return numero;
    }
}
