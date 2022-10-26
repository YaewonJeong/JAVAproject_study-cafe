import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class setOut extends JFrame{
	//선택
	int select = 0;
	
	setOut(){
		
		JFrame f =new JFrame();
		
		f.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		            new MainFrame();
		        }
		});
		
		SimpleDateFormat time = new SimpleDateFormat("aa hh:mm");
		
		
		f.setTitle("LaLaLa StudyRoom - setOut");
		
		//기본 panel생성 
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
		
		//10개의 좌석번호에 대한 label생성 
		JLabel label1 = new JLabel("1");//좌석번호 1
		label1.setFont(new Font(label1.getFont().getName(), Font.ITALIC, 30));//글자에 대한 설정 
		label1.setForeground(Color.black);//글자 색상에 대한 설정 
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
		
		//퇴장 버튼 생성 
		JButton button = new JButton("퇴장");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		f.add(panel);//기본 panel을 frame에 붙여주기 
		
		//좌석에 대한 panel 위치 설정 
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
		//좌석에 대한 panel의 기본 배경색 설정
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
		//좌석 번호에 대한 위치 설정 
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
		//퇴장 버튼 위치 설정 
		button.setBounds(525, 500, 140, 30);
		
		//10개의 좌석 panel을 기본 panel에 붙여주기  
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
		//각각의 좌석번호를 해당되는 좌석 panel에 붙여주기 
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		panel5.add(label5);
		panel6.add(label6);
		panel7.add(label7);
		panel8.add(label8);
		panel9.add(label9);
		panel10.add(label10);
		//퇴장 버튼을 기본 panel에 붙여주기 
		panel.add(button);
		
		f.setSize(1200, 600);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		//좌석 선택시 좌석의 panel의 배경 색 변경 (10좌석에 대한 경우) 
		if(setIn.c[0] != null)//만약 1번 좌석이 공백이 아니면(=선택되었으면)
		{
			panel1.setBackground(Color.green);//1번 좌석의 색상을 초록색으로 바꿔주기
		}
		
		if(setIn.c[1] != null)
		{
			panel2.setBackground(Color.green);
		}
		
		if(setIn.c[2] != null)
		{
			panel3.setBackground(Color.green);
		}
		
		if(setIn.c[3] != null)
		{
			panel4.setBackground(Color.green);
		}
		
		if(setIn.c[4] != null)
		{
			panel5.setBackground(Color.green);
		}
		
		if(setIn.c[5] != null)
		{
			panel6.setBackground(Color.green);
		}
		
		if(setIn.c[6] != null)
		{
			panel7.setBackground(Color.green);
		}
		
		if(setIn.c[7] != null)
		{
			panel8.setBackground(Color.green);
		}
		
		if(setIn.c[8] != null)
		{
			panel9.setBackground(Color.green);
		}
		if(setIn.c[9] != null)
		{
			panel10.setBackground(Color.green);
		}
		
		//퇴장 버튼에 대한 이벤트 발생 시 
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Date today = new Date();
				Date t1 = new Date();
				Date t2 = new Date();
				
				for (int a = 0; a <= 9; a++)
				{
					if(select == a+1)
					{
						try {
							t1 = time.parse(time.format(today));
							t2 = time.parse(time.format(setIn.today[a]));
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						//시간 계산 
						long diff = t1.getTime() - t2.getTime();
						long sec = diff / 1000;
						
						//이용 금액 계산 
						setIn.money[a] = Long.valueOf((sec/60) * 100 + 100).intValue();
						
						new setOut_popup_1(setIn.c[a], Integer.toString(a+1), time.format(setIn.today[a]), setIn.money[a]);
						
						setIn.c[a] = null;
						
						break;
					}
				}
				
				//10개의 좌석에 퇴장 이벤트 발생에 대한 경우 만들기  
				if(select == 1)//1번이 선택되었다면
				{
					panel1.setBackground(Color.gray);//panel의 기본 색인 회색으로 바꿔준다. 
				}
				else if(select == 2)//2번 좌석이 선택되었다면 
				{
					panel2.setBackground(Color.gray);//기본 배경색을 회색으로 바꾼다. 
				} 
				else if(select == 3)//3번 좌석 선택시 
				{
					panel3.setBackground(Color.gray);
				}
				else if(select == 4)
				{
					panel4.setBackground(Color.gray);
				}
				else if(select == 5)
				{
					panel5.setBackground(Color.gray);
				}
				else if(select == 6)
				{
					panel6.setBackground(Color.gray);
				}
				else if(select == 7)
				{
					panel7.setBackground(Color.gray);
				}
				else if(select == 8)
				{
					panel8.setBackground(Color.gray);
				}
				else if(select == 9)
				{
					panel9.setBackground(Color.gray);
				}
				else if(select == 10)
				{
					panel10.setBackground(Color.gray);
				}
			}
		});
		
		//1번 좌석에 대한 panel이벤트 발생 시 
		panel1.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(setIn.c[0] == null)//만약 좌석이 공백이라면
				{
					new setOut_popup_2();//퇴장 실패 창 호출 
				}
				else//c1이 공백이 아니라면 
				{
					select = 1;//1번 선택 
					panel1.setBackground(Color.yellow);//1번 좌석 panel의 배경색을 노랑색으로 
					
					Color color = panel1.getBackground();
					if(color == panel2.getBackground())//만약 panel1의 색상이 panel2의 배경색과 같다면...
					{
						panel2.setBackground(Color.green);//panel2의 배경색을 초록색으로
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.green);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.green);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.green);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.green);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.green);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.green);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.green);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.green);
					}
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
		//2번 좌석에 대한 panel이벤트 발생 시 
		panel2.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(setIn.c[1] == null)
				{
					new setOut_popup_2();
				}
				else
				{
					select = 2;
					panel2.setBackground(Color.yellow);
					
					Color color = panel2.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.green);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.green);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.green);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.green);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.green);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.green);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.green);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.green);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.green);
					}
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
		//3번 좌석에 대한 panel이벤트 발생 시 
		panel3.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(setIn.c[2] == null)
				{
					new setOut_popup_2();
				}
				else
				{
					select = 3;
					panel3.setBackground(Color.yellow);
					
					Color color = panel3.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.green);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.green);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.green);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.green);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.green);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.green);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.green);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.green);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.green);
					}
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
		//4번 좌석에 대한 panel이벤트 발생 시 
		panel4.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(setIn.c[3] == null)
				{
					new setOut_popup_2();
				}
				else
				{
					select = 4;
					panel4.setBackground(Color.yellow);
					
					Color color = panel4.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.green);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.green);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.green);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.green);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.green);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.green);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.green);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.green);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.green);
					}
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
		//5번 좌석에 대한 panel이벤트 발생 시 
		panel5.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(setIn.c[4] == null)
				{
					new setOut_popup_2();
				}
				else
				{
					select = 5;
					panel5.setBackground(Color.yellow);
					
					Color color = panel5.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.green);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.green);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.green);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.green);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.green);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.green);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.green);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.green);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.green);
					}
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
		//6번 좌석에 대한 panel이벤트 발생 시 
		panel6.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(setIn.c[5] == null)
				{
					new setOut_popup_2();
				}
				else
				{
					
					select = 6;
					panel6.setBackground(Color.yellow);
					
					Color color = panel6.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.green);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.green);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.green);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.green);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.green);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.green);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.green);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.green);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.green);
					}
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
		//7번 좌석에 대한 panel이벤트 발생 시 
		panel7.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(setIn.c[6] == null)
				{
					new setOut_popup_2();
				}
				else
				{
					
					select = 7;
					panel7.setBackground(Color.yellow);
					
					Color color = panel7.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.green);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.green);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.green);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.green);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.green);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.green);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.green);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.green);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.green);
					}
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
		//8번 좌석에 대한 panel이벤트 발생 시 
		panel8.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(setIn.c[7] == null)
				{
					new setOut_popup_2();
				}
				else
				{
					
					select = 8;
					panel8.setBackground(Color.yellow);
					
					Color color = panel8.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.green);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.green);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.green);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.green);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.green);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.green);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.green);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.green);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.green);
					}
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
		//9번 좌석에 대한 panel이벤트 발생 시 
		panel9.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(setIn.c[8] == null)
				{
					new setOut_popup_2();
				}
				else
				{
					
					select = 9;
					panel9.setBackground(Color.yellow);
					
					Color color = panel9.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.green);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.green);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.green);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.green);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.green);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.green);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.green);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.green);
					}
					else if(color == panel10.getBackground())
					{
						panel10.setBackground(Color.green);
					}
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
		//10번 좌석에 대한 panel이벤트 발생 시 
		panel10.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(setIn.c[9] == null)
				{
					new setOut_popup_2();
				}
				else
				{
					
					select = 10;
					panel10.setBackground(Color.yellow);
					
					Color color = panel10.getBackground();
					if(color == panel1.getBackground())
					{
						panel1.setBackground(Color.green);
					}
					else if(color == panel2.getBackground())
					{
						panel2.setBackground(Color.green);
					}
					else if(color == panel3.getBackground())
					{
						panel3.setBackground(Color.green);
					}
					else if(color == panel4.getBackground())
					{
						panel4.setBackground(Color.green);
					}
					else if(color == panel5.getBackground())
					{
						panel5.setBackground(Color.green);
					}
					else if(color == panel6.getBackground())
					{
						panel6.setBackground(Color.green);
					}
					else if(color == panel7.getBackground())
					{
						panel7.setBackground(Color.green);
					}
					else if(color == panel8.getBackground())
					{
						panel8.setBackground(Color.green);
					}
					else if(color == panel9.getBackground())
					{
						panel9.setBackground(Color.green);
					}
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
