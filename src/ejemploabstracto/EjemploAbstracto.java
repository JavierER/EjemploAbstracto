
package ejemploabstracto;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public abstract class EjemploAbstracto {

   
    public static void main(String[] args) {
        motos vespa = new motos(125,50);
        JOptionPane.showMessageDialog(null,"Imposto: "+vespa.calcularImposto());
        JOptionPane.showMessageDialog(null,vespa.arrancar());  
        
        coche citroen = new coche(1003,75,4);
        JOptionPane.showMessageDialog(null,"Imposto: "+citroen.calcularImposto());
        JOptionPane.showMessageDialog(null,citroen.arrancar());  
        JOptionPane.showMessageDialog(null,citroen.toString()); 
        
        camion barreiro = new camion(3000,200,8);
        JOptionPane.showMessageDialog(null,"Imposto: "+barreiro.calcularImposto());
        JOptionPane.showMessageDialog(null,barreiro.arrancar());  
}
}
