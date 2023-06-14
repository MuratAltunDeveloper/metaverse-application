package prolab23hocaver;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class erdiyagram extends JFrame{
   JPanel panel;
	Container konteynerContainer;
	
	erdiyagram() throws IOException{
		
		System.out.println("er diyagram construstor");
		
		
		konteynerContainer=getContentPane();//"C:\\Users\\murat\\Downloads\\a.drawio.png"
		konteynerContainer.setLayout(null);//C:\\Users\\murat\\Downloads\\Photokako-plane-39PyoaXhhm51Ojq4 (2).png
		//panel oluşturma
		panel=new JPanel();
		//"C:\\Users\\murat\\Downloads\\a.drawio (4) (1)_1000x800 (1).jpg"//en iyi"C:\\Users\\murat\\Downloads\\a.drawio (4) (1)_1050x800.jpg"
		BufferedImage resImage=ImageIO.read(new File("C:\\Users\\murat\\Downloads\\a.drawio (4) (1)_1050x800.jpg"));
		JLabel resimler=new JLabel(new ImageIcon(resImage));
		panel.add(resimler);
		panel.setBounds(0,0,1000,950);
		panel.setBackground(Color.cyan);
		System.out.println(resImage.getGraphics());
			System.out.println("başarılı ekleme oldu");
		konteynerContainer.add(panel);
		konteynerContainer.setBackground(Color.cyan);
		setSize(1200,1200);
		setVisible(true);
	}
	
	
	
	
	
public static void main(String[] args) throws IOException
{
	//er diyagram oluşturma
	System.out.println("er diyagram oluşturma");
	new erdiyagram();
}




}
