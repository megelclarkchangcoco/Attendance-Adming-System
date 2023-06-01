
package Attendance_Management_Sytem1;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class AdminLoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField Username_tf;
	private JPasswordField Password_pf;
	private String Username;
	/**
	 * Create the frame.
	 */
	public AdminLoginFrame() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1141, 628);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(375, 340, 96, 23);
		contentPane.add(panel_2);
		
		JLabel Password_lbl = new JLabel("Password:");
		panel_2.add(Password_lbl);
		Password_lbl.setVerticalAlignment(SwingConstants.TOP);
		Password_lbl.setFont(new Font("Sitka Text", Font.BOLD, 15));
		Password_lbl.setForeground(new Color(0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(375, 273, 96, 23);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Username_lbl = new JLabel("Username:");
		Username_lbl.setBounds(7, 3, 81, 20);
		Username_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(Username_lbl);
		Username_lbl.setFont(new Font("Sitka Text", Font.BOLD, 15));
		Username_lbl.setForeground(new Color(0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1141, 19);
		panel.setBackground(new Color(0, 153, 51));
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JLabel X_btn = new JLabel("X");
		X_btn.setVerticalAlignment(SwingConstants.TOP);
		X_btn.setBounds(1121, 0, 20, 19);	
		panel.add(X_btn);
		X_btn.setFont(new Font("Candara Light", Font.BOLD, 20));
		X_btn.setHorizontalAlignment(SwingConstants.CENTER);
		X_btn.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			if(JOptionPane.showConfirmDialog(null, "Do you want to close the application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
				AdminLoginFrame.this.dispose();
			}
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			X_btn.setForeground(Color.RED);
		}public void mouseExited(MouseEvent arg0) {
			X_btn.setForeground(Color.BLACK);
		}
	});
		X_btn.setForeground(new Color(0, 0, 0));
		
		JLabel Login_lbl = new JLabel("LOGIN");
		Login_lbl.setBounds(459, 170, 174, 54);
		Login_lbl.setVerticalAlignment(SwingConstants.TOP);
		Login_lbl.setForeground(new Color(0, 153, 51));
		Login_lbl.setFont(new Font("Sitka Text", Font.PLAIN, 55));
		Login_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(Login_lbl);
		
		Username_tf = new JTextField();
		Username_tf.setBounds(377, 297, 327, 20);
		contentPane.add(Username_tf);
		Username_tf.setColumns(10);
		Username_tf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (Username_tf.getText().equals("")) {
					Username_tf.setForeground(new Color(96, 96, 96));
					Username_tf.setText("Username");
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				if (Username_tf.getText().equals("Username")) {
					Username_tf.setForeground(Color.BLACK);
					Username_tf.setText("");
				}
			}
		});
		
		Password_pf = new JPasswordField();
		Password_pf.setBounds(377, 372, 327, 20);
		contentPane.add(Password_pf);
		Password_pf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (Password_pf.getText().equals("")) {
					Password_pf.setForeground(new Color(96, 96, 96));
					Password_pf.setText("Password");
					Password_pf.setEchoChar((char) 0);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (Password_pf.getText().equals("Password")) {
					Password_pf.setForeground(Color.BLACK);
					Password_pf.setText("");
				}
			}

		});
		
		final  JButton Login_btn = new JButton("Login");
		Login_btn.setBounds(874, 516, 145, 41);
		Login_btn.setFont(new Font("Tahoma", Font.BOLD, 12));
		Login_btn.setForeground(new Color(0, 0, 0));
		Login_btn.setBackground(new Color(0, 153, 51));
		contentPane.add(Login_btn);       // For Logging-in 
		
		Login_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = Username_tf.getText();
                String password = new String(Password_pf.getPassword());

                if (username.equals("Admin01") && password.equals("admin1")) {
                    JOptionPane.showMessageDialog(null, "Admin Login Successful!");
                    Admin_Paycheck ap = new Admin_Paycheck();
                    ap.setVisible(true);
                    dispose();    
                    // Add your admin login logic here
                }  else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password!");
                }
            }
        });
    

		Login_btn.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 23));
		contentPane.add(Login_btn);
		
		JButton Register_btn = new JButton("Register");
		Register_btn.setBounds(346, 443, 89, 23);
		Register_btn.setFont(new Font("Tahoma", Font.BOLD, 12));
		Register_btn.setForeground(new Color(0, 0, 0));
		Register_btn.setBackground(new Color(0, 153, 51));
		contentPane.add(Register_btn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rafae\\Downloads\\Pic.v1 (1).jpg"));
		lblNewLabel.setBounds(81, 21, 901, 596);
		contentPane.add(lblNewLabel);
		
		
	
		
	}
}