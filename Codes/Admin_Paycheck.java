package Attendance_Management_Sytem1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;



public class Admin_Paycheck extends JFrame {
	
	// all image 
	private ImageIcon exitIcons = new ImageIcon(
	new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\TheAttendanceManagementSystem\\src\\AssetsAdminPaycheck\\button.png")
	.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
	
	private ImageIcon logoutIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\TheAttendanceManagementSystem\\src\\AssetsAdminPaycheck\\logout (1).png")
			.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
	
	private ImageIcon paycheckIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\TheAttendanceManagementSystem\\src\\AssetsAdminPaycheck\\wage.png")
			.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
	
	private ImageIcon viewIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\TheAttendanceManagementSystem\\src\\AssetsAdminPaycheck\\immigration.png")
			.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
	
	private ImageIcon pesosIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\TheAttendanceManagementSystem\\src\\AssetsAdminPaycheck\\philippines-peso-currency-symbol.png")
			.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
	private ImageIcon chequeIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\TheAttendanceManagementSystem\\src\\AssetsAdminPaycheck\\cheque.png")
			.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));

    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel tableModel;
    private JLabel paycheckLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Admin_Paycheck frame = new Admin_Paycheck();
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
    public Admin_Paycheck() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1141, 628);
        setUndecorated(true);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 250, 250));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel uppanel = new JPanel();
        uppanel.setBounds(0, 0, 1141, 36);
        uppanel.setBackground(new Color(0, 153, 51));
        contentPane.add(uppanel);
        uppanel.setLayout(null);

        JLabel Employee_Paycheck_lbl = new JLabel("PAYCHECK CHECKER");
        Employee_Paycheck_lbl.setFont(new Font("Arial", Font.BOLD, 30));
        Employee_Paycheck_lbl.setHorizontalAlignment(SwingConstants.CENTER);
        Employee_Paycheck_lbl.setBounds(340, 0, 433, 36);
        uppanel.add(Employee_Paycheck_lbl);
        
        
        JLabel exitIcon = new JLabel("");
        exitIcon.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirm", JOptionPane.YES_NO_OPTION)== 0 ) {
