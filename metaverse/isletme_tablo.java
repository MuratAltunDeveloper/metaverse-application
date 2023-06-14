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
public class isletme_tablo extends JFrame {
//arayuziçin değişkenler
    public JTable tablo=new JTable();
	
	DefaultTableModel tablomodeli = new DefaultTableModel();
	
	public JButton bTNButton=new JButton();
	
	public JPanel arayuzpanelim=new JPanel();
	
	String sorgu;

	
	
	Object[] satirlar = new Object[12];
    String sutunadlari[]=new String[] {"isletmeno","isletmetur","yoneticiisletucret","kulisletmeucret","isletmelevel",
    		"isletmekapasite","isletmecalisansayi", "isletmefiyat","kiraisletfiyat" ,
    		"sbtgelirmiktar","sbtgeliroran","buseviyebaslatarihi"};
	Object[] sutunlar = {sutunadlari[0],sutunadlari[1],sutunadlari[2],sutunadlari[3],sutunadlari[4],sutunadlari[5],sutunadlari[6],sutunadlari[7],sutunadlari[8],sutunadlari[9],sutunadlari[10],sutunadlari[11]};
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					isletme_tablo frame = new isletme_tablo();
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

	    isletme_tablo() throws SQLException {
		//sorgu yapısının ğerçekleştirilmesi
		sorgu = "select  * from isletme";
		//Oyuncu tablosu için
		
		
		//
	    		JScrollPane kaydirmapaneli = new JScrollPane();	
	    		//postgreSql bağlan
		postgresqlvericekme.baglan();
	    	Object ataObject=new EmptyBorder(0,0,0,0);// kenarlık olusturur  altta anlatılıyor 
	    	                                              //https://stackoverflow.com/questions/40759013/what-exactly-does-an-emptyborder-do
	    	
	    arayuzpanelim.setBorder((Border) ataObject);
	    
	   
		bTNButton.setText("İSLETME TABLOSU");
		bTNButton.setBounds(250,0,880,20);//ilk ikisi xvey digerleri genislik ve yukseklik

		

	
		
	

		
	tablomodeli.setColumnCount(0);	
	tablomodeli.setRowCount(0);
	
		System.out.print("her selectsorgusu");
		System.out.print("sonucu setcolumn");
		System.out.println("ve setrowcount sifirladim");
		
		tablomodeli.setColumnIdentifiers(sutunlar);
		
		ResultSet sonuc = postgresqlvericekme.gonder(sorgu);
	
			while (sonuc.next()) {
				satirlar[0] = sonuc.getInt("isletmeno");
				satirlar[1] = sonuc.getString("isletmetur");
				satirlar[2] = sonuc.getInt("yoneticiisletucret");
				satirlar[3]=sonuc.getInt("kulisletmeucret");
				satirlar[4] = sonuc.getInt("isletmelevel");
				satirlar[5] = sonuc.getInt("isletmekapasite");
				satirlar[6] = sonuc.getInt("isletmecalisansayi");
				satirlar[7]=sonuc.getInt("isletmefiyat");
				satirlar[8] = sonuc.getInt("kiraisletfiyat");
				satirlar[9] = sonuc.getInt(	"sbtgelirmiktar");
				satirlar[10] = sonuc.getInt("sbtgeliroran");
				satirlar[11]=sonuc.getDate("buseviyebaslatarihi");
			
				
				
				tablomodeli.addRow(satirlar);
			}
			tablo.setModel(tablomodeli);
	        tablo.setGridColor(Color.RED);
	        //1538 1538
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0,0,1500,1500);//ilk ikisi şağa,aşagı kaydırma son ikisi ise genişlik ve yukselik ayarlamaları
		    setContentPane(arayuzpanelim);
			kaydirmapaneli.setBounds(0,35,1400,750);//ilk ikisi tabloyu, şağa veya aşagı kaydırır  
		                                       //diğer ikisi tablo genişlik ve yukseklik
		    arayuzpanelim.add(kaydirmapaneli); 
		    arayuzpanelim.setLayout(null);	
		    arayuzpanelim.add(bTNButton);
		    kaydirmapaneli.setViewportView(tablo);
	}
}