import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Management extends JFrame{
	
	Management(){
		setTitle("LaLaLa StudyRoom - Management");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		add(panel);
		
		JLabel label = new JLabel("������ �޴�");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 30));
		label.setForeground(Color.MAGENTA); // ���ڸ� MAGENTA���� �ٲ���
		JButton button1 = new JButton("�����¼� ���º���");
		JButton button2 = new JButton("��ü�¼� �����ϱ�");
		JButton button3 = new JButton("�մ���Ȳ ����");
		JButton button4 = new JButton("�Ѽ��� Ȯ���ϱ�");

		label.setBounds(160, 40, 200, 80); 
		button1.setBounds(170, 130, 140, 30);
		button2.setBounds(170, 175, 140, 30);
		button3.setBounds(170, 220, 140, 30);
		button4.setBounds(170, 265, 140, 30);
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		setSize(500, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		
				// ���� ��ư �̺�Ʈ ������
				button1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						Management.this.dispose();
						new Management_front();
					}
				});

				// ���� ��ư �̺�Ʈ ������
				button2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Management.this.dispose();
						new Management_reset();
					}
				});

				// ������ ��ư �̺�Ʈ ������
				button3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Management.this.dispose();
						new Management_customerlist();
					}
				});
				
				// ������ ��ư �̺�Ʈ ������
				button4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Management.this.dispose();
						new Management_total();
					}
				});
	}
}
