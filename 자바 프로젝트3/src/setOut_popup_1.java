import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class setOut_popup_1 extends JFrame{

	String name = "", number = "", time = "";
	setOut_popup_1(String name, String number, String time, int money)
	{
		this.name = name;//�̸� 
		this.number = number;//�¼���ȣ
		this.time = time;//���� �ð� 
		
		setTitle("LaLaLa StudyRoom - Management");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		add(panel);
		
		//label ���� 
		JLabel label = new JLabel("�̸� : " + name);
		JLabel label2 = new JLabel("�¼���ȣ : " + number);
		JLabel label3 = new JLabel("����ð� : " + time);
		JLabel label4 = new JLabel("�ݾ� : " + Integer.toString(money));
		JLabel label5 = new JLabel("����Ǿ����ϴ�.");
		//label�� ���� �۾�ü �� ũ��, ���� ����  
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));
		label2.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label3.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));
		label3.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label4.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));
		label4.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label5.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));
		label5.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		//[ok]��ư ���� 
		JButton button1 = new JButton("OK");
		
		//label�� ��ġ ���� 
		label.setBounds(30, 0, 250, 80); 
		label2.setBounds(30, 30, 250, 80);
		label3.setBounds(30, 60, 250, 80); 
		label4.setBounds(30, 90, 400, 80);
		label5.setBounds(30, 120, 400, 80);
		//button�� ���� ��ġ ���� 
		button1.setBounds(150, 200, 80, 30);
		
		//�̸�, �¼���ȣ, ����ð�, �ݾ�, ���强������ label�� panel�� �ٿ��ֱ� 
		panel.add(label); 
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(button1);//ok ��ư�� panel�� �ٿ��ֱ� 
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//ok��ư �̺�Ʈ �߻� �� 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setOut_popup_1.this.dispose();//setOut_popup_1 â �ݾ��ֱ� 
			}
		});
	}
}
