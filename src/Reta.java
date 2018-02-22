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
    private Double tamanho;
    
    public Reta(Ponto p1, Ponto p2){
        this.p1 = p1; this.p2 = p2;
    }
    
    public Ponto getP1(Ponto p1){
        return this.p1;
    }
    public Ponto getP2(Ponto p2){
        return this.p2;
    }
    
    public Double getTamanho(){
        return this.p1.getDistancia(this.p2);
    }
     
}
