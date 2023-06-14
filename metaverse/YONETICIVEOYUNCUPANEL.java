package prolab23hocaver;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class YONETICIVEOYUNCUPANEL {
 //her bir kullanicimin markettemi magaza emlak calısıyor belirle
 public static	String kul1isyerString="market";
 public static	String kul2isyerString="market";
 public static	String kul3isyerString="magaza";
 public static	String kul4isyerString="emlak";
	
	
 public static int kul1aylikpara=100;
 public static int kul2aylikpara=100;
 public static int kul3aylikpara=100;
 public static int kul4aylikpara=100;
	
	
	
 public static int sifreata;
	static int kontalan=0;	
	static int gunlukazalma=50;	

	public static void azaltmafonk(int deger)
	{
	gunlukazalma=deger;	
	}
	
	
	
	
	public static void main(String[] args) {
	int secim=JOptionPane.showConfirmDialog(null,"yönetici paneli ise evet oyuncu paneli ise hayir","panel secici",JOptionPane.YES_NO_OPTION);
	
	if(secim==JOptionPane.YES_OPTION)
	{
		int alanolustur = 0;
		gridalan.alanal();
		System.out.println("yönetici panel");
		JFrame  yonetici=new JFrame();
		//alan tablo buton
		JButton alantablobButton=new JButton();
		alantablobButton.setText("alan_tablo");
		alantablobButton.setBounds(10,10,150,30);
		//baslangicdegerler tablo buton
		JButton baslangicdegerlerButton=new JButton();
		baslangicdegerlerButton.setText("baslangicdegerler_tablo");
		baslangicdegerlerButton.setBounds(170,10,200,30);
		//emlak tablo butonu
		JButton emlaktabloButton=new JButton();
		emlaktabloButton.setText("emlak_tablo");
		emlaktabloButton.setBounds(380,10,150,30);
		//gunluk gider tablosu
		JButton gunlukgidertabloButton=new JButton();
		gunlukgidertabloButton.setText("gunlukgider_tablo");
		gunlukgidertabloButton.setBounds(540,10,150,30);
		//isletme tablosu
		JButton isletmetabloButton=new JButton();
		isletmetabloButton.setText("isletme_tablo");
		isletmetabloButton.setBounds(700,10,150,30);
		//kullanici tablosu butonu
		JButton kullanicitabloButton=new JButton();
		 kullanicitabloButton.setText("kullanici_tablo");
		 kullanicitabloButton.setBounds(860,10,150,30);
		//ucretlendirme tablosu buton
		 JButton ucretlendirmetabloButton=new JButton();
			ucretlendirmetabloButton.setText("ucretlendirme_tablo");
			ucretlendirmetabloButton.setBounds(1023,10,150,30);
		
		// yoneticinin isletmelerini göster
			JButton yoneticiisletmeButton=new JButton();
			yoneticiisletmeButton.setText("yonetici_isletmeleri");
		    yoneticiisletmeButton.setBounds(10,50,150,30);
		 //yonetici teklif
		    JButton yoneticiteklifButton=new JButton();
			yoneticiteklifButton.setText("yonetici_teklifleri");
		    yoneticiteklifButton.setBounds(170,50,150,30);
		//ızgara
		    JButton izgaraButton=new JButton();
		    izgaraButton.setText("ızgara");
            izgaraButton.setBounds(330,50,150,30);
            //oyuncu tablosuna gitme butonu
          //oyuncu tablosuna gitme
		    JButton oyuncutabloButton=new JButton();
		    oyuncutabloButton.setText("oyuncutablosuna git");
            oyuncutabloButton.setBounds(490,50,190,30);
            //gunlukazalma ayarlama
            JButton azaltmaButton=new JButton();
		      azaltmaButton.setText("degerazaltma git");
              azaltmaButton.setBounds(710,50,150,30);
           //yonetici toplam butonnu
              JButton yoneticitoplamButton=new JButton();
		      yoneticitoplamButton.setText("heratladaisletmeler");
              yoneticitoplamButton.setBounds(870,50,150,30);
           //e/r diyagramı ve normalizasyon adımları
              JButton erButton1=new JButton();
		      erButton1.setText("er diyagramı ");
              erButton1.setBounds(930,50,150,30);
             
              //  normalizasyon adımları
              JButton normalizasyonButton=new JButton();
		      normalizasyonButton.setText("normalizasyon diyagramı ");
              normalizasyonButton.setBounds(1090,50,250,30);
           
		   //hangi butona tıkladık onun durumu
            izgaraButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
						izgara.main(args);
						
						//iZGARA CEKME İSLEMİ
						System.out.println(gridalan.alansatir+"-"+gridalan.alansutun);
				  		for(int i=0;i<gridalan.alansatir;i++)
				  		{
				  			for(int j=0;j<gridalan.alansutun;j++)
				  			{
				  				System.out.println(izgara.izgaradizi[i][j]);
				  			}
				  			System.out.println(" ");
				  		}
				  		
						
				
						
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
            
            yoneticiteklifButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					yonetici_teklifleri.main(args);
				}
			});
          
           yoneticiisletmeButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					yonetici_isletmeleri.main(args);
				}
			});
       
           ucretlendirmetabloButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					ucretlendirme.main(args);
				}
			});
           kullanicitabloButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					kullanici_tablo.main(args);
				}
			});
           isletmetabloButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					isletme_tablo.main(args);
				}
			});
           gunlukgidertabloButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					gunlukgider_tablo.main(args);
		
				}
			});
           emlaktabloButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					emlak_tablo.main(args);
				}
			});
           
           baslangicdegerlerButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					baslangicdegerler_tablo.main(args);
				}
			});
           alantablobButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					alan_tablo.main(args);
				}
			});
          
           oyuncutabloButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					YONETICIVEOYUNCUPANEL.main(args);
				}
			});
         
           azaltmaButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					
				String alString=JOptionPane.showInputDialog("ne kadar azaltma olsun");
				int ata=Integer.parseInt(alString);	
					
				YONETICIVEOYUNCUPANEL.azaltmafonk(ata);
				System.out.println("---------------ata"+ata);
				}
			});
           yoneticitoplamButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				yonetici_isletmeleri.herzamanatlamadaneisletti();
				}
			});
           erButton1.addActionListener(new ActionListener() {
				
       				@Override
       				public void actionPerformed(ActionEvent e) {
       					// TODO Auto-generated method stub
       				try {
						erdiyagram.main(args);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
       				}
       			});
           normalizasyonButton.addActionListener(new ActionListener() {
        		@Override
   				public void actionPerformed(ActionEvent e) {
        		normalizasyonadımları.main(args);
        		}
  			
  			});
   
          normalizasyonButton.setVisible(true); 
	  	erButton1.setVisible(true);	
	  	azaltmaButton.setVisible(true);	
	  	oyuncutabloButton.setVisible(true);	
        izgaraButton.setVisible(true);    
		yoneticiteklifButton.setVisible(true);
		//yoneticitoplamButton.setVisible(true);    
		yoneticiisletmeButton.setVisible(true);    
			ucretlendirmetabloButton.setVisible(true);
		kullanicitabloButton.setVisible(true);
		isletmetabloButton.setVisible(true);
		gunlukgidertabloButton.setVisible(true);
		emlaktabloButton.setVisible(true);
		baslangicdegerlerButton.setVisible(true);
		alantablobButton.setVisible(true);
		//ekleme
		yonetici.add(normalizasyonButton);
		yonetici.add(erButton1);
		yonetici.add(azaltmaButton);
		yonetici.add(izgaraButton);
		yonetici.add(yoneticiteklifButton);
		//yonetici.add(yoneticitoplamButton);
		yonetici.add(yoneticiisletmeButton);
	    yonetici.add(oyuncutabloButton);
		yonetici.add(ucretlendirmetabloButton);
		yonetici.add(kullanicitabloButton);
		yonetici.add(isletmetabloButton);
		yonetici.add(gunlukgidertabloButton);
		yonetici.add(baslangicdegerlerButton);
		yonetici.add(emlaktabloButton); 
		yonetici.add(alantablobButton);
		    yonetici.setLayout(null);
		    yonetici.setSize(1500,1500);
		    yonetici.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  		yonetici.setVisible(true);
	  		
	  	
	  		

	  		
	  				
	}
	else if(secim==JOptionPane.NO_OPTION)
	{
		
		JFrame oyuncu=new JFrame();
		
		
		
		System.out.println("oyuncu sectim");
		String kullaniciadString="yok";
		String kullanicisifreString="0";
		int kullanicisifre=0;
		//ad ve sifre alma kısmı
		int kont=0;
		
		while(kont==0)
		{
		kullaniciadString=JOptionPane.showInputDialog("kullanıcı adınızı giriniz:");
		
		
		if(kullaniciadString.equals("kul1"))
		{
		kont=1;	
		}
		else if(kullaniciadString.equals("kul2"))
		{
			kont=1;
		}
		else if(kullaniciadString.equals("kul3"))
		{
			kont=1;
		}
		else if(kullaniciadString.equals("kul4"))
		{
			kont=1;
		}
		else {
			JOptionPane.showMessageDialog(null,"tekrar kullanici ad gir!");
		}
		
		
		}
		
		int kont2=0;
		int kullanicisifreString2=0;
		
		while(kont2==0)
		{
			
	      	kullanicisifreString=JOptionPane.showInputDialog("kullanıcı sifrenizi giriniz:");
          
		   kullanicisifreString2=Integer.parseInt(kullanicisifreString);
			
			if(kullanicisifreString2==10)
			{
			kont2=1;
			kullanicisifre=10;
			}
			else if(kullanicisifreString2==20)
			{
				kont2=1;
				kullanicisifre=20;
				
			}
			else if(kullanicisifreString2==30)
			{
				kont2=1;
				kullanicisifre=30;
			}
			else if(kullanicisifreString2==40)
			{
				kont2=1;
				kullanicisifre=40;
			}
			else {
				JOptionPane.showMessageDialog(null,"tekrar kullanici sifre gir!");
			}	
			
			
		}
		
          
		   matematiksel_alimsatim_calisma.kim(kullaniciadString, kullanicisifre);      
           sifreata=kullanicisifre;
           
			  
		
		//alan tablo buton
				JButton alantablobButton=new JButton();
				alantablobButton.setText("alan_tablo");
				alantablobButton.setBounds(10,10,150,30);
				//baslangicdegerler tablo buton
				JButton baslangicdegerlerButton=new JButton();
				baslangicdegerlerButton.setText("baslangicdegerler_tablo");
				baslangicdegerlerButton.setBounds(170,10,200,30);
				//emlak tablo butonu
				JButton emlaktabloButton=new JButton();
				emlaktabloButton.setText("emlak_tablo");
				emlaktabloButton.setBounds(380,10,150,30);
				//gunluk gider tablosu
				JButton gunlukgidertabloButton=new JButton();
				gunlukgidertabloButton.setText("gunlukgider_tablo");
				gunlukgidertabloButton.setBounds(540,10,150,30);
				//isletme tablosu
				JButton isletmetabloButton=new JButton();

                isletmetabloButton.setText("isletme_tablo");
				isletmetabloButton.setBounds(700,10,150,30);
				//kullanici tablosu butonu
				JButton kullanicitabloButton=new JButton();
				 kullanicitabloButton.setText("kullanici_tablo");
				 kullanicitabloButton.setBounds(860,10,150,30);
				//ucretlendirme tablosu buton
				 JButton ucretlendirmetabloButton=new JButton();
					ucretlendirmetabloButton.setText("ucretlendirme_tablo");
					ucretlendirmetabloButton.setBounds(1023,10,150,30);
				//teklif alma
					JButton teklifalButton=new JButton();
					teklifalButton.setText("kabulettiğiteklifler");
		            teklifalButton.setBounds(10,50,220,30);
		
		       //teklifverme
		            JButton teklifvermeButton=new JButton();
		            teklifvermeButton.setText("verdiğiteklifler");
		            teklifvermeButton.setBounds(250,50,180,30);
		
		          //ızgara
				    JButton izgaraButton=new JButton();
				    izgaraButton.setText("ızgara");
		            izgaraButton.setBounds(500,50,150,30); 
		            // //ızgara
				    JButton kullaniciisletmeleriButton=new JButton();
				    kullaniciisletmeleriButton.setText("kullanicinin_isletmeleri");
		            kullaniciisletmeleriButton.setBounds(660,50,250,30); 
		           //giderler
		            JButton giderlerButton=new JButton();
				     giderlerButton.setText("giderler");
		             giderlerButton.setBounds(940,50,250,30); 
		      
		       
		           ucretlendirmetabloButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
					ucretlendirme.main(args);
						}
					});
		           kullanicitabloButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							kullanici_tablo.main(args);
						}
					});
		           isletmetabloButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							isletme_tablo.main(args);
						}
					});
		           gunlukgidertabloButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							gunlukgider_tablo.main(args);
						}
					});
		           emlaktabloButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							emlak_tablo.main(args);
						}
					});
		           
		           baslangicdegerlerButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							baslangicdegerler_tablo.main(args);
						}
					});
		           alantablobButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							alan_tablo.main(args);
						}
					});
		           
		            
		            
		            
		           teklifalButton.addActionListener(new ActionListener() {
		  				
		  				@Override
		  				public void actionPerformed(ActionEvent e) {
		  					// TODO Auto-generated method stub
		  		         kullanicinin_aldigiteklifler.main(args);
		  				}
		  			});
		            teklifvermeButton.addActionListener(new ActionListener() {
		  				
		  				@Override
		  				public void actionPerformed(ActionEvent e) {
		  					// TODO Auto-generated method stub
		  					kullanicinin_verdiğteklifler.main(args);
		  				}
		  			});
		        
                  izgaraButton.addActionListener(new ActionListener() {
		  				
		  				@Override
		  				public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							try {
								izgara.main(args);
								
								//iZGARA CEKME İSLEMİ
								System.out.println(gridalan.alansatir+"-"+gridalan.alansutun);
						  		for(int i=0;i<gridalan.alansatir;i++)
						  		{
						  			for(int j=0;j<gridalan.alansutun;j++)
						  			{
						  				System.out.println(izgara.izgaradizi[i][j]);
						  			}
						  			System.out.println(" ");
						  		}
						  		
								
						
								
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
		  			});
                  teklifvermeButton.addActionListener(new ActionListener() {
		  				
		  				@Override
		  				public void actionPerformed(ActionEvent e) {
		  					// TODO Auto-generated method stub
		  					
		  				}
		  			});
                  kullaniciisletmeleriButton.addActionListener(new ActionListener() {
		  				
		  				@Override
		  				public void actionPerformed(ActionEvent e) {
		  					// TODO Auto-generated method stub
		  					kullanicinin_isletmeleri.main(args);
		  				}
		  			});
		           
                  giderlerButton.addActionListener(new ActionListener() {
		  				
		  				@Override
		  				public void actionPerformed(ActionEvent e) {
		  					// TODO Auto-generated method stub
		  				oyuncugiderler.main(args);
		  				}
		  			});
		           
		           
		           
		           
		        
		           
		            
	    
		            
		
		giderlerButton.setVisible(true);
		kullaniciisletmeleriButton.setVisible(true);
		izgaraButton.setVisible(true);
		teklifvermeButton.setVisible(true);
		teklifalButton.setVisible(true);
		ucretlendirmetabloButton.setVisible(true);
		kullanicitabloButton.setVisible(true);
		isletmetabloButton.setVisible(true);
		gunlukgidertabloButton.setVisible(true);
		emlaktabloButton.setVisible(true);
		baslangicdegerlerButton.setVisible(true);
		alantablobButton.setVisible(true);
		
	
		//oyuncu frame add kısmı
		oyuncu.add(giderlerButton);
		oyuncu.add(izgaraButton);
		oyuncu.add(teklifvermeButton);
		oyuncu.add(teklifalButton);	
		oyuncu.add(ucretlendirmetabloButton);
		oyuncu.add(kullanicitabloButton);
		oyuncu.add(isletmetabloButton);
		oyuncu.add(gunlukgidertabloButton);
		oyuncu.add(baslangicdegerlerButton);
		oyuncu.add(emlaktabloButton); 
		oyuncu.add(alantablobButton);
		oyuncu.add(kullaniciisletmeleriButton);
		
		  oyuncu.setLayout(null);
		  oyuncu.setSize(1500,1500);
		  oyuncu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	  oyuncu.setVisible(true);
		
		
		
		
		
	}
	
	
	
	
	
	
	}

}
