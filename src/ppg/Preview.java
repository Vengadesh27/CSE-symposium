package ppg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Preview {

	public JFrame frame;
	private JTable Table;
	
	
	String url = "jdbc:mysql://localhost:3306/registration";
  	String username = "root";
  	String password = "Vengadesh#27";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preview window = new Preview();
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
	public Preview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setBounds(400, 200, 950, 620);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setBounds(0, 0, 936, 36);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("REGISTERED USERS DETAILS");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setBackground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 48, 918, 449);
		frame.getContentPane().add(scrollPane);
		
		Table = new JTable();
		Table.setShowVerticalLines(false);
		Table.setRowHeight(30);
		Table.getTableHeader().setBackground(new Color (36,134,254));
		Table.setSelectionBackground(new Color(255, 255, 0));
		Table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(Table);
		
		JButton btnNewButton_1 = new JButton("Show Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Connection con = DriverManager.getConnection(url , username , password);
					Statement st = con.createStatement();
					String query = "select * from details";
					ResultSet rs = st.executeQuery(query);
					java.sql.ResultSetMetaData rmd = rs.getMetaData();
					Table.setModel(new DefaultTableModel());
					DefaultTableModel model = (DefaultTableModel) Table.getModel();
					int col = rmd.getColumnCount();
					String [] colname = new String[col];
					for(int i=0 ; i <col; i++ ) {
						colname[i] = rmd.getColumnName(i+1);
						model.setColumnIdentifiers(colname);
						
					}
					String sno , name , collage , location , number , email , mode ,amount ,event,gender;
					while(rs.next()) {
						sno = rs.getString(1);
						name = rs.getString(2);
						collage = rs.getString(3);
						location = rs.getString(4);
						number = rs.getString(5);
						email = rs.getString(6);
						mode = rs.getString(7);
						amount = rs.getString(8);
						event = rs.getString(9);
						gender = rs.getString(10);
						String [] row = {sno , name , collage , location , number , email ,mode, amount,event ,gender};
						model.addRow(row);
					}
					st.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
          
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_1.setBounds(325, 522, 130, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Print Details");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageFormat header = new MessageFormat("USER REGISTRATION DETAILS");
				MessageFormat footer = new MessageFormat("End of page");
				try {
					Table.print(JTable.PrintMode.FIT_WIDTH,header, footer);
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Cannot print !!");
					
				}
			}
		});
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(496, 522, 130, 36);
		frame.getContentPane().add(btnNewButton_1_1);
	}
}
