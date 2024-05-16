package packageSW22;

import packageSW20.TEST;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.awt.event.ActionEvent;


import javax.swing.ImageIcon;

public class GUI_RechtwinkligesDreieck extends JFrame {

	private JPanel contentPane;
	private JTextField tfKatheteA;
	private JTextField tfHypotenuse;
	private JTextField tfKatheteB;
	private JTextField tfFlaecheA;
	private JTextField tfAlpha;
	private JTextField tfBeta;
	private JTextField tfUmfang;

	// Deklaration der Objektverbindung -> Assoziation
	// Schritt 1v2 der Assoziation
	
	
	private fachklasse_rechtwinkligesDreieck objRechtwinkligesDreieck;		
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_RechtwinkligesDreieck frame = new GUI_RechtwinkligesDreieck();
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
	public GUI_RechtwinkligesDreieck() {
		setTitle("Berechnungen im rechtwinkligen Dreieck - B. Sautter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Rechtwinkliges Dreieck: Gesucht Kathete");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblNewLabel.setBounds(57, 11, 331, 31);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Eingabe");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 53, 100, 25);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Kathete a [cm]:");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(20, 94, 100, 25);
		contentPane.add(lblNewLabel_2);

		tfKatheteA = new JTextField();
		tfKatheteA.setBackground(new Color(152, 251, 152));
		tfKatheteA.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfKatheteA.setBounds(140, 96, 54, 20);
		contentPane.add(tfKatheteA);
		tfKatheteA.setColumns(10);

		JLabel lblNewLabel_2_1 = new JLabel("Hypotenuse c [cm]:");
		lblNewLabel_2_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(20, 130, 110, 25);
		contentPane.add(lblNewLabel_2_1);

		tfHypotenuse = new JTextField();
		tfHypotenuse.setBackground(new Color(152, 251, 152));
		tfHypotenuse.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfHypotenuse.setColumns(10);
		tfHypotenuse.setBounds(140, 132, 54, 20);
		contentPane.add(tfHypotenuse);

		JLabel lblNewLabel_1_1 = new JLabel("Ausgabe");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(250, 53, 100, 25);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_2 = new JLabel("Kathete b [cm]:");
		lblNewLabel_2_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(250, 94, 100, 25);
		contentPane.add(lblNewLabel_2_2);

		tfKatheteB = new JTextField();
		tfKatheteB.setEditable(false);
		tfKatheteB.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfKatheteB.setColumns(10);
		tfKatheteB.setBounds(370, 96, 54, 20);
		contentPane.add(tfKatheteB);

		JLabel lblNewLabel_2_1_1 = new JLabel("Fläche A [cm²]:");
		lblNewLabel_2_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(250, 130, 110, 25);
		contentPane.add(lblNewLabel_2_1_1);

		tfFlaecheA = new JTextField();
		tfFlaecheA.setEditable(false);
		tfFlaecheA.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfFlaecheA.setColumns(10);
		tfFlaecheA.setBounds(370, 132, 54, 20);
		contentPane.add(tfFlaecheA);

		JLabel lblNewLabel_2_2_1 = new JLabel("Winkel Alpha [°]:");
		lblNewLabel_2_2_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2_2_1.setBounds(250, 166, 100, 25);
		contentPane.add(lblNewLabel_2_2_1);

		tfAlpha = new JTextField();
		tfAlpha.setEditable(false);
		tfAlpha.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfAlpha.setColumns(10);
		tfAlpha.setBounds(370, 168, 54, 20);
		contentPane.add(tfAlpha);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Winkel Beta [°]:");
		lblNewLabel_2_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(250, 202, 110, 25);
		contentPane.add(lblNewLabel_2_1_1_1);

		tfBeta = new JTextField();
		tfBeta.setEditable(false);
		tfBeta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfBeta.setColumns(10);
		tfBeta.setBounds(370, 204, 54, 20);
		contentPane.add(tfBeta);

		JLabel lblNewLabel_2_2_2 = new JLabel("Umfang U [cm]:");
		lblNewLabel_2_2_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2_2_2.setBounds(250, 236, 100, 25);
		contentPane.add(lblNewLabel_2_2_2);

		tfUmfang = new JTextField();
		tfUmfang.setEditable(false);
		tfUmfang.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfUmfang.setColumns(10);
		tfUmfang.setBounds(370, 238, 54, 20);
		contentPane.add(tfUmfang);

