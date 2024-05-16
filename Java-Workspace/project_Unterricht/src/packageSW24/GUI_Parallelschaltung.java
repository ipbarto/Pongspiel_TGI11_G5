package packageSW24;

import java.awt.EventQueue;
import packageSW18.Parallelschaltung_rechner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;

public class GUI_Parallelschaltung extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfSpannung;
	private JTextField tfWider1;
	private JTextField tfWider2;
	private JTextField tfGesWider;
	private JTextField tfGesStrom;
	private JTextField tfStrom1;
	private JTextField tfStrom2;
	private JTextField tfLeistung;
	
	private fachklasse_Parallelschaltung objParallelschaltung_rechner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Parallelschaltung frame = new GUI_Parallelschaltung();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		fachklasse_Parallelschaltung rechner = new fachklasse_Parallelschaltung();
	}

	
	
	/**
	 * Create the frame.
	 */
	

	
	public GUI_Parallelschaltung() {
		
		
		setTitle("Lenny Bartossek");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 412);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(140, 140, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Schaltung mit 2 parallelen Widerständen");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 688, 45);
		contentPane.add(lblNewLabel);

		JLabel lblEingabe = new JLabel("Eingabe");
		lblEingabe.setHorizontalAlignment(SwingConstants.LEFT);
		lblEingabe.setFont(new Font("Verdana", Font.BOLD, 12));
		lblEingabe.setBounds(54, 56, 86, 35);
		contentPane.add(lblEingabe);

		JLabel lblAusgabe = new JLabel("Ausgabe");
		lblAusgabe.setHorizontalAlignment(SwingConstants.LEFT);
		lblAusgabe.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAusgabe.setBounds(426, 56, 86, 35);
		contentPane.add(lblAusgabe);

		JLabel lblSpannung = new JLabel("Spannung");
		lblSpannung.setHorizontalAlignment(SwingConstants.LEFT);
		lblSpannung.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSpannung.setBounds(54, 102, 86, 35);
		contentPane.add(lblSpannung);

		JLabel lblWiderstand = new JLabel("Widerstand 1");
		lblWiderstand.setHorizontalAlignment(SwingConstants.LEFT);
		lblWiderstand.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblWiderstand.setBounds(54, 148, 86, 35);
		contentPane.add(lblWiderstand);

		JLabel lblWiderstand_1 = new JLabel("Widerstand 2");
		lblWiderstand_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblWiderstand_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblWiderstand_1.setBounds(54, 194, 86, 35);
		contentPane.add(lblWiderstand_1);

		JLabel lblGesamtwiderstand = new JLabel("Gesamtwiderstand");
		lblGesamtwiderstand.setHorizontalAlignment(SwingConstants.LEFT);
		lblGesamtwiderstand.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblGesamtwiderstand.setBounds(426, 102, 86, 35);
		contentPane.add(lblGesamtwiderstand);

		JLabel lblGesamtstrom = new JLabel("Gesamtstrom");
		lblGesamtstrom.setHorizontalAlignment(SwingConstants.LEFT);
		lblGesamtstrom.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblGesamtstrom.setBounds(426, 148, 86, 35);
		contentPane.add(lblGesamtstrom);

		JLabel lblStrom = new JLabel("Strom 1");
		lblStrom.setHorizontalAlignment(SwingConstants.LEFT);
		lblStrom.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblStrom.setBounds(426, 194, 86, 35);
		contentPane.add(lblStrom);

		JLabel lblStrom_1 = new JLabel("Strom 2");
		lblStrom_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblStrom_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblStrom_1.setBounds(426, 240, 86, 35);
		contentPane.add(lblStrom_1);

		JLabel lblLeistung = new JLabel("Leistung");
		lblLeistung.setHorizontalAlignment(SwingConstants.LEFT);
		lblLeistung.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblLeistung.setBounds(426, 286, 86, 35);
		contentPane.add(lblLeistung);

		JButton btnBerechnen = new JButton("Berechnen");
		btnBerechnen.setMnemonic('B');
		getRootPane().setDefaultButton(btnBerechnen);
		btnBerechnen.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
				}
			}
		   
		});
		btnBerechnen.setBackground(new Color(192, 192, 192));
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Berechne();
			}
		});
		btnBerechnen.setBounds(51, 339, 89, 23);
		contentPane.add(btnBerechnen);

		JButton btnLoeschen = new JButton("Löschen");
		btnLoeschen.setMnemonic('L');
		btnLoeschen.setBackground(new Color(192, 192, 192));
		btnLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loeschen();
			}
		});
		btnLoeschen.setBounds(306, 339, 89, 23);
		contentPane.add(btnLoeschen);

		JButton btnEnde = new JButton("Ende");
		btnEnde.setMnemonic('E');
		btnEnde.setBackground(new Color(192, 192, 192));
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ende();
			}
		});
		btnEnde.setBounds(556, 339, 89, 23);
		contentPane.add(btnEnde);

		tfSpannung = new JTextField();
		tfSpannung.setColumns(10);
		tfSpannung.setBounds(172, 110, 86, 20);
		contentPane.add(tfSpannung);

		tfWider1 = new JTextField();
		tfWider1.setColumns(10);
		tfWider1.setBounds(172, 156, 86, 20);
		contentPane.add(tfWider1);

		tfWider2 = new JTextField();
		tfWider2.setColumns(10);
		tfWider2.setBounds(172, 202, 86, 20);
		contentPane.add(tfWider2);

		tfGesWider = new JTextField();
		tfGesWider.setEditable(false);
		tfGesWider.setColumns(10);
		tfGesWider.setBounds(536, 110, 86, 20);
		contentPane.add(tfGesWider);

		tfGesStrom = new JTextField();
		tfGesStrom.setEditable(false);
		tfGesStrom.setColumns(10);
		tfGesStrom.setBounds(536, 156, 86, 20);
		contentPane.add(tfGesStrom);

		tfStrom1 = new JTextField();
		tfStrom1.setEditable(false);
		tfStrom1.setColumns(10);
		tfStrom1.setBounds(536, 202, 86, 20);
		contentPane.add(tfStrom1);

		tfStrom2 = new JTextField();
		tfStrom2.setEditable(false);
		tfStrom2.setColumns(10);
		tfStrom2.setBounds(536, 248, 86, 20);
		contentPane.add(tfStrom2);

		tfLeistung = new JTextField();
		tfLeistung.setEditable(false);
		tfLeistung.setColumns(10);
		tfLeistung.setBounds(536, 294, 86, 20);
		contentPane.add(tfLeistung);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(GUI_Parallelschaltung.class.getResource("/packageSW18/Parallelschaltung_Widerstände.svg.png")));
		lblNewLabel_1.setBounds(244, 213, 200, 160);
		contentPane.add(lblNewLabel_1);
		
		
		objParallelschaltung_rechner = new fachklasse_Parallelschaltung();
	}
	
	public void Berechne() {
		double I1,I2,P;
		
		DecimalFormat nk3 = new DecimalFormat("#0.000");
		
		try {
			double Spannung =  Double.parseDouble(tfSpannung.getText());
			double WIder1 = Double.parseDouble(tfWider1.getText());
			double Wider2 = Double.parseDouble(tfWider2.getText());
			objParallelschaltung_rechner.setSpannung(Spannung);
			objParallelschaltung_rechner.setWiderstan1(WIder1);
			objParallelschaltung_rechner.setWiderstan2(Wider2); 
		} catch (NumberFormatException objError) {
			JOptionPane.showMessageDialog(null, objError);
		}

		


		if (objParallelschaltung_rechner.getWiderstand1() != 0 && objParallelschaltung_rechner.getWiderstand2() != 0) {

				//Rges = R1 * R2 / ( (R1+R2));
				//objParallelschaltung_rechner.Rges = objParallelschaltung_rechner.GesWiderstand();
				//Iges = U / Rges;
				//objParallelschaltung_rechner.Iges = objParallelschaltung_rechner.GesStrom();
				//I1 = U / R1;
				I1 = objParallelschaltung_rechner.Strom1();
				//I2 = U / R2;
				I2 = objParallelschaltung_rechner.Strom1();
				//P = U * Iges;
				P = objParallelschaltung_rechner.Power();

				tfGesWider.setText(nk3.format(objParallelschaltung_rechner.GesWiderstand()));
				tfGesStrom.setText(nk3.format(objParallelschaltung_rechner.GesStrom()));
				tfStrom1.setText(nk3.format(I1));
				tfStrom2.setText(nk3.format(I2));
				tfLeistung.setText(nk3.format(P));
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Widerstand null", "Widerstand null", JOptionPane.WARNING_MESSAGE);
		}

		}

	

	private void Loeschen() {
		tfGesWider.setText(null);
		tfGesStrom.setText(null);
		tfStrom1.setText(null);
		tfStrom2.setText(null);
		tfLeistung.setText(null);
		tfSpannung.setText(null);
		tfWider1.setText(null);
		tfWider2.setText(null);
	}

	private void Ende() {
		System.exit(0);		//Programm ende
	}
}
