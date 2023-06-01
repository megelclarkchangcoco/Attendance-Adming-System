package Attendance_Management_Sytem1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class ReceiptFrame extends JFrame {

	private JPanel contentPane;
	// this is the reason why you see the text from another frame
	

	public static JLabel employeenamehere;
	public static JLabel EmployeeIDhere;
	public static JLabel departmenthere;
	public static JLabel paydatehere;
	public static JLabel incomehere;
	public static JLabel totalhere;
	public static JLabel totalhourhere; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceiptFrame frame = new ReceiptFrame();
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
	public ReceiptFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 379);
		setTitle("Receipt");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel receiptpanel = new JPanel();
		receiptpanel.setBackground(new Color(240, 240, 240));
		receiptpanel.setBounds(0, 0, 688, 340);
		contentPane.add(receiptpanel);
		receiptpanel.setLayout(null);
		
		JPanel uppanel = new JPanel();
		uppanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		uppanel.setBackground(new Color(0, 153, 51));
		uppanel.setBounds(0, 33, 688, 34);
		receiptpanel.add(uppanel);
		uppanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Emplyee Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(0, 0, 136, 34);
		uppanel.add(lblNewLabel);
		
		JLabel lblId = new JLabel("Employee ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblId.setBounds(196, 0, 136, 34);
		uppanel.add(lblId);
		
		JLabel lblPaydate = new JLabel("Paydate");
		lblPaydate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPaydate.setBounds(583, 0, 105, 34);
		uppanel.add(lblPaydate);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblDepartment.setBounds(390, 0, 136, 34);
		uppanel.add(lblDepartment);
		
		JPanel downpanel = new JPanel();
		downpanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		downpanel.setBackground(new Color(0, 153, 51));
		downpanel.setBounds(0, 102, 688, 45);
		receiptpanel.add(downpanel); 
		downpanel.setLayout(null);
		
		JPanel down = new JPanel();
		down.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		down.setBackground(new Color(0, 153, 51));
		down.setBounds(0, 245, 688, 34);
		receiptpanel.add(down);
		down.setLayout(null);
		
		JLabel lblTotalIncome = new JLabel("Total Income");
		lblTotalIncome.setBounds(383, 0, 136, 34);
		down.add(lblTotalIncome);
		lblTotalIncome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		 employeenamehere = new JLabel("");
		employeenamehere.setBounds(0, 77, 131, 14);
		receiptpanel.add(employeenamehere);
		
		EmployeeIDhere = new JLabel("");
		EmployeeIDhere.setBounds(182, 78, 122, 14);
		receiptpanel.add(EmployeeIDhere);
		
		 departmenthere = new JLabel("");
		departmenthere.setBounds(376, 78, 116, 14);
		receiptpanel.add(departmenthere);
		
		 paydatehere = new JLabel("");
		paydatehere.setBounds(562, 78, 116, 14);
		receiptpanel.add(paydatehere);
		
		 incomehere = new JLabel("");
		incomehere.setBounds(524, 277, 106, 34);
		receiptpanel.add(incomehere);
		
		JLabel totalhere = new JLabel("72.25 Hour");
		totalhere.setBounds(0, 158, 106, 34);
		receiptpanel.add(totalhere);
		
		 totalhourhere = new JLabel("");
		totalhourhere.setBounds(287, 158, 106, 34);
		receiptpanel.add(totalhourhere);
		
		JLabel pagibiglbl = new JLabel("Pagibig      : 0.8");
		pagibiglbl.setBounds(535, 158, 106, 34);
		receiptpanel.add(pagibiglbl);
		
		JLabel lblPerHour = new JLabel("Per Hour");
		lblPerHour.setBounds(0, 12, 102, 34);
		lblPerHour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		downpanel.add(lblPerHour);
		
		JLabel lblTotalHour = new JLabel("Total Hour");
		lblTotalHour.setBounds(289, 12, 136, 34);
		lblTotalHour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		downpanel.add(lblTotalHour);
		
		JLabel lblTax = new JLabel("Tax\r\n");
		lblTax.setBounds(542, 11, 136, 37);
		lblTax.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		downpanel.add(lblTax);
		
		JLabel lblSss = new JLabel("SSS           : 0.8");
		lblSss.setBounds(535, 172, 106, 34);
		receiptpanel.add(lblSss);
		
		JLabel pagibiglbl_1_1 = new JLabel("Philhealth  : 0.8");
		pagibiglbl_1_1.setBounds(535, 186, 118, 34);
		receiptpanel.add(pagibiglbl_1_1);
	}

}
