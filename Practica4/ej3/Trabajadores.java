/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.ej3;

/**
 *
 * @author rocio
 */
public class Trabajadores extends Persona{
    private String tarea;
    
    public Trabajadores (String unNombre,int unaEdad, int unDni,String unaTarea){
        super(unNombre,unaEdad,unDni);
        setTarea(unaTarea);
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    @Override
    public String toString(){
        String aux=super.toString()+".Soy "+this.getTarea();
        return aux;
    }
    
}
