package prolab23hocaver;

import javax.swing.JOptionPane;

public class kullanicinin_verdiğteklifler {
public static int mevcut4=0;
	
	public static void main(String[] args)
	{
	
		if(mevcut4==0)
		{
	
		
		if(izgara.ilerizaman%3==0&&izgara.ilerizaman>2)
		{
			
			String teklifverString=JOptionPane.showInputDialog("MARKET KAÇ SAAT hafta KACTL");
			
			JOptionPane.showMessageDialog(null,teklifverString,"teklif",JOptionPane.INFORMATION_MESSAGE);
			
			
		
		}
		if(izgara.ilerizaman%3==1&&izgara.ilerizaman>3)
		{String teklifverString=JOptionPane.showInputDialog("MAGAZA KAÇ SAAT hafta KACTL");
		
			
			JOptionPane.showMessageDialog(null,teklifverString,"teklif",JOptionPane.INFORMATION_MESSAGE);
			
			
	
			
			
			
		}
		if(izgara.ilerizaman%3==2)
		{
			
			
	String teklifverString3=JOptionPane.showInputDialog("EMLAK KAÇ SAAT hafta KACTL");
			
			JOptionPane.showMessageDialog(null,teklifverString3,"teklif",JOptionPane.INFORMATION_MESSAGE);
			
		
			
			
			
			
			
			
			
		}
	
		
		}
		else {
			//mevcut4=1  ise
			mevcut4=0;
		
		
			JOptionPane.showMessageDialog(null,"mevcut teklifler devam ediyor","teklif",JOptionPane.INFORMATION_MESSAGE);
			

		
		}
		
		
		
		
		
		
		
		
	
    }
}
