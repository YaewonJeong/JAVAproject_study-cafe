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
	//����
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
		
		//�⺻ panel���� 
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
		
		//10���� �¼���ȣ�� ���� label���� 
		JLabel label1 = new JLabel("1");//�¼���ȣ 1
		label1.setFont(new Font(label1.getFont().getName(), Font.ITALIC, 30));//���ڿ� ���� ���� 
		label1.setForeground(Color.black);//���� ���� ���� ���� 
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
		
		//���� ��ư ���� 
		JButton button = new JButton("����");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		f.add(panel);//�⺻ panel�� frame�� �ٿ��ֱ� 
		
		//�¼��� ���� panel ��ġ ���� 
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
		//�¼��� ���� panel�� �⺻ ���� ����
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
		//�¼� ��ȣ�� ���� ��ġ ���� 
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
		
		//10���� �¼� panel�� �⺻ panel�� �ٿ��ֱ�  
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
		//������ �¼���ȣ�� �ش�Ǵ� �¼� panel�� �ٿ��ֱ� 
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
		//���� ��ư�� �⺻ panel�� �ٿ��ֱ� 
		panel.add(button);
		
		f.setSize(1200, 600);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		//�¼� ���ý� �¼��� panel�� ��� �� ���� (10�¼��� ���� ���) 
		if(setIn.c[0] != null)//���� 1�� �¼��� ������ �ƴϸ�(=���õǾ�����)
		{
			panel1.setBackground(Color.green);//1�� �¼��� ������ �ʷϻ����� �ٲ��ֱ�
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
		
		//���� ��ư�� ���� �̺�Ʈ �߻� �� 
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
						
						//�ð� ��� 
						long diff = t1.getTime() - t2.getTime();
						long sec = diff / 1000;
						
						//�̿� �ݾ� ��� 
						setIn.money[a] = Long.valueOf((sec/60) * 100 + 100).intValue();
						
						new setOut_popup_1(setIn.c[a], Integer.toString(a+1), time.format(setIn.today[a]), setIn.money[a]);
						
						setIn.c[a] = null;
						
						break;
					}
				}
				
				//10���� �¼��� ���� �̺�Ʈ �߻��� ���� ��� �����  
				if(select == 1)//1���� ���õǾ��ٸ�
				{
					panel1.setBackground(Color.gray);//panel�� �⺻ ���� ȸ������ �ٲ��ش�. 
				}
				else if(select == 2)//2�� �¼��� ���õǾ��ٸ� 
				{
					panel2.setBackground(Color.gray);//�⺻ ������ ȸ������ �ٲ۴�. 
				} 
				else if(select == 3)//3�� �¼� ���ý� 
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
		
		//1�� �¼��� ���� panel�̺�Ʈ �߻� �� 
		panel1.addMouseListener((MouseListener) new MouseListener() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				if(setIn.c[0] == null)//���� �¼��� �����̶��
				{
					new setOut_popup_2();//���� ���� â ȣ�� 
				}
				else//c1�� ������ �ƴ϶�� 
				{
					select = 1;//1�� ���� 
					panel1.setBackground(Color.yellow);//1�� �¼� panel�� ������ ��������� 
					
					Color color = panel1.getBackground();
					if(color == panel2.getBackground())//���� panel1�� ������ panel2�� ������ ���ٸ�...
					{
						panel2.setBackground(Color.green);//panel2�� ������ �ʷϻ�����
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
		//2�� �¼��� ���� panel�̺�Ʈ �߻� �� 
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
		//3�� �¼��� ���� panel�̺�Ʈ �߻� �� 
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
		//4�� �¼��� ���� panel�̺�Ʈ �߻� �� 
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
		//5�� �¼��� ���� panel�̺�Ʈ �߻� �� 
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
		//6�� �¼��� ���� panel�̺�Ʈ �߻� �� 
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
		//7�� �¼��� ���� panel�̺�Ʈ �߻� �� 
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
		//8�� �¼��� ���� panel�̺�Ʈ �߻� �� 
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
		//9�� �¼��� ���� panel�̺�Ʈ �߻� �� 
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
		//10�� �¼��� ���� panel�̺�Ʈ �߻� �� 
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
