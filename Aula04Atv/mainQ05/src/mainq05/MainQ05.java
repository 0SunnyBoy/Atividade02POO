package mainq05;

public class MainQ05 {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("dos bobos", 0);
        Endereco e2 = new Endereco("onde judas perdeu as botas", 444);

        Pessoa p1 = new Pessoa("Samir", 19, e1);
        Pessoa p2 = new Pessoa("Lua", 21, e2);

        p1.mostrarDados();
        p2.mostrarDados();
    }
}
