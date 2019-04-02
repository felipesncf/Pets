/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import javax.swing.JOptionPane;

/**
 *
 * @author pioca_000
 */
public class PetShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pet animal = new Pet();
        Dono dono1 = new Dono();
        Entrega entrega1 = new Entrega();
        
        dono1.setNomeDono(JOptionPane.showInputDialog("Informe o nome do cliente: "));
        dono1.setTelefone(JOptionPane.showInputDialog("Informe o numero de telefone do cliente: "));
        dono1.setDistancia(Integer.parseInt(JOptionPane.showInputDialog("Informe a distancia da casa do cliente em relacao ao PetShop: ")));
        entrega1.preco();
        
        if(dono1.negacao(dono1.getDistancia())){
            animal.setNomePet(JOptionPane.showInputDialog("Informe o nome do animal: "));
            animal.setRaca(JOptionPane.showInputDialog("Informe a raca do animal: "));
            animal.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do animal: ")));
            animal.setDono(dono1);
        }
        else{
            JOptionPane.showInputDialog("Essa distancia nao pode ser realizada a entrega!");
        }
        JOptionPane.showMessageDialog(null, "O valor da entrega foi de R$" +entrega1.getValor());
        
        
        
        
        
        
        
    }
    
}
