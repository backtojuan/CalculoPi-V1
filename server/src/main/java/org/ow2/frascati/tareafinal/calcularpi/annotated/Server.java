/** 
  * Tarea Final: CalcularPi-RMI
  *
  * Author: Lina Salinas, Juan José Valencia, Jhon Edward Mora
*/
package org.ow2.frascati.tareafinal.calcularpi.annotated;

import java.util.Random;
/**
 * The multiplication service implementation.
 */
public class Server implements CalcularPi
{    
    /**
     * Default constructor.
     */
    public Server()
    {
        System.out.println("SERVER created.");
    }

    /**
     * calcPi implementation.
     */ 
    public final long calcPi(long seed, long puntostotales) 
    {
        long puntoscirculo = 0;
        final long seedf = seed;
        final Random rnd = new Random(seedf);        

        //Generar los puntos
        for(int i=0; i<puntostotales; i++)
        {          
            //Generar los puntos
            double puntox = rnd.nextDouble();
            double puntoy = rnd.nextDouble();          
        
            //Verificar si el punto cumple con la ecuación del circulo 
            double radio = (puntox * puntox + puntoy * puntoy);
            if(radio <= 1)
            {
              puntoscirculo++;
            }       
        }
        return puntoscirculo;
    }
}