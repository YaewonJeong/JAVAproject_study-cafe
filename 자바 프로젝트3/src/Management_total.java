import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//관리자 메뉴 중 총 수입 확인하기 
public class Management_total extends JFrame{
	Management_total() {
		
		setTitle("LaLaLa StudyRoom - total");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		add(panel);
		
		int total = 0;
		//총 수입 변수=1번 입장에 대한 수입 + 2번 입장 + ...... + 9번 입장에 대한 수입 + 10번 입장에 대한 수입
		for(int a = 0; a <= 9; a++)
		{
			total = total + setIn.money[a];
		}
		
		JLabel label = new JLabel("현재까지의 총 수입은");//label 생성 
		JLabel label2 = new JLabel(Integer.toString(total) +"원 입니다.");//금액을 알려주는 label 생성 
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));//label에 대한 설정 
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));//label2에 대한 설정 
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		JButton button1 = new JButton("OK");//ok버튼 생성 
		
		//label들의 위치 설정과 ok버튼 위치 설정 
		label.setBounds(50, 10, 200, 80); 
		label2.setBounds(50, 30, 200, 80);
		button1.setBounds(75, 100, 80, 30);
		
		//기본 panel에 label과 label2, button1 달아주기 
		panel.add(label);
		panel.add(label2);
		panel.add(button1);
		
		setSize(250, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//ok버튼 이벤트 발생 시 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Management_total.this.dispose();//Management_total 창 닫아주기 
				new MainFrame();

			}
		});
	}
}
