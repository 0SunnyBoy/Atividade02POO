package mainq01;
public class MainQ01 {
    public static void main(String[] args) {
    pessoa p01 = new pessoa("Samir", 19);
    pessoa p02 = new pessoa();
    p02.nome = "Lua";
    p02.idade = 21;
        System.out.println(p01.nome);
        System.out.println(p01.idade);
        
        System.out.println("----");
        
        System.out.println(p02.nome);
        System.out.println(p02.idade);
    }
}
