/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manderbolt;

import javax.swing.JFrame;

/**
 *
 * @author utente
 */
public class Finestra extends JFrame {
    Pannello pannello;
    public Finestra(int x,int y){
        setSize(x,y);
        pannello=new Pannello();
        pannello.setSize(getWidth(), getHeight());
        add(pannello);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
