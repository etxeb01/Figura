/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Etxeb
 */
public class Circunferencia implements IFigura {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }   
    
    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(this.radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*this.radio;
    }
    
    
    
}
