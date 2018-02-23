/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Reta {
    private Ponto p1;
    private Ponto p2;
    private Double tamanho = Double.NaN;
    
    public Reta(Ponto p1, Ponto p2){
        this.p1 = p1; 
        this.p2 = p2;
    }
    
    public Ponto getP1(){
        return p1;
    }
    
    public Ponto getP2(){
        return p2;
    }
    
    public Double getTamanho(){
        return p1.getDistancia(p2);
    }
}
