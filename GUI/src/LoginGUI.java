import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DAO.MemberDAO;
import VO.MemberVO;

public class LoginGUI {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;

	/**
	 * Create the application.
	 */
	public LoginGUI() {
		// LoginGUI()�� â�� ���̰� ����� ����
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 297, 272);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Consolas", Font.BOLD, 25));
		lblLogin.setBounds(105, 24, 72, 33);
		frame.getContentPane().add(lblLogin);
		
		
		
		JLabel lbl_id = new JLabel("ID : ");
		lbl_id.setBounds(35, 86, 57, 15);
		frame.getContentPane().add(lbl_id);
		
		JLabel lbl_pw = new JLabel("Password : ");
		lbl_pw.setBounds(35, 130, 76, 15);
		frame.getContentPane().add(lbl_pw);
		
		tf_id = new JTextField();
		tf_id.setBounds(123, 83, 116, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		tf_pw = new JTextField();
		tf_pw.setBounds(123, 127, 116, 21);
		frame.getContentPane().add(tf_pw);
		tf_pw.setColumns(10);
		
		// ���¹�ư
		JButton btn_reset = new JButton("RESET");
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_id.setText("");
				tf_pw.setText("");
			}
		});
		btn_reset.setBounds(35, 181, 97, 23);
		frame.getContentPane().add(btn_reset);
		
		// �α��� ��ư
		JButton btn_login = new JButton("LOGIN");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tf_id.getText();
				String pw = tf_pw.getText();
				
				
				if( !id.equals("") && !pw.equals("") ) {
					MemberDAO dao = new MemberDAO();
					MemberVO vo = dao.loginSelect(id, pw);
					
					if( vo != null ) {
						JOptionPane.showMessageDialog(null, "����� �湮�� ȯ���մϴ�.");
						new MainGUI( vo );
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "����, �� ��ũ�� �ƴ��ݾ�", "�α���", JOptionPane.ERROR_MESSAGE);
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "�ʴ� ����������.", "�α���", JOptionPane.ERROR_MESSAGE );
				}
				
			}
		});
		btn_login.setBounds(142, 181, 97, 23);
		frame.getContentPane().add(btn_login);
	}

}
