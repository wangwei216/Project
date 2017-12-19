package io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.awt.Font;
import java.awt.Color;
import java.io.*;
/*����һ��������NoteBookDemo*/
public class NoteBookDemo extends JFrame implements ActionListener {
/*����������NoteBookDemo��ĳ�Ա����˵����������ı������򿪻򱣴����ʱ�õ����ļ����������塢�ļ��Ի���*/ 
	//�˵������˵��Ͳ˵���
	JMenuBar menuBar = new JMenuBar();
	  JMenu file = new JMenu("�ļ�"),
	       edit = new JMenu("�༭");    
	  JMenuItem[] menuItem ={
	   new JMenuItem("�½�"),
	   new JMenuItem("��"),
	   new JMenuItem("����"),
	   new JMenuItem("�˳�"),
	   new JMenuItem("ȫѡ"),
	   new JMenuItem("����"),
	   new JMenuItem("����"),
	   new JMenuItem("ճ��"),
	   };
JTextArea textArea = new JTextArea();//���±��ı���
  String fileName = "NoName";//�򿪻򱣴�ʱ�õ����ļ���
  Toolkit toolKit = Toolkit.getDefaultToolkit();
  Clipboard clipboard = toolKit.getSystemClipboard();//���������
  
  //�򿪺ͱ����ļ��Ի������
  private JFileChooser openFileDialog = new JFileChooser();
  private JFileChooser saveFileDialog = new JFileChooser();

/*�����������NoteBookDemo����޲ι��췽�������޲ι��췽���н��н��沼�ֺ��¼������ע�������*/
  public NoteBookDemo() {
	  // ���ô����title�����塢����ɫ����С������
	  setTitle("Java���±�");
	  setFont(new Font("Times New Roman",Font.PLAIN,15));
	  setBackground(Color.white);
	  setSize(500,500);
	  //��Ӳ˵����Ͳ˵�
	  setJMenuBar(menuBar);
	  menuBar.add(file);
	  menuBar.add(edit);
	  //��Ӳ˵���
	  for(int i=0;i<4;i++)
	  {
	   file.add(menuItem[i]);
	   edit.add(menuItem[i+4]);
	   }
	  //����ı���
	     this.getContentPane().add(textArea);
	 //���ùرմ���ʱ�ͷŴ�����Դ���˳�ϵͳ   
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 //ÿ���˵�����¼�Դ��ע��������ɱ���������
	     for(int i=0;i<menuItem.length;i++)
	     {
	      menuItem[i].addActionListener(this);
	      }
	 }

       /*�����ģ�����openFile��writeFile����������ļ��Ĵ򿪺ͱ��档*/
//���ļ����򿪣�
  public void openFile(String fileName){
   try{
    File file = new File(fileName);
    FileReader readIn = new FileReader(file);
    int size = (int)file.length();
    int charsRead = 0;
    char[] content = new char[size];
    while(readIn.ready())
       charsRead += readIn.read(content,charsRead,size-charsRead);
    readIn.close();
    textArea.setText(new String(content,0,charsRead));
    }catch(Exception e)
    {
     System.out.println("Error opening file!");
     }
   } 
  
  //д�ļ������棩
  public void writeFile(String fileName){
   try{
    File file = new File(fileName);
    FileWriter write = new FileWriter(file);
    write.write(textArea.getText());
    write.close();
    }catch(Exception e){
     System.out.println("Error closing file!");
     }
   }




	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//�����壺���actionPerformed�������Բ˵���������¼�������Ӧ������½����򿪡����桢�˳������ļ��������ܺ�ȫѡ�����ơ����С�ճ������༭���ܡ�
		Object eventSource = e.getSource();
	    if(eventSource == menuItem[0])//�˵���½�
	  {
	   textArea.setText("");
	   }
	   else if(eventSource == menuItem[1])//�˵����
	  {
	   openFileDialog.showOpenDialog(this);
	   fileName = openFileDialog.getSelectedFile().getPath();
	   if(fileName != null)
	   {
	    openFile(fileName);
	    }
	  }
	    else if(eventSource ==menuItem[2])//�˵������
	  {
	   saveFileDialog.showSaveDialog(this);
	   fileName = saveFileDialog.getSelectedFile().getPath();
	   if(fileName !=null)
	   {
	    writeFile(fileName);
	    }
	   }
	    else if(eventSource==menuItem[3])//�˵���˳�
	  {
	   System.exit(0);
	   }
	    else if(eventSource == menuItem[4])//�˵��ȫѡ
	  {
	   textArea.selectAll();
	   }
	     else if(eventSource == menuItem[5])//�˵������
	     {
	      String text = textArea.getSelectedText();
	      StringSelection selection= new StringSelection(text);
	      clipboard.setContents(selection,null);
	      }
	     else if(eventSource == menuItem[6])//�˵������
	  {
	   String text = textArea.getSelectedText();
	   StringSelection selection = new StringSelection(text);
	   clipboard.setContents(selection,null);
	   textArea.replaceRange("",textArea.getSelectionStart(),
	       textArea.getSelectionEnd());
	  
	  }
	 else if(eventSource == menuItem[7])//�˵��ճ��
	  {
	      Transferable contents = clipboard.getContents(this);
	      if(contents==null)
	      return;
	      String text;
	      text="";
	      try{
	       text = (String)contents.getTransferData(DataFlavor.stringFlavor);
	       
	       }
	catch(UnsupportedFlavorException ex){ }
		    catch(IOException ex){ }
	      textArea.replaceRange(text,
	         textArea.getSelectionStart(),textArea.getSelectionEnd());  
	      }

		}
	public static void main(String[] args) {
		// �����������main��������������NoteBookDemo�Ķ��󣬲���ʾ���С�
		NoteBookDemo noteBook = new NoteBookDemo();
		noteBook.setVisible(true);

			}
}

