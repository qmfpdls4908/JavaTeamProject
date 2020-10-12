import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.net.URL;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
    
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

    
public class WordGame extends JPanel{
    
    static int interval;
    static Timer timer;
    private MainFrame win;
    JPanel qpanel;
    JPanel anpanel;
    JTextField q;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    public WordGame(MainFrame win){
       setLayout(null);
       this.win = win;
         
       qpanel = new JPanel();
       qpanel.setLayout(null);
       qpanel.setSize(450,595);
       qpanel.setLocation(5,80);
       qpanel.setBorder(new TitledBorder(new LineBorder(Color.black),"문제"));
       
       anpanel = new JPanel();
       anpanel.setLayout(null);
       anpanel.setSize(430,305);
       anpanel.setLocation(10,280);
       anpanel.setBorder(new TitledBorder(new LineBorder(Color.black),"보기"));
              
       URL imgUrl1 = this.getClass().getResource("btn1.png");
		URL imgUrl2 = this.getClass().getResource("btn2.png");
		URL imgUrl3 = this.getClass().getResource("btn3.png");
		URL imgUrl4 = this.getClass().getResource("btn4.png");
		ImageIcon image_btn1 = new ImageIcon(imgUrl1);
		ImageIcon image_btn2 = new ImageIcon(imgUrl2);
		ImageIcon image_btn3 = new ImageIcon(imgUrl3);
		ImageIcon image_btn4 = new ImageIcon(imgUrl4);
		
		Font font = new Font("굴림",Font.BOLD,38);
		
		q = new JTextField("Apple");
		q.setSize(380,50);
		q.setHorizontalAlignment(JTextField.CENTER);
		q.setLocation(38,120);
		q.setFont(font);
		qpanel.add(q);
		
		btn1 = new JButton("  사과",image_btn1);
		btn1.setSize(200,75);
		btn1.setBackground(Color.pink);
        btn1.setLocation(5,60);
        btn1.setFont(font);
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setHorizontalTextPosition(JButton.RIGHT);
        btn1.setOpaque(false);
        anpanel.add(btn1);
        
        btn2 = new JButton("  바나나",image_btn2);
        btn2.setSize(300,75);
        btn2.setBackground(Color.pink);
        btn2.setLocation(170,60);
        btn2.setFont(font);
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setHorizontalTextPosition(JButton.RIGHT);
        btn2.setOpaque(false);
        anpanel.add(btn2);
        
        btn3 = new JButton("  커피",image_btn3);
        btn3.setSize(200,75);
        btn3.setBackground(Color.pink);
        btn3.setLocation(5,180);
        btn3.setFont(font);
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setHorizontalTextPosition(JButton.RIGHT);
        btn3.setOpaque(false);
        anpanel.add(btn3);
        
        btn4 = new JButton("  달고나",image_btn4);
        btn4.setSize(300,75);
        btn4.setBackground(Color.pink);
        btn4.setLocation(170,180);
        btn4.setFont(font);
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setHorizontalTextPosition(JButton.RIGHT);
        btn4.setOpaque(false);
        anpanel.add(btn4);
         
        JButton back = new JButton("뒤로");
        back.setSize(100,50);
        back.setLocation(10,10);
        back.addActionListener(new MyActionListener());
        
        JLabel countTimer = new JLabel("00");
        countTimer.setSize(50,50);
        countTimer.setLocation(20,2);
        countTimer.setFont(font);
        q.add(countTimer);
        
        //ExecWordQuiz ewq = new ExecWordQuiz();
        
       String secs = "5";
       int delay = 1000;
       int period = 1000;
       timer = new Timer();
       interval = Integer.parseInt(secs);
//       System.out.println(secs);
       countTimer.setText(secs);
       timer.scheduleAtFixedRate(new TimerTask() {

       public void run() {
//           System.out.println(setInterval());
           String i = Integer.toString(setInterval());
           countTimer.setText(i);
       }
   }, delay, period);
		
       qpanel.add(anpanel);
       add(back);
		add(qpanel);
		setSize(480,720);
    }
   private static final int setInterval() {
       if (interval == 1)
           timer.cancel();
       return --interval;
   }
    public class ExecWordQuiz {
        String[] strWords = {"television", "coumputer", "yesterday", "tomorrow", "christams"};
        String[] strHan ={"티비", "컴퓨터", "어제", "내일", "크리스마스"};
        public ExecWordQuiz(){
            Random random = new Random();
            int ran = random.nextInt(strWords.length);
            //int ran2 = random.nextInt(strWords.length);
            //int ran3 = random.nextInt(strWords.length);
            //int ran4 = random.nextInt(strWords.length);
            //int ran1 = random.nextInt(strWords.length);
            q.setText(strWords[ran]);
            //btn1.setText(strHan[ran2]);
            //btn2.setText(strHan[ran3]);
            //btn3.setText(strHan[ran4]);
            //btn4.setText(strHan[ran1]);     
        }
    }
          
     class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			win.change("firstPanel");
		}
    }
 }