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
import javax.swing.JPanel;
public class emlak_tablo extends JFrame {
//arayuziçin değişkenler
    public JTable tablo=new JTable();
	
	DefaultTableModel tablomodeli = new DefaultTableModel();
	
	public JButton bTNButton=new JButton();
	
	public JPanel arayuzpanelim=new JPanel();
	
	String sorgu;

	
	
	Object[] satirlar = new Object[8];
    String sutunadlari[]=new String[] {"emlak_komisyon","emlak_islemi","kirasuresi","satistarih","kiralama_baslamatarih","kiralama_bitistarihi","islem_yapanemlakci","isletmeninno"};
	Object[] sutunlar = {sutunadlari[0],sutunadlari[1],sutunadlari[2],sutunadlari[3],sutunadlari[4],sutunadlari[5],sutunadlari[6],sutunadlari[7]};
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					emlak_tablo frame = new emlak_tablo();
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

	    emlak_tablo() throws SQLException {
		//sorgu yapısının ğerçekleştirilmesi
		int kont=0;
	    	if(matematiksel_alimsatim_calisma.kisiString==null)
	    	{		
	    		
	    		    	sorgu = "select  * from emlak";
	    		    	kont=1;
	    	}
	    	
	
		//kullanici tablosu için
		if(kont==0)	
		{
			
			
		
		if(matematiksel_alimsatim_calisma.kisiString.equals("kul1"))
		{
			sorgu = "select * from emlak where isletmeninno IN(select oyunalanno from alan  where  oyunalantur LIKE '%1')";
			
		}
		if(matematiksel_alimsatim_calisma.kisiString.equals("kul2"))
		{
sorgu="select * from emlak where isletmeninno IN(select oyunalanno from alan  where  oyunalantur LIKE '%2')";
		}
		if(matematiksel_alimsatim_calisma.kisiString.equals("kul3"))
		{
		  	sorgu="select * from emlak where isletmeninno IN(select oyunalanno from alan  where  oyunalantur LIKE '%3')";

		}
		if(matematiksel_alimsatim_calisma.kisiString.equals("kul4"))
		{
		  	sorgu="select * from emlak where isletmeninno IN(select oyunalanno from alan  where  oyunalantur LIKE '%4')";

		}
		
		}
	    	//
		JScrollPane kaydirmapaneli = new JScrollPane();	
	    		//postgreSql bağlan
		postgresqlvericekme.baglan();
	    	Object ataObject=new EmptyBorder(15, 15, 15,15);
	    	
	    arayuzpanelim.setBorder((Border) ataObject);
	    
	   
		bTNButton.setText("EMLAK TABLOSU");
		bTNButton.setBounds(650,0,220,20);//ilk ikisi xvey digerleri genislik ve yukseklik

		

	
		
	

		
	tablomodeli.setColumnCount(0);	
	tablomodeli.setRowCount(0);
	
		System.out.print("her selectsorgusu");
		System.out.print("sonucu setcolumn");
		System.out.println("ve setrowcount sifirladim");
		
		tablomodeli.setColumnIdentifiers(sutunlar);
		
		ResultSet sonuc = postgresqlvericekme.gonder(sorgu);
	
			while (sonuc.next()) {
				satirlar[0] = sonuc.getInt("emlak_komisyon");
				satirlar[1] = sonuc.getString("emlak_islemi");
				satirlar[2] = sonuc.getInt("kirasuresi");
				satirlar[3]=sonuc.getDate("satistarih");
				satirlar[4]=sonuc.getDate("kiralama_baslamatarih");
				satirlar[5]=sonuc.getDate("kiralama_bitistarihi");
				satirlar[6]=sonuc.getString("islem_yapanemlakci");
				satirlar[7]=sonuc.getInt("isletmeninno");
				tablomodeli.addRow(satirlar);
			}
			tablo.setModel(tablomodeli);
	        tablo.setGridColor(Color.RED);
	        
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0,0,1500,1500);//ilk ikisi şağa,aşagı kaydırma son ikisi ise genişlik ve yukselik ayarlamaları
		    setContentPane(arayuzpanelim);
			kaydirmapaneli.setBounds(63, 26,1350,1350);//ilk ikisi tabloyu, şağa veya aşagı kaydırır  
		                                       //diğer ikisi tablo genişlik ve yukseklik
		    arayuzpanelim.add(kaydirmapaneli); 
		    arayuzpanelim.setLayout(null);	
		    arayuzpanelim.add(bTNButton);
		    kaydirmapaneli.setViewportView(tablo);
	}
}