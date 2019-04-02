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
public class Pet {
    private String nomePet;
    private int idade;
    private String raca;
    private Dono dono;

    /**
     * @return the nomePet
     */
    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

 
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

 
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    public Dono getDono() {
        return dono;
    }
    
    public void setDono(Dono dono) {
        this.dono = dono;
    }
    
    
    
    
}
