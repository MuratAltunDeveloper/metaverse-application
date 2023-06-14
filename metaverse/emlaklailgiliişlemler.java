package prolab23hocaver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
// EMLAK OLUŞTURULMASI İÇİN İLK IZGARAYA GİR
//Emlakla ilgili şilemlerde kimstring,isletmeno.emlakislemi girilmelidir
//tarih arasına - kullan
public class emlaklailgiliişlemler {

	
	public static String emlakislemiString;
	public static int isletmeno;
	public static String emlakfonk()
	{   
	int x=9;
		String sorgulamaString="select oyunalantur from alan where oyunalantur LIKE 'emlak%' "; 
		postgresqlvericekme.baglan();	
		ResultSet sonuc=postgresqlvericekme.gonder(sorgulamaString);
		String emlaktip="";
		try {

			while (sonuc.next()) {
					emlaktip=sonuc.getString("oyunalantur");
			System.err.println("**EMLAK TİP:"+emlaktip);
					if(emlaktip.equals("emlak4"))
			{
				x=4;
				break;
			}
				if(emlaktip.equals("emlak3"))
			{
				x=3;
				break;
			}
			if(emlaktip.equals("emlak2"))
			{
			x=2;
			break;
			}
		
				if(emlaktip.equals("emlak1"))
			{
			x=1;
			break;
			}
	
			if(emlaktip.equals("emlak0"))
			{
		x=0;
	
			}
		
			
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.err.println("HATA  ALANDAN İSLETMEYE ATA");
		}
		
		
		/*String geciciString="yok";
		
		for(int i=gridalan.alansatir-1;i>-1;i--)
		{
			for(int j=0;j<gridalan.alansutun;j++)
			{
				if((izgara.izgaradizi[i][j]).contains("emlak"))
				{
					
					System.out.println("*18"+izgara.izgaradizi[i][j]);
				geciciString=izgara.izgaradizi[i][j];	
					break;	
				}
			
				
			}
		}*/
System.err.println("emlak"+x);
	return "emlak"+x;
	
	}

	
public static String kimString="";
	public static void main(String[] args) {
	
		System.out.println("444444444444444444444444444444444");
		
		
		int emlakkomisyon=izgara.ilerizaman+2;
		int kirasuresi=0;
		String kirabaslamatarihiString="9000-09-09";
		String kirabitistarihiString="9000-09-09";
	    String satıstarihiString ="9000-09-09";
		
		String islemyapanemlakcı="emlak0";
        
        
		//emlak0,emlak1,emlak2,emlak3,emlak4 ve isletmeno
	
		islemyapanemlakcı=emlakfonk();
		
		
	
		
		
		if(emlakislemiString.equalsIgnoreCase("satis"))
		{
	
		 LocalDate now = LocalDate.now();
		satıstarihiString=String.valueOf(now);
		
		System.out.println("+++++++++++++++++++++++++++++++++++"+satıstarihiString);
		}
		if(emlakislemiString.equalsIgnoreCase("kira"))
		{
			kirasuresi=30;
			LocalDate now=LocalDate.now();
			kirabaslamatarihiString=String.valueOf(now);
			
			
		     kirabitistarihiString=String.valueOf(now.plusYears(1));
		}
		
		
		
	if(kimString.equalsIgnoreCase("yonetici"))
	{
		
		/*
	//emlak komisyon
		
		postgresqlvericekme.intguncelle("emlak","emlak_komisyon",String.valueOf(emlakkomisyon),"" );

   //kirasuresi
		
		postgresqlvericekme.intguncelle("emlak","kirasuresi",String.valueOf(kirasuresi) ,"" );

	//satıstarihi
		postgresqlvericekme.dateguncelle("emlak", "satistarih",satıstarihiString, "");

	//kiralambas tarihi
		postgresqlvericekme.dateguncelle("emlak","kiralama_baslamatarih",kirabaslamatarihiString,"" );

	//kira bitis tarihi
		postgresqlvericekme.dateguncelle("emlak","kiralama_bitistarihi",kirabitistarihiString,"" );

	//islemyapan emlakci
		postgresqlvericekme.stringguncelle("emlak",islemyapanemlakcı,"islem_yapanemlakci","" );
		
		
	//isletmeninno

	
		postgresqlvericekme.intguncelle("emlak","isletmeninno",String.valueOf(isletmeno) ,"" );
		
		
	//emlakislemi

		postgresqlvericekme.stringguncelle("emlak",emlakislemiString,"emlak_islemi","");
		*/
	//Connection conn,String name,String emlak_komisyon,String emlak_islemi,String  kirasuresi,String  satistarih,String  kiralama_baslamatarih,String  kiralama_bitistarihi,String islem_yapanemlakci,String isletmeninno
	postgresqlvericekme.baglan();
	postgresqlvericekme.insert_rowemlak(postgresqlvericekme.conn,"emlak",String.valueOf(emlakkomisyon),emlakislemiString,String.valueOf(kirasuresi),String.valueOf(satıstarihiString),String.valueOf(kirabaslamatarihiString),String.valueOf(kirabitistarihiString),islemyapanemlakcı,String.valueOf(isletmeno));
    
	
	alandanisletmeyeata.isletmenumara=String.valueOf(isletmeno);
	alandanisletmeyeata.main(args);	
		
		
	}
	if(kimString.equalsIgnoreCase("kul1"))
	{
		
		/*
	//emlak komisyon
		
		postgresqlvericekme.intguncelle("emlak","emlak_komisyon",String.valueOf(emlakkomisyon),"" );

   //kirasuresi
		
		postgresqlvericekme.intguncelle("emlak","kirasuresi",String.valueOf(kirasuresi) ,"" );

	//satıstarihi
		postgresqlvericekme.dateguncelle("emlak", "satistarih",satıstarihiString, "");

	//kiralambas tarihi
		postgresqlvericekme.dateguncelle("emlak","kiralama_baslamatarih",kirabaslamatarihiString,"" );

	//kira bitis tarihi
		postgresqlvericekme.dateguncelle("emlak","kiralama_bitistarihi",kirabitistarihiString,"" );

	//islemyapan emlakci
		postgresqlvericekme.stringguncelle("emlak",islemyapanemlakcı,"islem_yapanemlakci","" );
		
		
	//isletmeninno

	
		postgresqlvericekme.intguncelle("emlak","isletmeninno",String.valueOf(isletmeno) ,"" );
		
		
	//emlakislemi

		postgresqlvericekme.stringguncelle("emlak",emlakislemiString,"emlak_islemi","");
		*/
	//Connection conn,String name,String emlak_komisyon,String emlak_islemi,String  kirasuresi,String  satistarih,String  kiralama_baslamatarih,String  kiralama_bitistarihi,String islem_yapanemlakci,String isletmeninno
	postgresqlvericekme.baglan();
	postgresqlvericekme.insert_rowemlak2(postgresqlvericekme.conn,"emlak",String.valueOf(emlakkomisyon),emlakislemiString,String.valueOf(kirasuresi),String.valueOf(satıstarihiString),String.valueOf(kirabaslamatarihiString),String.valueOf(kirabitistarihiString),islemyapanemlakcı,String.valueOf(isletmeno));


	
	
		
	alandanisletmeyeata.isletmenumara=String.valueOf(isletmeno);

		alandanisletmeyeata.main(args);
		
	}
	if(kimString.equalsIgnoreCase("kul2"))
	{
		
		/*
	//emlak komisyon
		
		postgresqlvericekme.intguncelle("emlak","emlak_komisyon",String.valueOf(emlakkomisyon),"" );

   //kirasuresi
		
		postgresqlvericekme.intguncelle("emlak","kirasuresi",String.valueOf(kirasuresi) ,"" );

	//satıstarihi
		postgresqlvericekme.dateguncelle("emlak", "satistarih",satıstarihiString, "");

	//kiralambas tarihi
		postgresqlvericekme.dateguncelle("emlak","kiralama_baslamatarih",kirabaslamatarihiString,"" );

	//kira bitis tarihi
		postgresqlvericekme.dateguncelle("emlak","kiralama_bitistarihi",kirabitistarihiString,"" );

	//islemyapan emlakci
		postgresqlvericekme.stringguncelle("emlak",islemyapanemlakcı,"islem_yapanemlakci","" );
		
		
	//isletmeninno

	
		postgresqlvericekme.intguncelle("emlak","isletmeninno",String.valueOf(isletmeno) ,"" );
		
		
	//emlakislemi

		postgresqlvericekme.stringguncelle("emlak",emlakislemiString,"emlak_islemi","");
		*/
	//Connection conn,String name,String emlak_komisyon,String emlak_islemi,String  kirasuresi,String  satistarih,String  kiralama_baslamatarih,String  kiralama_bitistarihi,String islem_yapanemlakci,String isletmeninno
	postgresqlvericekme.baglan();
	postgresqlvericekme.insert_rowemlak2(postgresqlvericekme.conn,"emlak",String.valueOf(emlakkomisyon),emlakislemiString,String.valueOf(kirasuresi),String.valueOf(satıstarihiString),String.valueOf(kirabaslamatarihiString),String.valueOf(kirabitistarihiString),islemyapanemlakcı,String.valueOf(isletmeno));


	
		
	
	alandanisletmeyeata.isletmenumara=String.valueOf(isletmeno);
		alandanisletmeyeata.main(args);
		
	}
	if(kimString.equalsIgnoreCase("kul3"))
	{
		
		/*
	//emlak komisyon
		
		postgresqlvericekme.intguncelle("emlak","emlak_komisyon",String.valueOf(emlakkomisyon),"" );

   //kirasuresi
		
		postgresqlvericekme.intguncelle("emlak","kirasuresi",String.valueOf(kirasuresi) ,"" );

	//satıstarihi
		postgresqlvericekme.dateguncelle("emlak", "satistarih",satıstarihiString, "");

	//kiralambas tarihi
		postgresqlvericekme.dateguncelle("emlak","kiralama_baslamatarih",kirabaslamatarihiString,"" );

	//kira bitis tarihi
		postgresqlvericekme.dateguncelle("emlak","kiralama_bitistarihi",kirabitistarihiString,"" );

	//islemyapan emlakci
		postgresqlvericekme.stringguncelle("emlak",islemyapanemlakcı,"islem_yapanemlakci","" );
		
		
	//isletmeninno

	
		postgresqlvericekme.intguncelle("emlak","isletmeninno",String.valueOf(isletmeno) ,"" );
		
		
	//emlakislemi

		postgresqlvericekme.stringguncelle("emlak",emlakislemiString,"emlak_islemi","");
		*/
	//Connection conn,String name,String emlak_komisyon,String emlak_islemi,String  kirasuresi,String  satistarih,String  kiralama_baslamatarih,String  kiralama_bitistarihi,String islem_yapanemlakci,String isletmeninno
	postgresqlvericekme.baglan();
	postgresqlvericekme.insert_rowemlak2(postgresqlvericekme.conn,"emlak",String.valueOf(emlakkomisyon),emlakislemiString,String.valueOf(kirasuresi),String.valueOf(satıstarihiString),String.valueOf(kirabaslamatarihiString),String.valueOf(kirabitistarihiString),islemyapanemlakcı,String.valueOf(isletmeno));

	alandanisletmeyeata.isletmenumara=String.valueOf(isletmeno);

		alandanisletmeyeata.main(args);
		
		
	}
	if(kimString.equalsIgnoreCase("kul4"))
	{
		
		/*
	//emlak komisyon
		
		postgresqlvericekme.intguncelle("emlak","emlak_komisyon",String.valueOf(emlakkomisyon),"" );

   //kirasuresi
		
		postgresqlvericekme.intguncelle("emlak","kirasuresi",String.valueOf(kirasuresi) ,"" );

	//satıstarihi
		postgresqlvericekme.dateguncelle("emlak", "satistarih",satıstarihiString, "");

	//kiralambas tarihi
		postgresqlvericekme.dateguncelle("emlak","kiralama_baslamatarih",kirabaslamatarihiString,"" );

	//kira bitis tarihi
		postgresqlvericekme.dateguncelle("emlak","kiralama_bitistarihi",kirabitistarihiString,"" );

	//islemyapan emlakci
		postgresqlvericekme.stringguncelle("emlak",islemyapanemlakcı,"islem_yapanemlakci","" );
		
		
	//isletmeninno

	
		postgresqlvericekme.intguncelle("emlak","isletmeninno",String.valueOf(isletmeno) ,"" );
		
		
	//emlakislemi

		postgresqlvericekme.stringguncelle("emlak",emlakislemiString,"emlak_islemi","");
		*/
	//Connection conn,String name,String emlak_komisyon,String emlak_islemi,String  kirasuresi,String  satistarih,String  kiralama_baslamatarih,String  kiralama_bitistarihi,String islem_yapanemlakci,String isletmeninno
	postgresqlvericekme.baglan();
	postgresqlvericekme.insert_rowemlak2(postgresqlvericekme.conn,"emlak",String.valueOf(emlakkomisyon),emlakislemiString,String.valueOf(kirasuresi),String.valueOf(satıstarihiString),String.valueOf(kirabaslamatarihiString),String.valueOf(kirabitistarihiString),islemyapanemlakcı,String.valueOf(isletmeno));

		
		
	alandanisletmeyeata.isletmenumara=String.valueOf(isletmeno);
	
	alandanisletmeyeata.main(args);	
	}
	
	
	
	
	
	
      }
}
