package packageSW20;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Staedtereisen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfStrecke;
	private JTextField tfAnzahlperson;
	private JRadioButton rbKlasse1;
	private JTextField tfKostenEingabe;
	private JCheckBox cbAufSchlafwagen;
	private JCheckBox cbAufReservierterPlatz;
	private JRadioButton rbKlasse2;
	private JCheckBox cbRabattFrühbucher;
	private JTextArea tazusammenfassung;
	private ButtonGroup gruppeRadioButton;
	
	// Attribute für Berechnungen
	private double strecke;
	private double KostenproKM;
	private int anzahlPersonen;
	private boolean klasse1;
	private boolean klasse2;
	private boolean aufschlagSchlafw;
	private boolean aufschlagRiP;
	private boolean rabatte;
	double Gesamtkostenzsm;
	double kostenGesamt;
	double AufschlagSw;
	double aufschlagRP;
	double rabattFB;
	private final Action action = new SwingAction();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staedtereisen frame = new Staedtereisen();
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
	public Staedtereisen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1045, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1029, 22);
		contentPane.add(menuBar);

		JMenu mndatei = new JMenu("Datei");
		mndatei.setMnemonic('D');
		menuBar.add(mndatei);

		JMenuItem mnuDateiSpeichern = new JMenuItem("Speichern");
		mnuDateiSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			save();
			}
			
		});
		mndatei.add(mnuDateiSpeichern);

		JMenuItem mnuDateiOeffnen = new JMenuItem("Öffnen");
		mnuDateiOeffnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				load();
			}
		});
		mndatei.add(mnuDateiOeffnen);

		JSeparator separator = new JSeparator();
		mndatei.add(separator);

		JMenuItem mnuDateiProgrammende = new JMenuItem("Programmende");
		mnuDateiProgrammende.setMnemonic('E');
		mnuDateiProgrammende.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beenden();
			}
		});
		mndatei.add(mnuDateiProgrammende);

		JMenu mnBearbeiten = new JMenu("Bearbeiten");
		menuBar.add(mnBearbeiten);

		JMenuItem mnuBearbeitenKostenBerechnen = new JMenuItem("Kosten Berechnen");
		mnuBearbeitenKostenBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berechnekosten();
			}
		});
		mnBearbeiten.add(mnuBearbeitenKostenBerechnen);

		JMenuItem mnuBearbeitenAngebotmitText = new JMenuItem("Angebot mit Text erstellen");
		mnuBearbeitenAngebotmitText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test_erstellen();
			}
		});
		mnBearbeiten.add(mnuBearbeitenAngebotmitText);

		JMenuItem mnuBearbeitenAngebotloeschen = new JMenuItem("Angebot löschen");
		mnuBearbeitenAngebotloeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Text_loeschen();
			}
		});
		mnBearbeiten.add(mnuBearbeitenAngebotloeschen);

		JLabel lblNewLabel = new JLabel("TG-Städtereisen kalkulieren");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(420, 33, 216, 38);
		contentPane.add(lblNewLabel);

		tazusammenfassung = new JTextArea();
		tazusammenfassung.setEditable(false);
		tazusammenfassung.setBounds(701, 179, 318, 374);
		contentPane.add(tazusammenfassung);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Kosten [Euro]", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(701, 90, 318, 53);
		contentPane.add(panel);
		panel.setLayout(null);

		tfKostenEingabe = new JTextField();
		tfKostenEingabe.setBounds(96, 21, 126, 23);
		tfKostenEingabe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(tfKostenEingabe);
		tfKostenEingabe.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Transpoertmittel w\u00E4hlen", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(51, 90, 256, 123);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		rbKlasse1 = new JRadioButton("1. Klasse (100%)");
		rbKlasse1.setBounds(26, 23, 224, 25);
		rbKlasse1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(rbKlasse1);

		rbKlasse2 = new JRadioButton("2. Klasse (90%)");
		rbKlasse2.setSelected(true);
		rbKlasse2.setBounds(26, 69, 224, 25);
		rbKlasse2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(rbKlasse2);


		gruppeRadioButton = new ButtonGroup();
		gruppeRadioButton.add(rbKlasse1);
		gruppeRadioButton.add(rbKlasse2);


		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Optionen und Rabatte", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(51, 224, 256, 219);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		cbAufSchlafwagen = new JCheckBox("Aufschlag Schlafwagen (+15%)");
		cbAufSchlafwagen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbAufSchlafwagen.setBounds(6, 36, 244, 23);
		panel_2.add(cbAufSchlafwagen);

		cbAufReservierterPlatz = new JCheckBox("Aufschlag Reservierter Platz (+8%)");
		cbAufReservierterPlatz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbAufReservierterPlatz.setBounds(6, 106, 244, 23);
		panel_2.add(cbAufReservierterPlatz);

		cbRabattFrühbucher = new JCheckBox("Rabatt Frühbucher (-7%)");
		cbRabattFrühbucher.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbRabattFrühbucher.setBounds(6, 171, 244, 23);
		panel_2.add(cbRabattFrühbucher);

		tfStrecke = new JTextField();
		tfStrecke.setBounds(175, 467, 132, 20);
		contentPane.add(tfStrecke);
		tfStrecke.setColumns(10);

		tfAnzahlperson = new JTextField();
		tfAnzahlperson.setColumns(10);
		tfAnzahlperson.setBounds(175, 514, 132, 20);
		contentPane.add(tfAnzahlperson);

		JLabel lblNewLabel_1 = new JLabel("Strecke[km]");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(51, 464, 114, 22);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Anzahl Personen");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(51, 517, 114, 22);
		contentPane.add(lblNewLabel_1_1);
	}
	// bisschen Schöner
	public void erfasseGuiEingaben() {
		strecke = Double.parseDouble(tfStrecke.getText());
		anzahlPersonen = Integer.parseInt(tfAnzahlperson.getText());
		KostenproKM = 0.14;
		klasse1 = rbKlasse1.isSelected();
		klasse2 = rbKlasse2.isSelected();
		aufschlagSchlafw = cbAufSchlafwagen.isSelected();
		aufschlagRiP = cbAufReservierterPlatz.isSelected();
		rabatte = cbRabattFrühbucher.isSelected();
	}

	private void beenden() {
		System.exit(0);
	}

	private double berechnekosten() {
		erfasseGuiEingaben();
		
		DecimalFormat nk2 = new DecimalFormat("#.##");
		

		// double kostengesamt = 0, aufschlag, aufschlagSw, Rabatt;


		if (klasse1 == true) {
			kostenGesamt = strecke * anzahlPersonen * KostenproKM * 1;
		}
		else if (klasse2 ==true) {
			kostenGesamt = strecke * anzahlPersonen * KostenproKM * 0.9;
		}
		else {
			JOptionPane.showMessageDialog(null, "Bitte wählen sie eine Klasse aus");
		}

		// Checkboxes
		if (aufschlagSchlafw == true) {
			AufschlagSw = kostenGesamt * 0.15;
		}
		else {
			AufschlagSw = 0;
		}
		if (aufschlagRiP == true) {
			aufschlagRP = kostenGesamt * 0.08;
		}
		else {
			aufschlagRP = 0;
		}
		if (rabatte == true) { 
			rabattFB = kostenGesamt * 0.07;
		}
		else {
			rabattFB = 0;
		}
		kostenGesamt = kostenGesamt + AufschlagSw + aufschlagRP - rabattFB;



		tfKostenEingabe.setText(nk2.format(kostenGesamt));
		
		return kostenGesamt;
	}

	private void Test_erstellen() {
		DecimalFormat nk2 = new DecimalFormat("#.##");
		
		erfasseGuiEingaben();
		
		String streckestring = tfStrecke.getText();
		String personenstring = tfAnzahlperson.getText();
		
		if (klasse1 == true) {
			Gesamtkostenzsm = strecke * anzahlPersonen * KostenproKM;		
		}
		else if(klasse2==true) {
			Gesamtkostenzsm = strecke * anzahlPersonen * KostenproKM * 0.9;
		}
		String Gesamtkostenzsmstring = Double.toString(Gesamtkostenzsm);
		
		berechnekosten();
		
		
		
		Timestamp datum;
		datum = new Timestamp(System.currentTimeMillis());		// Systemuhrzeit abrufen

		SimpleDateFormat datumFormat;
		datumFormat = new SimpleDateFormat("dd.M.yyyy hh:mm");		// Datum-Zeit-format ändern

		String datumString = datumFormat.format(datum);		// 
		tazusammenfassung.setText("Datum: /Zeit:" + "\n");
		tazusammenfassung.append(datumString + "\n");
		tazusammenfassung.append("Strecke: " + streckestring + " km \n");
		tazusammenfassung.append("Anz. Pers: " + personenstring + "\n");
		tazusammenfassung.append("----------------------------" + "\n");
		
		
		
		if (rbKlasse1.isSelected()==true) {
			tazusammenfassung.append("1.Klasse: " + Gesamtkostenzsmstring + "\n");
		}
		else if(rbKlasse2.isSelected() == true) {
			tazusammenfassung.append("2.Klasse: " + Gesamtkostenzsmstring + "\n");
		}
		

		
		String kostenGesamtstring = nk2.format(kostenGesamt - Gesamtkostenzsm);
		tazusammenfassung.append("+ Res. Pl : " + kostenGesamtstring + "\n");
		
		
		tazusammenfassung.append("----------------------------" + "\n");
		tazusammenfassung.append("Gesamtkosten: " + nk2.format(kostenGesamt));

	}
	
	private void Text_loeschen(){
		tazusammenfassung.setText(null);
		tfKostenEingabe.setText(null);
		tfAnzahlperson.setText(null);
		tfStrecke.setText(null);
		cbAufReservierterPlatz.setSelected(false);
		cbAufSchlafwagen.setSelected(false);
		cbRabattFrühbucher.setSelected(false);
		gruppeRadioButton.clearSelection();
		
	}
	public void save() 
	{
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showSaveDialog(getParent());

		if (returnVal == JFileChooser.APPROVE_OPTION)
		{
			File file = fc.getSelectedFile();
			saveText(file);
		}
	}

public void saveText(File file) 
        {
		try {
			FileWriter writer = new FileWriter(file);
			String text = this.tazusammenfassung.getText( );
			writer.write(text);
			writer.flush();
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace( );
		}
	}
public void load()
	{
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(getParent());

		if (returnVal == JFileChooser.APPROVE_OPTION)
		{
			File file = fc.getSelectedFile();
			showText(file);
		}

	}

public void showText(File file)
	{
		StringBuffer buf = new StringBuffer();
		if (file.exists())
		{
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = "";
				while ((line = reader.readLine()) != null){
					buf.append(line+"\n");
				}
				reader.close();

			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		this.tazusammenfassung.setText(buf.toString());
}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

