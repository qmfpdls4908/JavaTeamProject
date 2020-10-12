import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FirstPanel extends JPanel{
    private MainFrame win;
    public FirstPanel(MainFrame win) {
    	this.win = win;
        setLayout(null);
        setSize(480,720);
        
    	JButton btn1 = new JButton("단어장");
        JButton btn2 = new JButton("테스트");
        
        btn1.setSize(100,100);
        btn1.setLocation(50,50);
        
        btn2.setSize(100,100);
        btn2.setLocation(50,200);
    	
    	add(btn1);
    	add(btn2);
    		
    	btn1.addActionListener(new WordActionListener());
    	btn2.addActionListener(new TextActionListener());
		}
    class WordActionListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			win.change("dictPanel"); // 단어장 패널
		}
    }
    class TextActionListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			win.change("wordGame"); // 테스트 패널
		}
    }
}
