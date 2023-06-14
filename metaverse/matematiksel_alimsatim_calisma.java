package prolab23hocaver;

import javax.swing.JOptionPane;

public class matematiksel_alimsatim_calisma {
public static String kisiString;
public static int kisisifre;
	
public static int miktar=500;
	
public static void main(String[] args) {
System.out.println("matematiksel tablom:");
	System.out.println(kisiString+"/"+kisisifre);

	if(kullanicinin_aldigiteklifler.para==0&&kullanicinin_aldigiteklifler.saat==0)
	{//JOptionPane.showMessageDialog(null,teklifverString,"teklif",JOptionPane.INFORMATION_MESSAGE);
		
		
		JOptionPane.showMessageDialog(null,"maas sıfırsa kullanıcı arayuzunden KULLANICININ ALDIGITEKLİFLERBUTONUNABAS ","teklifal",JOptionPane.WARNING_MESSAGE);
	}
	kullanicinin_aldigiteklifler.maas=kullanicinin_aldigiteklifler.para*30*kullanicinin_aldigiteklifler.saat;
	//kul1ve kul2 market,kul3 ve kul4 magaza
	//gunluk azaltmayı kullan
	if(kisisifre==10)
	{
		
		
		int ekle1=0;
		int ekle2=0;
		int ekle3=0;
		
		
		if(YONETICIVEOYUNCUPANEL.kul1isyerString.equals("market"))
		{
			ekle1=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		if(YONETICIVEOYUNCUPANEL.kul1isyerString.equals("magaza"))
		{
			ekle2=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		if(YONETICIVEOYUNCUPANEL.kul1isyerString.equalsIgnoreCase("emlak"))
		{
			ekle3=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		
		
		
		System.err.println(ekle1+"-"+ekle2+"-"+ekle3);
		
		int kisi1mar;
		int kisi1mag;
		int kisi1em;
		
		int kisi1yemek=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle1;
		int kisi1esya=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle2;
		int kisi1para=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle3+(izgara.ilerizaman*YONETICIVEOYUNCUPANEL.kul1aylikpara);
		
			oyuncugiderler.yemek=ekle1;
			oyuncugiderler.para=ekle2;
			oyuncugiderler.esya=ekle3;
		
			
		ekle1=0;
		ekle2=0;
		ekle3=0;
		
		
		postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar",String.valueOf(kisi1yemek),"kullaniciad='kul1'");
		postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar",String.valueOf(kisi1esya),"kullaniciad='kul1'");
		postgresqlvericekme.intguncelle("kullanici","kullanici_paramiktar",String.valueOf(kisi1para),"kullaniciad='kul1'");
		
		
		
		
		if(kisi1yemek<0)
		{
			postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar","0","kullaniciad='kul1'");
			
		}
		if(kisi1esya<0)
		{
			postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar","0","kullaniciad='kul1'");
			
		}
		
		
	}
	else if(kisisifre==20)
	{
		
		
		
		int ekle1=0;
		int ekle2=0;
		int ekle3=0;
		
		
		if(YONETICIVEOYUNCUPANEL.kul2isyerString.equals("market"))
		{
			ekle1=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		if(YONETICIVEOYUNCUPANEL.kul2isyerString.equals("magaza"))
		{
			ekle2=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		if(YONETICIVEOYUNCUPANEL.kul2isyerString.equalsIgnoreCase("emlak"))
		{
			ekle3=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		
		
		
		
		
		
		
		
		int kisi2mar;
		int kisi2mag;
		int kisi2em;
		
		int kisi2yemek=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle1;
		int kisi2esya=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle2;
		int kisi2para=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle3+(izgara.ilerizaman*YONETICIVEOYUNCUPANEL.kul2aylikpara);
		
		
		
		oyuncugiderler.yemek=ekle1;
		oyuncugiderler.para=ekle2;
		oyuncugiderler.esya=ekle3;
	
		
	ekle1=0;
	ekle2=0;
	ekle3=0;
	
	postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar",String.valueOf(kisi2yemek),"kullaniciad='kul1'");
	postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar",String.valueOf(kisi2esya),"kullaniciad='kul1'");
	postgresqlvericekme.intguncelle("kullanici","kullanici_paramiktar",String.valueOf(kisi2para),"kullaniciad='kul1'");
	



		
	
		if(kisi2yemek<0)
		{
			postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar","0","kullaniciad='kul2'");
			
		}
		if(kisi2esya<0)
		{
			postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar","0","kullaniciad='kul2'");
			
		}
	
	
	
	
	
	}
	else if(kisisifre==30)
	{
		
		
		int ekle1=0;
		int ekle2=0;
		int ekle3=0;
		
		
		if(YONETICIVEOYUNCUPANEL.kul3isyerString.equals("market"))
		{
			ekle1=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		if(YONETICIVEOYUNCUPANEL.kul3isyerString.equals("magaza"))
		{
			ekle2=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		if(YONETICIVEOYUNCUPANEL.kul3isyerString.equalsIgnoreCase("emlak"))
		{
			ekle3=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		
		
		
		
		
		
		
		
		
		
		
		
    int kisi3mar;
	int kisi3mag;
	int kisi3em;
	
	int kisi3yemek=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle1;
	int kisi3esya=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle2;
	int kisi3para=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle3+(izgara.ilerizaman*YONETICIVEOYUNCUPANEL.kul3aylikpara);
		
	
	oyuncugiderler.yemek=ekle1;
	oyuncugiderler.para=ekle2;
	oyuncugiderler.esya=ekle3;

		
	ekle1=0;
	ekle2=0;
	ekle3=0;
	
	postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar",String.valueOf(kisi3yemek),"kullaniciad='kul1'");
	postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar",String.valueOf(kisi3esya),"kullaniciad='kul1'");
	postgresqlvericekme.intguncelle("kullanici","kullanici_paramiktar",String.valueOf(kisi3para),"kullaniciad='kul1'");
	


	
	

	if(kisi3yemek<0)
	{
		postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar","0","kullaniciad='kul3'");
		
	}
	if(kisi3esya<0)
	{
		postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar","0","kullaniciad='kul3'");
		
	}
	
	
	
	}
	else if(kisisifre==40){
		
		
		int ekle1=0;
		int ekle2=0;
		int ekle3=0;
		
		
		if(YONETICIVEOYUNCUPANEL.kul4isyerString.equals("market"))
		{
			ekle1=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		if(YONETICIVEOYUNCUPANEL.kul4isyerString.equals("magaza"))
		{
			ekle2=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		if(YONETICIVEOYUNCUPANEL.kul4isyerString.equalsIgnoreCase("emlak"))
		{
			ekle3=(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+kullanicinin_aldigiteklifler.maas;
		}
		
		
		
		
		
		
		
		
		
		int kisi4mar;
		int kisi4mag;
		int kisi4em;
		
		int kisi4yemek=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle1;
		int kisi4para=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle3+(izgara.ilerizaman*YONETICIVEOYUNCUPANEL.kul4aylikpara);
		int kisi4esya=miktar-(YONETICIVEOYUNCUPANEL.gunlukazalma*izgara.ilerizaman)+ekle2;
		

		
		
		oyuncugiderler.yemek=ekle1;
		oyuncugiderler.para=ekle2;
		oyuncugiderler.esya=ekle3;
	
		ekle1=0;
		ekle2=0;
		ekle3=0;
		
		postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar",String.valueOf(kisi4yemek),"kullaniciad='kul1'");
		postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar",String.valueOf(kisi4esya),"kullaniciad='kul1'");
		postgresqlvericekme.intguncelle("kullanici","kullanici_paramiktar",String.valueOf(kisi4para),"kullaniciad='kul1'");
		
	
	
			
		
	if(kisi4yemek<0)
	{
		postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar","0","kullaniciad='kul4'");
		
	}
	if(kisi4esya<0)
	{
		postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar","0","kullaniciad='kul4'");
		
	}
	
	
	}
	
	

	
	
	
	
	
	
	
}



public static void kim(String ad,int sifre)
{
kisiString=ad;
kisisifre=sifre;
}



}
