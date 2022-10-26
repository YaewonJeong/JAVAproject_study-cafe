import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


//첫 번째 메인화면 
public class MainFrame extends JFrame {
	
	static JFrame f;
	MainFrame(){
		
		f =new JFrame();
		f.setTitle("LaLaLa StudyRoom - 자바 프로젝트");
		
		JPanel panel = new JPanel(null);
		JLabel label = new JLabel("LaLaLa StudyRoom");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 30));//위 label에 대한 설정(1)  
		label.setForeground(Color.MAGENTA); // 글자를 MAGENTA으로 바꿔줌, 위 label에 대한 설정(2)  
		
		//버튼 생성 
		JButton button1 = new JButton("입장");
		JButton button2 = new JButton("퇴장");
		JButton button3 = new JButton("관리자");
		
		//라벨과 버튼에 대한 위치 설정 
		label.setBounds(110, 40, 500, 80); 
		button1.setBounds(170, 140, 140, 30);
		button2.setBounds(170, 200, 140, 30);
		button3.setBounds(170, 260, 140, 30);
	 
		f.add(panel);//frame에 panel달아주기 
		panel.add(label);//panel에 label달아주기 
		panel.add(button1);//panel에 button 달아주기 
		panel.add(button2);
		panel.add(button3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		
		f.setSize(500, 400);
		f.setLocationRelativeTo(null);
		f.setVisible(true);

		// 입장 버튼 이벤트 리스너
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				MainFrame.this.f.dispose();//입장 이벤트 발생 시 mainFrame은 닫아주기 
				new setIn();
				
			}
		});

		// 퇴장 버튼 이벤트 리스너
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MainFrame.this.f.dispose();//퇴장 이벤트 발생 시 mainFrame은 닫아주기 
				new setOut(); 		
			}
		});

		// 관리자 버튼 이벤트 리스너
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MainFrame.this.f.dispose();//관리자 이벤트 발생 시 mainFrame은 닫아주기 
				new Management();
			}
		});

	}

	public static void main(String args[]) {
		new MainFrame();
		// new movie().show();
	}
}

