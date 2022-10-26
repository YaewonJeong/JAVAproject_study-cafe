import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class setIn_popup_1 extends JFrame{
	
	String name = "", number = "", time = "";
	setIn_popup_1(String name, String number, String time)
	{
		this.name = name; //이름 
		this.number = number; //좌석번호
		this.time = time; //입장시간 
		
		setTitle("LaLaLa StudyRoom - Management");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		add(panel);
		
		JLabel label = new JLabel("이름 : " + name);
		JLabel label2 = new JLabel("좌석번호 : " + number);
		JLabel label3 = new JLabel("입장시간 : " + time);
		JLabel label4 = new JLabel("좌석이 선택되었습니다.");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));//이름에 대한 설정 
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));//좌석번호에 대한 설정
		label2.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label3.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));//입장시간에 대한 설정 
		label3.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label4.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));//문구에 대한 설정 
		label4.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		JButton button1 = new JButton("OK");//ok버튼 생성 
		
		//label 위치 설정 
		label.setBounds(30, 0, 250, 80); 
		label2.setBounds(30, 40, 250, 80);
		label3.setBounds(30, 80, 250, 80); 
		label4.setBounds(30, 130, 400, 80);
		button1.setBounds(150, 200, 80, 30);//button 위치 설정 
		
		//label을 panel에 달아주기 
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(button1);//[ok]버튼을 panel에 달아주기 
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//[ok] button에 대한 이벤트 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//ok버튼 누르면...
				// TODO Auto-generated method stub
				setIn_popup_1.this.dispose();//setIn_popup_1 창 닫기
			}
		});
	}
}
