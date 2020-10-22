/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Etxeb
 */
public class TrianguloEquilatero implements IFigura {
    
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double altura;
        altura = Math.pow(lado, 2)-Math.pow((lado/2), 2);
        
        return lado*altura;
    }

    @Override
    public double calcularPerimetro() {
        
        return lado*3;
    }
    
    
    
}
