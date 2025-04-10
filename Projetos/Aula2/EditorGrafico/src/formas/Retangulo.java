package formas;

public class Retangulo {
    private Ponto ponto;
    private int largura;
    private int altura;

    public Retangulo(int x, int y, int largura, int altura) {
        this.ponto = new Ponto(x,y);
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(Ponto ponto, int largura, int altura) {
        this.ponto = ponto;
        this.largura = largura;
        this.altura = altura;
    }



    public void desenhar() {
        System.out.printf("Retangulo(%d, %d, %d, %d)\n",
                ponto, largura, altura);
    }

    public void redimensionar(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (sx / 100 * largura);
            altura = (int) (sy / 100 * altura);
        }
    }

    public void dividir(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (largura / sx);
            altura = (int) (altura / sy);
        }
    }



}