//					LoginFrame frame = new LoginFrame();
//					frame.setVisible(true);
					Admin_Paycheck.this.dispose();
				}
        	}
        });

        exitIcon.setIcon(exitIcons);
        exitIcon.setBounds(1101, 0, 40, 36);
        uppanel.add(exitIcon);

        JPanel midPanel = new JPanel();
        midPanel.setBorder(new LineBorder(new Color(6, 139, 49), 2));
        midPanel.setBounds(0, 37, 1141, 401);
        contentPane.add(midPanel);
        midPanel.setLayout(null);

        tableModel = new DefaultTableModel(
                new Object[][] {},
                new String[] { "Employee Name", "Employee ID", "Check-In", "Department", "Work File", "Break-In", "Break-Out", "Total Work Of Hours" }
        );
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new LineBorder(new Color(0, 153, 51), 2));
        scrollPane.setBounds(0, 0, 1144, 401);
        midPanel.add(scrollPane);
        
        JPanel Downpanel = new JPanel();
        Downpanel.setBorder(new LineBorder(new Color(0, 153, 51), 2));
        Downpanel.setBounds(0, 438, 1141, 179);
        contentPane.add(Downpanel);
        Downpanel.setLayout(null);
        
        JPanel Viewpanel = new JPanel();
        Viewpanel.setBorder(new LineBorder(new Color(0, 153, 51), 2));
        Viewpanel.addMouseListener(new PanelButtonMouseAdapter(Viewpanel));
        Viewpanel.setBounds(142, 110, 184, 58);
        Downpanel.add(Viewpanel);
        Viewpanel.setLayout(null);
        
        JLabel viewlbl = new JLabel("Load Data");
        viewlbl.setIcon(viewIcon);
        viewlbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        viewlbl.setBounds(10, 0, 174, 58);
        Viewpanel.add(viewlbl);
        
        JPanel PaycheckPanel = new JPanel();
        PaycheckPanel.setBorder(new LineBorder(new Color(0, 153, 51), 2));
        PaycheckPanel.addMouseListener(new PanelButtonMouseAdapter2(PaycheckPanel));
        PaycheckPanel.setBounds(383, 110, 184, 58);
        Downpanel.add(PaycheckPanel);
        PaycheckPanel.setLayout(null);
        
        JLabel paychecklbl = new JLabel("PayCheck");
        paychecklbl.setIcon(paycheckIcon);
        paychecklbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        paychecklbl.setBounds(10, 0, 174, 58);
        PaycheckPanel.add(paychecklbl);
        
        // paycheck label show
         paycheckLabel = new JLabel();
         paycheckLabel.setIcon(pesosIcon);
         paycheckLabel.setBounds(400, 11, 333, 58);
         Downpanel.add(paycheckLabel);
         paycheckLabel.setFont(new Font("Arial", Font.BOLD, 20));
         
         JPanel logoutPanel = new JPanel();
         logoutPanel.addMouseListener(new PanelButtonMouseAdapter2(logoutPanel));
         logoutPanel.setLayout(null);
         logoutPanel.setBorder(new LineBorder(new Color(0, 153, 51), 2));
         logoutPanel.setBounds(836, 110, 184, 58);
         Downpanel.add(logoutPanel);
         
         JLabel lblLogout = new JLabel("Logout");
         lblLogout.setIcon(logoutIcon);
         lblLogout.addMouseListener(new MouseAdapter() {
         	@Override
         	public void mouseClicked(MouseEvent e) {
         		if(JOptionPane.showConfirmDialog(null, "Do you want Logout?", "Confirm", JOptionPane.YES_NO_OPTION)== 0 ) {
// 					LoginFrame frame = new LoginFrame();
// 					frame.setVisible(true);
 					Admin_Paycheck.this.dispose();
 				}
         	}
         });
         lblLogout.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
         lblLogout.setBounds(23, 0, 161, 58);
         logoutPanel.add(lblLogout);
         
         JPanel PaycheckPanels = new JPanel();
         PaycheckPanels.addMouseListener(new PanelButtonMouseAdapter4(PaycheckPanels));
         PaycheckPanels.setLayout(null);
         PaycheckPanels.setBorder(new LineBorder(new Color(0, 153, 51), 2));
         PaycheckPanels.setBounds(616, 110, 184, 58);
         Downpanel.add(PaycheckPanels);
          
         JLabel lblPrintPaycheck = new JLabel("Print Cheque");
         lblPrintPaycheck.setIcon(chequeIcon);
         lblPrintPaycheck.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
         lblPrintPaycheck.setBounds(10, 0, 174, 58);
         PaycheckPanels.add(lblPrintPaycheck);

    } 
    // private method for load table date this is the reason why data show in Jtable
    private void loadTableData() {
        String filePath = "C:\\DatabaseAttendance.txt";
        tableModel.setRowCount(0);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String headerLine = br.readLine(); // Read the header line (not needed for the table)
            String[] headers = headerLine.split("\t"); // Split the header line by tabs
            
            // Check if the header line contains the expected number of columns
            if (headers.length == 8 && headers[0].equals("Employee Name") && headers[1].equals("Employee ID") && headers[2].equals("Check - In") && headers[3].equals("Department")
                    && headers[4].equals("Work File") && headers[5].equals("Break In") && headers[6].equals("Break Out") && headers[7].equals("Total Work Of Hours")) {
                
                String line;
                
                while ((line = br.readLine()) != null) {
                    String[] data = line.split("\t"); // Split the line by tabs
                    
                    if (data.length == 8) {
                        String employeeName = data[0];
                        String employeeID = data[1];
                        String checkIn = data[2];
                        String department = data[3];
                        String workFile = data[4];
                        String breakIn = data[5];
                        String breakOut = data[6];
                        String totalWorkHours = data[7];

                        tableModel.addRow(new Object[] { employeeName, employeeID, checkIn, department, workFile, breakIn, breakOut, totalWorkHours });
                    }
                }
            } else {
                System.out.println("Invalid header format in the data file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // private method for Calculate pay check this is the reason why you total work hours has calculate
    private void calculatePaycheck() {
    	// computation 
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String totalWorkHours = table.getValueAt(selectedRow, 7).toString();
            double hours = Double.parseDouble(totalWorkHours);
            double hourlyRate = 72.25; // total salary per hour
            double grossPay = hours * hourlyRate;

            // Subtract taxes
            double taxSSS = 0.8;
            double taxPagibig = 0.8;
            double taxPhilhealth = 0.8;
            double totalDeductions = taxSSS + taxPagibig + taxPhilhealth;
            double netPay = grossPay - totalDeductions;

            paycheckLabel.setText(" : "+netPay); // paycheck show total
        }
    }

    // View Panel Panel Effect and Function
    private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
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
			
			  loadTableData(); // called Textfile
		} 
		
		@Override
		public void mouseReleased(MouseEvent e){
			panel.setBackground(new Color(240,  240, 240));
		}

	}
    
    // Paycheck Panel Panel Effect and Function
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
			
			calculatePaycheck(); // button to calculate your Days
		} 
		
		@Override
		public void mouseReleased(MouseEvent e){
			panel.setBackground(new Color(240,  240, 240));
		}

	}
    
    // logout panel Effect and function
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
			
		
		} 
		
		@Override
		public void mouseReleased(MouseEvent e){
			panel.setBackground(new Color(240,  240, 240));
		}

	}
    
 // Print Cheque panel Effect and function
    private class PanelButtonMouseAdapter4 extends MouseAdapter {
        JPanel panel;

        public PanelButtonMouseAdapter4(JPanel panel) {
            this.panel = panel;
        }

        public void mouseEntered(MouseEvent e) {
            panel.setBackground(new Color(6, 137, 49));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            panel.setBackground(new Color(240, 240, 240));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            panel.setBackground(new Color(6, 137, 49));

            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String employeeName = table.getValueAt(selectedRow, 0).toString();
                String employeeID = table.getValueAt(selectedRow, 1).toString();
                String department = table.getValueAt(selectedRow, 3).toString();
                String totalWorkHours = table.getValueAt(selectedRow, 7).toString();

                // Create an instance of the Receipt frame
                ReceiptFrame fr = new ReceiptFrame();

                // Set values in the Receipt frame
                fr.employeenamehere.setText(employeeName);
                fr.EmployeeIDhere.setText(employeeID);
                fr.departmenthere.setText(department);
                fr.paydatehere.setText(getCurrentDate()); // Assuming getCurrentDate() returns the current date
                fr.incomehere.setText(paycheckLabel.getText().replace(" : ", ""));
                fr.totalhourhere.setText(totalWorkHours);
                
             // Set the visibility of the Receipt frame to true
                fr.setVisible(true);
                
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            panel.setBackground(new Color(240, 240, 240));
        }

        private String getCurrentDate() {
        	 LocalDate currentDate = LocalDate.now();
        	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        	 String formattedDate = currentDate.format(formatter);
        	 return formattedDate;
          
        }
    }

}

