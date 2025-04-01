package Aluno;

public class Aluno {

    double notaChallenge, notaGlobalSolution;
    double[] notasCp = new double[2];
    double notaMedia;

    //CP20% CH20% GS60%
    public void calculaNotaMedia() {
        double notaCp = notasCp[1] + notasCp[0];
       notaMedia =  (notaChallenge * 20 + notaCp * 20 + notaGlobalSolution * 60)/ 100;
    }

    public double getNotaChallenge() {
        return notaChallenge;
    }

    public void setNotaChallenge(double notaChallenge) {
        this.notaChallenge = notaChallenge;
    }

    public double getNotaGlobalSolution() {
        return notaGlobalSolution;
    }

    public void setNotaGlobalSolution(double notaGlobalSolution) {
        this.notaGlobalSolution = notaGlobalSolution;
    }

    public double[] getNotasCp() {
        return notasCp;
    }

    public void setNotasCp(double[] notasCp) {
        this.notasCp = notasCp;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
