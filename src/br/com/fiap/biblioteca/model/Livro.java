package br.com.fiap.biblioteca.model;

public class Livro {
    String id;
    String autor;
    String nome;
    int quantidadePaginas;
    boolean disponivel;

    @Override
    public String toString() {
        return "Livro{" +
                "id='" + id + '\'' +
                ", autor='" + autor + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidadePaginas=" + quantidadePaginas +
                ", disponivel=" + disponivel +
                '}';
    }

    public void emprestar(){
    disponivel = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}