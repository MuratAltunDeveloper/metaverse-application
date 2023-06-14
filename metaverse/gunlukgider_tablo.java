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
public class gunlukgider_tablo extends JFrame {
//arayuziçin değişkenler
    public JTable tablo=new JTable();
	
	DefaultTableModel tablomodeli = new DefaultTableModel();
	
	public JButton bTNButton=new JButton();
	
	public JPanel arayuzpanelim=new JPanel();
	
	String sorgu;

	
	
	Object[] satirlar = new Object[4];
    String sutunadlari[]=new String[] {"gunluk_yiyecekgider","gunluk_esyagider","gunluk_paragider","calisilanyer"};
	Object[] sutunlar = {sutunadlari[0],sutunadlari[1],sutunadlari[2],sutunadlari[3]};
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gunlukgider_tablo frame = new gunlukgider_tablo();
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

	    gunlukgider_tablo() throws SQLException {
		//sorgu yapısının ğerçekleştirilmesi
		sorgu = "select * from gunlukgider";
		//OYUNCULAR İÇİN
		
		
		
		
		
		
		
		
		//
	    		JScrollPane kaydirmapaneli = new JScrollPane();	
	    		//postgreSql bağlan
		postgresqlvericekme.baglan();
	    	Object ataObject=new EmptyBorder(15, 15, 15,15);
	    	
	    arayuzpanelim.setBorder((Border) ataObject);
	    
	   
		bTNButton.setText("GUNLUKGİDER TABLOSU");
		bTNButton.setBounds(250,0,220,20);//ilk ikisi xvey digerleri genislik ve yukseklik

		

	
		
	

		
	tablomodeli.setColumnCount(0);	
	tablomodeli.setRowCount(0);
	
		System.out.print("her selectsorgusu");
		System.out.print("sonucu setcolumn");
		System.out.println("ve setrowcount sifirladim");
		
		tablomodeli.setColumnIdentifiers(sutunlar);
		
		ResultSet sonuc = postgresqlvericekme.gonder(sorgu);
	
			while (sonuc.next()) {
				satirlar[0] = sonuc.getInt("gunluk_yiyecekgider");
				satirlar[1] = sonuc.getInt("gunluk_esyagider");
				satirlar[2] = sonuc.getInt("gunluk_paragider");
				satirlar[3]=sonuc.getString("calisilanyer");
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