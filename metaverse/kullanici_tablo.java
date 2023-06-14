
/*
 * package prolab23hocaver;
 

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class kullanici_tablo extends JFrame {
//arayuziçin değişkenler

	
	
    public JTable tablo=new JTable();
	
	DefaultTableModel tablomodeli = new DefaultTableModel();
	
	public JButton bTNButton=new JButton();
	
	public JPanel arayuzpanelim=new JPanel();
	
	String sorgu;

	
	
	Object[] satirlar = new Object[11];
    String sutunadlari[]=new String[] {"kulcalismabastarih","kulcalismabitistarih","kulcalismasaatleri","kulcalismagun",
    		"kulno","kulsifre","kulaad","kulsoyad","kulyemekmiktar","kulesyamiktar","kulparamiktar"};
	Object[] sutunlar = {sutunadlari[0],sutunadlari[1],sutunadlari[2],sutunadlari[3],sutunadlari[4],sutunadlari[5],sutunadlari[6],sutunadlari[7],sutunadlari[8],sutunadlari[9],sutunadlari[10]};
	
	public static void main(String[] args) {
		
		//matematiksel isleme gitme
		matematiksel_alimsatim_calisma.main(args);
		  
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kullanici_tablo frame = new kullanici_tablo();
				int	kontrolyapisi=1;
					if(kontrolyapisi==0)
		                       {
						frame.setVisible(false);
		                         }
					    else {
		              	frame.setVisible(true);
		                            }
				} catch (SQLException e) {
					System.err.println("tablo oluşturuken attı bu hatayı");
					e.printStackTrace();
				}
			}
		});
		
		
	}

	void git()
	{
		System.exit(0);
	}
	
	    kullanici_tablo() throws SQLException {
		
	    	
	  	  
	    	//sorgu yapısının ğerçekleştirilmesi
		int kont=0;
		if(matematiksel_alimsatim_calisma.kisiString==null)
		{
	    sorgu = "select * from kullanici";
		kont=1;
		}
		//kullanici
			if(kont==0) 
			{
				
		
			if(matematiksel_alimsatim_calisma.kisiString.equals("kul1"))
			{
				sorgu = "select * from kullanici where kullanicisifre=10";
			
				int kullaniciyemekmiktar = 0;
				int kullaniciesyamiktar = 0;
				
				
				
				String sorgulamaString="select kullanici_yemekmiktar from kullanici where kullanicisifre=10";
				String sorgulamaString2="select kullanici_esyamiktar from kullanici where kullanicisifre=10";
				
				postgresqlvericekme.baglan();	
				ResultSet sonuc=postgresqlvericekme.gonder(sorgulamaString);
				
				try {

					while (sonuc.next()) {
							kullaniciyemekmiktar=sonuc.getInt("kullanici_yemekmiktar");
					        kullaniciesyamiktar=sonuc.getInt("kullanici_esyamiktar");
							//	System.out.println("**"+isletmene);
					
						if(kullaniciyemekmiktar==0||kullaniciesyamiktar==0)
                {
	
	
                JOptionPane.showMessageDialog(null,"OYUN KAYBEDİLDİ","KAYBETME",JOptionPane.ERROR_MESSAGE);	
           
                }
			                    
					
					
					}


				} catch (SQLException e) {
					// TODO Auto-generated catch block
					     git();
					System.err.println("HATA  ALANDAN İSLETMEYE ATA");
				}
				
			
				
				
				
			}
			if(matematiksel_alimsatim_calisma.kisiString.equals("kul2"))
			{
	sorgu="select * from kullanici where kullanicisifre=20";
		
			
	int kullaniciyemekmiktar = 0;
	int kullaniciesyamiktar = 0;
	
	
	
	String sorgulamaString="select kullanici_yemekmiktar from kullanici where kullanicisifre=20";
	String sorgulamaString2="select kullanici_esyamiktar from kullanici where kullanicisifre=20";
	
	postgresqlvericekme.baglan();	
	ResultSet sonuc=postgresqlvericekme.gonder(sorgulamaString);
	
	try {

		while (sonuc.next()) {
				kullaniciyemekmiktar=sonuc.getInt("kullanici_yemekmiktar");
		        kullaniciesyamiktar=sonuc.getInt("kullanici_esyamiktar");
				//	System.out.println("**"+isletmene);
		
		  
			if(kullaniciyemekmiktar==0||kullaniciesyamiktar==0)
    {


    JOptionPane.showMessageDialog(null,"OYUN KAYBEDİLDİ","KAYBETME",JOptionPane.ERROR_MESSAGE);	
   
    }
		
		}


	} catch (SQLException e) {
		// TODO Auto-generated catch block
		 git();
		System.err.println("HATA  ALANDAN İSLETMEYE ATA");
	}
  
			
			
			}
			if(matematiksel_alimsatim_calisma.kisiString.equals("kul3"))
			{
			  	sorgu="select * from kullanici where kullanicisifre=30";

			  	
			  	int kullaniciyemekmiktar = 0;
				int kullaniciesyamiktar = 0;
				
				
				
				String sorgulamaString="select kullanici_yemekmiktar from kullanici where kullanicisifre=30";
				String sorgulamaString2="select kullanici_esyamiktar from kullanici where kullanicisifre=30";
				
				postgresqlvericekme.baglan();	
				ResultSet sonuc=postgresqlvericekme.gonder(sorgulamaString);
				
				try {

					while (sonuc.next()) {
							kullaniciyemekmiktar=sonuc.getInt("kullanici_yemekmiktar");
					        kullaniciesyamiktar=sonuc.getInt("kullanici_esyamiktar");
							//	System.out.println("**"+isletmene);
					
					
					    	if(kullaniciyemekmiktar==0||kullaniciesyamiktar==0)
                {
	
	
                JOptionPane.showMessageDialog(null,"OYUN KAYBEDİLDİ","KAYBETME",JOptionPane.ERROR_MESSAGE);	

                }
					
					}


				} catch (SQLException e) {
					// TODO Auto-generated catch block
					
		   git();
					System.err.println("HATA  ALANDAN İSLETMEYE ATA");
				}
				
			
				
			}
			if(matematiksel_alimsatim_calisma.kisiString.equals("kul4"))
			{
			  	sorgu="select * from kullanici where kullanicisifre=40";

			  	
			  	int kullaniciyemekmiktar = 0;
				int kullaniciesyamiktar = 0;
				
				
				
				String sorgulamaString="select kullanici_yemekmiktar from kullanici where kullanicisifre=40";
				String sorgulamaString2="select kullanici_esyamiktar from kullanici where kullanicisifre=40";
				
				postgresqlvericekme.baglan();	
				ResultSet sonuc=postgresqlvericekme.gonder(sorgulamaString);
				
				try {

					while (sonuc.next()) {
							kullaniciyemekmiktar=sonuc.getInt("kullanici_yemekmiktar");
					        kullaniciesyamiktar=sonuc.getInt("kullanici_esyamiktar");
							//	System.out.println("**"+isletmene);
					
						if(kullaniciyemekmiktar==0||kullaniciesyamiktar==0)
                  {
	
	
                  JOptionPane.showMessageDialog(null,"OYUN KAYBEDİLDİ","KAYBETME",JOptionPane.ERROR_MESSAGE);	
               
                  }
		
					}


				} catch (SQLException e) {
					// TODO Auto-generated catch block
					   git();
					System.err.println("HATA  ALANDAN İSLETMEYE ATA");
				}

		    
		
			}
		
			
			}
			
		
			//
	    		JScrollPane kaydirmapaneli = new JScrollPane();	
	    		//postgreSql bağlan
		postgresqlvericekme.baglan();
	    	Object ataObject=new EmptyBorder(0,0,0,0);// kenarlık olusturur  altta anlatılıyor 
	    	                                              //https://stackoverflow.com/questions/40759013/what-exactly-does-an-emptyborder-do
	    	
	    arayuzpanelim.setBorder((Border) ataObject);
	    
	   
		bTNButton.setText("KULLANİCİ TABLOSU");
		bTNButton.setBounds(250,0,880,20);//ilk ikisi xvey digerleri genislik ve yukseklik

		

	
		
	

		
	tablomodeli.setColumnCount(0);	
	tablomodeli.setRowCount(0);
	
		System.out.print("her selectsorgusu");
		System.out.print("sonucu setcolumn");
		System.out.println("ve setrowcount sifirladim");
		
		tablomodeli.setColumnIdentifiers(sutunlar);
	
		
		ResultSet sonuc = postgresqlvericekme.gonder(sorgu);
	
			
		
		
			while (sonuc.next()) {
				satirlar[0] = sonuc.getDate("kullanici_calisma_bas_tarihi");
				satirlar[1] = sonuc.getDate("kullanici_calisma_bitis_tarihi");
				satirlar[2] = sonuc.getInt("kullanici_calisma_saatleri");
				satirlar[3]=sonuc.getInt("kullanici_calisma_gun_sayisi");
				satirlar[4] = sonuc.getInt("kullanicino");
				satirlar[5] = sonuc.getInt("kullanicisifre");
				satirlar[6] = sonuc.getString("kullaniciad");
				satirlar[7]=sonuc.getString("kullanicisoyad");
				satirlar[8] = sonuc.getInt("kullanici_yemekmiktar");
				satirlar[9] = sonuc.getInt("kullanici_esyamiktar");
				satirlar[10] = sonuc.getInt("kullanici_paramiktar");
				//burdan itibaren degistirdim
				
				
				
			
		     		//
				
				
			
				tablomodeli.addRow(satirlar);
			}
			tablo.setModel(tablomodeli);
	        tablo.setGridColor(Color.RED);
	        
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0,0,1538,1538);//ilk ikisi şağa,aşagı kaydırma son ikisi ise genişlik ve yukselik ayarlamaları
		    setContentPane(arayuzpanelim);
			kaydirmapaneli.setBounds(0,35,1533,1533);//ilk ikisi tabloyu, şağa veya aşagı kaydırır  
		                                       //diğer ikisi tablo genişlik ve yukseklik
		    arayuzpanelim.add(kaydirmapaneli); 
		    arayuzpanelim.setLayout(null);	
		    arayuzpanelim.add(bTNButton);
		    kaydirmapaneli.setViewportView(tablo);
	}
}

*/
package prolab23hocaver;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class kullanici_tablo extends JFrame {
//arayuziçin değişkenler

	
	
    public JTable tablo=new JTable();
	
	DefaultTableModel tablomodeli = new DefaultTableModel();
	
	public JButton bTNButton=new JButton();
	
	public JPanel arayuzpanelim=new JPanel();
	
	String sorgu;

	
	
	Object[] satirlar = new Object[11];
    String sutunadlari[]=new String[] {"kulcalismabastarih","kulcalismabitistarih","kulcalismasaatleri","kulcalismagun",
    		"kulno","kulsifre","kulaad","kulsoyad","kulyemekmiktar","kulesyamiktar","kulparamiktar"};
	Object[] sutunlar = {sutunadlari[0],sutunadlari[1],sutunadlari[2],sutunadlari[3],sutunadlari[4],sutunadlari[5],sutunadlari[6],sutunadlari[7],sutunadlari[8],sutunadlari[9],sutunadlari[10]};
	
	public static void main(String[] args) {
		
		//matematiksel isleme gitme
		matematiksel_alimsatim_calisma.main(args);
		  
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kullanici_tablo frame = new kullanici_tablo();
				int	kontrolyapisi=1;
					if(kontrolyapisi==0)
		                       {
						frame.setVisible(false);
		                         }
					    else {
		              	frame.setVisible(true);
		                            }
				} catch (SQLException e) {
					System.err.println("tablo oluşturuken attı bu hatayı");
					e.printStackTrace();
				}
			}
		});
		
		
	}

	    kullanici_tablo() throws SQLException {
		
	    	int oyuncubelirtec=0;
	  	  
	    	//sorgu yapısının ğerçekleştirilmesi
		int kont=0;
		if(matematiksel_alimsatim_calisma.kisiString==null)
		{
	    sorgu = "select * from kullanici";
		kont=1;
		}
		//kullanici
			if(kont==0) 
			{
				
		
			if(matematiksel_alimsatim_calisma.kisiString.equals("kul1"))
			{
				sorgu = "select * from kullanici where kullanicisifre=10";
				oyuncubelirtec=1;
			}
			if(matematiksel_alimsatim_calisma.kisiString.equals("kul2"))
			{
	sorgu="select * from kullanici where kullanicisifre=20";
			oyuncubelirtec=2;
			}
			if(matematiksel_alimsatim_calisma.kisiString.equals("kul3"))
			{
			  	sorgu="select * from kullanici where kullanicisifre=30";
oyuncubelirtec=3;
			}
			if(matematiksel_alimsatim_calisma.kisiString.equals("kul4"))
			{
			  	sorgu="select * from kullanici where kullanicisifre=40";
oyuncubelirtec=4;
			}
		
			
			}
			
		
			//
	    		JScrollPane kaydirmapaneli = new JScrollPane();	
	    		//postgreSql bağlan
		postgresqlvericekme.baglan();
	    	Object ataObject=new EmptyBorder(0,0,0,0);// kenarlık olusturur  altta anlatılıyor 
	    	                                              //https://stackoverflow.com/questions/40759013/what-exactly-does-an-emptyborder-do
	    	
	    arayuzpanelim.setBorder((Border) ataObject);
	    
	   
		bTNButton.setText("KULLANİCİ TABLOSU");
		bTNButton.setBounds(250,0,880,20);//ilk ikisi xvey digerleri genislik ve yukseklik

		

	
		
	

		
	tablomodeli.setColumnCount(0);	
	tablomodeli.setRowCount(0);
	
		System.out.print("her selectsorgusu");
		System.out.print("sonucu setcolumn");
		System.out.println("ve setrowcount sifirladim");
		
		tablomodeli.setColumnIdentifiers(sutunlar);
	
		
		ResultSet sonuc = postgresqlvericekme.gonder(sorgu);
	
			
		
		
			while (sonuc.next()) {
				satirlar[0] = sonuc.getDate("kullanici_calisma_bas_tarihi");
				satirlar[1] = sonuc.getDate("kullanici_calisma_bitis_tarihi");
				satirlar[2] = sonuc.getInt("kullanici_calisma_saatleri");
				satirlar[3]=sonuc.getInt("kullanici_calisma_gun_sayisi");
				satirlar[4] = sonuc.getInt("kullanicino");
				satirlar[5] = sonuc.getInt("kullanicisifre");
				satirlar[6] = sonuc.getString("kullaniciad");
				satirlar[7]=sonuc.getString("kullanicisoyad");
				satirlar[8] = sonuc.getInt("kullanici_yemekmiktar");
				satirlar[9] = sonuc.getInt("kullanici_esyamiktar");
				satirlar[10] = sonuc.getInt("kullanici_paramiktar");
				//burdan itibaren degistirdim
				

			
			
				tablomodeli.addRow(satirlar);
			}
			
			
			int kullaniciyemekmiktar = 0;
			int kullaniciesyamiktar = 0;
			int kaybet=0;
			
			if(oyuncubelirtec!=0)
			{
			String sorgulamaString="select kullanici_yemekmiktar from kullanici where kullanicisifre="+String.valueOf(oyuncubelirtec)+"0";
			String sorgulamaString2="select kullanici_esyamiktar from kullanici where kullanicisifre="+String.valueOf(oyuncubelirtec)+"0";
				
			postgresqlvericekme.baglan();	
			ResultSet sonuc2=postgresqlvericekme.gonder(sorgulamaString);
			ResultSet sonuc3=postgresqlvericekme.gonder(sorgulamaString2);
			try {

				while (sonuc2.next()) {
						kullaniciyemekmiktar=sonuc2.getInt("kullanici_yemekmiktar");
				       	//	System.out.println("**"+isletmene);
				}
                        if(kullaniciyemekmiktar<=0)
                        {    kaybet=1;}
			
				}
				catch (Exception e) {
					// TODO: handle exception
					System.err.println("hata kullanici tbalosubda");
				}
			//kullanici
			try {

				while (sonuc3.next()) {
						kullaniciesyamiktar=sonuc3.getInt("kullanici_esyamiktar");
				       	//	System.out.println("**"+isletmene);
				}
				   if(kullaniciesyamiktar<=0)
                   {    kaybet=1;}
                               
			
				}
				catch (Exception e) {
					// TODO: handle exception
					System.err.println("hata kullanici tbalosubda");
				}
			
			
			
			
			
			if(kaybet==1)
			{
				
				kaybet=0;
			JOptionPane.showMessageDialog(null,"OYUN KAYBEDİLDİ","KAYBETME",JOptionPane.ERROR_MESSAGE);	
				System.exit(0);
			}
			
			}
		
	     		//
			
			
			
			
			
			
			
			tablo.setModel(tablomodeli);
	        tablo.setGridColor(Color.RED);
	        
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0,0,1538,1538);//ilk ikisi şağa,aşagı kaydırma son ikisi ise genişlik ve yukselik ayarlamaları
		    setContentPane(arayuzpanelim);
			kaydirmapaneli.setBounds(0,35,1533,1533);//ilk ikisi tabloyu, şağa veya aşagı kaydırır  
		                                       //diğer ikisi tablo genişlik ve yukseklik
		    arayuzpanelim.add(kaydirmapaneli); 
		    arayuzpanelim.setLayout(null);	
		    arayuzpanelim.add(bTNButton);
		    kaydirmapaneli.setViewportView(tablo);
	}
}