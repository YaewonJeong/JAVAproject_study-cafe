import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class setIn_popup_2 extends JFrame{
	setIn_popup_2() {
		setTitle("LaLaLa StudyRoom - Management");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		add(panel);
		
		JLabel label = new JLabel("이미 사용중인 좌석,");
		JLabel label2 = new JLabel("다시 선택하세요!!!");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));//label에 대한 설정 
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));//label2에 대한 설정 
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		JButton button1 = new JButton("OK");//[ok]버튼 생성 
		
		//label의 위치 설정 
		label.setBounds(80, 50, 250, 80); 
		label2.setBounds(80, 90, 250, 80);
		button1.setBounds(150, 180, 80, 30);//버튼 위치 설정 
		
		//label, button을 panel에 붙이기 
		panel.add(label);
		panel.add(label2);
		panel.add(button1);
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//[ok] button에 대한 이벤트 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//ok버튼 누르면...
				// TODO Auto-generated method stub
				setIn_popup_2.this.dispose();//setIn_popup_2창 닫기
			}
		});
	}
}
