package prolab23hocaver;

import javax.swing.JOptionPane;

public class yonetici_teklifleri {
	//TEKLİF VERİRKEN İSLETME ADI 6 İNDEX SONRAKİ 1 İNDEX BOSLUK SONRA 2 İNDEX SAAT
	//saat 01 gibi birseyyazma veya paradada 0888tl deme
	public static int maas;  
	public static int  mevcut2=0;
	
	public static String kullanicicalistigiaylik="8-saat-100-para";
public static void main(String[] args) {
	
	if(mevcut2==0)
	{
	//marketi varsa
	JOptionPane.showMessageDialog(null,"ilk markette 8saat hafta 100tl","teklif",JOptionPane.INFORMATION_MESSAGE);
	
	//emlak varsa
	
	JOptionPane.showMessageDialog(null,"ilk emlakta 8saat hafta 100tl","teklif",JOptionPane.INFORMATION_MESSAGE);
	
	
	//magaza varsa
	
	JOptionPane.showMessageDialog(null,"ilk magazada 8saat hafta 100tl","teklif",JOptionPane.INFORMATION_MESSAGE);
	//
	
	if(izgara.ilerizaman%4==0&&izgara.ilerizaman>0)
	{
		
		String teklifverString=JOptionPane.showInputDialog("MARKET KAÇ SAAT hafta KACTL");
		
		JOptionPane.showMessageDialog(null,teklifverString,"teklif",JOptionPane.INFORMATION_MESSAGE);
		
		
		
String teklifverString2=JOptionPane.showInputDialog("EMLAK KAÇ SAAT hafta KACTL");
		
		JOptionPane.showMessageDialog(null,teklifverString2,"teklif",JOptionPane.INFORMATION_MESSAGE);
	
		
		//kullanicinin teklif semesi
int kacsaat1=Integer.parseInt(teklifverString.substring(7,9));
int kacpara1=Integer.parseInt(teklifverString.substring(21,25));	
			
int kacsaat2=Integer.parseInt(teklifverString2.substring(7,9));
int kacpara2=Integer.parseInt(teklifverString2.substring(21,25));		
			
	if((kacsaat1*kacpara1)>(kacsaat2*kacpara2))
	{
		kullanicicalistigiaylik=kacsaat1+"-saat-"+kacpara1+"-para";
		kullanicinin_aldigiteklifler.saat=kacsaat1;
		kullanicinin_aldigiteklifler.para=kacpara1;
	}
	else {
		kullanicicalistigiaylik=kacsaat2+"-saat-"+kacpara2+"-para";
		kullanicinin_aldigiteklifler.saat=kacsaat2;
		kullanicinin_aldigiteklifler.para=kacpara2;
	
	     }	
		
		
		
	}
	if(izgara.ilerizaman%4==1&&izgara.ilerizaman>0)
	{String teklifverString=JOptionPane.showInputDialog("MAGAZA KAÇ SAAT hafta KACTL");
	
		
		JOptionPane.showMessageDialog(null,teklifverString,"teklif",JOptionPane.INFORMATION_MESSAGE);
		
		
		
String teklifverString2=JOptionPane.showInputDialog("EMLAK KAÇ SAAT hafta KACTL");
		
		JOptionPane.showMessageDialog(null,teklifverString2,"teklif",JOptionPane.INFORMATION_MESSAGE);
		
		//kullanicinin teklif semesi
int kacsaat1=Integer.parseInt(teklifverString.substring(7,9));
int kacpara1=Integer.parseInt(teklifverString.substring(21,25));	
			
int kacsaat2=Integer.parseInt(teklifverString2.substring(7,9));
int kacpara2=Integer.parseInt(teklifverString2.substring(21,25));		
			
	if((kacsaat1*kacpara1)>(kacsaat2*kacpara2))
	{
		kullanicicalistigiaylik=kacsaat1+"-saat-"+kacpara1+"-para";
		kullanicinin_aldigiteklifler.saat=kacsaat1;
		kullanicinin_aldigiteklifler.para=kacpara1;
	
	}
	else {
		kullanicicalistigiaylik=kacsaat2+"-saat-"+kacpara2+"-para";
		kullanicinin_aldigiteklifler.saat=kacsaat2;
		kullanicinin_aldigiteklifler.para=kacpara2;
	
	     }	
		
		
	}
	if(izgara.ilerizaman%4==2&&izgara.ilerizaman>0)
	{
		String teklifverString=JOptionPane.showInputDialog("MAGAZA KAÇ SAAT hafta KACTL");
		
		
		JOptionPane.showMessageDialog(null,teklifverString,"teklif",JOptionPane.INFORMATION_MESSAGE);
		
		
		
String teklifverString2=JOptionPane.showInputDialog("MARKET KAÇ SAAT hafta KACTL");
		
		JOptionPane.showMessageDialog(null,teklifverString2,"teklif",JOptionPane.INFORMATION_MESSAGE);
		
	
		
String teklifverString3=JOptionPane.showInputDialog("EMLAK KAÇ SAAT hafta KACTL");
		
		JOptionPane.showMessageDialog(null,teklifverString3,"teklif",JOptionPane.INFORMATION_MESSAGE);
		
	
		
		
		
		
		//kullanicinin teklif semesi
int kacsaat1=Integer.parseInt(teklifverString.substring(7,9));
int kacpara1=Integer.parseInt(teklifverString.substring(21,25));	
			
int kacsaat2=Integer.parseInt(teklifverString2.substring(7,9));
int kacpara2=Integer.parseInt(teklifverString2.substring(21,25));		
	
int kacsaat3=Integer.parseInt(teklifverString3.substring(7,9));
int kacpara3=Integer.parseInt(teklifverString3.substring(21,25));
	
int max=kacpara3*kacsaat3;
kullanicicalistigiaylik=kacsaat3+"-saat-"+kacpara3+"-para";
kullanicinin_aldigiteklifler.saat=kacsaat3;
kullanicinin_aldigiteklifler.para=kacpara3;

if((kacpara1*kacsaat1)>max)
{
	kullanicicalistigiaylik=kacsaat1+"-saat-"+kacpara1+"-para";
	kullanicinin_aldigiteklifler.saat=kacsaat1;
	kullanicinin_aldigiteklifler.para=kacpara1;

}if((kacpara2*kacsaat2)>(kacpara1*kacsaat1))
{
	kullanicicalistigiaylik=kacsaat2+"-saat-"+kacpara2+"-para";
	kullanicinin_aldigiteklifler.saat=kacsaat2;
	kullanicinin_aldigiteklifler.para=kacpara2;
	
}
	
	
		
	}
	if(izgara.ilerizaman%4==3&&izgara.ilerizaman>0)
	{
		String teklifverString=JOptionPane.showInputDialog("MARKET KAÇ SAAT hafta KACTL");
		
		
		
		JOptionPane.showMessageDialog(null,teklifverString,"teklif",JOptionPane.INFORMATION_MESSAGE);
		
		
		//kullanicinin teklif semesi
		int kacsaat1=Integer.parseInt(teklifverString.substring(7,9));
		int kacpara1=Integer.parseInt(teklifverString.substring(21,25));	
				
		kullanicicalistigiaylik=kacsaat1+"-saat-"+kacpara1+"-para";
		kullanicinin_aldigiteklifler.saat=kacsaat1;
		kullanicinin_aldigiteklifler.para=kacpara1;
		
		
		
			
		
	}
	System.out.println(kullanicicalistigiaylik.toUpperCase());
	
	}else {
		//mevcut2=1  ise
		mevcut2=0;
	
	
		JOptionPane.showMessageDialog(null,"mevcut teklifler devam ediyor","teklif",JOptionPane.INFORMATION_MESSAGE);
		

	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
