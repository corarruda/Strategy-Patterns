public class Main {
    public static void main(String[] args) {
        Disciplina d = new Disciplina();

        d.setNome( "Padroes de Desenvolvimento") ;
        d.setP1(10);
        d.setP2(5);

        d.setCalcMedia(new Aritmetica());
        d.calcularMedia();
        System.out.println(String.format("(Aritmética) | P1: %.2f | P2: %.2f | Média: %.2f | Situação: %s",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));

        d.setCalcMedia(new Geometrica());
        d.calcularMedia();
        System.out.println(String.format("(Geométrica) | P1: %.2f | P2: %.2f | Média: %.2f | Situação: %s",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    }
}