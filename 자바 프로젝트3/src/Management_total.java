import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//������ �޴� �� �� ���� Ȯ���ϱ� 
public class Management_total extends JFrame{
	Management_total() {
		
		setTitle("LaLaLa StudyRoom - total");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		add(panel);
		
		int total = 0;
		//�� ���� ����=1�� ���忡 ���� ���� + 2�� ���� + ...... + 9�� ���忡 ���� ���� + 10�� ���忡 ���� ����
		for(int a = 0; a <= 9; a++)
		{
			total = total + setIn.money[a];
		}
		
		JLabel label = new JLabel("��������� �� ������");//label ���� 
		JLabel label2 = new JLabel(Integer.toString(total) +"�� �Դϴ�.");//�ݾ��� �˷��ִ� label ���� 
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));//label�� ���� ���� 
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));//label2�� ���� ���� 
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		JButton button1 = new JButton("OK");//ok��ư ���� 
		
		//label���� ��ġ ������ ok��ư ��ġ ���� 
		label.setBounds(50, 10, 200, 80); 
		label2.setBounds(50, 30, 200, 80);
		button1.setBounds(75, 100, 80, 30);
		
		//�⺻ panel�� label�� label2, button1 �޾��ֱ� 
		panel.add(label);
		panel.add(label2);
		panel.add(button1);
		
		setSize(250, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//ok��ư �̺�Ʈ �߻� �� 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Management_total.this.dispose();//Management_total â �ݾ��ֱ� 
				new MainFrame();

			}
		});
	}
}
