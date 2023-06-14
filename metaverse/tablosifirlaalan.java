package prolab23hocaver;

import java.sql.ResultSet;
import java.sql.SQLException;

public class tablosifirlaalan {
public static void main(String[] args) {
	//alantablosunu arsa0 yapma
	postgresqlvericekme.baglan();
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=10;j++)
		{if(!(i==1&&j==1)&&!(i==1&&j==2)&&!(i==1&&j==3))
			
			{
			int x;
			String ataString=String.valueOf(i)+String.valueOf(j);
			x=Integer.parseInt(ataString);
			postgresqlvericekme.stringguncelle("alan","arsa0","oyunalantur","oyunalanno ="+x);	
			}
	
		}
	}
		
	
	
	
	
}
}
