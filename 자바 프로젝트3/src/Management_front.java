import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//������ �޴� �� ���� �¼� ���� ���� 
public class Management_front extends JFrame{
	Management_front(){
		setTitle("LaLaLa StudyRoom - front");
		
		JPanel panel = new JPanel(null);//�⺻ panel
		JPanel panel1 = new JPanel();//1�� �¼� panel ���� 
		JPanel panel2 = new JPanel();//2�� �¼� panel ����
		JPanel panel3 = new JPanel();//3�� �¼� panel ����
		JPanel panel4 = new JPanel();//4�� �¼� panel ����
		JPanel panel5 = new JPanel();//5�� �¼� panel ����
		JPanel panel6 = new JPanel();//6�� �¼� panel ����
		JPanel panel7 = new JPanel();//7�� �¼� panel ����
		JPanel panel8 = new JPanel();//8�� �¼� panel ����
		JPanel panel9 = new JPanel();//9�� �¼� panel ����
		JPanel panel10 = new JPanel();//10�� �¼� panel ����
		
		//10���� �¼��� ���� �¼���ȣ label���� �� ����ü, ���� ũ��, ���� ���� 
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
		
		//Ȯ�ι�ư ���� 
		JButton button = new JButton("Ȯ��");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		add(panel);
		
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
		//10�� �¼��� ���� panel�� �⺻ ���� ���� 
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
		//10�� �¼� ��ȣ ��ġ ���� 
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
		//��ư ��ġ ���� 
		button.setBounds(525, 500, 140, 30);
		
		//10�� �¼� panel�� �⺻panel�� �ٿ��ֱ� 
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
		//10���� �¼� ��ȣ���� �ش�Ǵ� �¼� panel�� �ٿ��ֱ� 
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
		panel.add(button);//button�� �⺻ panel�� �ٿ��ֱ� 
		
		setSize(1200, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		
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
		
		//��ư �̺�Ʈ �߻� ��
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Management_front.this.dispose();//Management_fromt �ݱ� 
				new MainFrame();
			}
		});
	}
}
