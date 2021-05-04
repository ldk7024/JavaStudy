import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DAO.MemberDAO;
import VO.MemberVO;

public class InfoGUI {

	private JFrame frame;
	MemberDAO dao = new MemberDAO();
	ArrayList<MemberVO> al = null;
	String selected_id = "";

	/**
	 * Create the application.
	 */
	public InfoGUI() {
		// 모든 회원정보를 불러오기
		// MemberDAO에서 allSelect()메서드 활용
		al = dao.allSelect();
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 727, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_Id = new JLabel("ID");
		lbl_Id.setBounds(495, 123, 82, 21);
		frame.getContentPane().add(lbl_Id);

		JLabel lbl_Pw = new JLabel("Password");
		lbl_Pw.setBounds(495, 167, 82, 21);
		frame.getContentPane().add(lbl_Pw);

		JLabel lbl_Name = new JLabel("Name");
		lbl_Name.setBounds(495, 217, 82, 21);
		frame.getContentPane().add(lbl_Name);

		JLabel lbl_Gender = new JLabel("Gender");
		lbl_Gender.setBounds(495, 269, 82, 21);
		frame.getContentPane().add(lbl_Gender);

		JLabel lbl_Hobby = new JLabel("Hobby");
		lbl_Hobby.setBounds(495, 321, 82, 21);
		frame.getContentPane().add(lbl_Hobby);

		JLabel lblNewLabel_1 = new JLabel("Member Info");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(217, 35, 274, 51);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel info_id = new JLabel("");
		info_id.setBounds(606, 123, 82, 21);
		frame.getContentPane().add(info_id);

		JLabel info_pw = new JLabel("");
		info_pw.setBounds(606, 167, 82, 21);
		frame.getContentPane().add(info_pw);

		JLabel info_name = new JLabel("");
		info_name.setBounds(606, 217, 82, 21);
		frame.getContentPane().add(info_name);

		JLabel info_gender = new JLabel("");
		info_gender.setBounds(606, 269, 82, 21);
		frame.getContentPane().add(info_gender);

		JLabel info_hobby = new JLabel("");
		info_hobby.setBounds(606, 321, 82, 21);
		frame.getContentPane().add(info_hobby);

		// 테이블의 컬럼명을 담을 변수
		String[] header = { "ID", "PW", "NAME", "GENDER", "HOBBY" };
		// 컬럼의 값들을 담을 변수(데이터) - 2차원 배열
		String[][] data = new String[al.size()][5];
		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j < 5; j++) {
				switch (j) {
				case 0:
					data[i][j] = al.get(i).getId();
					break;
				case 1:
					data[i][j] = al.get(i).getPw();
					break;
				case 2:
					data[i][j] = al.get(i).getName();
					break;
				case 3:
					data[i][j] = al.get(i).getGender();
					break;
				case 4:
					data[i][j] = al.get(i).getHobby();
					break;
				default:
					break;
				}
			}

			JPanel panel = new JPanel();
			panel.setBounds(17, 123, 461, 283);
			frame.getContentPane().add(panel);

			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(33, 403, 398, -278);
			// 스크롤을 추가하기 위해서는 패널이 필요함.
			// 패널에 스크롤 추가!
			panel.add(scrollPane);

			
			// 테이블 생성
			//                       ( 데이터, 컬럼이름 )
			JTable table = new JTable( data, header );
			table.addMouseListener(new MouseAdapter() {
		         @Override
		         public void mouseClicked(MouseEvent e) {
		        	 int row = table.getSelectedRow();
		        	 selected_id = (String)table.getModel().getValueAt( row , 0 );
		        	 String selected_pw = (String)table.getModel().getValueAt( row , 1 );
		        	 String selected_name = (String)table.getModel().getValueAt( row , 2 );
		        	 String selected_gender = (String)table.getModel().getValueAt( row , 3 );
		        	 String selected_hobby = (String)table.getModel().getValueAt( row , 4 );
		        	 
		        	 info_id.setText(selected_id);
		        	 info_pw.setText(selected_pw);
		        	 info_name.setText(selected_name);
		        	 info_gender.setText(selected_gender);
		        	 info_hobby.setText(selected_hobby);
		         }
		      });
			// 패널전체에 테이블이 꽉차게 만들고 싶을때 사용
			table.setFillsViewportHeight(true);
			// 테이블을 스크롤 패널에 추가, 컬럼이름 보이기 위해서 추가**
			scrollPane.setViewportView(table);
			
			
			JButton btn_delete = new JButton("\uD68C\uC6D0\uC0AD\uC81C");
			btn_delete.setBounds(559, 377, 129, 29);
			btn_delete.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            boolean result = dao.delete(selected_id);
		            
		            if( result == true ) {
		            	JOptionPane.showMessageDialog(null, selected_id + "번 회원 석방이다.");
		            	new InfoGUI();
		            	frame.dispose();
		            } else {
		            	JOptionPane.showMessageDialog(null, "회원삭제 실패", "회원삭제", JOptionPane.ERROR_MESSAGE);
		            }
		         }
		      });
			frame.getContentPane().add(btn_delete);
		}

	}
}
