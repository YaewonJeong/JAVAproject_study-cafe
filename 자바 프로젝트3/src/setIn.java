import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.awt.Color;
import java.awt.Font;


public class setIn extends JFrame{

	//좌석 변수 
	static String c[] = new String[10];
	
	//시간 설정 
	static Date today[] = new Date[10];
	
	//손님별 이용 금액 
	static int money[] = new int[10];
	
	//선택 
	int select = 0;
	
	setIn(){
		
		JFrame f =new JFrame();
		
		f.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		            new MainFrame();
		        }
		});
		
		SimpleDateFormat time = new SimpleDateFormat("aa hh:mm");//시간 가져오기 
		
		f.setTitle("LaLaLa StudyRoom - setIn");
		
		JLabel label = new JLabel("이름 : ");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 30));//이름 label에 대한 설정 
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		
		JTextField textfield = new JTextField(); //이름 적는 란
		
		JPanel panel = new JPanel(null);
		//10개의 좌석에 대한 panel 생성  
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		//10개의 좌석 번호label생성 및 글씨체 설정 
		JLabel label1 = new JLabel("1");
		label1.setFont(new Font(label1.getFont().getName(), Font.ITALIC, 30));
		label1.setForeground(Color.black);
		JLabel label2 = new JLabel("2");
		label2.setFont(new Font(label2.getFont().getName(), Font.ITALIC, 30));
		label2.setForeground(Color.black);
		JLabel label3 = new JLabel("3");
		label3.setFont(new Font(label3.getFont().getName(), Font.ITALIC, 30));
		label3.setForeground(Color.black); 
		JLabel label4 = new JLabel("4");
		label4.setFont(new Font(label4.getFont().getName(), Font.ITALIC, 30));
		label4.setForeground(Color.black);
		JLabel label5 = new JLabel("5");
		label5.setFont(new Font(label5.getFont().getName(), Font.ITALIC, 30));
		label5.setForeground(Color.black); 
		JLabel label6 = new JLabel("6");
		label6.setFont(new Font(label6.getFont().getName(), Font.ITALIC, 30));
		label6.setForeground(Color.black); 
		JLabel label7 = new JLabel("7");
		label7.setFont(new Font(label7.getFont().getName(), Font.ITALIC, 30));
		label7.setForeground(Color.black); 
		JLabel label8 = new JLabel("8");
		label8.setFont(new Font(label8.getFont().getName(), Font.ITALIC, 30));
		label8.setForeground(Color.black);
		JLabel label9 = new JLabel("9");
		label9.setFont(new Font(label9.getFont().getName(), Font.ITALIC, 30));
		label9.setForeground(Color.black);
		JLabel label10 = new JLabel("10");
		label10.setFont(new Font(label10.getFont().getName(), Font.ITALIC, 30));
		label10.setForeground(Color.black);
		
		//[입장]button 생성 
		JButton button = new JButton("입장");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		
		label.setBounds(130, 40, 200, 80); //(이름:)라벨 위치 설정  
		textfield.setBounds(220, 60, 200, 40);// 이름 적는 란 위치 설정 
		//10개 좌석에 대한 panel 위치 설정 
		panel1.setBounds(130, 160, 120, 120);
		panel2.setBounds(330, 160, 120, 120);
		panel3.setBounds(530, 160, 120, 120);
		panel4.setBounds(730, 160, 120, 120);
		panel5.setBounds(930, 160, 120, 120);
		panel6.setBounds(130, 320, 120, 120);
		panel7.setBounds(330, 320, 120, 120);
		panel8.setBounds(530, 320, 120, 120);
		panel9.setBounds(730, 320, 120, 120);
		panel10.setBounds(930, 320, 120, 120);
		//10개 좌석의 panel의 색은 회색으로 기본 설정 
		panel1.setBackground(Color.gray);
		panel2.setBackground(Color.gray);
		panel3.setBackground(Color.gray);
		panel4.setBackground(Color.gray);
		panel5.setBackground(Color.gray);
		panel6.setBackground(Color.gray);
		panel7.setBackground(Color.gray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.gray);
		panel10.setBackground(Color.gray);
		//10개 좌석 번호 label 위치 설정 
		label1.setBounds(1, 40, 50, 50);
		label2.setBounds(1, 40, 50, 50);
		label3.setBounds(20, 40, 50, 50);
		label4.setBounds(20, 40, 50, 50);
		label5.setBounds(20, 40, 50, 50);
		label6.setBounds(20, 40, 50, 50);
		label7.setBounds(20, 40, 50, 50);
		label8.setBounds(20, 40, 50, 50);
		label9.setBounds(20, 40, 50, 50);
		label10.setBounds(20, 40, 50, 50);
		//입장 버튼 위치 설정 
		button.setBounds(525, 500, 140, 30);
		
		panel.add(label);//(이름: ) panel에 붙여주기 
		panel.add(textfield);//이름 적는 란 pael에 붙여주기 
		//10개 좌석에 대한 panel을 기본 panel에 달아주기 
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		panel.add(panel4);
		panel.add(panel5);
		panel.add(panel6);
		panel.add(panel7);
		panel.add(panel8);
		panel.add(panel9);
		panel.add(panel10);
		//좌석 번호 label을 해당되는 좌석panel에 각각 붙여주기   
		panel1.add(label1);//1번 좌석번호를 1번 panel에 붙여주기
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		panel5.add(label5);
		panel6.add(label6);
		panel7.add(label7);
		panel8.add(label8);
		panel9.add(label9);
		panel10.add(label10);
		//입장버튼을 panel에 붙여주기 
		panel.add(button);
		
		//기본 panel을 frame에 붙여주기 
		f.add(panel);
		
		f.setSize(1200, 600);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		//좌석 선택시 좌석의 panel의 배경 색 변경 (10좌석에 대한 경우) 
		if(c[0] != null)//만약 1번 좌석이 공백이 아니면(=선택되었으면)
		{
			panel1.setBackground(Color.green);//1번 좌석의 색상을 초록색으로 바꿔주기
		}
		
		if(c[1] != null)
		{
			panel2.setBackground(Color.green);
		}
		
		if(c[2] != null)
		{
			panel3.setBackground(Color.green);
		}
		
		if(c[3] != null)
		{
			panel4.setBackground(Color.green);
		}
		
		if(c[4] != null)
		{
			panel5.setBackground(Color.green);
		}
		
		if(c[5] != null)
		{
			panel6.setBackground(Color.green);
		}
		
		if(c[6] != null)
		{
			panel7.setBackground(Color.green);
		}
		
		if(c[7] != null)
		{
			panel8.setBackground(Color.green);
		}
		
		if(c[8] != null)
		{
			panel9.setBackground(Color.green);
		}
		if(c[9] != null)
		{
			panel10.setBackground(Color.green);
		}
		
		//입장 버튼 눌렀을 때 발생하는 이벤트 
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				for (int a = 0; a <= 9; a++)
				{
					if(select == a+1)
					{
						c[a] = textfield.getText();
						today[a] = new Date();//들어온 입장시간을 today에 저장
						money[a] = 100;//money에 100원 기본요금 청구
						new setIn_popup_1(c[a], Integer.toString(a+1), time.format(today[a]));
					}
				}
				
				if(select == 1)//만약 1번을 선택했다면...
				{
					panel1.setBackground(Color.green);//1번 좌석 panel의 배경색을 초록으로 
				}
				else if(select == 2)
				{
					panel2.setBackground(Color.green);
				}
				else if(select == 3)
				{
					panel3.setBackground(Color.green);
				}
				else if(select == 4)
				{
					panel4.setBackground(Color.green);
				}
				else if(select == 5)
				{
					panel5.setBackground(Color.green);
				}
				else if(select == 6)
				{
					panel6.setBackground(Color.green);
				}
				else if(select == 7)
				{
					panel7.setBackground(Color.green);
				}
				else if(select == 8)
				{
					panel8.setBackground(Color.green);
				}
				else if(select == 9)
				{
					panel9.setBackground(Color.green);
				}
				else if(select == 10)
				{
					panel10.setBackground(Color.green);
				}
			}
		});
		
		//1번 좌석에 대한 이벤트 발생 
		panel1.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(c[0] == null)//1번 좌석이 선택되어 있지 않은 상태에서 
				{
					select = 1;//1번좌석을 선택하면
					panel1.setBackground(Color.yellow);//1번 좌석 배경색을 노랑색으로 바꾼다. 
					
					Color color = panel1.getBackground();
					if(color == panel2.getBackground())//근데.. 2번 좌석의 색과 배경색이 같다면...
					{
						panel2.setBackground(Color.gray);//2번 좌석의 색을 회색으로 바꿔준다.( 좌석은 하나만 선택할 수 있으니까)
					}
					else if(color == panel3.getBackground())//마찬가지로 3번 좌석 선택시 
					{
						panel3.setBackground(Color.gray);//3번 좌석의 색을 회색으로 바꿔준다. 
					}
					else if(color == panel4.getBackground())//위의 경우를 10번 좌석까지 반복 해준다. 
					{
						panel4.setBackground(Color.gray);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.gray);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.gray);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.gray);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.gray);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.gray);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.gray);
					}
				}
				else
				{
					new setIn_popup_2();//이미 사용 중인 좌석을 선택했을 경우 '입장 실패 창' 열기 
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        }); 
		
		//2번 좌석에 대한 이벤트 발생 
		panel2.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(c[1] == null)//2번 좌석이 공백인 상태에서 
				{
					select = 2;//2번 좌석을 선택하면
					panel2.setBackground(Color.yellow);//2번 좌석의 배경색을 노랑색으로 바꿔준다. 
					
					Color color = panel2.getBackground();
					if(color == panel1.getBackground())//만약 2번좌석의 배경색이 1번 좌석의 배경색과 같다면
					{
						panel1.setBackground(Color.gray);//1번 좌석의 배경색을 회색으로 바꿔준다. 
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.gray);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.gray);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.gray);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.gray);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.gray);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.gray);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.gray);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.gray);
					}
				}
				else
				{
					new setIn_popup_2();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        }); 
		
		//3번 좌석에 대한 이벤트 발생 
		panel3.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(c[2] == null)
				{
					select = 3;
					panel3.setBackground(Color.yellow);
					
					Color color = panel3.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.gray);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.gray);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.gray);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.gray);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.gray);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.gray);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.gray);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.gray);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.gray);
					}
				}
				else
				{
					new setIn_popup_2();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        }); 
		
		//4번 좌석에 대한 이벤트 발생 
		panel4.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(c[3] == null)
				{
					select = 4;
					panel4.setBackground(Color.yellow);
					
					Color color = panel4.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.gray);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.gray);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.gray);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.gray);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.gray);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.gray);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.gray);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.gray);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.gray);
					}
				}
				else
				{
					new setIn_popup_2();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        }); 
		
		//5번 좌석에 대한 이벤트 발생 
		panel5.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(c[4] == null)
				{
					select = 5;
					panel5.setBackground(Color.yellow);
					
					Color color = panel5.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.gray);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.gray);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.gray);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.gray);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.gray);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.gray);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.gray);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.gray);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.gray);
					}
				}
				else
				{
					new setIn_popup_2();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        }); 
		
		//6번 좌석에 대한 이벤트 발생 
		panel6.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(c[5] == null)
				{
					select = 6;
					panel6.setBackground(Color.yellow);
					
					Color color = panel6.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.gray);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.gray);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.gray);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.gray);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.gray);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.gray);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.gray);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.gray);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.gray);
					}
				}
				else
				{
					new setIn_popup_2();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        }); 
		
		//7번 좌석에 대한 이벤트 발생 
		panel7.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(c[6] == null)
				{
					select = 7;
					panel7.setBackground(Color.yellow);
					
					Color color = panel7.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.gray);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.gray);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.gray);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.gray);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.gray);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.gray);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.gray);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.gray);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.gray);
					}
				}
				else
				{
					new setIn_popup_2();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        }); 
		
		//8번 좌석에 대한 이벤트 발생 
		panel8.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(c[7] == null)
				{
					select = 8;
					panel8.setBackground(Color.yellow);
					
					Color color = panel8.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.gray);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.gray);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.gray);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.gray);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.gray);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.gray);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.gray);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.gray);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.gray);
					}
				}
				else
				{
					new setIn_popup_2();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        }); 
		
		//9번 좌석에 대한 이벤트 발생 
		panel9.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(c[8] == null)
				{
					select = 9;
					panel9.setBackground(Color.yellow);
					
					Color color = panel9.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.gray);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.gray);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.gray);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.gray);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.gray);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.gray);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.gray);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.gray);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.gray);
					}
				}
				else
				{
					new setIn_popup_2();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        }); 
		
		//10번 좌석에 대한 이벤트 발생 
		panel10.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(c[9] == null)
				{
					select = 10;
					panel10.setBackground(Color.yellow);
					
					Color color = panel10.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.gray);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.gray);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.gray);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.gray);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.gray);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.gray);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.gray);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.gray);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.gray);
					}
				}
				else
				{
					new setIn_popup_2();
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        });
	}
}
 

	

 

