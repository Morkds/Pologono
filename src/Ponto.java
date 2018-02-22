/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Ponto {
    private Double x;
    private Double y;
    
    public Ponto (Double x, Double y){
        this.x = x;
        this.y = y;
    }
    
    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public String getLocalizacao(){
        if (x==0 && y==0){
            return "Na origem";
        }
        if (x==0){
            return "Sobre o eixo x";
        }
        if (y==0){
            return "Sobre o eixo y";
        }
        if (x>0 && y>0){
            return "1º Quadrante";
        }
        if (x<0 && y>0){
            return "2º Quadrante";
        }
        if (x<0 && y<0){
            return "3º Quadrante";
        }
        if (x>0 && y<0){
            return "4º Quadrante";
        }
        return null;
    }

    public Double getx(){
        return this.x;
    }
        public Double gety(){
        return this.y;
    }
        
    public Double getDistancia(Ponto p){
        return Math.sqrt(Math.pow(p.getx()-this.x,2)
                + Math.pow(p.gety()-this.y,2));
    }
     
    public static void main (String args []){
        Ponto p1 = new Ponto(3.8, -5.2);
        System.out.println(p1.getLocalizacao());
        Ponto p2 = new Ponto();
        System.out.println(p2.getLocalizacao());
        System.out.println(p1.getDistancia(p2));
    }
}

