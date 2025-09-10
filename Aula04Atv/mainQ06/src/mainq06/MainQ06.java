package mainq06;

public class MainQ06 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Livro l1 = new Livro("O Mito de Sisifo", "Albert Camus");
        Livro l2 = new Livro("Crime e Castigo", "Fiodor Dostoievski");
        Livro l3 = new Livro("1984", "George Orwell");
        
        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        biblioteca.mostrarLivros();

        biblioteca.emprestarLivro("Crime e Castigo");
        biblioteca.mostrarLivros();

        biblioteca.devolverLivro("Crime e Castigo");
        biblioteca.mostrarLivros();
    }
}
