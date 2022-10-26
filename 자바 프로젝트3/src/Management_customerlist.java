import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//관리자 메뉴 중 손님 현황보기 
public class Management_customerlist extends JFrame{
	
	int count[] = new int[10];
	int count_ = 0;
	
	Management_customerlist(){
		
		JLabel label_name1 = new JLabel("");//1번 이름 label
		JLabel label_number1 = new JLabel("");//1번 좌석 label 
		JLabel label_name2 = new JLabel("");//2번 이름 label
		JLabel label_number2 = new JLabel("");//2번 좌석 label 
		JLabel label_name3 = new JLabel("");//3번 이름 label
		JLabel label_number3 = new JLabel("");//3번 좌석 label 
		JLabel label_name4 = new JLabel("");//4번 이름 label
		JLabel label_number4 = new JLabel("");//4번 좌석 label 
		JLabel label_name5 = new JLabel("");//5번 이름 label
		JLabel label_number5 = new JLabel("");//5번 좌석 label 
		JLabel label_name6 = new JLabel("");//6번 이름 label
		JLabel label_number6 = new JLabel("");//6번 좌석 label 
		JLabel label_name7 = new JLabel("");//7번 이름 label
		JLabel label_number7 = new JLabel("");//7번 좌석 label 
		JLabel label_name8 = new JLabel("");//8번 이름 label
		JLabel label_number8 = new JLabel("");//8번 좌석 label 
		JLabel label_name9 = new JLabel("");//9번 이름 label
		JLabel label_number9 = new JLabel("");//9번 좌석 label 
		JLabel label_name10 = new JLabel("");//10번 이름 label
		JLabel label_number10 = new JLabel("");//10번 좌석 label 
		
		
		for (int a = 0; a <= 9; a++)
		{
			if(setIn.c[a] != null)
			{
				count_ = count_ + 1;
				count[a] = 1;
			}
		}
		
		
		//만약 손님의 수가 1명인데...
		if(count_ == 1)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number1.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
				}
			}
		}
		else if(count_ == 2)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number1.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number2.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
		}
		else if(count_ == 3)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number1.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number2.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number3.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
		}
		else if(count_ == 4)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number1.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number2.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number3.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number4.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
		}
		else if(count_ == 5)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number1.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number2.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number3.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number4.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number5.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
		}
		else if(count_ == 6)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number1.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number2.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number3.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number4.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number5.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name6.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number6.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
		}
		else if(count_ == 7)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number1.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number2.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number3.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number4.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number5.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name6.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number6.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name7.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number7.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
		}
		else if(count_ == 8)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number1.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number2.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number3.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number4.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number5.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name6.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number6.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name7.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number7.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name8.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number8.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
		}
		else if(count_ == 9)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number1.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number2.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number3.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number4.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number5.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name6.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number6.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name7.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number7.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name8.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number8.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name9.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number9.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
		}
		else if(count_ == 10)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number1.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number2.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number3.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number4.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number5.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name6.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number6.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name7.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number7.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name8.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number8.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name9.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number9.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name10.setText(setIn.c[a]);//이름 란에 이름 보이게 
					label_number10.setText(Integer.toString(a+1));//좌석번호 란에 좌석 번호 보이게  
					count[a] = 0;
					break;
				}
			}
		}
		
		setTitle("LaLaLa StudyRoom - customerlist");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 불가
		add(panel);
		
		JLabel label = new JLabel("이름");
		JLabel label2 = new JLabel("좌석");
		JLabel label3 = new JLabel("____________________________");
		
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));//이름 라벨에 대한 설정 
		label.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));//좌석 라벨에 대한 설정 
		label2.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		label3.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));//구분 선 라벨에 대한 설정 
		label3.setForeground(Color.black); // 글자를 MAGENTA으로 바꿔줌
		
		JButton button1 = new JButton("OK");//ok버튼 생성 
		
		label.setBounds(120, 0, 200, 80);//이름 라벨 위치 설정
		label2.setBounds(270, 0, 200, 80);//좌석 라벨 위치 설정
		label3.setBounds(100, 5, 400, 80);//구분 선 라벨 위치 설정 
		button1.setBounds(170, 270, 80, 30);//버튼 위치 설정 
		
		//들어온 이용자의 이름라벨과 좌석라벨 위치 설정 
		label_name1.setBounds(120, 30, 200, 80); 
		label_number1.setBounds(280, 30, 200, 80);
		label_name2.setBounds(120, 50, 200, 80);
		label_number2.setBounds(280, 50, 200, 80);
		label_name3.setBounds(120, 70, 200, 80); 
		label_number3.setBounds(280, 70, 200, 80);
		label_name4.setBounds(120, 90, 200, 80);
		label_number4.setBounds(280, 90, 200, 80);
		label_name5.setBounds(120, 110, 200, 80); 
		label_number5.setBounds(280, 110, 200, 80);
		label_name6.setBounds(120, 130, 200, 80);
		label_number6.setBounds(280, 130, 200, 80);
		label_name7.setBounds(120, 150, 200, 80); 
		label_number7.setBounds(280, 150, 200, 80);
		label_name8.setBounds(120, 170, 200, 80);
		label_number8.setBounds(280, 170, 200, 80);
		label_name9.setBounds(120, 190, 200, 80); 
		label_number9.setBounds(280, 190, 200, 80);
		label_name10.setBounds(120, 210, 200, 80);
		label_number10.setBounds(280, 210, 200, 80);
		
		//기본 panel에 label 붙여주기 
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		
		//들어온 손님에 대한 이름라벨과 좌석라벨을 기본 panel에 붙여주기 
		panel.add(label_name1);
		panel.add(label_number1);
		panel.add(label_name2);
		panel.add(label_number2);
		panel.add(label_name3);
		panel.add(label_number3);
		panel.add(label_name4);
		panel.add(label_number4);
		panel.add(label_name5);
		panel.add(label_number5);
		panel.add(label_name6);
		panel.add(label_number6);
		panel.add(label_name7);
		panel.add(label_number7);
		panel.add(label_name8);
		panel.add(label_number8);
		panel.add(label_name9);
		panel.add(label_number9);
		panel.add(label_name10);
		panel.add(label_number10);
		
		panel.add(button1);
		
		setSize(450, 350);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//버튼 이벤트 발생 시
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Management_customerlist.this.dispose();//Management_Customerlist를 닫아주고 
				new MainFrame();//MainFrame에 변수의 내용을 넘겨주기 
			}
		});
	}
}
