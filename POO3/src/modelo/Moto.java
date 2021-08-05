/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author david
 */
public class Moto extends Vehiculo_terrestre {
    private String horquilla,soporte;
    public Moto () {}

    public Moto(String horquilla, String soporte, String placa, String frenos, String tubo_escape, int nehumaticos, int faros, String motor, String color, String volante, String marca, String modelo, int asientos, double velocidad_maxima, double tanque_gasolina) {
        super(placa, frenos, tubo_escape, nehumaticos, faros, motor, color, volante, marca, modelo, asientos, velocidad_maxima, tanque_gasolina);
        this.horquilla = horquilla;
        this.soporte = soporte;
    }


    public String getHorquilla() {
        return horquilla;
    }

    public void setHorquilla(String horquilla) {
        this.horquilla = horquilla;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
    
    @Override
    public void arrancar(){}
    @Override
    public void acelerar(){}
    @Override
    public void desacelerar(){}
    @Override
    public void apagar(){}
    @Override
    public void frenar(){}
    @Override
    public void encende_faros(){}
    
    public void  maniobrar (){}
}
