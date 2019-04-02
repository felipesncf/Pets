/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author pioca_000
 */
public class Entrega {
    private int valor;
    private Dono dono;


    public int getValor() {
        return valor;
    }


    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
    
    
    public void preco(){
        int km = this.dono.getDistancia();
        if(km>=0 && km<=5){
            this.valor=10;
        }
        if(km>5 && km<=15){
            this.valor=20;
        }
        if(km>15){
            this.valor=50;
        }
    }
}
