package aula0704;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.logradouro = "log";
        endereco.cep = "085100";
        endereco.complemento="B";
        endereco.numero=115;

        System.out.println(endereco.retornarEndereco());
    }
}