		JButton btnBerechnen = new JButton("Berechnen");
		btnBerechnen.setMnemonic('B');
		getRootPane().setDefaultButton(btnBerechnen);                // Default-Button festlegen
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berechnen();
			}
		});
		btnBerechnen.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnBerechnen.setBounds(10, 279, 110, 23);
		contentPane.add(btnBerechnen);

		JButton btnLoeschen = new JButton("Löschen");
		btnLoeschen.setMnemonic('L');
		btnLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				leeren();
			}
		});
		btnLoeschen.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnLoeschen.setBounds(155, 280, 119, 23);
		contentPane.add(btnLoeschen);

		JButton btnProgrammende = new JButton("Programmende");
		btnProgrammende.setMnemonic('P');
		btnProgrammende.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beenden(); 
			}
		});
		btnProgrammende.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnProgrammende.setBounds(305, 280, 119, 23);
		contentPane.add(btnProgrammende);
		
		// Schritt 2v2 der Objektverbindung 
		
		objRechtwinkligesDreieck = new fachklasse_rechtwinkligesDreieck();
		
	}   // Ende vom Konstruktor - Ende von der GUI-Erstellung

	// Eigene Funktionen folgen
	private void beenden()
	{
		System.exit(0);            // Programmende
	}

	private void berechnen()
	{


		double b;

		double U;
		double A;
		double alpha;
		double beta;

		DecimalFormat nk3;
		nk3 = new DecimalFormat("#.###");

		// Eingabe
		objRechtwinkligesDreieck.katheteA =     Double.parseDouble(tfKatheteA.getText()      )  ;    // Double.parseDouble() wandelt einen String um in Double-Datentyp
		objRechtwinkligesDreieck.hypotenuseC =     Double.parseDouble(tfHypotenuse.getText()       )  ;

		if (objRechtwinkligesDreieck.hypotenuseC > objRechtwinkligesDreieck.katheteA)  // ok
		{
			/*
			//b = berechneKathete_b(a, c);
			b = TEST.berechneKathete_b(katheteA, hypotenuseC);
			//U = berechneUmfang(a, b, c);
			U = TEST.berechneUmfang(katheteA, b, hypotenuseC);
			//A = berechneFlaeche(a, b);
			A = TEST.berechneFlaeche(katheteA, b);
			//alpha =  Math.toDegrees(    Math.atan(a / b)    )   ;
			alpha = TEST.berechneAPlha(katheteA, b);
			//beta =  Math.toDegrees(    Math.acos(a / c)        );
			beta = TEST.berechneBeta(katheteA, hypotenuseC);

			*/
			
			b = objRechtwinkligesDreieck.berechneKathete_b();
			U = objRechtwinkligesDreieck.berechneUmfang();
			A = objRechtwinkligesDreieck.berechneFlaeche();
			alpha = objRechtwinkligesDreieck.berechneAPlha();
			beta = objRechtwinkligesDreieck.berechneBeta();
			
			// Ausgabe
			tfKatheteB.setText(nk3.format(b));  
			tfFlaecheA.setText(nk3.format(A));
			tfAlpha.setText(nk3.format(alpha));
			tfBeta.setText(nk3.format(beta));
			tfUmfang.setText(nk3.format(U));


		}
		else
		{
			JOptionPane.showMessageDialog(null, "c muss größer sein wie a", "Fehlerhafte Eingabe" , JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null, "Werte werden getauscht", "Fehlerkorrektur", JOptionPane.WARNING_MESSAGE);
			tfHypotenuse.setText(nk3.format(objRechtwinkligesDreieck.katheteA));
			tfKatheteA.setText(nk3.format(objRechtwinkligesDreieck.hypotenuseC));
			JOptionPane.showMessageDialog(null, "Werte wurden getauscht", "Fehlerkorrektur abgeschlossen", JOptionPane.WARNING_MESSAGE);
		}


	}

	private void leeren()
	{
		tfAlpha.setText("");
		tfBeta.setText("");
		tfFlaecheA.setText("");
		tfHypotenuse.setText("");
		tfKatheteA.setText("");
		tfKatheteB.setText("");
		tfUmfang.setText("");

	}
	

	 
}

