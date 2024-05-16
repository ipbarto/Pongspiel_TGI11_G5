package packageSW20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
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
import java.awt.Color;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;

import packageSW12.while_quader;

import javax.swing.JCheckBox;


public class GUI_Buecherliste extends JFrame {

	private JPanel contentPane;
	private JTextField tfEinagebName;
	private JTextArea taBucherListe;
	private JRadioButton rbTG11;
	private JRadioButton rbTG12;
	private JRadioButton rbTG13;
	private JCheckBox cbdeutschbuch;
	private JCheckBox cbenglischbuch;
	private JCheckBox cbmathebuch;
	private JCheckBox cbphysikbuch;
	private JCheckBox cbChemiebuch;
	private ButtonGroup gruppeRadionButten;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Buecherliste frame = new GUI_Buecherliste();
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
	public GUI_Buecherliste() {
		setTitle("Bücherliste erstellen       Lenny Bartossek");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 485);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 108, 22);
		contentPane.add(menuBar);

		JMenu mnDatei = new JMenu("Datei");
		mnDatei.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnDatei);

		JMenuItem mmiDateiSpeichern = new JMenuItem("Speichern");
		mmiDateiSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		mnDatei.add(mmiDateiSpeichern);

		JMenuItem mmiDateiOeffnen = new JMenuItem("Öffnen");
		mmiDateiOeffnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				load();
			}
		});
		mnDatei.add(mmiDateiOeffnen);

		JSeparator separator = new JSeparator();
		mnDatei.add(separator);

		JMenuItem mmiDateiProgrammende = new JMenuItem("Programmende");
		mmiDateiProgrammende.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beenden();
			}
		});
		mnDatei.add(mmiDateiProgrammende);

		JMenu mnBearbeiten = new JMenu("Bearbeiten");
		mnBearbeiten.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnBearbeiten);

		JMenuItem mmiBearbeitenLoeschen = new JMenuItem("Liste Löschen");
		mmiBearbeitenLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list_loeschen();
			}
		});
		mnBearbeiten.add(mmiBearbeitenLoeschen);

		JMenuItem mmiBearbeitenerstellen = new JMenuItem("Liste erstellen");
		mmiBearbeitenerstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list_erstellen();
			}
		});
		mnBearbeiten.add(mmiBearbeitenerstellen);

		taBucherListe = new JTextArea();
		taBucherListe.setBackground(Color.WHITE);
		taBucherListe.setBounds(368, 154, 268, 281);
		contentPane.add(taBucherListe);

		JLabel lblBuecherliste = new JLabel("Bücherliste für Schüler / Schülerinnen");
		lblBuecherliste.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBuecherliste.setBounds(10, 33, 273, 36);
		contentPane.add(lblBuecherliste);

		tfEinagebName = new JTextField();
		tfEinagebName.setBounds(368, 43, 268, 20);
		contentPane.add(tfEinagebName);
		tfEinagebName.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Klasse/Kurs", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(22, 125, 150, 104);
		contentPane.add(panel);
		panel.setLayout(null);

		gruppeRadionButten = new ButtonGroup();

		rbTG11 = new JRadioButton("TG11");
		rbTG11.setBounds(6, 24, 109, 23);
		panel.add(rbTG11);
		gruppeRadionButten.add(rbTG11);

		rbTG12 = new JRadioButton("TG12");
		rbTG12.setBounds(6, 50, 109, 23);
		panel.add(rbTG12);
		gruppeRadionButten.add(rbTG12);

		rbTG13 = new JRadioButton("TG13");
		rbTG13.setBounds(6, 76, 109, 23);
		panel.add(rbTG13);
		gruppeRadionButten.add(rbTG13);




		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Buchauswahl", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 240, 152, 153);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		cbdeutschbuch = new JCheckBox("Deutschbuch");
		cbdeutschbuch.setBounds(6, 17, 97, 23);
		panel_1.add(cbdeutschbuch);

		cbenglischbuch = new JCheckBox("Englischbuch");
		cbenglischbuch.setBounds(6, 43, 97, 23);
		panel_1.add(cbenglischbuch);

		cbmathebuch = new JCheckBox("Mathebuch");
		cbmathebuch.setBounds(6, 69, 97, 23);
		panel_1.add(cbmathebuch);

		cbphysikbuch = new JCheckBox("Physikbuch");
		cbphysikbuch.setBounds(6, 95, 97, 23);
		panel_1.add(cbphysikbuch);

		cbChemiebuch = new JCheckBox("Chemiebuch");
		cbChemiebuch.setBounds(6, 121, 97, 23);
		panel_1.add(cbChemiebuch);

		JLabel lblNewLabel = new JLabel("==>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(237, 191, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("==>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(237, 306, 46, 14);
		contentPane.add(lblNewLabel_1);

	}		//Ende der Gui erstellung
	// Eigene Funktionen


	private void beenden() {
		System.exit(0);
	}
	
	public void saveText(File file) 
    {
	// TODO Auto-generated method stub
	try {
		FileWriter writer = new FileWriter(file);
		String text = this.taBucherListe.getText( );
		writer.write(text);
		writer.flush();
		writer.close();
	}
	catch (IOException e)
	{
		e.printStackTrace( );
	}
}

	private void save() {
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showSaveDialog(getParent());

		if (returnVal == JFileChooser.APPROVE_OPTION)
		{
			File file = fc.getSelectedFile();
			saveText(file);
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
		this.taBucherListe.setText(buf.toString());
}

	private void load() {
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(getParent());

		if (returnVal == JFileChooser.APPROVE_OPTION)
		{
			File file = fc.getSelectedFile();
			showText(file);
		}

	}

	private void list_loeschen() {
		// textfelder löschen
		taBucherListe.setText(null);
		tfEinagebName.setText(null);
		// Radio buttons löschen
		gruppeRadionButten.clearSelection();		
		// checkboxes löschen
		cbdeutschbuch.setSelected(false);
		cbenglischbuch.setSelected(false);
		cbmathebuch.setSelected(false);
		cbphysikbuch.setSelected(false);
		cbChemiebuch.setSelected(false);
	}

	private void list_erstellen() {
		String name;
		boolean check = false;
		name = tfEinagebName.getText();
		
		
		
		
		DecimalFormat nk3;
		//Klasse		//Objekt
		
		nk3			 	= new DecimalFormat("#.###");
		//Objekt	// 	= new	//Konstruktor	: Konstruktor ist eine Besondere Methode

		

		
		Timestamp datum;
		datum = new Timestamp(System.currentTimeMillis());		// Systemuhrzeit abrufen
		
		SimpleDateFormat datumFormat;
		datumFormat = new SimpleDateFormat("dd.M.yyyy hh:mm");		// Datum-Zeit-format ändern
		
		String datumString = datumFormat.format(datum);		// 
		
		
		taBucherListe.setText("Heute ist " + datumString + "\n");	
		taBucherListe.append("Bücherliste von " + name + "\n" + "\n");

		//	Radio buttons auswerten
		if(rbTG11.isSelected() == true) {
			taBucherListe.append("Klasse: TG11" + "\n");
		}
		else if(rbTG12.isSelected() == true) {
			taBucherListe.append("Klasse: TG12" + "\n");
		}
		else if(rbTG13.isSelected() == true) {
			taBucherListe.append("Klasse: TG13" + "\n");
		}
		else {
			JOptionPane.showMessageDialog(null, "Bitte Klasse vor dem Erstellen wählen");
		}

		if(check == false) {
			//	checkboxes auswerten
			if(cbdeutschbuch.isSelected()==true) {
				taBucherListe.append("	- Deutsch buch" + "\n");
				check = true;
			}
			if(cbenglischbuch.isSelected()==true) {
				taBucherListe.append("	- Englisch buch" + "\n");
				check = true;
			}
			if(cbmathebuch.isSelected()==true) {
				taBucherListe.append("	- Mathe buch" + "\n");
				check = true;
			}
			if(cbphysikbuch.isSelected()==true) {
				taBucherListe.append("	- Physik buch" + "\n");
				check = true;
			}
			if(cbChemiebuch.isSelected()==true) {
				taBucherListe.append("	- Chemie buch" + "\n");
				check = true;
			}
		}
		if (check == false) {
			JOptionPane.showMessageDialog(null, "keine Bücher ausgewählt");
		}
	}
}		// Ende der Klasse
