package prolab23hocaver;

import javax.swing.JOptionPane;

public class kullanicinin_aldigiteklifler {
	public static String kullanicialdigitekliflerString="";
    public static int saat;
    public static int para;
    
    
	public static int maas;
    	  
public static void main(String[] args) {
int sayac=izgara.ilerizaman-1;

	if(izgara.ilerizaman<2)
	{//1 2 3 4 5 
		maas=8*30*100;
		kullanicialdigitekliflerString+="8-saat-100-para\n";
	    while(sayac>0)
	    {
	    	kullanicialdigitekliflerString=kullanicialdigitekliflerString+yonetici_teklifleri.kullanicicalistigiaylik+"\n";
	        
	    	sayac--;
	    }
	
	
	}		
	else if(izgara.ilerizaman<5&&izgara.ilerizaman>2)
	{
	//6 7 8 9	
		
		  while(sayac>0)
		    {
			  kullanicialdigitekliflerString=kullanicialdigitekliflerString+yonetici_teklifleri.kullanicicalistigiaylik+"\n";
			sayac--;  
		    }
		
		
	}
	else
	{      kullanicialdigitekliflerString+="8-saat-100-para\n";
		
		  while(sayac>0)
		    {
			  kullanicialdigitekliflerString=kullanicialdigitekliflerString+yonetici_teklifleri.kullanicicalistigiaylik+"\n";
			sayac--; 
		    }
		
	}
    kullanicialdigitekliflerString+="-----------------------------\n";
	System.out.println(izgara.ilerizaman);
	System.out.println(kullanicialdigitekliflerString.toUpperCase());
	
	JOptionPane.showMessageDialog(null,kullanicialdigitekliflerString,"teklif",JOptionPane.INFORMATION_MESSAGE);
	
	
}

}
