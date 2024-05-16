package packageSW22;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import packageSW12.while_quader;

import javax.swing.border.EtchedBorder;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class my3xplus1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfSteps;
	private JTextField tfHighestNumber;
	private JTextField tferg;
	private ButtonGroup buttengroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					my3xplus1 frame = new my3xplus1();
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
	public my3xplus1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 462);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("data");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("3x+1");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(312, 11, 151, 57);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Input", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 142, 245, 270);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel(" Put x in here");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 22, 225, 50);
		panel.add(lblNewLabel_1);

		tfInput = new JTextField();
		tfInput.setFont(new Font("Arial", Font.PLAIN, 18));
		tfInput.setBounds(10, 128, 225, 56);
		panel.add(tfInput);
		tfInput.setColumns(10);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Berechne();
			}
		});
		btnCalculate.setBounds(10, 227, 225, 32);
		panel.add(btnCalculate);

		JLabel lblNewLabel_1_1 = new JLabel("Only int and only positiv");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 53, 225, 50);
		panel.add(lblNewLabel_1_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Output", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(265, 142, 503, 270);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		tfSteps = new JTextField();
		tfSteps.setEditable(false);
		tfSteps.setFont(new Font("Arial", Font.PLAIN, 14));
		tfSteps.setBounds(10, 64, 178, 32);
		panel_1.add(tfSteps);
		tfSteps.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Steps");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 39, 178, 24);
		panel_1.add(lblNewLabel_2);

		tfHighestNumber = new JTextField();
		tfHighestNumber.setEditable(false);
		tfHighestNumber.setFont(new Font("Arial", Font.PLAIN, 14));
		tfHighestNumber.setColumns(10);
		tfHighestNumber.setBounds(315, 64, 178, 32);
		panel_1.add(tfHighestNumber);

		JLabel lblNewLabel_2_1 = new JLabel("highest Number");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(315, 39, 178, 24);
		panel_1.add(lblNewLabel_2_1);

		tferg = new JTextField();
		tferg.setFont(new Font("Arial", Font.PLAIN, 14));
		tferg.setEditable(false);
		tferg.setColumns(10);
		tferg.setBounds(10, 189, 178, 32);
		panel_1.add(tferg);

		JLabel lblNewLabel_2_2 = new JLabel("Solution");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(10, 164, 178, 24);
		panel_1.add(lblNewLabel_2_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(315, 107, 178, 139);
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 245, 126);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(6, 7, 109, 23);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(6, 33, 109, 23);
		panel_2.add(rdbtnNewRadioButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(6, 72, 97, 23);
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(6, 98, 97, 23);
		panel_2.add(chckbxNewCheckBox_1);
	
	
		buttengroup = new ButtonGroup();
		buttengroup.add(rdbtnNewRadioButton_1);
		buttengroup.add(rdbtnNewRadioButton);
	
	
	
	}
	
	

	public void Berechne() {
		//int x = (int) Math.sqrt(Math.pow(Double.parseDouble(tfInput.getText()), 2)) ; //(int)Double.parseDouble(tfInput.getText());
		String ersatzstinrg = tfInput.getText();
		ersatzstinrg = ersatzstinrg.replace(',', '.');
		int x = (int)Double.parseDouble(ersatzstinrg);
		if(x<=0) {
			JOptionPane.showMessageDialog(null, "Number is 0 or negative");
		}
		else {
			int steps=0;
			int hNuumber=x;
			do {
				if((x%2)==0) {
					x= x/2;
				}
				else {
					x = (3*x)+1;
				}
				if(x>hNuumber) {
					hNuumber=x;
				}
				steps++;
			}
			while(!(x==1));

			tfSteps.setText(Integer.toString(steps));
			tferg.setText((Integer.toString(x)));
			tfHighestNumber.setText(Integer.toString(hNuumber));
		}
	}
}
