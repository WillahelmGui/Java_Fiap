import Aluno.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        double[] notas = {10,10};

        aluno.setNotaChallenge(0);
        aluno.setNotaGlobalSolution(0);
        aluno.setNotasCp(notas);
        aluno.calculaNotaMedia();
        System.out.println("Nota média aluno: " + aluno.getNotaMedia());
    }
}