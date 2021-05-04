import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import VO.MemberVO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGUI {

	private JFrame frame;
	MemberVO vo = null;

	/**
	 * Create the application.
	 */
	public MainGUI( MemberVO vo ) {
		this.vo = vo;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 395, 174);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_member = new JLabel( "" );
		lbl_member.setFont(new Font("����", Font.PLAIN, 25));
		lbl_member.setBounds(184, 34, 150, 32);
		frame.getContentPane().add(lbl_member);
		// ����ϰ� ���� ������ ����� ���Ƿ� ����.
		// (���⼭�� ����� �̸��� ����ϵ��� ����)
		lbl_member.setText( vo.getName() );

		JLabel lblNewLabel_1 = new JLabel("Welcome!");
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 32));
		lblNewLabel_1.setBounds(39, 34, 150, 32);
		frame.getContentPane().add(lblNewLabel_1);

		// ������ ���̵�� �α��� �������� ��ư�� ���̵��� ���ǹ��� ����.
		if( vo.getId().equals("admin") ) {
			JButton btn_manage = new JButton("\uD68C\uC6D0\uAD00\uB9AC");
			btn_manage.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new InfoGUI();
					frame.dispose();
				}
			});
			btn_manage.setBounds(237, 100, 97, 23);
			frame.getContentPane().add(btn_manage);
		}
		
		

	}

}
