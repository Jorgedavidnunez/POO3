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
abstract class Vehiculo_terrestre extends Vehiculo {
    private String placa, frenos, tubo_escape;
    private int nehumaticos, faros;
    
    public Vehiculo_terrestre () {}

    public Vehiculo_terrestre(String placa, String frenos, String tubo_escape, int nehumaticos, int faros, String motor, String color, String volante, String marca, String modelo, int asientos, double velocidad_maxima, double tanque_gasolina) {
        super(motor, color, volante, marca, modelo, asientos, velocidad_maxima, tanque_gasolina);
        this.placa = placa;
        this.frenos = frenos;
        this.tubo_escape = tubo_escape;
        this.nehumaticos = nehumaticos;
        this.faros = faros;
    }

    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getTubo_escape() {
        return tubo_escape;
    }

    public void setTubo_escape(String tubo_escape) {
        this.tubo_escape = tubo_escape;
    }

    public int getNehumaticos() {
        return nehumaticos;
    }

    public void setNehumaticos(int nehumaticos) {
        this.nehumaticos = nehumaticos;
    }

    public int getFaros() {
        return faros;
    }

    public void setFaros(int faros) {
        this.faros = faros;
    }
    
    @Override
    public void arrancar(){}
    @Override
    public void acelerar(){}
    @Override
    public void desacelerar(){}
    @Override
    public void apagar(){}
    
    public void frenar(){}
    public void encende_faros(){}
    
    
    
}
