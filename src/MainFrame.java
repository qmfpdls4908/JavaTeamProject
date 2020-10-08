import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MainFrame extends JFrame{
    public DictPanel dictPanel = null;
    public WordGame wordGame = null;
    public FirstPanel firstPanel = null;
    
   /* public MainFrame(){
        setTitle("Main");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);
        setVisible(true);
    }*/
    
    public void change(String panelName) {
        if(panelName.equals("firstPanel")){
            getContentPane().removeAll();
            getContentPane().add(firstPanel);
            revalidate();
            repaint();
        }else if(panelName.equals("wordGame")) {
            getContentPane().removeAll();
            getContentPane().add(wordGame);
            revalidate();
            repaint();
        }else if(panelName.equals("dictPanel")) {
            getContentPane().removeAll();
            getContentPane().add(dictPanel);
            revalidate();
            repaint();
        }
    }
    
    public static void main(String[] args){
        MainFrame win = new MainFrame();
        win.firstPanel = new FirstPanel(win);
        win.dictPanel = new DictPanel(win);
        win.wordGame = new WordGame(win);
        
        win.add(win.firstPanel);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(1280,720);
        win.setVisible(true);
    }
}