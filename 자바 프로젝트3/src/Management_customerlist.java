import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//������ �޴� �� �մ� ��Ȳ���� 
public class Management_customerlist extends JFrame{
	
	int count[] = new int[10];
	int count_ = 0;
	
	Management_customerlist(){
		
		JLabel label_name1 = new JLabel("");//1�� �̸� label
		JLabel label_number1 = new JLabel("");//1�� �¼� label 
		JLabel label_name2 = new JLabel("");//2�� �̸� label
		JLabel label_number2 = new JLabel("");//2�� �¼� label 
		JLabel label_name3 = new JLabel("");//3�� �̸� label
		JLabel label_number3 = new JLabel("");//3�� �¼� label 
		JLabel label_name4 = new JLabel("");//4�� �̸� label
		JLabel label_number4 = new JLabel("");//4�� �¼� label 
		JLabel label_name5 = new JLabel("");//5�� �̸� label
		JLabel label_number5 = new JLabel("");//5�� �¼� label 
		JLabel label_name6 = new JLabel("");//6�� �̸� label
		JLabel label_number6 = new JLabel("");//6�� �¼� label 
		JLabel label_name7 = new JLabel("");//7�� �̸� label
		JLabel label_number7 = new JLabel("");//7�� �¼� label 
		JLabel label_name8 = new JLabel("");//8�� �̸� label
		JLabel label_number8 = new JLabel("");//8�� �¼� label 
		JLabel label_name9 = new JLabel("");//9�� �̸� label
		JLabel label_number9 = new JLabel("");//9�� �¼� label 
		JLabel label_name10 = new JLabel("");//10�� �̸� label
		JLabel label_number10 = new JLabel("");//10�� �¼� label 
		
		
		for (int a = 0; a <= 9; a++)
		{
			if(setIn.c[a] != null)
			{
				count_ = count_ + 1;
				count[a] = 1;
			}
		}
		
		
		//���� �մ��� ���� 1���ε�...
		if(count_ == 1)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number1.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
				}
			}
		}
		else if(count_ == 2)
		{
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name1.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number1.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number2.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
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
					label_name1.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number1.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number2.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number3.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
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
					label_name1.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number1.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number2.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number3.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number4.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
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
					label_name1.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number1.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number2.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number3.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number4.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number5.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
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
					label_name1.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number1.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number2.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number3.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number4.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number5.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name6.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number6.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
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
					label_name1.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number1.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number2.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number3.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number4.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number5.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name6.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number6.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name7.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number7.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
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
					label_name1.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number1.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number2.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number3.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number4.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number5.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name6.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number6.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name7.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number7.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name8.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number8.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
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
					label_name1.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number1.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number2.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number3.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number4.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number5.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name6.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number6.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name7.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number7.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name8.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number8.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name9.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number9.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
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
					label_name1.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number1.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name2.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number2.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name3.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number3.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name4.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number4.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name5.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number5.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name6.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number6.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name7.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number7.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name8.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number8.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name9.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number9.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
			
			for (int a = 0; a <= 9; a++)
			{
				if(count[a] == 1)
				{
					label_name10.setText(setIn.c[a]);//�̸� ���� �̸� ���̰� 
					label_number10.setText(Integer.toString(a+1));//�¼���ȣ ���� �¼� ��ȣ ���̰�  
					count[a] = 0;
					break;
				}
			}
		}
		
		setTitle("LaLaLa StudyRoom - customerlist");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		add(panel);
		
		JLabel label = new JLabel("�̸�");
		JLabel label2 = new JLabel("�¼�");
		JLabel label3 = new JLabel("____________________________");
		
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));//�̸� �󺧿� ���� ���� 
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));//�¼� �󺧿� ���� ���� 
		label2.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label3.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));//���� �� �󺧿� ���� ���� 
		label3.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		
		JButton button1 = new JButton("OK");//ok��ư ���� 
		
		label.setBounds(120, 0, 200, 80);//�̸� �� ��ġ ����
		label2.setBounds(270, 0, 200, 80);//�¼� �� ��ġ ����
		label3.setBounds(100, 5, 400, 80);//���� �� �� ��ġ ���� 
		button1.setBounds(170, 270, 80, 30);//��ư ��ġ ���� 
		
		//���� �̿����� �̸��󺧰� �¼��� ��ġ ���� 
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
		
		//�⺻ panel�� label �ٿ��ֱ� 
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		
		//���� �մԿ� ���� �̸��󺧰� �¼����� �⺻ panel�� �ٿ��ֱ� 
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
		
		//��ư �̺�Ʈ �߻� ��
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Management_customerlist.this.dispose();//Management_Customerlist�� �ݾ��ְ� 
				new MainFrame();//MainFrame�� ������ ������ �Ѱ��ֱ� 
			}
		});
	}
}
