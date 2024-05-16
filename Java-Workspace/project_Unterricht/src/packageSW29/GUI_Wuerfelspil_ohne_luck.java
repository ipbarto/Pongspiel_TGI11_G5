package packageSW29;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Wuerfelspil_ohne_luck extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnCom;
	private JRadioButton rdbtnSP2;
	private ButtonGroup gruppeRadioButton;
	Wuerfel [] objWuerfel = new Wuerfel[6];
	Spielbrett [] objSpielbrett = new Spielbrett[6];
	private JButton btnSP1wurf1;
	private JButton btnSP1wurf2;
	private JButton btnSP1wurf3;
	private JButton btnSP2wurf1;
	private JButton btnSP2wurf2;
	private JButton btnSP2wurf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Wuerfelspil_ohne_luck frame = new GUI_Wuerfelspil_ohne_luck();
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
	public GUI_Wuerfelspil_ohne_luck() {
		setTitle("Wuerfelspiel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSP1A0 = new JButton("");
		btnSP1A0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSP1A0.setBounds(36, 255, 95, 64);
		contentPane.add(btnSP1A0);
		
		JLabel lblSP1 = new JLabel("Spieler 1");
		lblSP1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSP1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSP1.setBounds(136, 43, 83, 44);
		contentPane.add(lblSP1);
		
		JLabel lblSpieler = new JLabel("Spieler 2");
		lblSpieler.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpieler.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSpieler.setBounds(628, 43, 83, 44);
		contentPane.add(lblSpieler);
		
		JPanel panel = new JPanel();
		panel.setBounds(617, 81, 123, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		rdbtnCom = new JRadioButton("Computer");
		rdbtnCom.setSelected(true);
		rdbtnCom.setBounds(6, 7, 109, 23);
		panel.add(rdbtnCom);
		
		rdbtnSP2 = new JRadioButton("Player");
		rdbtnSP2.setBounds(6, 33, 109, 23);
		panel.add(rdbtnSP2);
		
		JButton btnSP1A1 = new JButton("");
		btnSP1A1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSP1A1.setBounds(136, 255, 95, 64);
		contentPane.add(btnSP1A1);
		
		JButton btnSP1A2 = new JButton("");
		btnSP1A2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSP1A2.setBounds(236, 255, 95, 64);
		contentPane.add(btnSP1A2);
		
		JButton btnSP2A0 = new JButton("");
		btnSP2A0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSP2A0.setBounds(499, 255, 95, 64);
		contentPane.add(btnSP2A0);
		
		JButton btnSP2A1 = new JButton("");
		btnSP2A1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSP2A1.setBounds(602, 255, 95, 64);
		contentPane.add(btnSP2A1);
		
		JButton btnSP2A2 = new JButton("");
		btnSP2A2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSP2A2.setBounds(707, 255, 95, 64);
		contentPane.add(btnSP2A2);
		
		JButton btnwuerfeln = new JButton("Würfeln");
		btnwuerfeln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wuerfeln();
			}
		});
		btnwuerfeln.setBounds(378, 398, 89, 23);
		contentPane.add(btnwuerfeln);
		
		btnSP1wurf1 = new JButton("");
		btnSP1wurf1.setBounds(46, 177, 75, 64);
		contentPane.add(btnSP1wurf1);
		
		btnSP1wurf2 = new JButton("");
		btnSP1wurf2.setBounds(144, 177, 75, 64);
		contentPane.add(btnSP1wurf2);
		
		btnSP1wurf3 = new JButton("");
		btnSP1wurf3.setBounds(244, 176, 75, 64);
		contentPane.add(btnSP1wurf3);
		
		btnSP2wurf1 = new JButton("");
		btnSP2wurf1.setBounds(510, 177, 75, 64);
		contentPane.add(btnSP2wurf1);
		
		btnSP2wurf2 = new JButton("");
		btnSP2wurf2.setBounds(608, 177, 75, 64);
		contentPane.add(btnSP2wurf2);
		
		btnSP2wurf3 = new JButton("");
		btnSP2wurf3.setBounds(708, 176, 75, 64);
		contentPane.add(btnSP2wurf3);
		
		for(int i = 0;i<6;i++) {
			objWuerfel[i] = new Wuerfel();
		}
		
		for(int i = 0;i<6;i++) {
			objSpielbrett[i] = new Spielbrett();
		}
		
		gruppeRadioButton = new ButtonGroup();
		gruppeRadioButton.add(rdbtnCom);
		gruppeRadioButton.add(rdbtnSP2);
	
	}
	
	void wuerfeln() {
		
		for (int i = 0; i < 6; i++) {
			objWuerfel[i].setWuerfel(objWuerfel[i].zufallswurf()); 
		}
		
		btnSP1wurf1.setText(objWuerfel[0].getaugen().toString());
	}
}
