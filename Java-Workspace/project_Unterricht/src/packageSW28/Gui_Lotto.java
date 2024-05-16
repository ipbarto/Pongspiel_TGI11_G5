package packageSW28;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import packageSW27.Wuerfel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Gui_Lotto extends JFrame {

	private JPanel contentPane;
	private JTable tableZiehung;
	private JTable tableTipp;
	private JTextField tfrichtigeanzahl;
	private int[] tipp = new int [6];
	private int[] ziehung = new int[6] ; 
	private int[] richtige = new int[6];
	private Lottospiel objLottospiel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Lotto frame = new Gui_Lotto();
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
	public Gui_Lotto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Lottospiel");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(81, 29, 117, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Zufallszahlen aus der Ziehung");
		lblNewLabel_1.setBounds(10, 60, 177, 14);
		contentPane.add(lblNewLabel_1);

		tableZiehung = new JTable();
		tableZiehung.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column", "New column", "New column"
				}
				));
		tableZiehung.setBounds(208, 60, 216, 25);
		contentPane.add(tableZiehung);

		JButton btnZiehung = new JButton("Zufallszahlen ermitteln und eintragen");
		btnZiehung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickErzeugenZufallszahlen();
			}
		});
		btnZiehung.setBounds(10, 89, 414, 23);
		contentPane.add(btnZiehung);

		JLabel lblNewLabel_1_1 = new JLabel("Meine getippten Zahlen");
		lblNewLabel_1_1.setBounds(10, 149, 177, 14);
		contentPane.add(lblNewLabel_1_1);

		tableTipp = new JTable();
		tableTipp.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column", "New column", "New column"
				}
				));
		tableTipp.setBounds(208, 149, 216, 25);
		contentPane.add(tableTipp);

		JButton btnTippen = new JButton("Zufallszahlen ermitteln und eintragen");
		btnTippen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickTippspeichern();
			}
		});
		btnTippen.setBounds(10, 178, 414, 23);
		contentPane.add(btnTippen);

		JLabel lblNewLabel_2 = new JLabel("Auswertung");
		lblNewLabel_2.setBounds(10, 251, 104, 14);
		contentPane.add(lblNewLabel_2);

		JButton btnAuswertungStarten = new JButton("Auswertung starten");
		btnAuswertungStarten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ErmittleRichtige();
			}
		});
		btnAuswertungStarten.setBounds(10, 276, 414, 23);
		contentPane.add(btnAuswertungStarten);

		JLabel lblNewLabel_3 = new JLabel("Anzahl richtiger Tipps");
		lblNewLabel_3.setBounds(94, 251, 117, 14);
		contentPane.add(lblNewLabel_3);

		tfrichtigeanzahl = new JTextField();
		tfrichtigeanzahl.setBounds(217, 248, 57, 20);
		contentPane.add(tfrichtigeanzahl);
		tfrichtigeanzahl.setColumns(10);

		objLottospiel = new Lottospiel();

	}

	public void clickErzeugenZufallszahlen()
	{
		objLottospiel.startZufallszahl();
		objLottospiel.sortiereZufallszahl();
		for (int i = 0   ;  i<=5  ; i++)
		{
			ziehung[i] = objLottospiel.getZeihung(i);
			tableZiehung.setValueAt(ziehung[i], 0, i);

		}

	}

	public void clickTippspeichern()
	{
		for (int i = 0   ;  i<=5  ; i++)
		{

			tipp[i] = Integer.parseInt((String) tableTipp.getValueAt(0, i));
			if (tipp[i] >= 50)
			{
				JOptionPane.showMessageDialog(null, "Die eingetragene Zahl war zu groß: Bitte neu eingeben");
			}
			objLottospiel.setTipp(i, tipp[i]);


			System.out.println("Tipp = " + objLottospiel.getTipp(i));
		}

	}
	public void ErmittleRichtige() {
		int anzahlrichtige = objLottospiel.berechneAnzahlRichtige();
		objLottospiel.berechneDieRichtigenZahlen();
		for (int i = 0   ;  i<=5  ; i++)
		{
			richtige[i] = objLottospiel.getRichtige(i);
		}
		tfrichtigeanzahl.setText(Integer.toString(anzahlrichtige));
	}

}
