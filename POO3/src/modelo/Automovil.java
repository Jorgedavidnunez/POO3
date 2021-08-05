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
public class Automovil extends Vehiculo_terrestre {
    private String chasis, parachoques;
    private int puertas, ventanas;
    
    public Automovil (){}

    public Automovil(String chasis, String parachoques, int puertas, int ventanas, String placa, String frenos, String tubo_escape, int nehumaticos, int faros, String motor, String color, String volante, String marca, String modelo, int asientos, double velocidad_maxima, double tanque_gasolina) {
        super(placa, frenos, tubo_escape, nehumaticos, faros, motor, color, volante, marca, modelo, asientos, velocidad_maxima, tanque_gasolina);
        this.chasis = chasis;
        this.parachoques = parachoques;
        this.puertas = puertas;
        this.ventanas = ventanas;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getParachoques() {
        return parachoques;
    }

    public void setParachoques(String parachoques) {
        this.parachoques = parachoques;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
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
    
    public void bajar_ventanas(){}
}
