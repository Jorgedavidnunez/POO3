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
public class Avion extends Vehiculo_aereo {
    private int turbinas, alerones;
    
    public Avion (){}

    public Avion(int turbinas, int alerones, int estabilazador, int ventanas, int puertas, String motor, String color, String volante, String marca, String modelo, int asientos, double velocidad_maxima, double tanque_gasolina) {
        super(estabilazador, ventanas, puertas, motor, color, volante, marca, modelo, asientos, velocidad_maxima, tanque_gasolina);
        this.turbinas = turbinas;
        this.alerones = alerones;
    }

    public int getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }

    public int getAlerones() {
        return alerones;
    }

    public void setAlerones(int alerones) {
        this.alerones = alerones;
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
    
    public void planera(){}
    public void piloto_automatico(){}
    
}
