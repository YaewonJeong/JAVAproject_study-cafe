import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class setOut_popup_1 extends JFrame{

	String name = "", number = "", time = "";
	setOut_popup_1(String name, String number, String time, int money)
	{
		this.name = name;//이름 
		this.number = number;//좌석번호
		this.time = time;//입장 시간 
		
		setTitle("LaLaLa StudyRoom - Management");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		add(panel);
		
		//label 생성 
		JLabel label = new JLabel("이름 : " + name);
		JLabel label2 = new JLabel("좌석번호 : " + number);
		JLabel label3 = new JLabel("입장시간 : " + time);
		JLabel label4 = new JLabel("금액 : " + Integer.toString(money));
		JLabel label5 = new JLabel("퇴장되었습니다.");
		//label에 대한 글씨체 및 크기, 색상 설정  
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));
		label2.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label3.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));
		label3.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label4.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));
		label4.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label5.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));
		label5.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		//[ok]버튼 생성 
		JButton button1 = new JButton("OK");
		
		//label의 위치 설정 
		label.setBounds(30, 0, 250, 80); 
		label2.setBounds(30, 30, 250, 80);
		label3.setBounds(30, 60, 250, 80); 
		label4.setBounds(30, 90, 400, 80);
		label5.setBounds(30, 120, 400, 80);
		//button에 대한 위치 설정 
		button1.setBounds(150, 200, 80, 30);
		
		//이름, 좌석번호, 입장시간, 금액, 입장성공문구 label을 panel에 붙여주기 
		panel.add(label); 
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(button1);//ok 버튼을 panel에 붙여주기 
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//ok버튼 이벤트 발생 시 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setOut_popup_1.this.dispose();//setOut_popup_1 창 닫아주기 
			}
		});
	}
}
