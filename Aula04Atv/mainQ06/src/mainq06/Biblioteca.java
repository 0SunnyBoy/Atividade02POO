package mainq06;

public class Biblioteca {
    private Livro[] livros;
    private int contador;

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        contador = 0;
    }
    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro " + livro.getTitulo() + " adicionado a biblioteca.");
        } else {
            System.out.println("Nao ha espaco na biblioteca para adicionar mais livros.");
        }
    }
    public void emprestarLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].emprestar();
                return;
            }
        }
        System.out.println("Livro " + titulo + " nao encontrado na biblioteca.");
    }
    public void devolverLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].devolver();
                return;
            }
        }
        System.out.println("Livro " + titulo + " nao encontrado na biblioteca.");
    }
    public void mostrarLivros() {
        System.out.println(" Lista de Livros da Biblioteca:");
        for (int i = 0; i < contador; i++) {
            System.out.println(livros[i]);
        }
        System.out.println("-----------------------------------");
    }
}
