
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Retangulo extends Quadrado{
    private Reta altura;
    
    public Retangulo(Reta lado, Reta altura){
        super(lado);
        this.altura = altura;
    }
    
    public Reta getAltura(){
        return this.altura;
    }

    public Double getArea(){
        return this.altura.getTamanho() * this.getLado().getTamanho();
    }
}
