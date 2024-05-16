package package_KA2_Satellit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import java.awt.Panel;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;

// public class Gui_Satellitenantenne extends JFrame implements KeyListener{
public class Gui_Satellitenantenne extends JFrame {

	private JPanel contentPane;
	private JTextField tf_kosten;
	private JRadioButton rb_60cm;

	private JMenuBar menuBar;
	private JTextField tfKabellaenge;
	private ButtonGroup radiobuttondruchmesser;
	private ButtonGroup radiobuttonfarbe;
	private JRadioButton rb_80cm;
	private JRadioButton rb_100cm;
	private JRadioButton rb_ziegelrot;
	private JRadioButton rb_Anthrazit;
	private JRadioButton rb_hellgrau;
	private JCheckBox cb_Receiver;
	private JCheckBox cb_Befestigungfuerwand;
	private JCheckBox cb_befestigungfuerdach;
	private JCheckBox cb_lnb;
	private JCheckBox cb_kabel;
	private JTextArea tazusammenstellung;
	private boolean cm60;
	private boolean cm80;
	private boolean cm100;
	private boolean ziegelrot;
	private boolean antharzit;
	private boolean hellgrau;
	private boolean receiver;
	private boolean befestigungdach;
	private boolean befestigungwand;
	private boolean lnb;
	private boolean kabel;
	private double kabellaenge;
	private JMenuItem mnuBearbeitenangebotmitText;
	private JMenuItem mnuBearbeitenAngebotloeschen;
	private JSeparator separator_1;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Satellitenantenne frame = new Gui_Satellitenantenne();
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
	public Gui_Satellitenantenne() {
		setTitle("TG12-electronics: Lenny");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 635);

		menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);

		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);

		JMenuItem mnuProgrammende = new JMenuItem("Programmende");
		mnuProgrammende.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickProgrammende();
			}
		});
		mnDatei.add(mnuProgrammende);

		JMenu mnBearbeiten = new JMenu("Bearbeiten");
		mnBearbeiten.setMnemonic('B');
		menuBar.add(mnBearbeiten);

		JMenuItem mnukostenberechnen = new JMenuItem("Kosten berechnen");
		mnukostenberechnen.setMnemonic('k');
		mnukostenberechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				einagbeinkosten();
			}
		});
		mnBearbeiten.add(mnukostenberechnen);

		separator_1 = new JSeparator();
		mnBearbeiten.add(separator_1);

		mnuBearbeitenangebotmitText = new JMenuItem("Angebot mit Text");
		mnuBearbeitenangebotmitText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickAngebotmitText();
			}
		});
		mnBearbeiten.add(mnuBearbeitenangebotmitText);

		mnuBearbeitenAngebotloeschen = new JMenuItem("Angebot löschen");
		mnuBearbeitenAngebotloeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickAngebotLoeschen();
			}
		});
		mnBearbeiten.add(mnuBearbeitenAngebotloeschen);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("<HTML><u>Satellitenantenne  zusammenstellen</u></HTML>");
		lblNewLabel.setBounds(113, 11, 331, 25);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(302, 47, 197, 49);
		panel_4.setBorder(new TitledBorder(null, "Kosten", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		tf_kosten = new JTextField();
		tf_kosten.setEditable(false);
		tf_kosten.setBounds(10, 18, 86, 20);
		panel_4.add(tf_kosten);
		tf_kosten.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Euro");
		lblNewLabel_2.setBounds(106, 24, 46, 14);
		panel_4.add(lblNewLabel_2);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Bitte den Durchmesser angeben ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(41, 47, 244, 102);
		contentPane.add(panel);
		panel.setLayout(null);

		rb_60cm = new JRadioButton("60cm");
		rb_60cm.setSelected(true);
		rb_60cm.setBounds(6, 21, 109, 23);
		panel.add(rb_60cm);

		rb_80cm = new JRadioButton("80cm");
		rb_80cm.setBounds(6, 48, 109, 23);
		panel.add(rb_80cm);

		rb_100cm = new JRadioButton("100cm");
		rb_100cm.setBounds(6, 74, 109, 23);
		panel.add(rb_100cm);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Farbe w\u00E4hlen", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(41, 160, 244, 102);
		contentPane.add(panel_1);

		rb_ziegelrot = new JRadioButton("Ziegelrot");
		rb_ziegelrot.setSelected(true);
		rb_ziegelrot.setBounds(6, 21, 109, 23);
		panel_1.add(rb_ziegelrot);

		rb_Anthrazit = new JRadioButton("Anthrazit");
		rb_Anthrazit.setBounds(6, 48, 109, 23);
		panel_1.add(rb_Anthrazit);

		rb_hellgrau = new JRadioButton("Hellgrau");
		rb_hellgrau.setBounds(6, 74, 109, 23);
		panel_1.add(rb_hellgrau);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Optionale Erweiterung", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 273, 275, 156);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		cb_Receiver = new JCheckBox("Receiver");
		cb_Receiver.setBounds(6, 19, 97, 23);
		panel_2.add(cb_Receiver);

		cb_Befestigungfuerwand = new JCheckBox("Befestigung für Außenwand");
		cb_Befestigungfuerwand.setBounds(6, 45, 232, 23);
		panel_2.add(cb_Befestigungfuerwand);

		cb_befestigungfuerdach = new JCheckBox("Befestigung für Dach");
		cb_befestigungfuerdach.setBounds(6, 71, 232, 23);
		panel_2.add(cb_befestigungfuerdach);

		cb_lnb = new JCheckBox("LNB");
		cb_lnb.setBounds(6, 97, 97, 23);
		panel_2.add(cb_lnb);

		cb_kabel = new JCheckBox("Kabel");
		cb_kabel.setBounds(6, 123, 71, 23);
		panel_2.add(cb_kabel);

		tfKabellaenge = new JTextField();
		tfKabellaenge.setBounds(179, 124, 86, 20);
		panel_2.add(tfKabellaenge);
		tfKabellaenge.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Kabellänge [m]");
		lblNewLabel_1.setBounds(83, 127, 86, 19);
		panel_2.add(lblNewLabel_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Angebot mit Satellitenanlage", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(302, 107, 265, 466);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		tazusammenstellung = new JTextArea();
		tazusammenstellung.setEditable(false);
		tazusammenstellung.setBounds(10, 22, 245, 258);
		panel_3.add(tazusammenstellung);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(56, 291, 150, 164);
		panel_3.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(Gui_Satellitenantenne.class.getResource("/packageKA2_A2_Satellitenantenne_za/Satellitenantenne 150x150.jpg")));

		radiobuttondruchmesser = new ButtonGroup();
		radiobuttondruchmesser.add(rb_60cm);
		radiobuttondruchmesser.add(rb_80cm);
		radiobuttondruchmesser.add(rb_100cm);

		radiobuttonfarbe = new ButtonGroup();
		radiobuttonfarbe.add(rb_ziegelrot);
		radiobuttonfarbe.add(rb_Anthrazit);
		radiobuttonfarbe.add(rb_hellgrau);



	}  // Ende der Gui-Erstellung

	private void clickProgrammende() {
		System.exit(0);
	}

	public void guivariablen() {
		cm60 = rb_60cm.isSelected();
		cm80 = rb_80cm.isSelected();
		cm100 = rb_100cm.isSelected();

		ziegelrot = rb_ziegelrot.isSelected();
		antharzit = rb_Anthrazit.isSelected();
		hellgrau = rb_hellgrau.isSelected();

		receiver = cb_Receiver.isSelected();
		befestigungwand = cb_Befestigungfuerwand.isSelected();
		befestigungdach = cb_befestigungfuerdach.isSelected();
		lnb = cb_lnb.isSelected();
		kabel = cb_kabel.isSelected();

		kabellaenge = Double.parseDouble(tfKabellaenge.getText());
	}
	private void clickAngebotLoeschen() {
		radiobuttondruchmesser.clearSelection();
		radiobuttonfarbe.clearSelection();
		cb_kabel.setSelected(false);
		cb_befestigungfuerdach.setSelected(false);
		cb_Befestigungfuerwand.setSelected(false);
		cb_lnb.setSelected(false);
		cb_Receiver.setSelected(false);

		tfKabellaenge.setText(null);
		tf_kosten.setText(null);
		tazusammenstellung.setText(null);

	}

	private double clickberechnekosten() {

		guivariablen();
		double kosten = 0;
		int satcm = 0;
		double cbkosten = 0;

		if(cm60) {
			satcm = 39;
		}
		else if (cm80) {
			satcm = 48;
		}
		else if (cm100) {
			satcm = 105;
		}

		// Checkbox
		if (receiver) {
			cbkosten = cbkosten + 71;
		}
		if (befestigungwand) {
			cbkosten = cbkosten +32;
		}
		if (befestigungdach) {
			cbkosten = cbkosten + 71;
		}
		if (lnb) {
			cbkosten = cbkosten + 14.6;
		}
		if (kabel) {
			cbkosten = cbkosten + (0.35 * kabellaenge);
		}
		else {
			cbkosten = cbkosten;
		}
		kosten = satcm + cbkosten;

		return kosten;
	}

	private void einagbeinkosten() {
		DecimalFormat nk2 = new DecimalFormat("0.00");

		tf_kosten.setText(nk2.format(clickberechnekosten()));



	}


	private void clickAngebotmitText() {
		guivariablen();

		double kabelerneut;
		DecimalFormat nk2 = new DecimalFormat("0.00");


		tazusammenstellung.setText("Angebot einer Satellitenantenne" + "\n");
		tazusammenstellung.append("------------------------------------" + "\n");
		tazusammenstellung.append("Grunddaten: " + "\n");

		if(cm60) {
			tazusammenstellung.append("Durchmesser: 60cm: 39 Euro"+ "\n");
		}
		else if(cm80) {
			tazusammenstellung.append("Durchmesser: 80cm: 48 Euro"+ "\n");
		}
		else if(cm100) {
			tazusammenstellung.append("Durchmesser: 100cm: 105 Euro"+ "\n");
		}

		tazusammenstellung.append("Farbe: ");

		if (ziegelrot) {
			tazusammenstellung.append("Ziegelrot"+ "\n");
		}
		else if (antharzit) {
			tazusammenstellung.append("Antharzit"+ "\n");
		}
		else if (hellgrau) {
			tazusammenstellung.append("Hellgrau"+ "\n");
		}

		tazusammenstellung.append("------------------------------------" + "\n");
		tazusammenstellung.append("Optionen: " + "\n");

		if (receiver) {
			tazusammenstellung.append("Receiver : 71,00 Euro" + "\n");
		}
		if(befestigungwand) {
			tazusammenstellung.append("Befestigung für Außenwand: 32,00 Euro" + "\n");
		}
		if (befestigungdach) {
			tazusammenstellung.append("Befestigung für Dach: 71,00 Euro" + "\n");
		}
		if(lnb) {
			tazusammenstellung.append("LNB: 14,60 Euro" + "\n");
		}
		if (kabel) {
			tazusammenstellung.append("Kabel: " + kabellaenge + "m : " + nk2.format(0.35 * kabellaenge) + "Euro" + "\n");
		}

		tazusammenstellung.append("------------------------------------" + "\n");

		tazusammenstellung.append("Gesamtkosten: " + nk2.format(clickberechnekosten()) + " Euro");

	}
}   // Ende vom gesamten Programm


