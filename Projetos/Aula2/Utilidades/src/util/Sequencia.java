package util;

public class Sequencia {
    private int inicio;
    private int fim;

    public Sequencia(int inicio, int fim) {
        if (inicio > fim) {
            this.inicio = fim;
            this.fim = inicio;
        } else {
            this.inicio = inicio;
            this.fim = fim;
        }

    }


    public void imprimir(){
        for (int i = inicio; i <= fim; i++){
            System.out.println(i);
        }
    }

    public void imprimir(int incremento){
        for (int i = inicio; i <= fim; i = i + incremento){
            System.out.println(i);
        }
    }
}
