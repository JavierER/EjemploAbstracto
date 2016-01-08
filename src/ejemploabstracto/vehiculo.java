package ejemploabstracto;

/**
 *
 * @author Javii
 */
public abstract class vehiculo {
    private int cilindrada;
    private int potencia;

    public vehiculo(int cilindrada, int potencia) {
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }
    
    public String arrancar(){
        return "Arranca o vehículo";
    }
    public abstract double calcularImposto();
}

    
   

