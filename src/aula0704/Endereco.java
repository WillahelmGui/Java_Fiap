package aula0704;

public class Endereco {
    String logradouro;
    short numero;
    String complemento;
    String cep;


    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }

    String retornarEndereco(){
        return this.toString();
    }
}
