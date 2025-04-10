package pacote;

public class Motor {
    float cilindrada;
    private Carro carroDoMotor;

    public Motor(float cilindrada){
        this.cilindrada = cilindrada;
    }

    public float getCilindrada() {
        return cilindrada;
    }
}
