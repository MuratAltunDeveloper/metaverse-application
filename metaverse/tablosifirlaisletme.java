package prolab23hocaver;

public class tablosifirlaisletme {
public static void main(String[] args) {
	//işletme tablosunu isletme tur yok sıfırlama
	
		postgresqlvericekme.baglan();
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
				
				{
				int x;
				String ataString=String.valueOf(i)+String.valueOf(j);
				x=Integer.parseInt(ataString);
				postgresqlvericekme.stringguncelle("isletme","yok","isletmetur","isletmeno ="+x);	
				}
		
			}
		}
		//işletme tablosunu isletmelevel  sıfırlama	
		postgresqlvericekme.baglan();
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
				
				{
				int x;
				String ataString=String.valueOf(i)+String.valueOf(j);
				x=Integer.parseInt(ataString);
				postgresqlvericekme.intguncelle("isletme","isletmelevel","0","isletmeno ="+x);	
				}
		
			}
		}
		//işletme tablosunu yoneticiisletucret  sıfırlama	
			postgresqlvericekme.baglan();
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
				{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
					
					{
					int x;
					String ataString=String.valueOf(i)+String.valueOf(j);
					x=Integer.parseInt(ataString);
					postgresqlvericekme.intguncelle("isletme","yoneticiisletucret","0","isletmeno ="+x);	
					}
			
				}
			}
			//işletme tablosunu kulisletmeucret  sıfırlama	
			postgresqlvericekme.baglan();
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
				{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
					
					{
					int x;
					String ataString=String.valueOf(i)+String.valueOf(j);
					x=Integer.parseInt(ataString);
					postgresqlvericekme.intguncelle("isletme","kulisletmeucret","0","isletmeno ="+x);	
					}
			
				}
			}
			//işletme tablosunu isletmekapasitesi  sıfırlama	
			postgresqlvericekme.baglan();
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
				{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
					
					{
					int x;
					String ataString=String.valueOf(i)+String.valueOf(j);
					x=Integer.parseInt(ataString);
					postgresqlvericekme.intguncelle("isletme","isletmekapasite","0","isletmeno ="+x);	
					}
			
				}
			}
			//işletme tablosunu isletmecalisansayi  sıfırlama	
			postgresqlvericekme.baglan();
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
				{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
					
					{
					int x;
					String ataString=String.valueOf(i)+String.valueOf(j);
					x=Integer.parseInt(ataString);
					postgresqlvericekme.intguncelle("isletme","isletmecalisansayi","0","isletmeno ="+x);	
					}
			
				}
			}
			//işletme tablosunu isletmefiyat  sıfırlama	
			postgresqlvericekme.baglan();
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
				{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
					
					{
					int x;
					String ataString=String.valueOf(i)+String.valueOf(j);
					x=Integer.parseInt(ataString);
					postgresqlvericekme.intguncelle("isletme","isletmefiyat","0","isletmeno ="+x);	
					}
			
				}
			}
			//işletme tablosunu kiraislet  sıfırlama	
			postgresqlvericekme.baglan();
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
				{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
					
					{
					int x;
					String ataString=String.valueOf(i)+String.valueOf(j);
					x=Integer.parseInt(ataString);
					postgresqlvericekme.intguncelle("isletme","kiraisletfiyat","0","isletmeno ="+x);	
					}
			
				}
			}
			//işletme tablosunu sbtgelirmiktar  sıfırlama	
			postgresqlvericekme.baglan();
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
				{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
					
					{
					int x;
					String ataString=String.valueOf(i)+String.valueOf(j);
					x=Integer.parseInt(ataString);
					postgresqlvericekme.intguncelle("isletme","sbtgelirmiktar","0","isletmeno ="+x);	
					}
			
				}
			}
			//işletme tablosunu sbtgeliroran  sıfırlama	
			postgresqlvericekme.baglan();
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
				{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
					
					{
					int x;
					String ataString=String.valueOf(i)+String.valueOf(j);
					x=Integer.parseInt(ataString);
					postgresqlvericekme.intguncelle("isletme","sbtgeliroran","0","isletmeno ="+x);	
					}
			
				}
			}
			//işletme tablosunu buseviyebaslatarihi  sıfırlama	
			postgresqlvericekme.baglan();
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=10;j++)
				{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
					
					{
					int x;
					String ataString=String.valueOf(i)+String.valueOf(j);
					x=Integer.parseInt(ataString);
					postgresqlvericekme.dateguncelle("isletme","buseviyebaslatarihi","01-01-0001","isletmeno ="+x);	
					}
			
				}
			}
		
		
		
		
}
}
