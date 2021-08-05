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
abstract class Vehiculo_aereo extends Vehiculo {
    private int estabilazador, ventanas, puertas;
    public Vehiculo_aereo (){}

    public Vehiculo_aereo(int estabilazador, int ventanas, int puertas, String motor, String color, String volante, String marca, String modelo, int asientos, double velocidad_maxima, double tanque_gasolina) {
        super(motor, color, volante, marca, modelo, asientos, velocidad_maxima, tanque_gasolina);
        this.estabilazador = estabilazador;
        this.ventanas = ventanas;
        this.puertas = puertas;
    }

    public int getEstabilazador() {
        return estabilazador;
    }

    public void setEstabilazador(int estabilazador) {
        this.estabilazador = estabilazador;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    @Override
    public void arrancar(){}
    @Override
    public void acelerar(){}
    @Override
    public void desacelerar(){}
    @Override
    public void apagar(){}
    
    public void elevarse(){}
    public void aterrizar(){}
    public void estabilizar(){}
    
}
