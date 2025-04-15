package pratica.apostila05.atividade02;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor da classe
    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    // Método para retornar a data no formato dd/mm/aaaa
    public String getData() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }

    // Método para validar e atribuir o valor ao dia
    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            this.dia = 1; // Caso o dia seja inválido, o valor será 1
        } else {
            this.dia = dia;
        }
    }

    // Método para validar e atribuir o valor ao mês
    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            this.mes = 1; // Caso o mês seja inválido, o valor será 1
        } else {
            this.mes = mes;
        }
    }

    // Método para validar e atribuir o valor ao ano
    public void setAno(int ano) {
        if (ano < 0) {
            this.ano = 2023; // Caso o ano seja negativo, o valor será 2023
        } else {
            this.ano = ano;
        }
    }

    // Métodos getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getNomeMes() {
        return switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mês Inválido";
        };
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe
        Data data = new Data(15, 7, 2025);
        System.out.println("Data formatada: " + data.getData());

        // Testando os métodos de validação
        data.setDia(35); // Dia inválido, vai para 1
        data.setMes(13); // Mês inválido, vai para 1
        data.setAno(-2025); // Ano negativo, vai para 2023
        System.out.println("Data após validações: " + data.getData());
        System.out.println(data.getNomeMes());
    }
}

