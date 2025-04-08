package br.com.fiap.biblioteca.view;

import br.com.fiap.biblioteca.model.Livro;

public class Principal {
    public static void main(String[] args) {
        //Cria livro e exibe
        Livro l1 = new Livro();
        l1.setNome("Natah");
        l1.setAutor("Jorginho");
        l1.setDisponivel(true);
        l1.setQuantidadePaginas(200);

        System.out.println(l1.toString());
        l1.emprestar();
        System.out.println(l1.toString());
    }
}
