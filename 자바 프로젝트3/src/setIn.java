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

	//�¼� ���� 
	static String c[] = new String[10];
	
	//�ð� ���� 
	static Date today[] = new Date[10];
	
	//�մԺ� �̿� �ݾ� 
	static int money[] = new int[10];
	
	//���� 
	int select = 0;
	
	setIn(){
		
		JFrame f =new JFrame();
		
		f.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		            new MainFrame();
		        }
		});
		
		SimpleDateFormat time = new SimpleDateFormat("aa hh:mm");//�ð� �������� 
		
		f.setTitle("LaLaLa StudyRoom - setIn");
		
		JLabel label = new JLabel("�̸� : ");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 30));//�̸� label�� ���� ���� 
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		
		JTextField textfield = new JTextField(); //�̸� ���� ��
		
		JPanel panel = new JPanel(null);
		//10���� �¼��� ���� panel ����  
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
		
		//10���� �¼� ��ȣlabel���� �� �۾�ü ���� 
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
		
		//[����]button ���� 
		JButton button = new JButton("����");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		
		label.setBounds(130, 40, 200, 80); //(�̸�:)�� ��ġ ����  
		textfield.setBounds(220, 60, 200, 40);// �̸� ���� �� ��ġ ���� 
		//10�� �¼��� ���� panel ��ġ ���� 
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
		//10�� �¼��� panel�� ���� ȸ������ �⺻ ���� 
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
		//10�� �¼� ��ȣ label ��ġ ���� 
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
		//���� ��ư ��ġ ���� 
		button.setBounds(525, 500, 140, 30);
		
		panel.add(label);//(�̸�: ) panel�� �ٿ��ֱ� 
		panel.add(textfield);//�̸� ���� �� pael�� �ٿ��ֱ� 
		//10�� �¼��� ���� panel�� �⺻ panel�� �޾��ֱ� 
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
		//�¼� ��ȣ label�� �ش�Ǵ� �¼�panel�� ���� �ٿ��ֱ�   
		panel1.add(label1);//1�� �¼���ȣ�� 1�� panel�� �ٿ��ֱ�
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		panel5.add(label5);
		panel6.add(label6);
		panel7.add(label7);
		panel8.add(label8);
		panel9.add(label9);
		panel10.add(label10);
		//�����ư�� panel�� �ٿ��ֱ� 
		panel.add(button);
		
		//�⺻ panel�� frame�� �ٿ��ֱ� 
		f.add(panel);
		
		f.setSize(1200, 600);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		//�¼� ���ý� �¼��� panel�� ��� �� ���� (10�¼��� ���� ���) 
		if(c[0] != null)//���� 1�� �¼��� ������ �ƴϸ�(=���õǾ�����)
		{
			panel1.setBackground(Color.green);//1�� �¼��� ������ �ʷϻ����� �ٲ��ֱ�
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
		
		//���� ��ư ������ �� �߻��ϴ� �̺�Ʈ 
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				for (int a = 0; a <= 9; a++)
				{
					if(select == a+1)
					{
						c[a] = textfield.getText();
						today[a] = new Date();//���� ����ð��� today�� ����
						money[a] = 100;//money�� 100�� �⺻��� û��
						new setIn_popup_1(c[a], Integer.toString(a+1), time.format(today[a]));
					}
				}
				
				if(select == 1)//���� 1���� �����ߴٸ�...
				{
					panel1.setBackground(Color.green);//1�� �¼� panel�� ������ �ʷ����� 
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
		
		//1�� �¼��� ���� �̺�Ʈ �߻� 
		panel1.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(c[0] == null)//1�� �¼��� ���õǾ� ���� ���� ���¿��� 
				{
					select = 1;//1���¼��� �����ϸ�
					panel1.setBackground(Color.yellow);//1�� �¼� ������ ��������� �ٲ۴�. 
					
					Color color = panel1.getBackground();
					if(color == panel2.getBackground())//�ٵ�.. 2�� �¼��� ���� ������ ���ٸ�...
					{
						panel2.setBackground(Color.gray);//2�� �¼��� ���� ȸ������ �ٲ��ش�.( �¼��� �ϳ��� ������ �� �����ϱ�)
					}
					else if(color == panel3.getBackground())//���������� 3�� �¼� ���ý� 
					{
						panel3.setBackground(Color.gray);//3�� �¼��� ���� ȸ������ �ٲ��ش�. 
					}
					else if(color == panel4.getBackground())//���� ��츦 10�� �¼����� �ݺ� ���ش�. 
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
					new setIn_popup_2();//�̹� ��� ���� �¼��� �������� ��� '���� ���� â' ���� 
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
		
		//2�� �¼��� ���� �̺�Ʈ �߻� 
		panel2.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(c[1] == null)//2�� �¼��� ������ ���¿��� 
				{
					select = 2;//2�� �¼��� �����ϸ�
					panel2.setBackground(Color.yellow);//2�� �¼��� ������ ��������� �ٲ��ش�. 
					
					Color color = panel2.getBackground();
					if(color == panel1.getBackground())//���� 2���¼��� ������ 1�� �¼��� ������ ���ٸ�
					{
						panel1.setBackground(Color.gray);//1�� �¼��� ������ ȸ������ �ٲ��ش�. 
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
		
		//3�� �¼��� ���� �̺�Ʈ �߻� 
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
		
		//4�� �¼��� ���� �̺�Ʈ �߻� 
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
		
		//5�� �¼��� ���� �̺�Ʈ �߻� 
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
		
		//6�� �¼��� ���� �̺�Ʈ �߻� 
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
		
		//7�� �¼��� ���� �̺�Ʈ �߻� 
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
		
		//8�� �¼��� ���� �̺�Ʈ �߻� 
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
		
		//9�� �¼��� ���� �̺�Ʈ �߻� 
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
		
		//10�� �¼��� ���� �̺�Ʈ �߻� 
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
 

	

 

