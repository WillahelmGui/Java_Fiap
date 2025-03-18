public class OperadoresAritimeticos {

    public static void main(String[] args) {
        double notasCp, notaChallenge, notaGs;
        double notaFinal = 0;
        notasCp = (double) (Math.random() * 10);
        notaChallenge = (double) (Math.random() * 10);
        notaGs = (double) (Math.random() * 10);

        double notas[] = new double[3];

        notas[0] = notasCp;
        notas[1] = notaChallenge;
        notas[2] = notaGs;

        for(double nota: notas){
            System.out.println(nota);
             notaFinal += nota;
        }
        System.out.println("Média: " + notaFinal / notas.length);

    }
}
