package prolab23hocaver;

import javax.swing.JOptionPane;

public class gridalan {
	
	    static int alansatir=0;
		static	int alansutun=0;
	  
	  
public static void alanal()
{
	 
       String alansatırString=JOptionPane.showInputDialog("alanın satır boyu");
       String alansutunString=JOptionPane.showInputDialog("alanın sutun boyutu");
       alansatir=Integer.parseInt(alansatırString);
       alansutun=Integer.parseInt(alansutunString); 
     
      


}



}