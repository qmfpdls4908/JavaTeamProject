import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DictPanel extends JPanel {
    private MainFrame win;
    JButton BckBtn = new JButton("Back");
    JButton[] btn = new JButton[2];
    JLabel[] la = new JLabel[4];
    JTextField[] tf = new JTextField[2];
    JList[] li = new JList[2];
    String[] str = {"영어단어", "단어 뜻", "영어단어", "단어 뜻"};
    String[] btnName = {"단어입력", "단어삭제"};

	public DictPanel(MainFrame win) {
        this.win = win;
		win.setTitle("DictFrame");
        setLayout(null);

        BckBtn.setLocation(10,10);
        BckBtn.setSize(30,20);
        add(BckBtn);
        BckBtn.addActionListener(new MyActionListener());

        for(int i = 0; i<4; i++) {
            la[i] = new JLabel(str[i]);
            la[i].setSize(30,20);
        }
        la[0].setLocation(10,60);
        la[1].setLocation(10,90);
        add(la[0]);
        add(la[1]);

        for(int i = 0; i<2; i++){
            tf[i] = new JTextField("", 10);
            tf[i].setSize(100,10);
        }
        tf[0].setLocation(50,60);
        tf[1].setLocation(50,90);
        add(tf[0]);
        add(tf[1]);
        
        //for(int i = 0; i<)
        
    }
    class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			win.change("firstPanel");
		}
    }
}