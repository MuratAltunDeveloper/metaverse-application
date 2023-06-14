package prolab23hocaver;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.concurrent.ConcurrentSkipListSet;

public class alandanisletmeyeata {
	public static	String isletmenumara="14";
	public static int sbtgelir;
	public static int sbtgelir2;
	public  static int calisansayi=4;
public static void main(String[] args)  {


	
	//isletmetur
	String sorgulamaString="select oyunalantur from alan where oyunalanno="+isletmenumara;
	postgresqlvericekme.baglan();	
	ResultSet sonuc=postgresqlvericekme.gonder(sorgulamaString);
	String isletmene="";
	try {

		while (sonuc.next()) {
				isletmene=sonuc.getString("oyunalantur");
		//	System.out.println("**"+isletmene);
		}


	} catch (SQLException e) {
		// TODO Auto-generated catch block
		
		System.err.println("HATA  ALANDAN İSLETMEYE ATA");
	}
	

	//isletmelevel guncelleme
	
//	if(!(isletmene.contains("0")))
	{
		if(izgara.ilerizaman==1)
		{
			postgresqlvericekme.intguncelle("isletme","isletmelevel" , String.valueOf(1),"isletmeno ="+isletmenumara);

		}	
	
			if(izgara.ilerizaman==2)
			{
				postgresqlvericekme.intguncelle("isletme","isletmelevel" , String.valueOf(2),"isletmeno ="+isletmenumara);
	
					
			}
			if(izgara.ilerizaman==3)
			{
				postgresqlvericekme.intguncelle("isletme","isletmelevel" , String.valueOf(3),"isletmeno ="+isletmenumara);
			}
		if(izgara.ilerizaman>=4)
			{
			postgresqlvericekme.intguncelle("isletme","isletmelevel" , String.valueOf(4),"isletmeno ="+isletmenumara);

			}
		
	}

	
	
	postgresqlvericekme.stringguncelle("isletme",isletmene,"isletmetur","isletmeno="+isletmenumara);
	
	////-----------------------toplu guncelleme
	/*for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=10;j++)
		{int x;
			String ataString=String.valueOf(i)+String.valueOf(j);
			x=Integer.parseInt(ataString);
			postgresqlvericekme.intguncelle("isletme", "isletmelevel","0","isletmeno="+String.valueOf(x));	
	
	
		}
	}
		
	*/
	//---------------------------------------------
	
	System.out.println("*"+izgara.ilerizaman);
	//yoneticiisletucret ,kulisletucret
	int yoneticiisletmeucret=100;
	int kulisletmeucret=150;
	//seviyesine gore sbt gelirel from 
	sbtgelir=100;
	sbtgelir2=50;
	//
	String sorgulamaString2="select isletmelevel from isletme where isletmeno ="+isletmenumara;
	postgresqlvericekme.baglan();	
	ResultSet sonuc2=postgresqlvericekme.gonder(sorgulamaString2);
	int isletmelevel=0;
	
	
	
	
	try {

		while (sonuc2.next()) {
				sonuc2.getInt("isletmelevel");
				isletmelevel=sonuc2.getInt("isletmelevel");
			System.out.println("**"+isletmelevel);
		}


	} catch (SQLException e) {
		// TODO Auto-generated catch block
		
		System.err.println("HATA  ALANDAN İSLETMEYE ATA");
	}
	if(isletmelevel!=0)
	{
	sbtgelir=sbtgelir*isletmelevel;
	sbtgelir2=sbtgelir2*isletmelevel;
	}
	
	yoneticiisletmeucret=100+izgara.ilerizaman*10+sbtgelir2;
	kulisletmeucret=150+sbtgelir+izgara.ilerizaman*10;
	
	
	//****************yoneticinin kullanıcıya verdiği sbt gelir

postgresqlvericekme.intguncelle("isletme","yoneticiisletucret" , String.valueOf(yoneticiisletmeucret),"isletmeno ="+isletmenumara);
	
postgresqlvericekme.intguncelle("isletme","kulisletmeucret" , String.valueOf(kulisletmeucret),"isletmeno ="+isletmenumara);

//*********************isletmekapasitesi

//int isletmekapasitesi=(int) Math.pow(2,isletmelevel);


if(isletmelevel==0)
{
postgresqlvericekme.intguncelle("isletme","isletmekapasite" ,"0","isletmeno ="+isletmenumara);

}	
else {
	if(isletmelevel==1)
	{
		postgresqlvericekme.intguncelle("isletme","isletmekapasite" ,"3","isletmeno ="+isletmenumara);

	}
	if(isletmelevel==2)
	{
		postgresqlvericekme.intguncelle("isletme","isletmekapasite" ,"6","isletmeno ="+isletmenumara);

	}
	if(isletmelevel==3)
	{
		postgresqlvericekme.intguncelle("isletme","isletmekapasite" ,"12","isletmeno ="+isletmenumara);

	}if(isletmelevel>=4)
	{
		postgresqlvericekme.intguncelle("isletme","isletmekapasite" ,"24","isletmeno ="+isletmenumara);

	}
}
	
//isletmede calisan sayisi

if(calisansayi>0)
{
if(izgara.ilerizaman%3==0)
{calisansayi-=3;
if(calisansayi>0)
{
	postgresqlvericekme.intguncelle("isletme","isletmecalisansayi",String.valueOf(3),"isletmeno ="+isletmenumara);
}
	

}
if(izgara.ilerizaman%3==1)
{
	calisansayi-=2;

	if(calisansayi>0)
	{
	postgresqlvericekme.intguncelle("isletme","isletmecalisansayi",String.valueOf(2),"isletmeno ="+isletmenumara);
	}

}
if(izgara.ilerizaman%3==2)
{    calisansayi-=1;

if(calisansayi>0)
{
	postgresqlvericekme.intguncelle("isletme","isletmecalisansayi",String.valueOf(1),"isletmeno ="+isletmenumara);
}


}


}
if(calisansayi==0)
{
	postgresqlvericekme.intguncelle("isletme","isletmecalisansayi",String.valueOf(0),"isletmeno ="+isletmenumara);

calisansayi=4;	
}

//isletmefiyat

int isletmefiyat=isletmelevel*250+1000;
postgresqlvericekme.intguncelle("isletme","isletmefiyat",String.valueOf(isletmefiyat),"isletmeno ="+isletmenumara);

//kiraisletfiyat

int isletmefiyat2=isletmelevel*50+1000;
postgresqlvericekme.intguncelle("isletme","kiraisletfiyat",String.valueOf(isletmefiyat2),"isletmeno ="+isletmenumara);


//sbtgelirmiktear

if(isletmene.contains("0"))
{
postgresqlvericekme.intguncelle("isletme","sbtgelirmiktar",String.valueOf(sbtgelir2),"isletmeno ="+isletmenumara);

}else 
	
{
	postgresqlvericekme.intguncelle("isletme","sbtgelirmiktar",String.valueOf(sbtgelir),"isletmeno ="+isletmenumara);

}


//sbtgeliroranı



if(isletmene.contains("0"))
{
	int oran2=(100*sbtgelir2)/yoneticiisletmeucret;
postgresqlvericekme.intguncelle("isletme","sbtgeliroran",String.valueOf(oran2),"isletmeno ="+isletmenumara);

}else

{
int oran=(100*sbtgelir)/kulisletmeucret;
postgresqlvericekme.intguncelle("isletme","sbtgeliroran",String.valueOf(oran),"isletmeno ="+isletmenumara);

}	
	
//buseviyebaslatarihi
LocalDate now = LocalDate.now();
String buseviyetarih=String.valueOf(now.plusWeeks(izgara.ilerizaman));
	
postgresqlvericekme.dateguncelle("isletme","buseviyebaslatarihi",buseviyetarih,"isletmeno ="+isletmenumara);


	
	
System.err.println("İSLETME LEVEL"+isletmelevel);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
