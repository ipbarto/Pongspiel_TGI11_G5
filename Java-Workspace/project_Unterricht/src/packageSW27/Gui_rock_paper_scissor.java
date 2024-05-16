package packageSW27;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_rock_paper_scissor extends JFrame {

	private JPanel contentPane;
	private JTextField tfBot;
	private JTextField tfPlayer;
	private Class_player objPlayer;
	private Class_Bot objBot;
	private JComboBox combPlayer;
	private Class_who_won objWho_won;
	private JTextField tfWinLose;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_rock_paper_scissor frame = new Gui_rock_paper_scissor();
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
	public Gui_rock_paper_scissor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnplay = new JButton("play");
		btnplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				play();
			}
		});
		btnplay.setBounds(10, 418, 89, 23);
		contentPane.add(btnplay);
		
		JButton btnSet = new JButton("set");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				set();
			}
		});
		btnSet.setBounds(327, 418, 89, 23);
		contentPane.add(btnSet);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		btnClose.setBounds(662, 418, 89, 23);
		contentPane.add(btnClose);
		
		combPlayer = new JComboBox();
		combPlayer.setModel(new DefaultComboBoxModel(new String[] {"Schere", "Stein", "Papier"}));
		combPlayer.setBounds(310, 243, 123, 119);
		contentPane.add(combPlayer);
		
		tfBot = new JTextField();
		tfBot.setEditable(false);
		tfBot.setBounds(59, 115, 123, 43);
		contentPane.add(tfBot);
		tfBot.setColumns(10);
		
		tfPlayer = new JTextField();
		tfPlayer.setEditable(false);
		tfPlayer.setColumns(10);
		tfPlayer.setBounds(572, 115, 123, 43);
		contentPane.add(tfPlayer);
		
		JLabel lblNewLabel = new JLabel("Player");
		lblNewLabel.setBounds(612, 51, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblBot = new JLabel("Bot");
		lblBot.setBounds(102, 51, 46, 14);
		contentPane.add(lblBot);
		
		tfWinLose = new JTextField();
		tfWinLose.setEditable(false);
		tfWinLose.setBounds(330, 126, 86, 20);
		contentPane.add(tfWinLose);
		tfWinLose.setColumns(10);
		
		objPlayer = new Class_player();
		objBot = new Class_Bot();
		objWho_won = new Class_who_won();
	}
	
	private void close() {
		System.exit(0);
	}
	
	private void set() {
		tfBot.setText(null);
		tfPlayer.setText(null);
		tfWinLose.setText(null);
		String weapon= (String) combPlayer.getItemAt(combPlayer.getSelectedIndex()); 
		objPlayer.setWeaponString(weapon);
		combPlayer.setEnabled(false);
		
		objBot.setWeaponString();
		
		
		objWho_won.setPlayerString(objPlayer.getWeaponString());
		objWho_won.setBotString(objBot.getWeaponString());
		
	}
	
	private void play() {
		tfPlayer.setText(objPlayer.getWeaponString());
		tfBot.setText(objBot.getWeaponString());
		tfWinLose.setText(objWho_won.getmessage());
		combPlayer.setEnabled(true);
	}

}
