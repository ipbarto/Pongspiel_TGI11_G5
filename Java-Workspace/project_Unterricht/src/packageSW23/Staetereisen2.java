package packageSW23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.lang.model.element.NestingKind;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Staetereisen2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfStrecke;
	private JTextField tfanzahlpersonen;
	private ButtonGroup radiobutten;
	private double strecke;
	private int anzahlpersonen;
	private boolean ersteklasse;
	private boolean zweiteklasse;
	private boolean rabatt;
	private boolean aufschlagschlafwagen;
	private boolean aufschlagReserv;
	private JRadioButton rbersteKlasse;
	private JRadioButton rbzweiteKlasse;
	private JCheckBox cbaufschlagschlafwagen;
	private JCheckBox cbaufschlagReservierterPlatz;
	private JCheckBox cbRabattFruebucher;
	private JTextField tfKosten;
	private JTextArea tazusammenstellung;
	private double kostenproKM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staetereisen2 frame = new Staetereisen2();
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
	public Staetereisen2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 481);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDatei = new JMenu("Datei");
		mnDatei.setMnemonic('d');
		menuBar.add(mnDatei);
		
		JMenuItem mnuDateiBeenden = new JMenuItem("Beenden");
		mnuDateiBeenden.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_DOWN_MASK));
		mnuDateiBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beenden();
			}
		});
		mnDatei.add(mnuDateiBeenden);
		
		JSeparator separator = new JSeparator();
		mnDatei.add(separator);
		
		JMenuItem mnuDateiTexterstellen = new JMenuItem("Text erstellen");
		mnuDateiTexterstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zusammenfassung();
			}
		});
		mnDatei.add(mnuDateiTexterstellen);
		
		JMenuItem mnuDatailoeschen = new JMenuItem("Löschen");
		mnuDatailoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loeschen();
			}
		});
		mnDatei.add(mnuDatailoeschen);
		
		JMenu mnBearbeiten = new JMenu("Bearbeiten");
		menuBar.add(mnBearbeiten);
		
		JMenuItem mnuBearbeitenkostenberechnen = new JMenuItem("kostenberechnen");
		mnuBearbeitenkostenberechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showkosten();
			}
		});
		mnBearbeiten.add(mnuBearbeitenkostenberechnen);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TG Städtereisen kalkulieren");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(196, 11, 276, 21);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Transportmittel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 61, 173, 99);
		contentPane.add(panel);
		panel.setLayout(null);
		
		rbersteKlasse = new JRadioButton("1. Klasse (100%)");
		rbersteKlasse.setBounds(6, 26, 109, 23);
		panel.add(rbersteKlasse);
		
		rbzweiteKlasse = new JRadioButton("2. Klasse (90%)");
		rbzweiteKlasse.setBounds(6, 52, 109, 23);
		panel.add(rbzweiteKlasse);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Optionen und Rabatte", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 174, 328, 119);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		cbaufschlagschlafwagen = new JCheckBox("aufschlag Schlafwagen (+15%)");
		cbaufschlagschlafwagen.setBounds(6, 23, 316, 23);
		panel_1.add(cbaufschlagschlafwagen);
		
		cbaufschlagReservierterPlatz = new JCheckBox("aufschlag Reservierter Platz (+8%)");
		cbaufschlagReservierterPlatz.setBounds(6, 49, 316, 23);
		panel_1.add(cbaufschlagReservierterPlatz);
		
		cbRabattFruebucher = new JCheckBox("Rabatt Frühbucher (-7%)");
		cbRabattFruebucher.setBounds(6, 75, 316, 23);
		panel_1.add(cbRabattFruebucher);
		
		tfKosten = new JTextField();
		tfKosten.setBounds(436, 83, 173, 20);
		contentPane.add(tfKosten);
		tfKosten.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Strecke [km]");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 317, 83, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Anzahl Personen");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 378, 112, 21);
		contentPane.add(lblNewLabel_1_1);
		
		tfStrecke = new JTextField();
		tfStrecke.setColumns(10);
		tfStrecke.setBounds(123, 319, 173, 20);
		contentPane.add(tfStrecke);
		
		tfanzahlpersonen = new JTextField();
		tfanzahlpersonen.setColumns(10);
		tfanzahlpersonen.setBounds(123, 380, 173, 20);
		contentPane.add(tfanzahlpersonen);
		
		tazusammenstellung = new JTextArea();
		tazusammenstellung.setBounds(436, 169, 204, 262);
		contentPane.add(tazusammenstellung);
		
		radiobutten = new ButtonGroup();
		radiobutten.add(rbersteKlasse);
		radiobutten.add(rbzweiteKlasse);
	}
	private void beenden() {
		System.exit(0);
	}
	public void guiVariablen() {
		strecke = Double.parseDouble(tfStrecke.getText());
		anzahlpersonen = Integer.parseInt(tfanzahlpersonen.getText());
		//Radiobutton
		ersteklasse = rbersteKlasse.isSelected();
		zweiteklasse = rbzweiteKlasse.isSelected();
	 
		aufschlagschlafwagen = cbaufschlagschlafwagen.isSelected();
		aufschlagReserv = cbaufschlagReservierterPlatz.isSelected();
		rabatt = cbRabattFruebucher.isSelected();
		
		kostenproKM = 0.14;
	}
	private void loeschen() {
		tfanzahlpersonen.setText(null);
		tfKosten.setText(null);
		tfStrecke.setText(null);
		tazusammenstellung.setText(null);
		radiobutten.clearSelection();
		cbaufschlagReservierterPlatz.setSelected(false);
		cbaufschlagschlafwagen.setSelected(false);
		cbRabattFruebucher.setSelected(false);
	}
	private double kostenberechnen() {
		double kosten = 0;
		guiVariablen();
		
		double aufschalgSW = 0;
		double aufschalgRP = 0;
		double rabatteminus = 0;
		
		if(ersteklasse) {
			kosten = strecke * anzahlpersonen * kostenproKM;
		}
		else if(zweiteklasse) {
			kosten = strecke * anzahlpersonen * kostenproKM * 0.9;
		}
		else {
			JOptionPane.showMessageDialog(null, "keine Klasse ausgewählt");
		}
		
		if(aufschlagschlafwagen) {
			aufschalgSW = kosten * 0.15;
		}
		if(aufschlagReserv) {
			aufschalgRP = kosten * 0.08;
		}
		if(rabatt){
			rabatteminus = kosten * 0.07;
		}
		
		kosten = kosten + aufschalgRP + aufschalgSW - rabatteminus;
		return kosten;
	}
	
	private void showkosten() {
		
		DecimalFormat nk2 = new DecimalFormat("#.##");
		
		String anzahlpersonenString = tfanzahlpersonen.getText();
		String strecke = tfStrecke.getText();
		
		boolean streckeempty = strecke.isEmpty();
		boolean anzalpersonenempty = anzahlpersonenString.isEmpty();
		
		if(ersteklasse || zweiteklasse || streckeempty==false || anzalpersonenempty==false) {
			tfKosten.setText(nk2.format(kostenberechnen()));
		}
		else {
			JOptionPane.showMessageDialog(null, "Keine Klasse/strecke/Anzahl der Personen gefählt");
		}
		
	}
	
	private void zusammenfassung() {
		guiVariablen();
		double kosten = 0;
		
		DecimalFormat nk2 = new DecimalFormat("#.##");
		
		
		Timestamp datum = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.M.yyyy hh:mm");
		
		String dataString = dateFormat.format(datum);
		
		tazusammenstellung.setText("Datum:/Zeit:" + "\n");
		tazusammenstellung.append(dataString + "\n");
		tazusammenstellung.append("Strecke: " + strecke + "\n");
		tazusammenstellung.append("Anz. pers: " + anzahlpersonen + "\n");
		tazusammenstellung.append("--------------------------------" + "\n");
		
		if(ersteklasse) {
			kosten = strecke * anzahlpersonen * kostenproKM;
			tazusammenstellung.append("1.Klasse: " + nk2.format(kosten) + "\n");
		}
		else if(zweiteklasse) {
			kosten = strecke * anzahlpersonen * kostenproKM * 0.9;
			tazusammenstellung.append("2.Klasse: " + nk2.format(kosten) + "\n");
		}
		
		tazusammenstellung.append("+ Res PL. :" + nk2.format((kostenberechnen()-kosten)) + "\n");
		
		tazusammenstellung.append("--------------------------------" + "\n");
		
		tazusammenstellung.append("Ges kosten : " + nk2.format(kostenberechnen()));
		
	}
	
}
