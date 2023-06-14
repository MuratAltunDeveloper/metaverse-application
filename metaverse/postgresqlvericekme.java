package prolab23hocaver;


import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class postgresqlvericekme {
	
	static String urlokuString = "jdbc:postgresql://localhost:5432/prolab23";
	static Connection conn=null;
	
	static void baglan()
	{
	
		try {
			conn = DriverManager.getConnection(urlokuString,"postgres","1071");
			System.out.println("Bağlantı gerçekleşti!");
			System.out.print("başarılı bağlantı");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("hata -postgresqlvericekmesınıfından baglanma fonksiyonu-");
			e.printStackTrace();
		}
	}
	
	


	static ResultSet gonder(String sorgu) {
		try {
			Statement ifade = conn.createStatement();
			ResultSet sorgual = ifade.executeQuery(sorgu);
			return sorgual;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("hata -postgresqlvericekmesınıfından gonder fonksiyonu-");
			
			e.printStackTrace();
			return null;
		}
	}

	
	
	public static void stringguncelle(String tabloadi,String gunceledegeratString,String neguncellenecekString,String sart)
	{
		
		if(sart.equals(""))
		{
		
		String donecekolanString="";
		donecekolanString="update "+tabloadi+" set"+" "+neguncellenecekString+"="+"'"+gunceledegeratString+"'";
		
		System.out.println(donecekolanString);
		
		try {
			Statement guncellemeStatement=conn.createStatement();
			guncellemeStatement.executeUpdate(donecekolanString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("\n\n hata postgreslveriçek string guncelle");
			e.printStackTrace();
		}
		}	
		else {

			
			String donecekolanString="";
			donecekolanString="update "+tabloadi+" set"+" "+neguncellenecekString+"="+"'"+gunceledegeratString+"'"+"where "+sart;
			
			System.out.println(donecekolanString);
			
			try {
				Statement guncellemeStatement=conn.createStatement();
				guncellemeStatement.executeUpdate(donecekolanString);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("\n\n hata postgreslveriçek string guncelle");
				e.printStackTrace();
			}
			
		}
	
	}
	public static void intguncelle(String tabloadi,String neguncellenecek,String guncellenecegedegeratama,String sart )
	{

		
		if(sart.equals(""))
		{
		String donecekolanString="";
		donecekolanString="update "+tabloadi+" set"+" "+neguncellenecek+"="+guncellenecegedegeratama;
		
		System.out.println(donecekolanString.toUpperCase());
		
		
		try {
			Statement guncellemeStatement=conn.createStatement();
			guncellemeStatement.executeUpdate(donecekolanString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("\n\n hata postgreslveriçek string guncelle");
			e.printStackTrace();
		}
		}
		else {

			String donecekolanString="";
			donecekolanString="update "+tabloadi+" set"+" "+neguncellenecek+"="+guncellenecegedegeratama+" where "+sart;
			
			System.out.println(donecekolanString.toUpperCase());
			
			
			try {
				Statement guncellemeStatement=conn.createStatement();
				guncellemeStatement.executeUpdate(donecekolanString);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("\n\n hata postgreslveriçek string guncelle");
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	public static void dateguncelle(String tabloadi,String neguncellenecek,String guncellenecegedegeratama,String sart )
	{

		
		if(sart.equals(""))
		                 {
		String donecekolanString="";
		donecekolanString="update "+tabloadi+" set"+" "+neguncellenecek+"="+"'"+guncellenecegedegeratama+"'";
		
		System.out.println(donecekolanString.toUpperCase());
		
		
		try {
			Statement guncellemeStatement=conn.createStatement();
			guncellemeStatement.executeUpdate(donecekolanString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("\n\n hata postgreslveriçek string guncelle");
			e.printStackTrace();
		}
		                  }
		else
        {
String donecekolanString="";
donecekolanString="update "+tabloadi+" set"+" "+neguncellenecek+"="+"'"+guncellenecegedegeratama+"'"+" where "+sart;

System.out.println(donecekolanString.toUpperCase());


try {
Statement guncellemeStatement=conn.createStatement();
guncellemeStatement.executeUpdate(donecekolanString);
} catch (SQLException e) {
// TODO Auto-generated catch block
System.err.println("\n\n hata postgreslveriçek string guncelle");
e.printStackTrace();
}
         }
		
		
	}
	//burası sonraki deneme kısmı insert
	public static void insert_rowemlak(Connection conn,String name,String emlak_komisyon,String emlak_islemi,String  kirasuresi,String  satistarih,String  kiralama_baslamatarih,String  kiralama_bitistarihi,String islem_yapanemlakci,String isletmeninno)
	{Statement ifadeStatement;
	try {
		
	String sorguString=String.format("insert into  "+name +"(emlak_komisyon,emlak_islemi,kirasuresi,satistarih,kiralama_baslamatarih,kiralama_bitistarihi,islem_yapanemlakci,isletmeninno)values"+"("+emlak_komisyon+","+"'"+emlak_islemi+"'"+","+kirasuresi+","+"'"+satistarih+"'"+","+"'"+kiralama_baslamatarih+"'"+","+"'"+kiralama_bitistarihi+"'"+","+"'"+islem_yapanemlakci+"'"+","+isletmeninno+")");
	
	System.out.println(sorguString.toUpperCase());
	ifadeStatement=conn.createStatement();
	ifadeStatement.executeUpdate(sorguString);
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
//satmıycam kiralıycam
		LocalDate now=LocalDate.now();
		
		dateguncelle("emlak","satistarih","9000-09-09","isletmeninno="+isletmeninno);
		dateguncelle("emlak","kiralama_baslamatarih",String.valueOf(now),"isletmeninno="+isletmeninno);
		intguncelle("emlak","kirasuresi","1","isletmeninno="+isletmeninno);
		dateguncelle("emlak","kiralama_bitistarihi",String.valueOf(now.plusMonths(1)),"isletmeninno="+isletmeninno);
	     stringguncelle("emlak","kira","emlak_islemi","isletmeninno="+isletmeninno);
		
		yonetici_isletmeleri.kiraalanno=isletmeninno;
		yonetici_isletmeleri.kiraisletmetipString="mevcut olan"+isletmeninno+" nolu isletmenin";
		
		
		
		
		yonetici_isletmeleri.mevcut=1;
		yonetici_teklifleri.mevcut2=1;
		
		
		//
		kullanicinin_isletmeleri.mevcut3=1;
		kullanicinin_verdiğteklifler.mevcut4=1;
	    kullanicinin_isletmeleri.kiraalanno=isletmeninno;
		kullanicinin_isletmeleri.kiraisletmetipString="mevcut olan"+isletmeninno+"nolu isletmenin";
		
	System.err.println("postgresql insert_row fonksiyonunda");
	System.out.println(e);
	}
	
		
		
	}
	
	public static void insert_rowemlak2(Connection conn,String name,String emlak_komisyon,String emlak_islemi,String  kirasuresi,String  satistarih,String  kiralama_baslamatarih,String  kiralama_bitistarihi,String islem_yapanemlakci,String isletmeninno)
	{Statement ifadeStatement;
	try {
		
		System.err.println("try insert_row emlak");
	String sorguString=String.format("insert into  "+name +"(emlak_komisyon,emlak_islemi,kirasuresi,satistarih,kiralama_baslamatarih,kiralama_bitistarihi,islem_yapanemlakci,isletmeninno)values"+"("+emlak_komisyon+","+"'"+emlak_islemi+"'"+","+kirasuresi+","+"'"+satistarih+"'"+","+"'"+kiralama_baslamatarih+"'"+","+"'"+kiralama_bitistarihi+"'"+","+"'"+islem_yapanemlakci+"'"+","+isletmeninno+")");
	
	System.out.println(sorguString.toUpperCase());
	ifadeStatement=conn.createStatement();
	ifadeStatement.executeUpdate(sorguString);
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
//satmıycam kiralıycam
		LocalDate now=LocalDate.now();
		
		dateguncelle("emlak","satistarih","9000-09-09","isletmeninno="+isletmeninno);
		dateguncelle("emlak","kiralama_baslamatarih",String.valueOf(now),"isletmeninno="+isletmeninno);
		intguncelle("emlak","kirasuresi","1","isletmeninno="+isletmeninno);
		dateguncelle("emlak","kiralama_bitistarihi",String.valueOf(now.plusMonths(1)),"isletmeninno="+isletmeninno);
	     stringguncelle("emlak","kira","emlak_islemi","isletmeninno="+isletmeninno);
		
	
		
		kullanicinin_isletmeleri.mevcut3=1;
		kullanicinin_verdiğteklifler.mevcut4=1;
	    kullanicinin_isletmeleri.kiraalanno=isletmeninno;
		kullanicinin_isletmeleri.kiraisletmetipString="mevcut olan"+isletmeninno+"nolu isletmenin";
		
	System.err.println("postgresql insert_row fonksiyonunda");
	System.out.println(e);
	}
	
	
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("");


	}

}
