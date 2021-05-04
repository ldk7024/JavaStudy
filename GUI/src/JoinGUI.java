import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DAO.MemberDAO;

public class JoinGUI {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_pw;
	private JTextField tf_name;

	/**
	 * Create the application.
	 */
	public JoinGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 291, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("JOIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 25));
		lblNewLabel.setBounds(103, 27, 72, 33);
		frame.getContentPane().add(lblNewLabel);

		JLabel lbl_ID = new JLabel("ID :");
		lbl_ID.setBounds(27, 79, 57, 15);
		frame.getContentPane().add(lbl_ID);

		JLabel lbl_PW = new JLabel("Password : ");
		lbl_PW.setBounds(27, 123, 90, 15);
		frame.getContentPane().add(lbl_PW);

		JLabel lbl_Name = new JLabel("Name : ");
		lbl_Name.setBounds(27, 175, 57, 15);
		frame.getContentPane().add(lbl_Name);

		JLabel lbl_Gender = new JLabel("Gender : ");
		lbl_Gender.setBounds(27, 232, 57, 15);
		frame.getContentPane().add(lbl_Gender);

		tf_id = new JTextField();
		tf_id.setBounds(111, 76, 134, 21);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);

		tf_pw = new JTextField();
		tf_pw.setBounds(111, 120, 134, 21);
		frame.getContentPane().add(tf_pw);
		tf_pw.setColumns(10);

		tf_name = new JTextField();
		tf_name.setBounds(111, 172, 134, 21);
		frame.getContentPane().add(tf_name);
		tf_name.setColumns(10);

		// ��ư�׷��� ���� ����.
		ButtonGroup gender = new ButtonGroup();

		JRadioButton rb_male = new JRadioButton("Male");
		rb_male.setBounds(103, 228, 57, 23);
		frame.getContentPane().add(rb_male);

		JRadioButton rb_female = new JRadioButton("Female");
		rb_female.setBounds(171, 228, 80, 23);
		frame.getContentPane().add(rb_female);

		// ��ư�׷쿡 ���� ��ư �߰�(�ߺ����� ����)
		gender.add(rb_male);
		gender.add(rb_female);

		JLabel lbl_Hobby = new JLabel("Hobby : ");
		lbl_Hobby.setBounds(27, 287, 57, 15);
		frame.getContentPane().add(lbl_Hobby);

		JCheckBox chk_soccer = new JCheckBox("\uCD95\uAD6C");
		chk_soccer.setBounds(89, 283, 57, 23);
		frame.getContentPane().add(chk_soccer);

		JCheckBox chk_basket = new JCheckBox("\uB18D\uAD6C");
		chk_basket.setBounds(150, 283, 57, 23);
		frame.getContentPane().add(chk_basket);

		JCheckBox chk_base = new JCheckBox("\uC57C\uAD6C");
		chk_base.setBounds(211, 283, 56, 23);
		frame.getContentPane().add(chk_base);

		// ���¹�ư
		JButton btn_reset = new JButton("RESET");
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ؽ�Ʈ�� �ʱ�ȭ�ϱ� ���� ����.
				tf_id.setText("");
				tf_pw.setText("");
				tf_name.setText("");
				// ������ư -> �ʱ�ȭ�� �Ұ���
				// üũ�ڽ��� ����
				chk_soccer.setSelected(false);
				chk_basket.setSelected(false);
				chk_base.setSelected(false);
			}
		});
		btn_reset.setBounds(27, 348, 97, 23);
		frame.getContentPane().add(btn_reset);

		// ���ι�ư
		JButton btn_join = new JButton("JOIN");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ؽ�Ʈ �� �����ͼ� ������ ����.
				String id = tf_id.getText();
				String pw = tf_pw.getText();
				String name = tf_name.getText();

				// ������ư �� ��������(�����̸� male, �����̸� female�� ����)
				String gender = "";
				if (rb_male.isSelected() == true) {
					gender = "male";
				} else if (rb_female.isSelected() == true) {
					gender = "female";
				}

				String hobby = "";
				if (chk_soccer.isSelected()) {
					hobby += "�౸";
				}
				if (chk_basket.isSelected()) {
					hobby += "��";
				}
				if (chk_base.isSelected()) {
					hobby += "�߱�";
				}
				
				if( !id.equals( "" ) && !pw.equals("") && !name.equals("") && !gender.equals("") && !hobby.equals("") ) {
					// ��� ������ ������ ��� ȸ������.
					MemberDAO dao = new MemberDAO();
					int cnt = dao.joinInsert(id, pw, name, gender, hobby);
					
					if( cnt > 0 ) {
						JOptionPane.showMessageDialog(null, "��� ȸ�������� ó������?");
						new LoginJoin();
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "����� ����� �Բ��� �� �����ϴ�.", "ȸ������", JOptionPane.ERROR_MESSAGE);
					}
					
				} else {
					// ȸ������ �� �� null���� �ϳ��� ���� ��� ���â�� ���
					// 
					JOptionPane.showMessageDialog(null, "��� ������ �Է����̽�Ű��", "ȸ������", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btn_join.setBounds(148, 348, 97, 23);
		frame.getContentPane().add(btn_join);
	}
}
