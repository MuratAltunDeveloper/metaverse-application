package prolab23hocaver;

import java.sql.ResultSet;
import java.sql.SQLException;

public class tablosifirlaemlak {
public static void main(String[] args) {
	
	


	
	
	 
	//Delete from ogrenci where ogrno = 50
			
	String sorgulamaString="delete from emlak";
	postgresqlvericekme.baglan();	
	try {
		postgresqlvericekme.gonder(sorgulamaString);

	} catch (Exception e) {
		// TODO: handle exception
		System.err.println("silindi");
	}
	
	
	
}
}
