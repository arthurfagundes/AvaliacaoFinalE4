/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaofinale4;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Fagundes
 */
public class AvaliacaoFinalE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double P, a, RT, v, b;
        DecimalFormat f = new DecimalFormat("0.0");
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para A:"));
        RT = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para RT:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para B:"));
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para V:"));
        
        P = (((RT /(v-b)) - (a /(v*v))));
        
        JOptionPane.showMessageDialog(null, "O valor para A é: "+f.format(a)+"\n O valor para RT é: "+f.format(RT)
                +"\n O valor para B é: "+f.format(b)+"\n O valor para V é: "+f.format(v)
                +"\n O valor de P é: "+f.format(P));
    }
    
}
