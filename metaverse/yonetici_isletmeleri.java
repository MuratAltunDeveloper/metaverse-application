package prolab23hocaver;

import javax.swing.JOptionPane;

public class yonetici_isletmeleri {
	public static String yoneticialanlari[]=new String[30];
	public static int artim=0;
	public static String toplamString="";
	
	
	public static String kiraalanno;
	public static String kiraisletmetipString;
	
	
	public static int mevcut=0;
	
	
public static void herzamanatlamadaneisletti()
{
 toplamString="";
	for(int i=0;i<30;i++)
	{   if(yoneticialanlari[i]!=null)
	{
		toplamString+=yoneticialanlari[i];
	}
	
	}
	
	toplamString+="--------------------\n";
JOptionPane.showMessageDialog(null,toplamString);

}
	
	
	

public static void main(String[] args) {
	//isletme zamanın agore algoritma
	
	
	/*
	
	if(izgara.ilerizaman==0)
	{
		JOptionPane.showMessageDialog(null,"alanno 11 market\n alanno 12 magaza\nalanno 13 emlak","isletme",JOptionPane.INFORMATION_MESSAGE);
		yoneticialanlari[artim]="alanno 11 market\n alanno 12 magaza\nalanno 13 emlak";
		artim++;
	}
	if(izgara.ilerizaman/4==0&&izgara.ilerizaman>0)
	{
	String yoneticiisletme=gridalan.alansatir-1+"2";
	String sartString="oyunalanno="+yoneticiisletme;
	JOptionPane.showMessageDialog(null,"alanno "+yoneticiisletme+"market","isletme",JOptionPane.INFORMATION_MESSAGE);
//market
	postgresqlvericekme.stringguncelle("alan","market","oyunalantur",sartString );
	
	
	
	yoneticialanlari[artim]="oyunalanno="+yoneticiisletme+"market\n";
	artim++;
	
	}
	if(izgara.ilerizaman/4==1&&izgara.ilerizaman>0)
	{
    String yoneticiisletmeString=gridalan.alansatir-2+"1";
    String sartString="oyunalanno="+yoneticiisletmeString;
	
    
	JOptionPane.showMessageDialog(null,"alan no"+yoneticiisletmeString+"magaza","isletme",JOptionPane.INFORMATION_MESSAGE);


    //magaza
    postgresqlvericekme.stringguncelle("alan","magaza","oyunalantur",sartString);
	
    
    
    
    yoneticialanlari[artim]="oyunalanno="+yoneticiisletmeString+"magaza\n";
	artim++;
	
	}
	if(izgara.ilerizaman/4==2&&izgara.ilerizaman>0)
	{
	String yoneticiisletmeString=gridalan.alansatir-1+"2";
	String sartString="oyunalanno="+yoneticiisletmeString;
	
	JOptionPane.showMessageDialog(null," alan no "+yoneticiisletmeString+"emlak","isletme",JOptionPane.INFORMATION_MESSAGE);


	
	
	//emlak
	postgresqlvericekme.stringguncelle("alan","emlak","oyunalantur",sartString );
	
	
	
	
	yoneticialanlari[artim]="oyunalanno="+yoneticiisletmeString+"emlak\n";
	artim++;
	}
	if(izgara.ilerizaman/4==3&&izgara.ilerizaman>0)
	{
	String yoneticiisletmeString=gridalan.alansatir-2+"1";
	String sartString="oyunalanno="+yoneticiisletmeString;
	
	JOptionPane.showMessageDialog(null,"alanno "+yoneticiisletmeString+"market","isletme",JOptionPane.INFORMATION_MESSAGE);

	
	//market
	postgresqlvericekme.stringguncelle("alan","market","oyunalantur",sartString);
	
	
	
	yoneticialanlari[artim]="oyunalanno="+yoneticiisletmeString+"market\n";
	artim++;
	}
	
	*/

	
	
	
	//isletme zamanın agore algoritma
	
	
	//mevcut ayarlaması
	if(mevcut==0)
	{
	
	
		if(izgara.ilerizaman==0)
		{
			JOptionPane.showMessageDialog(null,"alanno 11 market\n alanno 12 magaza\nalanno 13 emlak","isletme",JOptionPane.INFORMATION_MESSAGE);
			yoneticialanlari[artim]="alanno 11 market\n alanno 12 magaza\nalanno 13 emlak\n";
			artim++;

		}
		//
		if(izgara.ilerizaman%4==0&&izgara.ilerizaman>0)
		{
			
			
			
		String yoneticiisletme=gridalan.alansatir-1+"1";
	
	
			
		String sartString="oyunalanno="+yoneticiisletme;
		JOptionPane.showMessageDialog(null,"alanno "+yoneticiisletme+"market","isletme",JOptionPane.INFORMATION_MESSAGE);
	
		
		postgresqlvericekme.stringguncelle("alan","market0","oyunalantur",sartString );
		
		
		//emlakla ilgili işlemler
		emlaklailgiliişlemler.kimString="yonetici";
		emlaklailgiliişlemler.isletmeno=Integer.parseInt(yoneticiisletme);
		emlaklailgiliişlemler.emlakislemiString="satis";
		
		
		emlaklailgiliişlemler.main(args);
		
		
		//market
		
		String yoneticiisletme2=gridalan.alansatir-1+"2";
		String sartString2="oyunalanno="+yoneticiisletme2;
		JOptionPane.showMessageDialog(null,"alanno "+yoneticiisletme2+"emlak","isletme",JOptionPane.INFORMATION_MESSAGE);

		
		
		//emlakla ilgili işlemler
				emlaklailgiliişlemler.kimString="yonetici";
				emlaklailgiliişlemler.isletmeno=Integer.parseInt(yoneticiisletme2);
				emlaklailgiliişlemler.emlakislemiString="satis";
			
				
				
				emlaklailgiliişlemler.main(args);
					
		//emlak
		
		postgresqlvericekme.stringguncelle("alan","emlak0","oyunalantur",sartString2 );
		
		

		
		
		}
		if(izgara.ilerizaman%4==1&&izgara.ilerizaman>0)
		{
	    String yoneticiisletmeString=gridalan.alansatir-2+"2";
	    String sartString="oyunalanno="+yoneticiisletmeString;
		
		JOptionPane.showMessageDialog(null,"alan no"+yoneticiisletmeString+"magaza","isletme",JOptionPane.INFORMATION_MESSAGE);

	    
	   
	    postgresqlvericekme.stringguncelle("alan","magaza0","oyunalantur",sartString);
		

	    
	    
	  //emlakla ilgili işlemler
	  		emlaklailgiliişlemler.kimString="yonetici";
	  		emlaklailgiliişlemler.isletmeno=Integer.parseInt(yoneticiisletmeString);
	  		emlaklailgiliişlemler.emlakislemiString="satis";
	  	
	  		
	  		emlaklailgiliişlemler.main(args);
	  		
 //magaza
	    
	    
	    String yoneticiisletmeString2=gridalan.alansatir-2+"1";
	    String sartString2="oyunalanno="+yoneticiisletmeString2;
		
		JOptionPane.showMessageDialog(null,"alan no"+yoneticiisletmeString2+"emlak","isletme",JOptionPane.INFORMATION_MESSAGE);

	    
	   
	    postgresqlvericekme.stringguncelle("alan","emlak0","oyunalantur",sartString2);
		 
	    
	    
	    
	    
	  //emlakla ilgili işlemler
	  		emlaklailgiliişlemler.kimString="yonetici";
	  		emlaklailgiliişlemler.isletmeno=Integer.parseInt(yoneticiisletmeString2);
	  		emlaklailgiliişlemler.emlakislemiString="satis";
	  		
	  		emlaklailgiliişlemler.main(args);
	  		
	    //emlak
	    
	    
	    
	    
	    
	    
	    
	    
		}
		if(izgara.ilerizaman%4==2&&izgara.ilerizaman>0)
		{
		String yoneticiisletmeString=gridalan.alansatir-1+"1";
		String sartString="oyunalanno="+yoneticiisletmeString;
		
		JOptionPane.showMessageDialog(null,"alan no "+yoneticiisletmeString+"emlak","isletme",JOptionPane.INFORMATION_MESSAGE);



		postgresqlvericekme.stringguncelle("alan","emlak0","oyunalantur",sartString );
		
		
		//emlakla ilgili işlemler
				emlaklailgiliişlemler.kimString="yonetici";
				emlaklailgiliişlemler.isletmeno=Integer.parseInt(yoneticiisletmeString);
				emlaklailgiliişlemler.emlakislemiString="satis";
			
				emlaklailgiliişlemler.main(args);
				
		
		//emlak
		
		String yoneticiisletmeString2=gridalan.alansatir-1+"2";
		String sartString2="oyunalanno="+yoneticiisletmeString2;
		
		JOptionPane.showMessageDialog(null,"alan no "+yoneticiisletmeString2+"market","isletme",JOptionPane.INFORMATION_MESSAGE);



		postgresqlvericekme.stringguncelle("alan","market0","oyunalantur",sartString2 );
		
		//emlakla ilgili işlemler
				emlaklailgiliişlemler.kimString="yonetici";
				emlaklailgiliişlemler.isletmeno=Integer.parseInt(yoneticiisletmeString2);
				emlaklailgiliişlemler.emlakislemiString="satis";
				
				emlaklailgiliişlemler.main(args);
				
		
		
        //market
		
		
		String yoneticiisletmeString3=gridalan.alansatir-1+"3";
		String sartString3="oyunalanno="+yoneticiisletmeString3;
		
		JOptionPane.showMessageDialog(null,"alan no "+yoneticiisletmeString3+"magaza","isletme",JOptionPane.INFORMATION_MESSAGE);



		postgresqlvericekme.stringguncelle("alan","magaza0","oyunalantur",sartString3 );
		
		
		
		
		
		//emlakla ilgili işlemler
				emlaklailgiliişlemler.kimString="yonetici";
				emlaklailgiliişlemler.isletmeno=Integer.parseInt(yoneticiisletmeString3);
				emlaklailgiliişlemler.emlakislemiString="satis";
				
		
				emlaklailgiliişlemler.main(args);
				
		//magaza
		}
		if(izgara.ilerizaman%4==3&&izgara.ilerizaman>0)
		{
		String yoneticiisletmeString=gridalan.alansatir-2+"3";
		String sartString="oyunalanno="+yoneticiisletmeString;
		
		JOptionPane.showMessageDialog(null,"alanno "+yoneticiisletmeString+"market","isletme",JOptionPane.INFORMATION_MESSAGE);

			postgresqlvericekme.stringguncelle("alan","market0","oyunalantur",sartString);
		
		//market
	
			//emlakla ilgili işlemler
			emlaklailgiliişlemler.kimString="yonetici";
			emlaklailgiliişlemler.isletmeno=Integer.parseInt(yoneticiisletmeString);
			emlaklailgiliişlemler.emlakislemiString="satis";
			
			
			emlaklailgiliişlemler.main(args);
			
		}
		
		
	}	
	else {
		//mevcut 1 ise
		mevcut=0;
		JOptionPane.showMessageDialog(null,"mevcut isletmeler devam ediyor","isletme",JOptionPane.INFORMATION_MESSAGE);

		
	}


	
	
	
}
}
