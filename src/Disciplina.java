public class Disciplina {
    private ICalcMedia calcMedia;
    private double media;
    private String nome;
    private double p1;
    private double p2;
    private String situacao;

    public Disciplina() {
        this.nome = "";
        this.p1 = 0.0;
        this.p2 = 0.0;
        this.calcMedia = new Aritmetica();
        calcularMedia();
    }

    public void calcularMedia() {
        this.media = calcMedia.CalculaMedia(p1, p2);
        this.situacao = calcMedia.Situacao(media);
    }

    public ICalcMedia getCalcMedia() {
        return calcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
        calcularMedia();
    }

    public double getMedia() {
        return media;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP1(double p1) {
        this.p1 = p1;
        calcularMedia();
    }

    public void setP2(double p2) {
        this.p2 = p2;
        calcularMedia();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }
}
