/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freecell.view;

import br.edu.uesb.aed.freecell.model.Baralho;
import br.edu.uesb.aed.freecell.model.Pilha;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author matheus
 */
public class Rascunho {

    Baralho baralho = new Baralho();
    JLabel label;
    public void gerarlabel(Pilha pilha, JPanel panel){
    
        
        for(int i =0; i < pilha.size(); i++){
            
            
            
            label = new JLabel();
            String naipe = (String) pilha.getCarta(i)[0];
            int num = (int) pilha.getCarta(i)[1];
            label.setText(naipe + " " + num);
            panel.add(label);
            panel.updateUI();
        }
        
    
        
    }
    
    public void listarLabels(){
        //gerarlabels no inicio do programa (no construtor do FramePrincipal)
    }
    
    public void caixaMudança(Pilha pilha){
        //JOPtion com lista de opções, botão ok executa pilha.mudardepilha
        
    }
    
}

