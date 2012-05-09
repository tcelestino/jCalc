/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author tcelestino
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static double somar(double val1, double val2) {

        return val1 + val2;
    }

    public static double subtrair(double val1, double val2) {

        return val1 - val2;
    }

    public static double multiplicar(double val1, double val2) {

        return val1 * val2;
    }

    public static double dividir(double val1, double val2) {

        return val1 / val2;
    }

    public static double expoente_raiz(double val1, double val2) {
        if(val2 == 0) {
            return Math.sqrt(val1);
        } else {
            return Math.pow(val1, val2);
        }
        
    }

    

    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modelo().setVisible(true);
            }
        });
    }

}
