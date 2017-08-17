package test1;

import java.awt.Container;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View implements ActionListener {
	JFrame frame = new JFrame("�ᰬ��-Example");// ��ܲ���  
    JPanel jPanel = new JPanel();// ѡ�����  
    Container con = new Container();//  
    JLabel label1 = new JLabel("�ļ�Ŀ¼");  
    JLabel label2 = new JLabel("ѡ���ļ�");  
    JTextField text1 = new JTextField();// TextField Ŀ¼��·��  
    JTextField text2 = new JTextField();// �ļ���·��  
    JButton button1 = new JButton("...");// ѡ��  
    JButton button2 = new JButton("...");// ѡ��  
    JFileChooser jfc = new JFileChooser();// �ļ�ѡ����  
    JButton button3 = new JButton("ȷ��");//  
	
	View(){
		jfc.setCurrentDirectory(new File("d://"));// �ļ�ѡ�����ĳ�ʼĿ¼��Ϊd��  
        
        double lx = Toolkit.getDefaultToolkit().getScreenSize().getWidth();  
          
        double ly = Toolkit.getDefaultToolkit().getScreenSize().getHeight();  
          
        frame.setLocation(new Point((int) (lx / 2) - 150, (int) (ly / 2) - 150));// �趨���ڳ���λ��
              
        frame.setSize(400, 350);// �趨���ڴ�С  
        frame.setVisible(true);// ���ڿɼ�  
        frame.setAlwaysOnTop(true);  //����������������
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ʹ�ܹرմ��ڣ���������  
        frame.add(con);
        label1.setBounds(10, 10, 70, 20);  
        text1.setBounds(75, 10, 120, 20);  
        button1.setBounds(210, 10, 50, 20);  
        label2.setBounds(10, 35, 70, 20);  
        text2.setBounds(75, 35, 120, 20);  
        button2.setBounds(210, 35, 50, 20);  
        button3.setBounds(30, 60, 60, 20);  
        button1.addActionListener(this); // ����¼�����  
        button2.addActionListener(this); // ����¼�����  
        button3.addActionListener(this); // ����¼�����  
        con.add(label1);  
        con.add(text1);  
        con.add(button1);  
        con.add(label2);  
        con.add(text2);  
        con.add(button2);  
        con.add(button3);  
       
		
	}
	
	/**
	 * �¼������ķ���
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(button1)) {// �жϴ��������İ�ť���ĸ�  
            jfc.setFileSelectionMode(0);// �趨ֻ��ѡ���ļ�
            int state = jfc.showOpenDialog(null);// �˾��Ǵ��ļ�ѡ��������Ĵ������  
            if (state == 1) {  
                return;  
            } else {  
                File f = jfc.getSelectedFile();// fΪѡ�񵽵�Ŀ¼ 
                System.out.println(f.getAbsolutePath());
                text1.setText(f.getAbsolutePath());  
            }  
        }  
        // �󶨵�ѡ���ļ��������ļ��¼�  
        if (e.getSource().equals(button2)) {  
            jfc.setFileSelectionMode(1);// �趨ֻ��ѡ���ļ���    
            int state = jfc.showOpenDialog(null);// �˾��Ǵ��ļ�ѡ��������Ĵ������  
            if (state == 1) {  
                return;// �����򷵻�  
            } else {  
                File f = jfc.getSelectedFile();// fΪѡ�񵽵��ļ�  
                text2.setText(f.getAbsolutePath()); 
                
            }  
        }  
        if (e.getSource().equals(button3)) {  
            // �����Ի�����Ըı�����Ĳ�������ÿ�����Լ�ȥ����ʱ��ܶ�  
            JOptionPane.showMessageDialog(null, "�����Ի����ʵ������ӭ��-�ᰬ�գ�", "��ʾ", 2);  
        }  

	}

	public static void main(String[] args) {
		View view = new View();
		/*JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton b = new JButton("��ť");
		panel.add(b);
		frame.add(panel);
		
		frame.setVisible(true);// ���ڿɼ�  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ʹ�ܹرմ��ڣ���������
        frame.setLocationRelativeTo(null); //���þ�����ʾ
        frame.setSize(200,200); //���ô�С
*/
	}

}
