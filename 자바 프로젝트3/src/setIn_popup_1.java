import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class setIn_popup_1 extends JFrame{
	
	String name = "", number = "", time = "";
	setIn_popup_1(String name, String number, String time)
	{
		this.name = name; //�̸� 
		this.number = number; //�¼���ȣ
		this.time = time; //����ð� 
		
		setTitle("LaLaLa StudyRoom - Management");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		add(panel);
		
		JLabel label = new JLabel("�̸� : " + name);
		JLabel label2 = new JLabel("�¼���ȣ : " + number);
		JLabel label3 = new JLabel("����ð� : " + time);
		JLabel label4 = new JLabel("�¼��� ���õǾ����ϴ�.");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));//�̸��� ���� ���� 
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));//�¼���ȣ�� ���� ����
		label2.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label3.setFont(new Font(label.getFont().getName(), Font.ITALIC, 20));//����ð��� ���� ���� 
		label3.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label4.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));//������ ���� ���� 
		label4.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		JButton button1 = new JButton("OK");//ok��ư ���� 
		
		//label ��ġ ���� 
		label.setBounds(30, 0, 250, 80); 
		label2.setBounds(30, 40, 250, 80);
		label3.setBounds(30, 80, 250, 80); 
		label4.setBounds(30, 130, 400, 80);
		button1.setBounds(150, 200, 80, 30);//button ��ġ ���� 
		
		//label�� panel�� �޾��ֱ� 
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(button1);//[ok]��ư�� panel�� �޾��ֱ� 
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//[ok] button�� ���� �̺�Ʈ 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//ok��ư ������...
				// TODO Auto-generated method stub
				setIn_popup_1.this.dispose();//setIn_popup_1 â �ݱ�
			}
		});
	}
}
