import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class setIn_popup_2 extends JFrame{
	setIn_popup_2() {
		setTitle("LaLaLa StudyRoom - Management");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		add(panel);
		
		JLabel label = new JLabel("�̹� ������� �¼�,");
		JLabel label2 = new JLabel("�ٽ� �����ϼ���!!!");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));//label�� ���� ���� 
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		label2.setFont(new Font(label.getFont().getName(), Font.ITALIC, 25));//label2�� ���� ���� 
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		JButton button1 = new JButton("OK");//[ok]��ư ���� 
		
		//label�� ��ġ ���� 
		label.setBounds(80, 50, 250, 80); 
		label2.setBounds(80, 90, 250, 80);
		button1.setBounds(150, 180, 80, 30);//��ư ��ġ ���� 
		
		//label, button�� panel�� ���̱� 
		panel.add(label);
		panel.add(label2);
		panel.add(button1);
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//[ok] button�� ���� �̺�Ʈ 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//ok��ư ������...
				// TODO Auto-generated method stub
				setIn_popup_2.this.dispose();//setIn_popup_2â �ݱ�
			}
		});
	}
}
