package wcpro;

import java.awt.FlowLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.io.File;  
import java.io.IOException;
  
import javax.swing.JButton;  
import javax.swing.JFileChooser;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JOptionPane;
import javax.swing.JTextField;  
  
/**
 * 
 * @author xuhao
 * 功能：图形界面
 *
 */
public class CountGUI extends JFrame implements ActionListener  
{  
  
    private static final long serialVersionUID = 1L;  
    public String s = new String();
    JButton btn = null;  
    JButton btn2 =null;
    JTextField textField = null;  
  
    public CountGUI()  
    {  
        this.setTitle("选择文件窗口");  
        FlowLayout layout = new FlowLayout();// 布局  
        JLabel label = new JLabel("请选择文件：");// 标签  
        textField = new JTextField(30);// 文本域  
        btn = new JButton("浏览");// 钮1  
        btn2=new JButton("确认");
        // 设置布局  
        layout.setAlignment(FlowLayout.LEFT);// 左对齐  
        this.setLayout(layout);  
        this.setBounds(400, 200, 600, 70);  
        this.setVisible(true);  
        this.setResizable(false);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        btn.addActionListener(this);
        btn2.addActionListener(this);
        this.add(label);  
        this.add(textField);  
        this.add(btn);  
        this.add(btn2);
  
    }  
  
    
  
    @Override  
    public void actionPerformed(ActionEvent e)  
    {   
    	if(e.getSource()==btn){
        JFileChooser chooser = new JFileChooser();  
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);  
        chooser.showDialog(new JLabel(),"选择");  
        File file = chooser.getSelectedFile();  
        textField.setText(file.getAbsoluteFile().toString());
        s=file.getAbsoluteFile().toString();
        }
    	if(e.getSource()==btn2){
    		Count.countFile(s);
    		Output op=new Output(Count.slist, Count.fqc, Count.record);
    		try {
				op.out();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "运行成功");
    	}
    }  
}  