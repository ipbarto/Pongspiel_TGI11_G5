package packageSW25_za;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.border.TitledBorder;

import packageSW08.BMI;

import javax.swing.JRadioButton;
import java.awt.SystemColor;

public class Gui_BMI_Rechner extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextArea taAusgabe;         // 1.: wie bei JTextField

	// Eigene Deklarationen
	private boolean weiblich;
	private ButtonGroup gruppeRadioButtons;
	private JTextField tfgewicht;
	private JTextField tfgroesse;
	private JTextField tfalter;

	private Person objPerson;
	private JTextField tfGeschlecht;

	// Hier das Objekt deklarieren

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_BMI_Rechner frame = new Gui_BMI_Rechner();
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
	public Gui_BMI_Rechner() {
		setTitle("Body Mass Index Rechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbInstruktion = new JLabel("Erg\u00E4nzen Sie bitte die Informationen zu Ihrer Person");
		lbInstruktion.setForeground(Color.RED);
		lbInstruktion.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lbInstruktion.setBounds(20, 11, 417, 31);
		contentPane.add(lbInstruktion);

		JLabel lbName = new JLabel("Name:");
		lbName.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbName.setBounds(20, 67, 46, 14);
		contentPane.add(lbName);

		JButton btNeu = new JButton("Leeren");
		btNeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickLeeren();
			}
		});
		btNeu.setFont(new Font("SansSerif", Font.PLAIN, 12));

		btNeu.setBounds(143, 363, 110, 23);
		contentPane.add(btNeu);

		JButton btBerechnen = new JButton("BMI berechnen");
		btBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickBerechnen();
			}
		});
		btBerechnen.setFont(new Font("SansSerif", Font.PLAIN, 12));

		btBerechnen.setBounds(20, 363, 119, 23);
		contentPane.add(btBerechnen);

		JButton btEnde = new JButton("Ende");
		btEnde.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				clickBeenden();
			}
		});
		btEnde.setBounds(277, 363, 97, 23);
		contentPane.add(btEnde);

		taAusgabe = new JTextArea();          // 2.: wie bei tfName
		taAusgabe.setEditable(false);
		taAusgabe.setFont(new Font("SansSerif", Font.PLAIN, 13));
		taAusgabe.setLineWrap(true);
		taAusgabe.setEnabled(true);
		taAusgabe.setBackground(Color.LIGHT_GRAY);
		taAusgabe.setBounds(133, 226, 241, 126);
		contentPane.add(taAusgabe);

		tfName = new JTextField();
		tfName.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfName.setBounds(115, 68, 259, 20);
		contentPane.add(tfName);
		tfName.setColumns(10);

		JLabel lbErgebnis = new JLabel("Ergebnis");
		lbErgebnis.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbErgebnis.setBounds(20, 230, 68, 14);
		contentPane.add(lbErgebnis);

		JLabel lblAlter = new JLabel("Alter:");
		lblAlter.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblAlter.setBounds(308, 121, 46, 14);
		contentPane.add(lblAlter);

		JLabel lblGroesse = new JLabel("Größe in [cm]");
		lblGroesse.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblGroesse.setBounds(308, 201, 89, 14);
		contentPane.add(lblGroesse);

		JLabel lblGewicht = new JLabel("Gewicht:");
		lblGewicht.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblGewicht.setBounds(20, 202, 68, 14);
		contentPane.add(lblGewicht);

		tfgewicht = new JTextField();
		tfgewicht.setBounds(133, 195, 60, 20);
		contentPane.add(tfgewicht);
		tfgewicht.setColumns(10);

		tfgroesse = new JTextField();
		tfgroesse.setColumns(10);
		tfgroesse.setBounds(407, 199, 60, 20);
		contentPane.add(tfgroesse);

		tfalter = new JTextField();
		tfalter.setColumns(10);
		tfalter.setBounds(407, 119, 60, 20);
		contentPane.add(tfalter);

		JLabel lblGeschlecht = new JLabel("Geschlecht");
		lblGeschlecht.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblGeschlecht.setBounds(20, 122, 103, 14);
		contentPane.add(lblGeschlecht);

		tfGeschlecht = new JTextField();
		tfGeschlecht.setColumns(10);
		tfGeschlecht.setBounds(133, 119, 60, 20);
		contentPane.add(tfGeschlecht);

		JTextArea taSave = new JTextArea();
		taSave.setLineWrap(true);
		taSave.setFont(new Font("SansSerif", Font.PLAIN, 13));
		taSave.setEnabled(true);
		taSave.setEditable(false);
		taSave.setBackground(SystemColor.controlShadow);
		taSave.setBounds(458, 226, 241, 126);
		contentPane.add(taSave);

		JButton btSave = new JButton("Save");
		btSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taSave.setText(objPerson.Saveausgabe(taAusgabe.getText()));
			}
		});
		btSave.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btSave.setBounds(458, 363, 119, 23);
		contentPane.add(btSave);

		JButton btleersave = new JButton("Leeren");
		btleersave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taSave.setText(null);
			}
		});
		btleersave.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btleersave.setBounds(587, 363, 110, 23);
		contentPane.add(btleersave);
		gruppeRadioButtons = new ButtonGroup();

		// Objekt person1 erstellen: Folgende Zeile fertigstellen
		// objekt = new Konstruktor() der Klasse

		objPerson = new Person();

	}

	public void clickLeeren()
	{

		taAusgabe.setText(null);

		tfalter.setText(null);
		tfName.setText(null);
		tfgewicht.setText(null);
		tfgroesse.setText(null);
		tfGeschlecht.setText(null);


	}


	public void clickBeenden()
	{
		System.exit(0);
	}

	public void clickBerechnen()
	{
		
	
			DecimalFormat nk1 = new DecimalFormat("#.#");

			if(tfGeschlecht.getText() != null)
			{
				objPerson.setgeschlecht((tfGeschlecht.getText()).charAt(0));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Kein Geschlecht eingegeben");
			}



			String Stringgewicht = tfgewicht.getText();
			Stringgewicht = Stringgewicht.replace(',', '.');
			if(tfgewicht.getText().isEmpty() == false && objPerson.isNumeric(Stringgewicht) == true)
			{

				double Gewicht = Double.parseDouble(Stringgewicht);
				objPerson.setgewicht(Gewicht);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Kein Gewicht eingegeben oder keine Zahl");
			}


			String Stringgroesse = tfgroesse.getText();
			Stringgroesse = Stringgroesse.replace(',', '.');
			if(tfgroesse.getText().isEmpty() == false && objPerson.isNumeric(Stringgroesse) == true) 
			{
				double koerpergroese = Double.parseDouble(Stringgroesse);
				objPerson.setgroesse(koerpergroese);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Keine Größe eingegeben");
			}
			
			
			
			String altString = tfalter.getText();
			altString = altString.replace(',', '.');
			if(tfalter.getText().isEmpty() == false && objPerson.isNumeric(altString) == true) 
			{

				altString = altString.substring(0, altString.indexOf("."));
				int alter = Integer.parseInt(altString);
				objPerson.setalter(alter);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Kein Alter eingegeben");
			}

			if(tfName.getText().isEmpty() == false) {
				objPerson.setname(tfName.getText());
			}
			else {
				JOptionPane.showMessageDialog(null, "Kein Name");
			}



			taAusgabe.setText("Name: " + objPerson.getname() +"\n");
			taAusgabe.append("Geschlecht: " + objPerson.Geschlechtanalystic() + " , Alter: " + Integer.toString(objPerson.getalter()) +  "\n");
			taAusgabe.append("Gewicht: " + Double.toString(objPerson.getgewicht()) + " kg; Größe: " + objPerson.getgroesse() + " cm" + "\n");
			taAusgabe.append("BMI = " + nk1.format(objPerson.berechneBMI()) + "\n");
			taAusgabe.append(objPerson.BMIname());
		}


		
	}





