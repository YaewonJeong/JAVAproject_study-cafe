import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//������ �޴� �� ��ü �¼� �����ϱ� 
public class Management_reset extends JFrame{
	Management_reset() {
		setTitle("LaLaLa StudyRoom - reset");
		JPanel panel = new JPanel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		add(panel);
		
		JLabel label = new JLabel("���� �Ǿ����ϴ�!!!");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 15));
		label.setForeground(Color.black); // ���ڸ� MAGENTA���� �ٲ���
		JButton button1 = new JButton("OK");
		
		label.setBounds(55, 20, 200, 80); 
		button1.setBounds(75, 100, 80, 30); 
		
		panel.add(label);
		panel.add(button1);
		
		setSize(250, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//���� ��ư �̺�Ʈ �߻� �� MainFrame�� �Ѱ��ִ� ���� ���� 
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				for(int a = 0; a <= 9; a++)
				{
					setIn.c[a] = null;
					setIn.today[a] = null;
					setIn.money[a] = 0;
				}
				
				Management_reset.this.dispose();
				new MainFrame();
			}
		});
	}
}
