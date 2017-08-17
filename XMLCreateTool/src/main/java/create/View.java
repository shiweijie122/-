package create;

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

import execute.ReadTxt;
import execute.WriteXml;

public class View implements ActionListener {
	JFrame frame = new JFrame("XML生成工具");// 框架布局  
    JPanel jPanel = new JPanel();// 选项卡布局  
    Container con = new Container();//  
    JLabel label1 = new JLabel("导入文件");  
    JLabel label2 = new JLabel("导出目录");  
    JTextField text1 = new JTextField();// TextField 目录的路径  
    JTextField text2 = new JTextField();// 文件的路径  
    JButton button1 = new JButton("...");// 选择  
    JButton button2 = new JButton("...");// 选择  
    JFileChooser jfc = new JFileChooser();// 文件选择器  
    JButton button3 = new JButton("开始转换");// 
    ReadTxt rt = new ReadTxt();
	WriteXml wx = new WriteXml();
	
	View(){
		jfc.setCurrentDirectory(new File("e://"));// 文件选择器的初始目录定为d盘  
        
        double lx = Toolkit.getDefaultToolkit().getScreenSize().getWidth();  
          
        double ly = Toolkit.getDefaultToolkit().getScreenSize().getHeight();  
          
        frame.setLocation(new Point((int) (lx / 2) - 150, (int) (ly / 2) - 150));// 设定窗口出现位置
              
        frame.setSize(360, 250);// 设定窗口大小  
        frame.setVisible(true);// 窗口可见  
        //frame.setAlwaysOnTop(true);  //设置总是在最上面
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 使能关闭窗口，结束程序  
        frame.add(con);
        label1.setBounds(40, 20, 70, 20);  
        text1.setBounds(105, 20, 120, 20);  
        button1.setBounds(240, 20, 50, 20);  
        label2.setBounds(40, 55, 70, 20);  
        text2.setBounds(105, 55, 120, 20);  
        button2.setBounds(240, 55, 50, 20);  
        button3.setBounds(105, 90, 120, 40);  
        button1.addActionListener(this); // 添加事件处理  
        button2.addActionListener(this); // 添加事件处理  
        button3.addActionListener(this); // 添加事件处理  
        con.add(label1);  
        con.add(text1);  
        con.add(button1);  
        con.add(label2);  
        con.add(text2);  
        con.add(button2);  
        con.add(button3);  
       
		
	}
	
	/**
	 * 事件监听的方法
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(button1)) {// 判断触发方法的按钮是哪个  
            jfc.setFileSelectionMode(0);// 设定只能选择到文件
            int state = jfc.showOpenDialog(null);// 此句是打开文件选择器界面的触发语句  
            if (state == 1) {  
                return;  
            } else {  
                File f = jfc.getSelectedFile();// f为选择到的文件 
                ReadTxt.inPath=f.getAbsolutePath();
               // System.out.println(f.getAbsolutePath());
                text1.setText(f.getAbsolutePath());  
            }  
        }  
        // 绑定到选择文件，先择文件事件  
        if (e.getSource().equals(button2)) {  
            jfc.setFileSelectionMode(1);// 设定只能选择到文件夹    
            int state = jfc.showOpenDialog(null);// 此句是打开文件选择器界面的触发语句  
            if (state == 1) {  
                return;// 撤销则返回  
            } else {  
                File f = jfc.getSelectedFile();// f为选择到的目录
                WriteXml.outPath=f.getAbsolutePath();
               // System.out.println(f.getAbsolutePath());
                text2.setText(f.getAbsolutePath()); 
                
            }  
        }  
        if (e.getSource().equals(button3)) { 
        	rt.read();
        	wx.write();
            // 弹出对话框可以改变里面的参数具体得靠大家自己去看，时间很短  
            JOptionPane.showMessageDialog(null, "文件转换完成!", "提示", 2);  
        }  

	}

	public static void main(String[] args) {
		View view = new View();
		
		/*JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton b = new JButton("按钮");
		panel.add(b);
		frame.add(panel);
		
		frame.setVisible(true);// 窗口可见  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 使能关闭窗口，结束程序
        frame.setLocationRelativeTo(null); //设置居中显示
        frame.setSize(200,200); //设置大小
*/
	}

}
