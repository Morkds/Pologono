/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Quadrado {
    private Reta lado;
    
    public Quadrado(Reta lado){
        this.lado = lado;
    }
    
    public Reta getLado(){
        return lado;
    }
    
    public Double getArea(){
        return lado.getTamanho() * lado.getTamanho();
    }
    
    public Double getPerimetro(){
        return lado.getTamanho() * 4;
    }
}
