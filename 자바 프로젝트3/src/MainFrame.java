import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


//ù ��° ����ȭ�� 
public class MainFrame extends JFrame {
	
	static JFrame f;
	MainFrame(){
		
		f =new JFrame();
		f.setTitle("LaLaLa StudyRoom - �ڹ� ������Ʈ");
		
		JPanel panel = new JPanel(null);
		JLabel label = new JLabel("LaLaLa StudyRoom");
		label.setFont(new Font(label.getFont().getName(), Font.ITALIC, 30));//�� label�� ���� ����(1)  
		label.setForeground(Color.MAGENTA); // ���ڸ� MAGENTA���� �ٲ���, �� label�� ���� ����(2)  
		
		//��ư ���� 
		JButton button1 = new JButton("����");
		JButton button2 = new JButton("����");
		JButton button3 = new JButton("������");
		
		//�󺧰� ��ư�� ���� ��ġ ���� 
		label.setBounds(110, 40, 500, 80); 
		button1.setBounds(170, 140, 140, 30);
		button2.setBounds(170, 200, 140, 30);
		button3.setBounds(170, 260, 140, 30);
	 
		f.add(panel);//frame�� panel�޾��ֱ� 
		panel.add(label);//panel�� label�޾��ֱ� 
		panel.add(button1);//panel�� button �޾��ֱ� 
		panel.add(button2);
		panel.add(button3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ũ�� ���� �Ұ�
		
		f.setSize(500, 400);
		f.setLocationRelativeTo(null);
		f.setVisible(true);

		// ���� ��ư �̺�Ʈ ������
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				MainFrame.this.f.dispose();//���� �̺�Ʈ �߻� �� mainFrame�� �ݾ��ֱ� 
				new setIn();
				
			}
		});

		// ���� ��ư �̺�Ʈ ������
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MainFrame.this.f.dispose();//���� �̺�Ʈ �߻� �� mainFrame�� �ݾ��ֱ� 
				new setOut(); 		
			}
		});

		// ������ ��ư �̺�Ʈ ������
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MainFrame.this.f.dispose();//������ �̺�Ʈ �߻� �� mainFrame�� �ݾ��ֱ� 
				new Management();
			}
		});

	}

	public static void main(String args[]) {
		new MainFrame();
		// new movie().show();
	}
}

