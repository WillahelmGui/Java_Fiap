import java.util.Scanner;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        double notasCp, notaChallenge, notaGs;
        double notaFinal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira nota da cp");
        notasCp = sc.nextDouble();
        System.out.println("Insira nota do challenge");
        notaChallenge = sc.nextDouble();
        System.out.println("Insira nota da GS");
        notaGs = (double) sc.nextDouble();
        System.out.println("Insira seu nome");
        String nomeAluno =  sc.nextLine() + sc.nextLine();
        double[] notas = new double[3];

        notas[0] = notasCp;
        notas[1] = notaChallenge;
        notas[2] = notaGs;

        for(double nota: notas){
            System.out.println(nota);
             notaFinal += nota;
        }
        System.out.println(nomeAluno + " sua média é: " + (notaFinal / notas.length));

    }
}