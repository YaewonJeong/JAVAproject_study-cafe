import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//관리자 메뉴 중 전체 좌석 리셋하기 
public class Management_reset extends JFrame{
	Management_reset() {
		setTitle("LaLaLa StudyRoom - reset");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		add(panel);
		
		JLabel label = new JLabel("리셋 되었습니다!!!");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		JButton button1 = new JButton("OK");
		
		label.setBounds(55, 20, 200, 80); 
		button1.setBounds(75, 100, 80, 30); 
		
		panel.add(label);
		panel.add(button1);
		
		setSize(250, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//리셋 버튼 이벤트 발생 시 MainFrame에 넘겨주는 내용 없음 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				for(int a = 0; a <= 9; a++)
				{
					setIn.c[a] = null;
					setIn.today[a] = null;
					setIn.money[a] = 0;
				}
				
				Management_reset.this.dispose();
				new MainFrame();
			}
		});
	}
}
