/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resoluçãodetela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author welton vaz de souza - weltonvaz@gmail.com.br
 */
public class ResoluçãoDeTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();  
        System.out.println("A resolução de Tela é ");  
        System.out.println("Screen height = " + d.height + "x" + d.width);
    }
    
}
