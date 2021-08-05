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
public class Helicoptero extends Vehiculo_aereo {
    private int helice, rotor;

    public Helicoptero(int helice, int rotor, int estabilazador, int ventanas, int puertas, String motor, String color, String volante, String marca, String modelo, int asientos, double velocidad_maxima, double tanque_gasolina) {
        super(estabilazador, ventanas, puertas, motor, color, volante, marca, modelo, asientos, velocidad_maxima, tanque_gasolina);
        this.helice = helice;
        this.rotor = rotor;
    }

    public int getHelice() {
        return helice;
    }

    public void setHelice(int helice) {
        this.helice = helice;
    }

    public int getRotor() {
        return rotor;
    }

    public void setRotor(int rotor) {
        this.rotor = rotor;
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
    public void elevarse(){}
    @Override
    public void aterrizar(){}
    @Override
    public void estabilizar(){}
    
    public void girar_eje(){}
    
}
