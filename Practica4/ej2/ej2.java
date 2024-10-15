/*
2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
- Informe la cantidad de personas mayores de 65 años.
- Muestre la representación de la persona con menor DNI.
3- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
 */
package practica4.ej2;
import PaqueteLectura.Lector;
/**
 *
 * @author rocio
 */
public class ej2 {
    public static void main (String [] args){
        jugadores jugador;
        entrenadores entrenador;
        jugador =new jugadores(10,7,"pablo",100,2);
        entrenador = new entrenadores (15,"tomas",350,3);
        
        System.out.println(jugador.toString());
        System.out.println(entrenador.toString());
       
    }
}
