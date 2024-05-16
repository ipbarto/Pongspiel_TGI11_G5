package packageSW22;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class Cardealership extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfKilometer;
	private ButtonGroup radButtonGroup;
	private JRadioButton rbMercedes;
	private JRadioButton rbPorsche;
	private JRadioButton rbAudi;
	private JCheckBox cbSitzheizung;
	private JCheckBox cbFreundschaft;
	private String name;
	private boolean audi;
	private boolean porsche;
	private boolean mercedes;
	private double kilometer;
	private JTextArea taZusammenfassung;
	private boolean freund;
	private boolean sitzheizunhg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cardealership frame = new Cardealership();
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
	public Cardealership() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 486);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);
		
		JMenuItem mnuDateiBeenden = new JMenuItem("Beenden");
		mnuDateiBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beenden();
			}
		});
		mnDatei.add(mnuDateiBeenden);
		
		JSeparator separator = new JSeparator();
		mnDatei.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnDatei.add(mntmNewMenuItem_1);
		
		JMenu mnBearbeiten = new JMenu("Bearbeiten");
		menuBar.add(mnBearbeiten);
		
		JMenuItem mnuBearbeitenListLoeschen = new JMenuItem("löschen");
		mnuBearbeitenListLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loeschen();
			}
		});
		mnBearbeiten.add(mnuBearbeitenListLoeschen);
		
		JMenuItem mnuBearbeitenListerstellen = new JMenuItem("erstellen");
		mnuBearbeitenListerstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				erstellen();
			}
		});
		mnBearbeiten.add(mnuBearbeitenListerstellen);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Auto marke", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 51, 151, 134);
		contentPane.add(panel);
		panel.setLayout(null);
		
		rbMercedes = new JRadioButton("Mercedes");
		rbMercedes.setBounds(6, 22, 109, 23);
		panel.add(rbMercedes);
		
		rbPorsche = new JRadioButton("Porsche");
		rbPorsche.setBounds(6, 48, 109, 23);
		panel.add(rbPorsche);
		
		rbAudi = new JRadioButton("Audi");
		rbAudi.setBounds(6, 74, 109, 23);
		panel.add(rbAudi);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Zusatz", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 244, 151, 134);
		contentPane.add(panel_1);
		
		cbSitzheizung = new JCheckBox("Sitzheizung +5%");
		cbSitzheizung.setBounds(6, 22, 139, 23);
		panel_1.add(cbSitzheizung);
		
		cbFreundschaft = new JCheckBox("Freundschaft -5%");
		cbFreundschaft.setBounds(6, 63, 139, 23);
		panel_1.add(cbFreundschaft);
		
		taZusammenfassung = new JTextArea();
		taZusammenfassung.setBounds(525, 115, 259, 299);
		contentPane.add(taZusammenfassung);
		
		tfName = new JTextField();
		tfName.setBounds(525, 48, 259, 20);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfKilometer = new JTextField();
		tfKilometer.setBounds(20, 394, 211, 20);
		contentPane.add(tfKilometer);
		tfKilometer.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(525, 23, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("km");
		lblNewLabel_1.setBounds(171, 364, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		radButtonGroup = new ButtonGroup();
		radButtonGroup.add(rbAudi);
		radButtonGroup.add(rbMercedes);
		radButtonGroup.add(rbPorsche);
		
		
	}
	
	
	
	
	
	public void Variablen() {
		name = tfName.getText();
		audi = rbAudi.isSelected();
		mercedes = rbMercedes.isSelected();
		porsche = rbPorsche.isSelected();
		
		sitzheizunhg = cbSitzheizung.isSelected();
		freund = cbFreundschaft.isSelected();
		
		kilometer = Double.parseDouble(tfKilometer.getText());

	}
	
	private void beenden(){
		System.exit(0);
	}
	
	
	private void loeschen() {
		tfKilometer.setText(null);
		tfName.setText(null);
		cbFreundschaft.setSelected(false);
		cbSitzheizung.setSelected(false);
		radButtonGroup.clearSelection();
		taZusammenfassung.setText(null);
	}
	
	private double kostenrechner() {
		Variablen();
		double Preis = 0;
		double sitzheizunhgzuschlag = 0;
		double Freundschaftzuschlag = 0;
		
	
			
		if(porsche == true) {
			Preis = 2 * kilometer;
		}
		else if(audi==true) {
			Preis = 1*kilometer;
		}
		else if(mercedes==true) {
			Preis = 0.5*kilometer;
		}

		if(sitzheizunhg) {
			sitzheizunhgzuschlag = Preis * 0.05;
		}

		if(freund) {
			Freundschaftzuschlag = Preis * 0.05;
		}
		
		Preis = Preis - Freundschaftzuschlag + sitzheizunhgzuschlag;
		
		
		
		return Preis;
	}
	
	private void erstellen() {
		Variablen();
		
		String test = tfName.getText();
		
		DecimalFormat nk2 = new DecimalFormat("#.##");	
		
		Timestamp datum;
		datum = new Timestamp(System.currentTimeMillis());
		
		SimpleDateFormat datumformat;
		datumformat = new SimpleDateFormat("dd.M.yyyy hh:mm");
		
		String datumstring = datumformat.format(datum);
		
		if((porsche || audi || mercedes)) {
			taZusammenfassung.setText("name: " + name + "\n");
			taZusammenfassung.append("kosten: " + nk2.format(kostenrechner()) + "\n");
			taZusammenfassung.append(datumstring);
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Kein Radio Button ausgewählt");
		}
		

		
	}
	
}
