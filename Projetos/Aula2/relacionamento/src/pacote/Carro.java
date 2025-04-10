package pacote;

public class Carro {
    String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public float velocidadeMaxima() {
        if (motor.getCilindrada() <= 1) {
            return 140;
        } else if (motor.getCilindrada() <= 1.6) {
            return 180;
        } else if (motor.getCilindrada() <= 2.0) {
            return 220;
        } else if (motor.getCilindrada() > 2) {
            return 260;
        }else {
            return 0;
        }
    }
}




