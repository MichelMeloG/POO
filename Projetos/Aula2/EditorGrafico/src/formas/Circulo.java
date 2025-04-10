package formas;

public class Circulo {
    private double raio;
    private Ponto ponto;
    ;


    public double getRaio(){
        return raio;
    }

    public void setRaio(){
        this.raio = raio;
    }



    public Circulo(double raio, double x, double y) {
        this.raio = raio;
        this.ponto = new Ponto(x,y);
    }

    public Circulo(Circulo outro){
        this.raio = outro.raio;
        this.x = outro.x;
        this.y = outro.y;
    }

    public double getArea(){
        return raio*raio*3.14;
    }

    public double getPerimetro(){
        return 2*3.14*raio;
    }

    public double getDiametro(){
        return 2*raio;
    }

}
