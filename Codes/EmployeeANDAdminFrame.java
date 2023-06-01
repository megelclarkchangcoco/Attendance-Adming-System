package Attendance_Management_Sytem1;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;


import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmployeeANDAdminFrame extends JFrame {

	private ImageIcon iconAttendance = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\TheAttendanceManagementSystem\\src\\AssetsAttendanceAndAdmin\\employee.png")
					.getImage().getScaledInstance(198, 180, Image.SCALE_DEFAULT));
	private ImageIcon iconPaycheck = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\TheAttendanceManagementSystem\\src\\AssetsAttendanceAndAdmin\\admin.png")
					.getImage().getScaledInstance(198, 180, Image.SCALE_DEFAULT));

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeANDAdminFrame frame = new EmployeeANDAdminFrame();
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
	public EmployeeANDAdminFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1141, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel upPanel = new JPanel();
		upPanel.setBackground(new Color(6, 137, 49));
		upPanel.setBounds(0, 0, 1125, 37);
		contentPane.add(upPanel);
		upPanel.setLayout(null);
		
		JPanel attendancePanel = new JPanel();
		attendancePanel.addMouseListener(new PanelButtonMouseAdapter2(attendancePanel));
		attendancePanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(6, 137, 49), new Color(6, 137, 49), new Color(6, 137, 49), new Color(6, 137, 49)));
		attendancePanel.setBounds(273, 205, 262, 266);
		contentPane.add(attendancePanel);
		attendancePanel.setLayout(null);
		
		JLabel lblattendanceIcon1 = new JLabel("");
		lblattendanceIcon1.setIcon(iconAttendance);
		lblattendanceIcon1.setBounds(33, 33, 198, 180);
		attendancePanel.add(lblattendanceIcon1);
		
		JLabel lblattendanceIcon = new JLabel("Attendance");
		lblattendanceIcon.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblattendanceIcon.setBounds(66, 221, 143, 34);
		attendancePanel.add(lblattendanceIcon);
		
		JPanel paysheetPanel = new JPanel();
		paysheetPanel.addMouseListener(new PanelButtonMouseAdapter3(paysheetPanel));
		paysheetPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(6, 137, 49), new Color(6, 137, 49), new Color(6, 137, 49), new Color(6, 137, 49)));
		paysheetPanel.setBounds(638, 205, 262, 266);
		contentPane.add(paysheetPanel);
		paysheetPanel.setLayout(null);
		
		JLabel lblpaysheetIcon = new JLabel("");
		lblpaysheetIcon.setIcon(iconPaycheck);
		lblpaysheetIcon.setBounds(38, 34, 198, 180);
		paysheetPanel.add(lblpaysheetIcon);
		
		JLabel lblNewLabel_3_2 = new JLabel("Admin");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3_2.setBounds(48, 221, 188, 34);
		paysheetPanel.add(lblNewLabel_3_2);
	}

	private class PanelButtonMouseAdapter2 extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter2(JPanel panel) {
			this.panel = panel;
		}
		public void mouseEntered(MouseEvent e){
			
			panel.setBackground(new Color(6, 137, 49));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(240, 240, 240));
		}
		
		@Override
		public void mousePressed(MouseEvent e){
			panel.setBackground(new Color(6, 137, 49));
			
			Emp_Attendance employeeattendance = new Emp_Attendance();
			employeeattendance.setVisible(true);
			dispose();
			
			
		}   
		
		@Override
		public void mouseReleased(MouseEvent e){
			panel.setBackground(new Color(240,  240, 240));
		}
	}	
	
	
	private class PanelButtonMouseAdapter3 extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter3(JPanel panel) {
			this.panel = panel;
		}
		public void mouseEntered(MouseEvent e){
			
			panel.setBackground(new Color(6, 137, 49));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(240, 240, 240));
		}
		
		@Override
		public void mousePressed(MouseEvent e){
			panel.setBackground(new Color(6, 137, 49));
			
			AdminLoginFrame adminpaycheck = new AdminLoginFrame();
			adminpaycheck.setVisible(true);
			dispose();
		} 
		
		@Override
		public void mouseReleased(MouseEvent e){
			panel.setBackground(new Color(240,  240, 240));
		}
	}	
	
}
