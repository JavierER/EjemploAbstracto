package ejemploabstracto;

/**
 *
 * @author Javii
 */
public class camion extends vehiculo {

    int numRodas;

public camion(int cilindrada, int potencia, int numRodas){
    super(cilindrada, potencia);
    this.numRodas=numRodas;
}
public double calcularImposto(){
    return getCilindrada()/30+getPotencia()*2+numRodas*20;
}

}
