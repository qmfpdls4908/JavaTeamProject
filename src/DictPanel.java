import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class DictPanel extends JPanel {
	private MainFrame win;
	private JButton BckBtn = new JButton("Back");
	private JButton insertBtn = new JButton("단어 입력");
	private JButton delBtn = new JButton("단어 삭제");
	private JLabel[] la = new JLabel[4];
	private JLabel resla = new JLabel("검색 결과");
	private JTextField[] tf = new JTextField[2];
	private JTextField restf = new JTextField();
	private JList<String> ewordli = new JList<String>();
	private JList<String> kwordli = new JList<String>();
	private JPanel searchWordPanel = new JPanel();
	private JPanel InsertWordPanel = new JPanel();
	private JPanel ListWordPanel = new JPanel();
    private JButton sortWordBtn = new JButton("단어순");
    private JButton sortDateBtn = new JButton("시간순");

	public DictPanel(MainFrame win) {
		this.win = win;
		win.setTitle("DictFrame");
		setLayout(null);
        setSize(480,720);
        
		BckBtn.setBounds(10, 10, 100, 30);
		add(BckBtn);
		BckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("firstPanel");
			}
		});

		makeInsertpa();
		makeListpa();
		makeSearchpa();
	}

	private void makeInsertpa() {
		InsertWordPanel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "단어추가",
				TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		InsertWordPanel.setBounds(32, 60, 400, 180);
		add(InsertWordPanel);
		InsertWordPanel.setLayout(null);

		la[0] = new JLabel("영어 단어");
		la[0].setBounds(87, 45, 57, 22);
		InsertWordPanel.add(la[0]);

		la[1] = new JLabel("단어 뜻");
		la[1].setBounds(87, 80, 57, 22);
		InsertWordPanel.add(la[1]);

		tf[0] = new JTextField();
		tf[0].setBounds(181, 45, 130, 22);
		InsertWordPanel.add(tf[0]);
		tf[0].setColumns(10);

		tf[1] = new JTextField();
		tf[1].setBounds(181, 80, 130, 22);
		InsertWordPanel.add(tf[1]);
		tf[1].setColumns(10);

		insertBtn.setBounds(66, 130, 100, 25);
		InsertWordPanel.add(insertBtn);
        
		delBtn.setBounds(234, 130, 100, 25);
		InsertWordPanel.add(delBtn);
	}

	private void makeListpa() {
		ListWordPanel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "단어목록",
				TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		ListWordPanel.setBounds(32, 245, 400, 329);
		add(ListWordPanel);
		ListWordPanel.setLayout(null);

		la[2] = new JLabel("영어 단어");
		la[2].setBounds(79, 31, 60, 15);
		ListWordPanel.add(la[2]);

		la[3] = new JLabel("단어 뜻");
		la[3].setBounds(270, 31, 57, 15);
		ListWordPanel.add(la[3]);

		ewordli.setBounds(31, 56, 153, 219);
		ListWordPanel.add(ewordli);

		kwordli.setBounds(216, 56, 153, 219);
		ListWordPanel.add(kwordli);
        
		sortWordBtn.setBounds(87, 285, 97, 23);
		ListWordPanel.add(sortWordBtn);
		
		sortDateBtn.setBounds(216, 285, 97, 23);
		ListWordPanel.add(sortDateBtn);
	}

	private void makeSearchpa() {
		searchWordPanel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "영단어검색",
				TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		searchWordPanel.setBounds(32, 584, 400, 71);
		add(searchWordPanel);
		searchWordPanel.setLayout(null);

		resla.setHorizontalAlignment(SwingConstants.CENTER);
		resla.setBounds(219, 25, 153, 25);
		searchWordPanel.add(resla);

		restf.setHorizontalAlignment(SwingConstants.CENTER);
		restf.setBounds(30, 25, 162, 25);
		searchWordPanel.add(restf);
		restf.setColumns(10);
	}
}