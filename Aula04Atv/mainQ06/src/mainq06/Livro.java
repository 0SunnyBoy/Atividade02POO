package mainq06;
public class Livro {
    private String titulo;
    private String autor;
    private Boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
    public String getTitulo(){
        return titulo;
    }
    public boolean isDisponivel(){
        return disponivel;
    }
    public void emprestar(){
        if(disponivel){
            disponivel = false;
            System.out.println("O livro " + titulo + " foi emprestado.");
        } else {
            System.out.println("O livro " + titulo + " ja está disponivel.");
        }
    }
    public void devolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("O livro " + titulo + " foi devolvido.");
        } else {
            System.out.println("O livro " + titulo + " ja está disponivel.");
        }
    }
    @Override
    public String toString() {
        return "Titulo: " + titulo + " | Autor: " + autor + 
               " | Status: " + (disponivel ? "Disponivel" : "Emprestado");
    }
}
