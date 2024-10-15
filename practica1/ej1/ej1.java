/*
1- Analice el programa Ej01Tabla2.java, que carga un vector que representa la tabla
del 2.
Genere enteros aleatorios hasta obtener el número 11. Para cada número muestre
el resultado de multiplicarlo por 2 (accediendo al vector).
 */
package practica4.ej1;

import PaqueteLectura.Lector;

/**
 *
 * @author rocio
 */
public class ej1 {
    public static void main (String [] args){
     circulo circulo1= new circulo(Lector.leerDouble(), Lector.leerString(), Lector.leerString());
     triangulo triangulo1 = new triangulo(Lector.leerDouble(), Lector.leerDouble(), Lector.leerDouble(), Lector.leerString(), Lector.leerString());
    
     System.out.println (circulo1.toString());
     System.out.println (triangulo1.toString());
            
    triangulo1.Despintar();
    System.out.println (triangulo1.toString());
  }
}
