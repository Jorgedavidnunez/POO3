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
abstract class Vehiculo {
    private String motor, color, volante, marca, modelo;
    private int  asientos;
    private double velocidad_maxima, tanque_gasolina;
    Vehiculo (){}

    public Vehiculo(String motor, String color, String volante, String marca, String modelo, int asientos, double velocidad_maxima, double tanque_gasolina) {
        this.motor = motor;
        this.color = color;
        this.volante = volante;
        this.marca = marca;
        this.modelo = modelo;
        this.asientos = asientos;
        this.velocidad_maxima = velocidad_maxima;
        this.tanque_gasolina = tanque_gasolina;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(double velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public double getTanque_gasolina() {
        return tanque_gasolina;
    }

    public void setTanque_gasolina(double tanque_gasolina) {
        this.tanque_gasolina = tanque_gasolina;
    }

    public void arrancar(){}
    public void acelerar(){}
    public void desacelerar(){}
    public void apagar(){}
    
}
