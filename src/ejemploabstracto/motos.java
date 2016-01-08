package ejemploabstracto;

/**
 *
 * @author Javii
 */
public class motos extends vehiculo{

public motos(int cilindrada, int potencia){
    super(cilindrada, potencia);
}
public double calcularImposto(){
    return getCilindrada()/30+getPotencia()*10;
}
}
