/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.ej1;

/**
 *
 * @author rocio
 */
public class Subsidio {
    private double monto;
    private String motivo;
    private boolean otorgado;
    
    public Subsidio (double unMonto,String unMotivo){//agrego un "boolean otorgado???
       setMonto(unMonto);
       setMotivo(unMotivo);
       this.otorgado =false;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isOtorgado() {
        return otorgado;
    }

    public void setOtorgado(boolean otorgado) {
        this.otorgado = otorgado;
    }
    
}
