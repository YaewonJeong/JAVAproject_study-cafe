import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class setOut_popup_2 extends JFrame{
	setOut_popup_2() {
		setTitle("LaLaLa StudyRoom - Management");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		add(panel);
		
		JLabel label = new JLabel("����Ͻ� �¼��� �ƴմϴ�.");
		JLabel label2 = new JLabel("�ٽ� �����ϼ���!!!");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		JButton button1 = new JButton("OK");
		
		//label�� ���� ��ġ ���� 
		label.setBounds(40, 50, 350, 80); 
		label2.setBounds(40, 90, 250, 80);
		button1.setBounds(150, 180, 80, 30);//��ư�� ���� ��ġ ���� 
		
		//label�� panel�� �ٿ��ֱ� 
		panel.add(label);
		panel.add(label2);
		//button�� panel�� �ٿ��ֱ� 
		panel.add(button1);
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//ok��ư �̺�Ʈ �߻� �� 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setOut_popup_2.this.dispose();//setOut_popup_2â �ݾ��ֱ� 
			}
		});
	}
}
