import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class setOut_popup_2 extends JFrame{
	setOut_popup_2() {
		setTitle("LaLaLa StudyRoom - Management");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		add(panel);
		
		JLabel label = new JLabel("사용하신 좌석이 아닙니다.");
		JLabel label2 = new JLabel("다시 선택하세요!!!");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		JButton button1 = new JButton("OK");
		
		//label에 대한 위치 설정 
		label.setBounds(40, 50, 350, 80); 
		label2.setBounds(40, 90, 250, 80);
		button1.setBounds(150, 180, 80, 30);//버튼에 대한 위치 설정 
		
		//label을 panel에 붙여주기 
		panel.add(label);
		panel.add(label2);
		//button을 panel에 붙여주기 
		panel.add(button1);
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//ok버튼 이벤트 발생 시 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setOut_popup_2.this.dispose();//setOut_popup_2창 닫아주기 
			}
		});
	}
}
