package pratica.apostila05.atividade03;

public class Elevador {

    private int andarAtual = 0;
    private int totalDeAndares;
    private int capacidadeElevador;
    private  int pessoasNoElevador;

    public void  inicializa(int capacidadeElevador, int totalDeAndares){
            this.totalDeAndares = totalDeAndares;
            this.capacidadeElevador = capacidadeElevador;
    }
    public void entra(){
        this.pessoasNoElevador += 1;
    }

    public void sai(){
        this.pessoasNoElevador -= 1;
    }

    public void subir(){
        this.andarAtual += 1;
    }

    public void descer(){
        this.andarAtual -= 1;
    }
    /***
     * inicializa: deve receber como parâmetros: a capacidade do
     * elevador e o total de andares no prédio;
     * entra: acrescenta uma pessoa no elevador;
     * sai: remove uma pessoa do elevador;
     * sobe: sobe um andar;
     * desce: desce um andar;
     */
}
