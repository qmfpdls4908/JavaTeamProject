import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    
 public class WordGame extends JPanel{
     private MainFrame win;
     public WordGame(MainFrame win){
        setLayout(null);
		this.win = win;
		JLabel q = new JLabel("Apple");
		q.setSize(50,30);
		q.setLocation(120,50);
		
		JLabel a1 = new JLabel("1. 사과");
		a1.setSize(50,30);
		a1.setLocation(60,100);
		
		JLabel a2 = new JLabel("2. 바나나");
		a2.setSize(50,30);
		a2.setLocation(180,100);
		
		JLabel a3 = new JLabel("3. 커피");
		a3.setSize(50,30);
		a3.setLocation(60,160);
		
		JLabel a4 = new JLabel("4. 달고나");
		a4.setSize(50,30);
		a4.setLocation(180,160);
         
        JButton btn3 = new JButton("뒤로");
        btn3.setSize(50,50);
		btn3.setLocation(50,50);
        btn3.addActionListener(new MyActionListener());
		
        add(btn3);
		add(a1);
		add(a2);
		add(a3);
		add(a4);
		add(q);
     }
     class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			win.change("firstPanel");
		}
    }
 }