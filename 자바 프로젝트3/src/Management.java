import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Management extends JFrame{
	
	Management(){
		setTitle("LaLaLa StudyRoom - Management");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		add(panel);
		
		JLabel label = new JLabel("관리자 메뉴");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 30));
		label.setForeground(Color.MAGENTA); // 글자를 MAGENTA으로 바꿔줌
		JButton button1 = new JButton("현재좌석 상태보기");
		JButton button2 = new JButton("전체좌석 리셋하기");
		JButton button3 = new JButton("손님현황 보기");
		JButton button4 = new JButton("총수입 확인하기");

		label.setBounds(160, 40, 200, 80); 
		button1.setBounds(170, 130, 140, 30);
		button2.setBounds(170, 175, 140, 30);
		button3.setBounds(170, 220, 140, 30);
		button4.setBounds(170, 265, 140, 30);
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		setSize(500, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		
				// 입장 버튼 이벤트 리스너
				button1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						Management.this.dispose();
						new Management_front();
					}
				});

				// 퇴장 버튼 이벤트 리스너
				button2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Management.this.dispose();
						new Management_reset();
					}
				});

				// 관리자 버튼 이벤트 리스너
				button3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Management.this.dispose();
						new Management_customerlist();
					}
				});
				
				// 관리자 버튼 이벤트 리스너
				button4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Management.this.dispose();
						new Management_total();
					}
				});
	}
}
