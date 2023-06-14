
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

import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class alan_tablo extends JFrame {
//arayuziçin değişkenler
    public JTable tablo=new JTable();
	
	DefaultTableModel tablomodeli = new DefaultTableModel();
	
	public JButton bTNButton=new JButton();
	
	public JPanel arayuzpanelim=new JPanel();
	
	String sorgu;

public static	String alanObject[][]=new String[10][10];
	
	Object[] satirlar = new Object[5];
    String sutunadlari[]=new String[] {"oyunalani_satirboy","oyunalani_sutunboy","oyunalanno","oyunalantur","kullanicisifrealan"};
	Object[] sutunlar = {sutunadlari[0],sutunadlari[1],sutunadlari[2],sutunadlari[3],sutunadlari[4]};
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alan_tablo frame = new alan_tablo();
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

	    alan_tablo() throws SQLException {
		//sorgu yapısının ğerçekleştirilmesi
	int kont=0;
	
	if(matematiksel_alimsatim_calisma.kisiString==null)
	{
		postgresqlvericekme.intguncelle("alan","kullanicisifrealan" , String.valueOf(0),"");

		
		
	    	sorgu="select * from alan order by oyunalanno asc "; 
	    	kont=1;
	}
	    	
	    	
//oyuncu tablosu için yapılandırıldı
	
	
	if(kont==0)
	{
		
	if(matematiksel_alimsatim_calisma.kisiString.equals("kul1"))
	{
		postgresqlvericekme.intguncelle("alan","kullanicisifrealan" , String.valueOf(10),"");


		sorgu="select * from alan  where  oyunalantur LIKE '%1' order by oyunalanno asc";

	}
	if(matematiksel_alimsatim_calisma.kisiString.equals("kul2"))
	{
		postgresqlvericekme.intguncelle("alan","kullanicisifrealan" , String.valueOf(20),"");


		
	  	sorgu="select * from alan  where  oyunalantur LIKE '%2' order by oyunalanno asc"; 

	}
	if(matematiksel_alimsatim_calisma.kisiString.equals("kul3"))
	{
		postgresqlvericekme.intguncelle("alan","kullanicisifrealan" , String.valueOf(30),"");


		
	  	sorgu="select * from alan  where  oyunalantur LIKE '%3' order by oyunalanno asc"; 

	}
	if(matematiksel_alimsatim_calisma.kisiString.equals("kul4"))
	{
		postgresqlvericekme.intguncelle("alan","kullanicisifrealan" , String.valueOf(40),"");


		
	  	sorgu="select * from alan  where  oyunalantur LIKE '%4' order by oyunalanno asc"; 

	}
	

	}
	
	
	
	
	
	
	
	
	
	
	
		
		
	//	
	    		JScrollPane kaydirmapaneli = new JScrollPane();	
	    		//postgreSql bağlan
		postgresqlvericekme.baglan();
	    	Object ataObject=new EmptyBorder(15, 15, 15,15);
	    	
	    arayuzpanelim.setBorder((Border) ataObject);
	    
	   
		bTNButton.setText("ALAN TABLOSU");
		bTNButton.setBounds(300,0,220,20);//ilk ikisi xvey digerleri genislik ve yukseklik

		

	
	
	

		
	tablomodeli.setColumnCount(0);	
	tablomodeli.setRowCount(0);
	
		System.out.print("her selectsorgusu");
		System.out.print("sonucu setcolumn");
		System.out.println("ve setrowcount sifirladim");
		
		tablomodeli.setColumnIdentifiers(sutunlar);
		
		ResultSet sonuc = postgresqlvericekme.gonder(sorgu);
	int i=0,j=0;
	
			while (sonuc.next()) {
				satirlar[0] = sonuc.getInt("oyunalani_satirboy");
				satirlar[1] = sonuc.getInt("oyunalani_sutunboy");
				satirlar[2] = sonuc.getInt("oyunalanno");
				satirlar[3]=sonuc.getString("oyunalantur");
				satirlar[4]=sonuc.getInt("kullanicisifrealan");
			//oyunalan cek
				alanObject[i][j]=sonuc.getInt("oyunalanno")+"-"+sonuc.getString("oyunalantur");
				
				
				tablomodeli.addRow(satirlar);
			}
			tablo.setModel(tablomodeli);
	        tablo.setGridColor(Color.RED);
	        
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0,0,1200,1200);//ilk ikisi şağa,aşagı kaydırma son ikisi ise genişlik ve yukselik ayarlamaları
		    setContentPane(arayuzpanelim);
			kaydirmapaneli.setBounds(63, 26,700,700);//ilk ikisi tabloyu, şağa veya aşagı kaydırır  
		                                       //diğer ikisi tablo genişlik ve yukseklik
		    arayuzpanelim.add(kaydirmapaneli); 
		    arayuzpanelim.setLayout(null);	
		    arayuzpanelim.add(bTNButton);
		    kaydirmapaneli.setViewportView(tablo);
	}
}