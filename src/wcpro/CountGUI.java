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
 * ���ܣ�ͼ�ν���
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
        this.setTitle("ѡ���ļ�����");  
        FlowLayout layout = new FlowLayout();// ����  
        JLabel label = new JLabel("��ѡ���ļ���");// ��ǩ  
        textField = new JTextField(30);// �ı���  
        btn = new JButton("���");// ť1  
        btn2=new JButton("ȷ��");
        // ���ò���  
        layout.setAlignment(FlowLayout.LEFT);// �����  
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
        chooser.showDialog(new JLabel(),"ѡ��");  
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
			JOptionPane.showMessageDialog(null, "���гɹ�");
    	}
    }  
}  