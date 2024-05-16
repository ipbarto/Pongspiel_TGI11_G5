package packageSW18;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Wuerfelspiel2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfZahl1;
	private JTextField tfZahl2;
	private JTextField tfAnzahl1;
	private JTextField tfAnzahl2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wuerfelspiel2 frame = new Wuerfelspiel2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Wuerfelspiel2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 418);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnWurfSP1 = new JButton("Würfeln");
		btnWurfSP1.setForeground(Color.BLACK);
		btnWurfSP1.setBackground(Color.GRAY);
		btnWurfSP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Zufall1();
			}
		});
		btnWurfSP1.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnWurfSP1.setBounds(10, 83, 107, 27);
		contentPane.add(btnWurfSP1);
		
		JButton btnWurfSP2 = new JButton("Würfeln");
		btnWurfSP2.setForeground(Color.BLACK);
		btnWurfSP2.setBackground(Color.GRAY);
		btnWurfSP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Zufall2();
			}
		});
		btnWurfSP2.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnWurfSP2.setBounds(515, 83, 107, 27);
		contentPane.add(btnWurfSP2);
		
		JLabel lbSp1 = new JLabel("Spieler 1");
		lbSp1.setFont(new Font("Arial Black", Font.BOLD, 13));
		lbSp1.setBounds(10, 30, 119, 27);
		contentPane.add(lbSp1);
		
		JLabel lbSp2 = new JLabel("Spieler 2");
		lbSp2.setFont(new Font("Arial Black", Font.BOLD, 13));
		lbSp2.setBounds(515, 30, 119, 27);
		contentPane.add(lbSp2);
		
		tfZahl1 = new JTextField();
		tfZahl1.setForeground(Color.WHITE);
		tfZahl1.setBackground(Color.DARK_GRAY);
		tfZahl1.setHorizontalAlignment(SwingConstants.CENTER);
		tfZahl1.setEditable(false);
		tfZahl1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfZahl1.setBounds(158, 77, 107, 43);
		contentPane.add(tfZahl1);
		tfZahl1.setColumns(10);
		
		tfZahl2 = new JTextField();
		tfZahl2.setForeground(Color.WHITE);
		tfZahl2.setBackground(Color.DARK_GRAY);
		tfZahl2.setHorizontalAlignment(SwingConstants.CENTER);
		tfZahl2.setEditable(false);
		tfZahl2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfZahl2.setColumns(10);
		tfZahl2.setBounds(362, 77, 107, 43);
		contentPane.add(tfZahl2);
		
		tfAnzahl1 = new JTextField();
		tfAnzahl1.setBackground(Color.LIGHT_GRAY);
		tfAnzahl1.setText("0");
		tfAnzahl1.setBounds(10, 174, 86, 20);
		contentPane.add(tfAnzahl1);
		tfAnzahl1.setColumns(10);
		
		tfAnzahl2 = new JTextField();
		tfAnzahl2.setBackground(Color.LIGHT_GRAY);
		tfAnzahl2.setText("0");
		tfAnzahl2.setColumns(10);
		tfAnzahl2.setBounds(509, 174, 86, 20);
		contentPane.add(tfAnzahl2);
		
		tfTEST1 = new JTextField();
		tfTEST1.setBackground(Color.LIGHT_GRAY);
		tfTEST1.setBounds(172, 174, 86, 20);
		contentPane.add(tfTEST1);
		tfTEST1.setColumns(10);
		
		tfTEST2 = new JTextField();
		tfTEST2.setBackground(Color.LIGHT_GRAY);
		tfTEST2.setColumns(10);
		tfTEST2.setBounds(362, 174, 86, 20);
		contentPane.add(tfTEST2);
		
		JLabel lbAnzahlWuerfe1 = new JLabel("Anzahl Würfe");
		lbAnzahlWuerfe1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbAnzahlWuerfe1.setHorizontalAlignment(SwingConstants.CENTER);
		lbAnzahlWuerfe1.setBounds(10, 149, 86, 14);
		contentPane.add(lbAnzahlWuerfe1);
		
		JLabel lbAnzahlWuerfe2 = new JLabel("Anzahl Würfe");
		lbAnzahlWuerfe2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbAnzahlWuerfe2.setHorizontalAlignment(SwingConstants.CENTER);
		lbAnzahlWuerfe2.setBounds(509, 149, 86, 14);
		contentPane.add(lbAnzahlWuerfe2);
		
		JLabel lbZahlen1 = new JLabel("Zahlen");
		lbZahlen1.setHorizontalAlignment(SwingConstants.CENTER);
		lbZahlen1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbZahlen1.setBounds(172, 150, 86, 14);
		contentPane.add(lbZahlen1);
		
		lbZahlen2 = new JLabel("Zahlen");
		lbZahlen2.setHorizontalAlignment(SwingConstants.CENTER);
		lbZahlen2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbZahlen2.setBounds(362, 150, 86, 14);
		contentPane.add(lbZahlen2);
		
		JButton btnSpalte1_1 = new JButton("1");
		btnSpalte1_1.setForeground(Color.BLACK);
		btnSpalte1_1.setBackground(Color.GRAY);
		btnSpalte1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adden1(tfZahl1_1);
			}
		});
		btnSpalte1_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSpalte1_1.setBounds(10, 240, 76, 27);
		contentPane.add(btnSpalte1_1);
		
		JButton btnSpalte2_1 = new JButton("2");
		btnSpalte2_1.setForeground(Color.BLACK);
		btnSpalte2_1.setBackground(Color.GRAY);
		btnSpalte2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adden1(tfZahl2_1);
			}
		});
		btnSpalte2_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSpalte2_1.setBounds(96, 240, 76, 27);
		contentPane.add(btnSpalte2_1);
		
		JButton btnSpalte3_1 = new JButton("3");
		btnSpalte3_1.setForeground(Color.BLACK);
		btnSpalte3_1.setBackground(Color.GRAY);
		btnSpalte3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adden1(tfZahl3_1);
			}
		});
		btnSpalte3_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSpalte3_1.setBounds(182, 240, 76, 27);
		contentPane.add(btnSpalte3_1);
		
		JButton btnSpalte1_2 = new JButton("1");
		btnSpalte1_2.setForeground(Color.BLACK);
		btnSpalte1_2.setBackground(Color.GRAY);
		btnSpalte1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adden2(tfZahl1_2);
			}
		});
		btnSpalte1_2.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSpalte1_2.setBounds(347, 240, 76, 27);
		contentPane.add(btnSpalte1_2);
		
		JButton btnSpalte2_2 = new JButton("2");
		btnSpalte2_2.setForeground(Color.BLACK);
		btnSpalte2_2.setBackground(Color.GRAY);
		btnSpalte2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adden2(tfZahl2_2);
			}
		});
		btnSpalte2_2.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSpalte2_2.setBounds(433, 240, 76, 27);
		contentPane.add(btnSpalte2_2);
		
		JButton btnSpalte3_2 = new JButton("3");
		btnSpalte3_2.setForeground(Color.BLACK);
		btnSpalte3_2.setBackground(Color.GRAY);
		btnSpalte3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adden2(tfZahl3_2);
			}
		});
		btnSpalte3_2.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSpalte3_2.setBounds(519, 240, 76, 27);
		contentPane.add(btnSpalte3_2);
		
		JLabel lbSpalten1 = new JLabel("Stellen");
		lbSpalten1.setHorizontalAlignment(SwingConstants.CENTER);
		lbSpalten1.setFont(new Font("Arial Black", Font.BOLD, 13));
		lbSpalten1.setBounds(10, 205, 248, 27);
		contentPane.add(lbSpalten1);
		
		JLabel lbSpalten2 = new JLabel("Stellen");
		lbSpalten2.setHorizontalAlignment(SwingConstants.CENTER);
		lbSpalten2.setFont(new Font("Arial Black", Font.BOLD, 13));
		lbSpalten2.setBounds(347, 205, 248, 27);
		contentPane.add(lbSpalten2);
		
		tfZahl1_1 = new JTextField();
		tfZahl1_1.setBackground(Color.LIGHT_GRAY);
		tfZahl1_1.setHorizontalAlignment(SwingConstants.CENTER);
		tfZahl1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfZahl1_1.setEditable(false);
		tfZahl1_1.setColumns(10);
		tfZahl1_1.setBounds(10, 276, 76, 43);
		contentPane.add(tfZahl1_1);
		
		tfZahl2_1 = new JTextField();
		tfZahl2_1.setBackground(Color.LIGHT_GRAY);
		tfZahl2_1.setHorizontalAlignment(SwingConstants.CENTER);
		tfZahl2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfZahl2_1.setEditable(false);
		tfZahl2_1.setColumns(10);
		tfZahl2_1.setBounds(96, 276, 76, 43);
		contentPane.add(tfZahl2_1);
		
		tfZahl3_1 = new JTextField();
		tfZahl3_1.setBackground(Color.LIGHT_GRAY);
		tfZahl3_1.setHorizontalAlignment(SwingConstants.CENTER);
		tfZahl3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfZahl3_1.setEditable(false);
		tfZahl3_1.setColumns(10);
		tfZahl3_1.setBounds(180, 276, 76, 43);
		contentPane.add(tfZahl3_1);
		
		tfZahl1_2 = new JTextField();
		tfZahl1_2.setBackground(Color.LIGHT_GRAY);
		tfZahl1_2.setHorizontalAlignment(SwingConstants.CENTER);
		tfZahl1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfZahl1_2.setEditable(false);
		tfZahl1_2.setColumns(10);
		tfZahl1_2.setBounds(347, 278, 76, 43);
		contentPane.add(tfZahl1_2);
		
		tfZahl2_2 = new JTextField();
		tfZahl2_2.setBackground(Color.LIGHT_GRAY);
		tfZahl2_2.setHorizontalAlignment(SwingConstants.CENTER);
		tfZahl2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfZahl2_2.setEditable(false);
		tfZahl2_2.setColumns(10);
		tfZahl2_2.setBounds(433, 278, 76, 43);
		contentPane.add(tfZahl2_2);
		
		tfZahl3_2 = new JTextField();
		tfZahl3_2.setBackground(Color.LIGHT_GRAY);
		tfZahl3_2.setHorizontalAlignment(SwingConstants.CENTER);
		tfZahl3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfZahl3_2.setEditable(false);
		tfZahl3_2.setColumns(10);
		tfZahl3_2.setBounds(517, 278, 76, 43);
		contentPane.add(tfZahl3_2);
	}
	int Ziehung1;
	int Ziehung2;
	String TEST1 = "";
	String TEST2 = "";
	private JTextField tfTEST1;
	private JTextField tfTEST2;
	private JLabel lbZahlen2;
	private JTextField tfZahl1_1;
	private JTextField tfZahl2_1;
	private JTextField tfZahl3_1;
	private JTextField tfZahl1_2;
	private JTextField tfZahl2_2;
	private JTextField tfZahl3_2;
	
	
	private void Zufall1() {
		
		
		Ziehung1 = (int) (Math.random() * 6 +1 );
		
		double ANzahl1 = Double.parseDouble(tfAnzahl1.getText());
		ANzahl1++;
		int Anzahl1 = (int) ANzahl1;
	
		
		
		String ziehungString1 = Integer.toString(Ziehung1);
		
		TEST1 = TEST1 + ziehungString1;
		
		tfTEST1.setText(TEST1);
		
		
		tfAnzahl1.setText((Integer.toString(Anzahl1)));

		
		tfZahl1.setText(ziehungString1);
	}	

	private void Zufall2() {
		
		
		Ziehung2 = (int) (Math.random() * 6 +1 );
		
		double ANzahl1 = Double.parseDouble(tfAnzahl2.getText());
		ANzahl1++;
		int Anzahl1 = (int) ANzahl1;
		
		String ziehungString2 = Integer.toString(Ziehung2);
		
		TEST2 = TEST2 + ziehungString2;
		
		tfTEST2.setText(TEST2);
		
		tfAnzahl2.setText((Integer.toString(Anzahl1)));
		
		
		tfZahl2.setText(ziehungString2);
	}
	
	private void Adden1(JTextField name1) {
		name1.setText(Integer.toString(Ziehung1));
	}
	
	private void Adden2(JTextField name2) {
		name2.setText(Integer.toString(Ziehung2));
	}
}
