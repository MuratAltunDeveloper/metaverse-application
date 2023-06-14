
/*
 * package prolab23hocaver;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class izgara {
	
	

static String izgaradizi[][]=new String[gridalan.alansatir][gridalan.alansutun];//o alan market,mağaza,emlak mı onu tutar
static int satirata=0;
static int sutunata=0;





public static String izgaraciz(String izgaradizi[][])
{

	String ekranString="<html><table>";
	for(int i=0;i<gridalan.alansatir;i++)
	{ekranString+="<tr>";
		for(int j=0;j<gridalan.alansutun;j++)
		{ 
			
		 if(izgaradizi[i][j].equals("emlak"))
		{
		
			ekranString+="<td bgcolor='black' width=30 >em</td> ";
		}		
		 else if(izgaradizi[i][j].equals("market"))	
		{ 
			ekranString+="<td bgcolor='orange' width=30 >mar</td> ";
			
		}
	
		 else  if(izgaradizi[i][j].equals( "magaza"))	
		{
			ekranString+="<td bgcolor='blue' width=30 >mgz</td> ";
			
		}
		else {
			ekranString+="<td bgcolor='white' width=30 >ars</td> ";
			
		}	
			
			
			
			
			
			
			
			
			
		}
	
	}
	ekranString+="</tr>";
	ekranString+="</table></html>";
	return ekranString;



	

}
// Market 1,Mağaza 2,emlak 3
	public static void main(String[] args) throws SQLException {
		

		postgresqlvericekme.baglan();
		String sorguString;
		sorguString="select * from alan";
		ResultSet ResultSetifade=postgresqlvericekme.gonder(sorguString);

			while(ResultSetifade.next())
			{//System.out.println(ResultSetifade.getInt("oyunalani_sutunboy"));
			//	System.out.println(ResultSetifade.getInt("oyunalani_satirboy"));//int veri cekme
	       //	System.out.println(ResultSetifade.getInt("oyunalanno"));
		 	System.out.println(ResultSetifade.getString("oyunalantur"));
				
				//System.out.println("-----------------------");
						
						izgaradizi[satirata][sutunata]=ResultSetifade.getString("oyunalantur");
					//	System.out.println("+++"+ResultSetifade.getString("oyunalantur"));

               sutunata++;	
               if(satirata==gridalan.alansatir-1 && sutunata==gridalan.alansutun)
				{
				break;
				}
	
				if(sutunata==gridalan.alansutun)
				{
			
		    satirata++;
		    sutunata=0;
				}
	
			
			 }
			
			
			
			System.out.println("**************");
			
			for(int i=0;i<gridalan.alansatir;i++)
			{
				for(int j=0;j<gridalan.alansutun;j++)
				{System.out.print(i+" "+j);

					System.out.println(izgaradizi[i][j]);
									}
			System.out.println("-");	
			}
		
	Object etiket[]= {"atla","tamam"};		
	int secim=JOptionPane.showInternalOptionDialog(null,izgaraciz(izgaradizi),"izgara",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE, null,etiket,etiket[1]);
		  		
		  	
	}

}
*/
package prolab23hocaver;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class izgara {
	
	
public static int ilerizaman;
public static String izgaradizi[][]=new String[gridalan.alansatir][gridalan.alansutun];//o alan market,mağaza,emlak mı onu tutar
static int satirata=0;
static int sutunata=0;





public static String izgaraciz(String izgaradizi[][])
{

	String ekranString="<html><table>";
	for(int i=0;i<gridalan.alansatir;i++)
	{ekranString+="<tr>";
		for(int j=0;j<gridalan.alansutun;j++)
		{
			
			//ilkini, algılamıyor yonetici market
			if(i==0&&j==0)
			{
				ekranString+="<td bgcolor='orange' width=30 >mr0</td> ";
			}
		
			//yonetici
			else if(izgaradizi[i][j].equals("market0"))	
		{ 
			ekranString+="<td bgcolor='orange' width=30 >mr0</td> ";
			
		}	
		 else if(izgaradizi[i][j].equals("emlak0"))
		{
		
			ekranString+="<td bgcolor='black' width=30 >em0</td> ";
		}		
		
	
		 else  if(izgaradizi[i][j].equals( "magaza0"))	
		{
			ekranString+="<td bgcolor='blue' width=30 >mgz0</td> ";
			
		}
		else if(izgaradizi[i][j].equals("arsa0")){
			ekranString+="<td bgcolor='white' width=30 >ars0</td> ";
			
		}	
			//kul1 için
		else if(izgaradizi[i][j].equalsIgnoreCase("market1"))	
	{ 
		ekranString+="<td bgcolor='orange' width=30 >mr1</td> ";
		
	}	
	 else if(izgaradizi[i][j].equals("emlak1"))
	{
	
		ekranString+="<td bgcolor='black' width=30 >em1</td> ";
	}		
	

	 else  if(izgaradizi[i][j].equals( "magaza1"))	
	{
		ekranString+="<td bgcolor='blue' width=30 >mgz1</td> ";
		
	}
	else if(izgaradizi[i][j].equals("arsa1")){
		ekranString+="<td bgcolor='white' width=30 >ars1</td> ";
		
	}	
			
			//kul2 
	else if(izgaradizi[i][j].equalsIgnoreCase("market2"))	
{ 
	ekranString+="<td bgcolor='orange' width=30 >mr2</td> ";
	
}	
 else if(izgaradizi[i][j].equals("emlak2"))
{

	ekranString+="<td bgcolor='black' width=30 >em2</td> ";
}		


 else  if(izgaradizi[i][j].equals( "magaza2"))	
{
	ekranString+="<td bgcolor='blue' width=30 >mgz2</td> ";
	
}
else if(izgaradizi[i][j].equals("arsa2")){
	ekranString+="<td bgcolor='white' width=30 >ars2</td> ";
	
}	
			//kul3 için
else if(izgaradizi[i][j].equalsIgnoreCase("market3"))	
{ 
ekranString+="<td bgcolor='orange' width=30 >mr3</td> ";

}	
else if(izgaradizi[i][j].equals("emlak3"))
{

ekranString+="<td bgcolor='black' width=30 >em3</td> ";
}		


else  if(izgaradizi[i][j].equals( "magaza3"))	
{
ekranString+="<td bgcolor='blue' width=30 >mgz3</td> ";

}
else if(izgaradizi[i][j].equals("arsa3")){
ekranString+="<td bgcolor='white' width=30 >ars3</td> ";

}	
			//kul 4 için 
else if(izgaradizi[i][j].equalsIgnoreCase("market4"))	
{ 
ekranString+="<td bgcolor='orange' width=30 >mr4</td> ";

}	
else if(izgaradizi[i][j].equals("emlak4"))
{

ekranString+="<td bgcolor='black' width=30 >em4</td> ";
}		


else  if(izgaradizi[i][j].equals( "magaza4"))	
{
ekranString+="<td bgcolor='blue' width=30 >mgz4</td> ";

}
else if(izgaradizi[i][j].equals("arsa4")){
ekranString+="<td bgcolor='white' width=30 >ars4</td> ";

}	
			
			
			
			
			
			
			
			
			
		}
	
	}
	ekranString+="</tr>";
	ekranString+="</table></html>";
	return ekranString;



	

}
// Market 1,Mağaza 2,emlak 3
	public static void main(String[] args) throws SQLException {
		

		postgresqlvericekme.baglan();
		String sorguString;
		sorguString="select * from alan order by oyunalanno asc";
		ResultSet ResultSetifade=postgresqlvericekme.gonder(sorguString);
boolean ifade=ResultSetifade.next();
			while(ifade)
			{//System.out.println(ResultSetifade.getInt("oyunalani_sutunboy"));
			//	System.out.println(ResultSetifade.getInt("oyunalani_satirboy"));//int veri cekme
	       //	System.out.println(ResultSetifade.getInt("oyunalanno"));
		 	//System.out.println(ResultSetifade.getString("oyunalantur"));
				
			//	System.out.println(ResultSetifade.next());
						
						izgaradizi[satirata][sutunata]=ResultSetifade.getString("oyunalantur");
					//	System.out.println("+++"+ResultSetifade.getString("oyunalantur"));

               sutunata++;	
               ifade=ResultSetifade.next();
               if(satirata==gridalan.alansatir-1 && sutunata==gridalan.alansutun)
				{
				ifade=false;
				}
	
				if(sutunata==gridalan.alansutun)
				{
			
		    satirata++;
		    sutunata=0;
				}
	
			
			 }
			
			satirata=0;
			sutunata=0;
			
			System.out.println("**************");
			
			for(int i=0;i<gridalan.alansatir;i++)
			{
				for(int j=0;j<gridalan.alansutun;j++)
				{System.out.print(i+" "+j);

					System.out.println(izgaradizi[i][j]);
									}
			System.out.println("-");	
			}
		
	Object etiket[]= {"atla","tamam"};		
	int secim=JOptionPane.showInternalOptionDialog(null,izgaraciz(izgaradizi),"izgara",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE, null,etiket,etiket[1]);
	
if(secim==0)
{
String zaman=JOptionPane.showInputDialog("ne kadar zaman ilerletecegiz");
ilerizaman=Integer.parseInt(zaman);
System.out.println("+++++++++++"+ilerizaman);
	
}
	
	

	}

}

