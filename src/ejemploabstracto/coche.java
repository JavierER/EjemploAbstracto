package ejemploabstracto;

/**
 *
 * @author Javii
 */
public class coche extends vehiculo{

    int numPortas;
    
public coche(int cilindrada, int potencia, int numPortas){
    super(cilindrada, potencia);
    this.numPortas=numPortas;
}

    @Override
    public String toString() {
        return "coche{" + "numero de portas: " + numPortas +", cilindrada: "+ getCilindrada()+ ", potencia: "+ getPotencia()+'}';
    }

public double calcularImposto(){
return getCilindrada()/30+getPotencia()*20;
}
}
