package prolab23hocaver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class oyuncugiderler {
public static int yemek;
public static int para;
public static int esya;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yemekgider=0;
		int paragider=0;
		int esyagider=0;
		int sifre=YONETICIVEOYUNCUPANEL.sifreata;
		
		String sorgulamaString="select kullanici_yemekmiktar from kullanici where kullanicisifre="+sifre;
		postgresqlvericekme.baglan();	
		ResultSet sonuc=postgresqlvericekme.gonder(sorgulamaString);
		String yemekmiktarString="";
		try {

			while (sonuc.next()) {
					yemekmiktarString=sonuc.getString("kullanici_yemekmiktar");
			yemekgider=matematiksel_alimsatim_calisma.miktar-Integer.parseInt(yemekmiktarString) ;
					//	System.out.println("**"+isletmene);
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.err.println("HATA  ALANDAN İSLETMEYE ATA");
		}
		
	//
		
		String sorgulamaString2="select kullanici_esyamiktar from kullanici where kullanicisifre="+sifre;
		postgresqlvericekme.baglan();	
		ResultSet sonuc2=postgresqlvericekme.gonder(sorgulamaString2);
		String esyamiktarString="";
		try {

			while (sonuc2.next()) {
					esyamiktarString=sonuc2.getString("kullanici_esyamiktar");
			esyagider=matematiksel_alimsatim_calisma.miktar-Integer.parseInt(esyamiktarString);
					//	System.out.println("**"+isletmene);
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.err.println("HATA  ALANDAN İSLETMEYE ATA");
		}
		
		//
		String sorgulamaString3="select kullanici_paramiktar from kullanici where kullanicisifre="+sifre;
		postgresqlvericekme.baglan();	
		ResultSet sonuc3=postgresqlvericekme.gonder(sorgulamaString3);
		String paramiktarString="";
		try {

			while (sonuc3.next()) {
					paramiktarString=sonuc3.getString("kullanici_paramiktar");
			paragider=matematiksel_alimsatim_calisma.miktar-Integer.parseInt(paramiktarString);
					//	System.out.println("**"+isletmene);
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.err.println("HATA  ALANDAN İSLETMEYE ATA");
		}
		if(yemekgider>1000)
		{
			yemekgider=0;
		}
		if(esyagider>1000||esyagider<-1000)
		{
			esyagider=0;
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//
		
		JOptionPane.showMessageDialog(null,"yemek="+yemekgider,"teklif",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"para="+paragider,"teklif",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"esya="+esyagider,"teklif",JOptionPane.INFORMATION_MESSAGE);

	}

}
