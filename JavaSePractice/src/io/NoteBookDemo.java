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
/*步骤一：创建类NoteBookDemo*/
public class NoteBookDemo extends JFrame implements ActionListener {
/*步骤二，添加NoteBookDemo类的成员，如菜单相关组件、文本区、打开或保存操作时用到的文件名、剪贴板、文件对话框。*/ 
	//菜单栏、菜单和菜单项
	JMenuBar menuBar = new JMenuBar();
	  JMenu file = new JMenu("文件"),
	       edit = new JMenu("编辑");    
	  JMenuItem[] menuItem ={
	   new JMenuItem("新建"),
	   new JMenuItem("打开"),
	   new JMenuItem("保存"),
	   new JMenuItem("退出"),
	   new JMenuItem("全选"),
	   new JMenuItem("复制"),
	   new JMenuItem("剪切"),
	   new JMenuItem("粘贴"),
	   };
JTextArea textArea = new JTextArea();//记事本文本区
  String fileName = "NoName";//打开或保存时用到的文件名
  Toolkit toolKit = Toolkit.getDefaultToolkit();
  Clipboard clipboard = toolKit.getSystemClipboard();//剪贴板对象
  
  //打开和保存文件对话框对象
  private JFileChooser openFileDialog = new JFileChooser();
  private JFileChooser saveFileDialog = new JFileChooser();

/*步骤三，添加NoteBookDemo类的无参构造方法，在无参构造方法中进行界面布局和事件处理的注册监听。*/
  public NoteBookDemo() {
	  // 设置窗体的title、字体、背景色、大小等属性
	  setTitle("Java记事本");
	  setFont(new Font("Times New Roman",Font.PLAIN,15));
	  setBackground(Color.white);
	  setSize(500,500);
	  //添加菜单栏和菜单
	  setJMenuBar(menuBar);
	  menuBar.add(file);
	  menuBar.add(edit);
	  //添加菜单项
	  for(int i=0;i<4;i++)
	  {
	   file.add(menuItem[i]);
	   edit.add(menuItem[i+4]);
	   }
	  //添加文本区
	     this.getContentPane().add(textArea);
	 //设置关闭窗体时释放窗体资源并退出系统   
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 //每个菜单项都是事件源，注册监听，由本类对象监听
	     for(int i=0;i<menuItem.length;i++)
	     {
	      menuItem[i].addActionListener(this);
	      }
	 }

       /*步骤四，创建openFile和writeFile方法，完成文件的打开和保存。*/
//读文件（打开）
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
  
  //写文件（保存）
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
		//步骤五：完成actionPerformed方法，对菜单项产生的事件进行响应，完成新建、打开、保存、退出四项文件操作功能和全选、复制、剪切、粘帖四项编辑功能。
		Object eventSource = e.getSource();
	    if(eventSource == menuItem[0])//菜单项：新建
	  {
	   textArea.setText("");
	   }
	   else if(eventSource == menuItem[1])//菜单项：打开
	  {
	   openFileDialog.showOpenDialog(this);
	   fileName = openFileDialog.getSelectedFile().getPath();
	   if(fileName != null)
	   {
	    openFile(fileName);
	    }
	  }
	    else if(eventSource ==menuItem[2])//菜单项：保存
	  {
	   saveFileDialog.showSaveDialog(this);
	   fileName = saveFileDialog.getSelectedFile().getPath();
	   if(fileName !=null)
	   {
	    writeFile(fileName);
	    }
	   }
	    else if(eventSource==menuItem[3])//菜单项：退出
	  {
	   System.exit(0);
	   }
	    else if(eventSource == menuItem[4])//菜单项：全选
	  {
	   textArea.selectAll();
	   }
	     else if(eventSource == menuItem[5])//菜单项：复制
	     {
	      String text = textArea.getSelectedText();
	      StringSelection selection= new StringSelection(text);
	      clipboard.setContents(selection,null);
	      }
	     else if(eventSource == menuItem[6])//菜单项：剪切
	  {
	   String text = textArea.getSelectedText();
	   StringSelection selection = new StringSelection(text);
	   clipboard.setContents(selection,null);
	   textArea.replaceRange("",textArea.getSelectionStart(),
	       textArea.getSelectionEnd());
	  
	  }
	 else if(eventSource == menuItem[7])//菜单项：粘贴
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
		// 步骤六：完成main方法，创建窗体NoteBookDemo的对象，并显示运行。
		NoteBookDemo noteBook = new NoteBookDemo();
		noteBook.setVisible(true);

			}
}

