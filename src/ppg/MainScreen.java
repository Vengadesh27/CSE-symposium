package ppg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.ButtonGroup;

public class MainScreen {

	protected static final Color Color = null;
	public JFrame frame;
	static public JTextField t1;
	public JTextField t2;
	public JTextField t3;
	public JTextField t4;
	public JTextField t5;
	public JTextField amt;
	public JTextField amtPaid;
	
	static String name;
	static String collage;
	static String location;
	static String mobile;
	static String email;
	static int amount;
	static String gender = null;
	int total_amt = 0;
	 String url = "jdbc:mysql://localhost:3306/registration";
	 String username = "root";
	 String password = "Vengadesh#27";
	
	private final Action action = new SwingAction();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBounds(new Rectangle(10, 10, 10, 10));
		frame.getContentPane().setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1200, 700);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		
		JLabel lblNewLabel = new JLabel("PPG INSTITUTE OF TECHNOLOGY");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(128, 0, 128));
		
		JLabel nametxt = new JLabel("PARTICIPENT NAME");
		nametxt.setForeground(new Color(128, 0, 128));
		nametxt.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.LEFT);
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				//change a focus to next text field when click the neter the button
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					t2.requestFocus();
				}
				
				
			}
		});
		t1.setBounds(new Rectangle(3, 3, 3, 3));
		t1.setBorder(null);
		t1.setFont(new Font("Tahoma", Font.BOLD, 18));
		t1.setSelectionColor(new Color(128, 0, 128));
		t1.setForeground(new Color(0, 0, 0));
		t1.setBackground(new Color(240, 240, 240));
		t1.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("COLLEGE\r\n");
		lblNewLabel_2_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.LEFT);
		t2.setBorder(null);
		t2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				//change focus to next text field
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					
					t3.requestFocus();
				}
				
			}
		});
		t2.setSelectionColor(new Color(128, 0, 128));
		t2.setForeground(new Color(0, 0, 0));
		t2.setFont(new Font("Tahoma", Font.BOLD, 18));
		t2.setColumns(10);
		t2.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_2_2 = new JLabel("COLLEGE LOCATION");
		lblNewLabel_2_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.LEFT);
		t3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					t4.requestFocus();
				}
			}
		});
		t3.setSelectionColor(new Color(128, 0, 128));
		t3.setForeground(new Color(0, 0, 0));
		t3.setFont(new Font("Tahoma", Font.BOLD, 18));
		t3.setColumns(10);
		t3.setBorder(null);
		t3.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("MOBILE NUMBER\r\n");
		lblNewLabel_2_1_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		t4 = new JTextField();
		t4.setHorizontalAlignment(SwingConstants.LEFT);
		t4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					t5.requestFocus();
				}
				
			}
		});
		t4.setSelectionColor(new Color(128, 0, 128));
		t4.setForeground(new Color(0, 0, 0));
		t4.setFont(new Font("Tahoma", Font.BOLD, 18));
		t4.setColumns(10);
		t4.setBorder(null);
		t4.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("E-MAIL ID");
		lblNewLabel_2_1_1_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_2_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		t5 = new JTextField();
		t5.setHorizontalAlignment(SwingConstants.LEFT);
		t5.setSelectionColor(new Color(128, 0, 128));
		t5.setForeground(new Color(0, 0, 0));
		t5.setFont(new Font("Tahoma", Font.BOLD, 18));
		t5.setColumns(10);
		t5.setBorder(null);
		t5.setBackground(new Color(240, 240, 240));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Paper Presentation");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 0));
		chckbxNewCheckBox.setForeground(new Color(128, 0, 128));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JCheckBox chckbxBugDiscovers = new JCheckBox("Bug Discovers");
		chckbxBugDiscovers.setForeground(new Color(128, 0, 128));
		chckbxBugDiscovers.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxBugDiscovers.setBackground(Color.YELLOW);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Technical Quiz");
		chckbxNewCheckBox_1_1.setForeground(new Color(128, 0, 128));
		chckbxNewCheckBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox_1_1.setBackground(Color.YELLOW);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Treasure Hunt");
		chckbxNewCheckBox_2.setForeground(new Color(255, 0, 128));
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox_2.setBackground(Color.YELLOW);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Fun Games\r\n");
		chckbxNewCheckBox_1_2.setForeground(new Color(255, 0, 128));
		chckbxNewCheckBox_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox_1_2.setBackground(Color.YELLOW);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("Mini Millitia");
		chckbxNewCheckBox_1_1_1.setForeground(new Color(255, 0, 128));
		chckbxNewCheckBox_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox_1_1_1.setBackground(Color.YELLOW);
		
		JLabel lblNewLabel_3 = new JLabel("Events");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setForeground(new Color(72, 72, 72));
		
		JLabel lblNewLabel_4 = new JLabel("Non-Technical");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		JLabel lblNewLabel_4_1 = new JLabel("Technical");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("GENDER");
		lblNewLabel_2_1_1_1_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		JRadioButton male = new JRadioButton("Male");
		buttonGroup.add(male);
		male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        gender = "male";
			    }
		});
		male.setFont(new Font("Tahoma", Font.BOLD, 14));
		male.setForeground(new Color(128, 0, 128));
		male.setBackground(new Color(255, 255, 255));
		
		JRadioButton female = new JRadioButton("Female");
		female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender = "female";
			}
		});
		buttonGroup.add(female);
		female.setForeground(new Color(128, 0, 128));
		female.setFont(new Font("Tahoma", Font.BOLD, 14));
		female.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("AMOUNT ");
		lblNewLabel_2_1_1_1_1_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		amt = new JTextField();
		amt.setHorizontalAlignment(SwingConstants.CENTER);
		amt.setSelectionColor(new Color(128, 0, 128));
		amt.setForeground(new Color(128, 0, 128));
		amt.setFont(new Font("Tahoma", Font.BOLD, 18));
		amt.setColumns(10);
		amt.setBorder(null);
		amt.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_3_1 = new JLabel("Per Head 200/- Rupees");
		lblNewLabel_3_1.setForeground(new Color(72, 72, 72));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		amtPaid = new JTextField();
		amtPaid.setText("0");
		amtPaid.setSelectionColor(new Color(128, 0, 128));
		amtPaid.setForeground(new Color(128, 0, 128));
		amtPaid.setFont(new Font("Tahoma", Font.BOLD, 18));
		amtPaid.setColumns(10);
		amtPaid.setBorder(null);
		amtPaid.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Total Amount Received");
		lblNewLabel_3_1_1.setForeground(new Color(72, 72, 72));
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton saveButton = new JButton("SAVE DETAILS");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  name = t1.getText();
				  collage = t2.getText();
				  location = t3.getText();
				  mobile = t4.getText();
				  email = t5.getText();
				  amount = Integer.parseInt(amt.getText());
				  
				  
				 		      
				confirm c = new confirm();
				c.frame.setVisible(true);
				InsertData in = new InsertData();
				try {
					amtPaid.setText(""+in.calAmount());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		saveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				saveButton.setBackground(java.awt.Color.green);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				saveButton.setBackground(java.awt.Color.red);
				}
		});
		saveButton.setForeground(new Color(255, 255, 255));
		saveButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		saveButton.setBorder(null);
		saveButton.setBackground(new Color(255, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 255, 255));
		GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
		gl_panel_1_1.setHorizontalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE)
				.addGap(0, 27, Short.MAX_VALUE)
		);
		gl_panel_1_1.setVerticalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 554, Short.MAX_VALUE)
				.addGap(0, 554, Short.MAX_VALUE)
		);
		panel_1_1.setLayout(gl_panel_1_1);
		
		JButton btnPrview = new JButton("PREVIEW");
		btnPrview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preview p = new Preview();
				p.frame.setVisible(true);
			}
		});
		btnPrview.setForeground(Color.WHITE);
		btnPrview.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrview.setBorder(null);
		btnPrview.setBackground(new Color(0, 255, 0));
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 amtPaid.setText("0");
				 try {
				 String query="select * from details";
				 Connection con = DriverManager.getConnection(url , username , password);
				 Statement st = con.createStatement();
				 ResultSet rs = st.executeQuery(query);
				
				 while(rs.next()) {
					 int DBamt =  rs.getInt(8);
					 total_amt = total_amt + DBamt;
					 
				 }
				 amtPaid.setText(String.valueOf(total_amt));
				 total_amt =0;
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCalculate.setForeground(new Color(0, 0, 0));
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCalculate.setBorder(null);
		btnCalculate.setBackground(new Color(255, 255, 0));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1186, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(male)
									.addGap(18)
									.addComponent(female, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(t3, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblNewLabel_2_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(18)
												.addComponent(t4, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(t2, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(nametxt, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(t1, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(t5, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
												.addComponent(amt, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))))
									.addGap(62)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_3)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(chckbxNewCheckBox)
												.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_4)
												.addComponent(chckbxNewCheckBox_2, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(chckbxNewCheckBox_1_1, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(chckbxNewCheckBox_1_1_1, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(chckbxBugDiscovers, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(chckbxNewCheckBox_1_2, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
												.addComponent(amtPaid, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addComponent(btnCalculate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
							.addGap(81))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(btnPrview, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addGap(312)))
					.addComponent(panel_1_1, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1_1, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(t1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(nametxt)
								.addComponent(lblNewLabel_3))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(16)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(t2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
									.addGap(25)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(t3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
									.addGap(24)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
										.addComponent(t4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
									.addGap(29)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
										.addComponent(t5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_4))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(chckbxNewCheckBox)
										.addComponent(chckbxNewCheckBox_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
									.addGap(31)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(chckbxBugDiscovers, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxNewCheckBox_1_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
									.addGap(27)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(chckbxNewCheckBox_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxNewCheckBox_1_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))))
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(female, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
										.addComponent(male))
									.addGap(34)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(amt, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(amtPaid, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPrview, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
					.addContainerGap())
		);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 27, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 554, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tech Sagaz 2K'23");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 0, 128));
		lblNewLabel_1.setFont(new Font("Imprint MT Shadow", Font.BOLD, 30));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(339)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
					.addGap(320))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(196)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
					.addGap(172))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
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
