package packageSW26;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Gui_Wuerfelspiel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfwuerfel1;
	private JTextField tfwuerfel2;
	private JTextField tfwuerfel3;
	private JTextField tfKontostand;
	
	private Spielkonto objSpielkonto;
	private Spielbrett objSpielbrett;
	private Wuerfel objWuerfel1;
	private Wuerfel objWuerfel2;
	private Wuerfel objWuerfel3;
	private JComboBox combSpielbrett;
	private Random rand;
	private boolean check;
	private JTextField tfMultiplikator;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Wuerfelspiel frame = new Gui_Wuerfelspiel();
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
	public Gui_Wuerfelspiel() {
		setTitle("Würfelspiel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnobjektanlegen = new JButton("Objekt anlegen");
		btnobjektanlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Objekteanlegen();
			}
		});
		btnobjektanlegen.setBounds(10, 350, 121, 23);
		contentPane.add(btnobjektanlegen);
		
		JButton btnspielen = new JButton("Spielen");
		btnspielen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spielen();
			}
		});
		btnspielen.setBounds(265, 350, 121, 23);
		contentPane.add(btnspielen);
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beenden();
			}
		});
		btnEnde.setBounds(501, 350, 121, 23);
		contentPane.add(btnEnde);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "W\u00FCrfel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 33, 292, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Würfel 1");
		lblNewLabel.setBounds(10, 49, 61, 20);
		panel.add(lblNewLabel);
		
		JLabel lblWrfel = new JLabel("Würfel 2");
		lblWrfel.setBounds(10, 130, 61, 20);
		panel.add(lblWrfel);
		
		JLabel lblWrfel_1 = new JLabel("Würfel 3");
		lblWrfel_1.setBounds(10, 217, 61, 20);
		panel.add(lblWrfel_1);
		
		tfwuerfel1 = new JTextField();
		tfwuerfel1.setHorizontalAlignment(SwingConstants.CENTER);
		tfwuerfel1.setEditable(false);
		tfwuerfel1.setBounds(148, 49, 86, 20);
		panel.add(tfwuerfel1);
		tfwuerfel1.setColumns(10);
		
		tfwuerfel2 = new JTextField();
		tfwuerfel2.setHorizontalAlignment(SwingConstants.CENTER);
		tfwuerfel2.setEditable(false);
		tfwuerfel2.setColumns(10);
		tfwuerfel2.setBounds(148, 130, 86, 20);
		panel.add(tfwuerfel2);
		
		tfwuerfel3 = new JTextField();
		tfwuerfel3.setHorizontalAlignment(SwingConstants.CENTER);
		tfwuerfel3.setEditable(false);
		tfwuerfel3.setColumns(10);
		tfwuerfel3.setBounds(148, 217, 86, 20);
		panel.add(tfwuerfel3);
		
		tfKontostand = new JTextField();
		tfKontostand.setFont(new Font("Tahoma", Font.PLAIN, 26));
		tfKontostand.setHorizontalAlignment(SwingConstants.CENTER);
		tfKontostand.setBounds(312, 234, 86, 71);
		contentPane.add(tfKontostand);
		tfKontostand.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Kontostand");
		lblNewLabel_1.setBounds(312, 209, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		combSpielbrett = new JComboBox();
		combSpielbrett.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		combSpielbrett.setBounds(306, 64, 92, 86);
		contentPane.add(combSpielbrett);
		
		JLabel lblNewLabel_2 = new JLabel("Spielbrett (Zahl zwischen 1 und 6)");
		lblNewLabel_2.setBounds(306, 33, 199, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Multiplikator");
		lblNewLabel_1_1.setBounds(494, 209, 86, 14);
		contentPane.add(lblNewLabel_1_1);
		
		tfMultiplikator = new JTextField();
		tfMultiplikator.setHorizontalAlignment(SwingConstants.CENTER);
		tfMultiplikator.setFont(new Font("Tahoma", Font.PLAIN, 26));
		tfMultiplikator.setColumns(10);
		tfMultiplikator.setBounds(494, 234, 86, 71);
		contentPane.add(tfMultiplikator);
		
		objWuerfel1 = new Wuerfel();
		objWuerfel2 = new Wuerfel();
		objWuerfel3 = new Wuerfel();
		
		objSpielbrett = new Spielbrett();
		objSpielkonto = new Spielkonto();
		
		Random rand = new Random();
		
		
	}
	
	
	private void beenden() {
		System.exit(0);
	}
	
	private void Objekteanlegen() {
		// Würfelzahl holen
		int zahlu = Integer.parseInt((String) combSpielbrett.getItemAt(combSpielbrett.getSelectedIndex())); 
		objSpielbrett.tippen(zahlu);
		
		
		
		// Combobox und Multiplikator nach 1 mal deaktivieren
		if(check == false) {
			
			
			if(tfKontostand.getText().isEmpty() == false) {
				int kontogeld = Integer.parseInt(tfKontostand.getText());
				if(kontogeld>0) {
					objSpielkonto.setKontostand(kontogeld);
				}
				else if(kontogeld<=0) {
					JOptionPane.showMessageDialog(null, "Wow. Hier ist Startkapital");
					int konto2 = 10;
					objSpielkonto.setKontostand(konto2);
					tfKontostand.setText(objSpielkonto.getKontostand().toString());
				}
				
			}
			else {
				int konto2 = 10;
				objSpielkonto.setKontostand(konto2);
				tfKontostand.setText(objSpielkonto.getKontostand().toString());
				JOptionPane.showMessageDialog(null, "Kapital vergessen. Hier ist ein Startguthaben.");

			}
			tfKontostand.setEditable(false);
			tfMultiplikator.setEditable(false);
			check = true;
		}

		

	}
	
	private void spielen() {
		// Nächstes mal Source-Getters.und.setters für die fachklassen
		
		
	
		// Zufall
		int wurf1 = (int)Math.floor(Math.random() *(6 - 1 + 1) + 1);
		int wurf2 = (int)Math.floor(Math.random() *(6 - 1 + 1) + 1);
		int wurf3 = (int)Math.floor(Math.random() *(6 - 1 + 1) + 1);
		tfwuerfel1.setText(Integer.toString(wurf1));
		tfwuerfel2.setText(Integer.toString(wurf2));
		tfwuerfel3.setText(Integer.toString(wurf3));
		objWuerfel1.setWuerfel(wurf1);
		objWuerfel2.setWuerfel(wurf2);
		objWuerfel3.setWuerfel(wurf3);
		
		int Speilzahl = objSpielbrett.getZahl();
		int wurfget1 = objWuerfel1.getaugen();
		int wurfget2 = objWuerfel2.getaugen();
		int wurfget3 = objWuerfel3.getaugen();
		
	
		
		
		// Multiplikator
		int multiplikator;
		
		if(tfMultiplikator.getText().isEmpty() == false) {
			multiplikator = Integer.parseInt(tfMultiplikator.getText());
			if(multiplikator<0) {
				multiplikator = multiplikator * (-1);
			}
			if(multiplikator==0) {
				multiplikator = 1;
			}
		}
		else {
			multiplikator = 1;
		}
		
		int Geldfach = 1 * multiplikator;
		
		
		// Würfel vergleich
		boolean evrtrue = false;
		
		
		if(Speilzahl == wurfget1) {
			objSpielkonto.einzahlen(Geldfach);
			evrtrue = true;
		}
		if(Speilzahl == wurfget2) {
			objSpielkonto.einzahlen(Geldfach);
			evrtrue = true;
		}
		if(Speilzahl == wurfget3) {
			objSpielkonto.einzahlen(Geldfach);
			evrtrue = true;
		}
		if(evrtrue == false) {
			objSpielkonto.abheben(Geldfach);
		}
		else if(evrtrue == true){
			objSpielkonto.einzahlen(Geldfach);
		}
		
		// Kontostand erneuern
		tfKontostand.setText(objSpielkonto.getKontostand().toString());
		
		// Schulden
		if(objSpielkonto.getKontostand() < 0) {
			JOptionPane.showMessageDialog(null, "Sie haben Schulden");
		}
	}
}
