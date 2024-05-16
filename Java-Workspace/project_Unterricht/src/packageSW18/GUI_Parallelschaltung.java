package packageSW18;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class GUI_Parallelschaltung extends JFrame {

	private JPanel contentPane;
	private JTextField tfKatheteA;
	private  JTextField tfHypotenuseC;
	private  JTextField tfFlaeche;
	private JTextField tfKatheteB;
	private JTextField tfUmfang;
	private JTextField tfWinkel_Alpha;
	private JTextField tfWInkel_Beta;


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
	}

	/**
	 * Create the frame.
	 */
	public GUI_Parallelschaltung() {
		setTitle("Berechnung von Lenny Bartossek");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 413);
		contentPane = new JPanel();
		contentPane.setFocusTraversalPolicyProvider(true);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Rechtwinkgliges Dreieck: Gesucht Kathete");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel.setBounds(0, 0, 599, 51);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Eingabe");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(21, 62, 93, 29);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Kathete a (cm)");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(21, 102, 110, 29);
		contentPane.add(lblNewLabel_1_1);

		tfKatheteA = new JTextField();
		tfKatheteA.setBackground(Color.GRAY);
		tfKatheteA.setForeground(Color.WHITE);
		tfKatheteA.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tfKatheteA.setBounds(164, 111, 57, 20);
		contentPane.add(tfKatheteA);
		tfKatheteA.setColumns(10);

		JLabel lblNewLabel_1_1_1 = new JLabel("Hypotenuse c (cm)");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(21, 142, 133, 29);
		contentPane.add(lblNewLabel_1_1_1);

		tfHypotenuseC = new JTextField();
		tfHypotenuseC.setBackground(Color.GRAY);
		tfHypotenuseC.setForeground(Color.WHITE);
		tfHypotenuseC.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tfHypotenuseC.setColumns(10);
		tfHypotenuseC.setBounds(164, 148, 57, 20);
		contentPane.add(tfHypotenuseC);

		JLabel lblNewLabel_1_2 = new JLabel("Ausgabe");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(366, 62, 93, 29);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_1_2 = new JLabel("Kathete b (cm)");
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(362, 102, 110, 29);
		contentPane.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Fläche A (cm²)");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(362, 142, 114, 29);
		contentPane.add(lblNewLabel_1_1_1_1);

		tfFlaeche = new JTextField();
		tfFlaeche.setEditable(false);
		tfFlaeche.setBackground(Color.GRAY);
		tfFlaeche.setForeground(Color.WHITE);
		tfFlaeche.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tfFlaeche.setColumns(10);
		tfFlaeche.setBounds(501, 148, 57, 20);
		contentPane.add(tfFlaeche);

		tfKatheteB = new JTextField();
		tfKatheteB.setEditable(false);
		tfKatheteB.setBackground(Color.GRAY);
		tfKatheteB.setForeground(Color.WHITE);
		tfKatheteB.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tfKatheteB.setColumns(10);
		tfKatheteB.setBounds(501, 108, 57, 20);
		contentPane.add(tfKatheteB);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Umfang (cm)");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(362, 258, 114, 29);
		contentPane.add(lblNewLabel_1_1_1_1_1);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("Winkel Alpha");
		lblNewLabel_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1.setBounds(362, 182, 110, 29);
		contentPane.add(lblNewLabel_1_1_2_1);

		tfUmfang = new JTextField();
		tfUmfang.setEditable(false);
		tfUmfang.setBackground(Color.GRAY);
		tfUmfang.setForeground(Color.WHITE);
		tfUmfang.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tfUmfang.setColumns(10);
		tfUmfang.setBounds(501, 264, 57, 20);
		contentPane.add(tfUmfang);

		tfWinkel_Alpha = new JTextField();
		tfWinkel_Alpha.setEditable(false);
		tfWinkel_Alpha.setBackground(Color.GRAY);
		tfWinkel_Alpha.setForeground(Color.WHITE);
		tfWinkel_Alpha.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tfWinkel_Alpha.setColumns(10);
		tfWinkel_Alpha.setBounds(501, 188, 57, 20);
		contentPane.add(tfWinkel_Alpha);

		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Winkel Beta");
		lblNewLabel_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1_1.setBounds(362, 219, 110, 29);
		contentPane.add(lblNewLabel_1_1_2_1_1);

		tfWInkel_Beta = new JTextField();
		tfWInkel_Beta.setEditable(false);
		tfWInkel_Beta.setBackground(Color.GRAY);
		tfWInkel_Beta.setForeground(Color.WHITE);
		tfWInkel_Beta.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tfWInkel_Beta.setColumns(10);
		tfWInkel_Beta.setBounds(501, 225, 57, 20);
		contentPane.add(tfWInkel_Beta);

		JButton btnBerechnen = new JButton("Berechnen");
		btnBerechnen.setForeground(Color.WHITE);
		btnBerechnen.setBackground(Color.BLACK);
		btnBerechnen.setMnemonic('B');
		getRootPane().setDefaultButton(btnBerechnen);
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Berechnen();
			}
		});
		btnBerechnen.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnBerechnen.setBounds(21, 335, 106, 23);
		contentPane.add(btnBerechnen);

		JButton btnLoeschen = new JButton("Löschen");
		btnLoeschen.setForeground(Color.WHITE);
		btnLoeschen.setBackground(Color.BLACK);
		btnLoeschen.setMnemonic('L');
		btnLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loeschen();
			}
		});
		btnLoeschen.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnLoeschen.setBounds(248, 335, 106, 23);
		contentPane.add(btnLoeschen);

		JButton btnEnde = new JButton("Ende");
		btnEnde.setForeground(Color.WHITE);
		btnEnde.setBackground(Color.BLACK);
		btnEnde.setMnemonic('E');
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beenden();
			}
		});
		btnEnde.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnEnde.setBounds(471, 335, 106, 23);
		contentPane.add(btnEnde);
		
		JLabel lbGrafik = new JLabel("New label");
		lbGrafik.setIcon(new ImageIcon(GUI_Parallelschaltung.class.getResource("/packageSW18/RechtwinkligesDreieck200x100.png")));
		lbGrafik.setBounds(31, 182, 200, 100);
		contentPane.add(lbGrafik);
	}		//Ende vom Konstruktor - Ende von der GUI

	private void beenden() {
		System.exit(0);		//Programm ende

	}

	private void Loeschen() {
		tfKatheteA.setText(null);
		tfKatheteB.setText(null);
		tfHypotenuseC.setText(null);
		tfWinkel_Alpha.setText(null);
		tfWInkel_Beta.setText(null);
		tfFlaeche.setText(null);
		tfUmfang.setText(null);
	}

	private void Berechnen() {
		double a;
		double b;
		double c;
		double U;
		double A;
		double alpha;
		double beta;

		DecimalFormat nk3 = new DecimalFormat("#.###");

		a = Double.parseDouble(tfKatheteA.getText());
		c = Double.parseDouble(tfHypotenuseC.getText());

		if (c > a)	//OK
		{	
			b = Math.sqrt(Math.pow(c,2) - Math.pow(a, 2));
			U = c + a + b;
			A = 0.5 * a * b;
			alpha = Math.toDegrees(Math.atan(a / b));
			beta = Math.toDegrees(Math.acos(a / c));
			//Ausgabe
			tfKatheteB.setText(nk3.format(b));
			tfFlaeche.setText(nk3.format(A));
			tfUmfang.setText(nk3.format(U));
			tfWinkel_Alpha.setText(nk3.format(alpha));
			tfWInkel_Beta.setText(nk3.format(beta));
		}
		else
		{
			JOptionPane.showMessageDialog(null, "'c'  muss größer sein wie 'a'", "Fehlerhafte Eingabe", JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null, "Werte werden getauscht", "Fehlerkorrektur", JOptionPane.WARNING_MESSAGE);
			tfHypotenuseC.setText(nk3.format(a));
			tfKatheteA.setText(nk3.format(c));
			JOptionPane.showMessageDialog(null, "Werte wurden getauscht", "Fehlerkorrektur abgeschlossen", JOptionPane.WARNING_MESSAGE);
		}
	}
}

