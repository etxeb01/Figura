/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Etxeb
 */
public class Rectangulo implements IFigura {

    private double largo;
    private double ancho;

    
    public Rectangulo(){
        
    }
    
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
       
    
    @Override
    public double calcularArea() {
        return largo*ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2*largo+2*ancho;
    }
    
}
