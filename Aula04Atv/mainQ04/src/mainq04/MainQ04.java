package mainq04;
public class MainQ04 {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Samsung A51");
        p1.setPreco(3500.00);

        Produto p2 = new Produto();
        p2.setNome("Mousepad");
        p2.setPreco(-50.00);

        System.out.println("Produto 1: " + p1.getNome() + " - R$ " + p1.getPreco());
        System.out.println("Produto 2: " + p2.getNome() + " - R$ " + p2.getPreco());
    }
}
