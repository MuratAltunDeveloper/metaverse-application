package prolab23hocaver;

import java.util.Scanner;

public class tablosifirlakullaniciyemekparaesya {
public static void main(String[] args) {
	int x;
	System.out.println("x gir:");
	Scanner klavyeScanner=new Scanner(System.in); 
	x=klavyeScanner.nextInt();
	postgresqlvericekme.baglan();
	postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar" , String.valueOf(x),"kullanicisifre =10");
	postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar" , String.valueOf(x),"kullanicisifre =10");
	postgresqlvericekme.intguncelle("kullanici","kullanici_paramiktar" , String.valueOf(x),"kullanicisifre =10");

	
	
	postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar" , String.valueOf(x),"kullanicisifre =20");
	postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar" , String.valueOf(x),"kullanicisifre =20");
	postgresqlvericekme.intguncelle("kullanici","kullanici_paramiktar" , String.valueOf(x),"kullanicisifre =20");
	
	
	
	postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar" , String.valueOf(x),"kullanicisifre =30");
	postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar" , String.valueOf(x),"kullanicisifre =30");
	postgresqlvericekme.intguncelle("kullanici","kullanici_paramiktar" , String.valueOf(x),"kullanicisifre =30");
	
	postgresqlvericekme.intguncelle("kullanici","kullanici_yemekmiktar" , String.valueOf(x),"kullanicisifre =40");
	postgresqlvericekme.intguncelle("kullanici","kullanici_esyamiktar" , String.valueOf(x),"kullanicisifre =40");
	postgresqlvericekme.intguncelle("kullanici","kullanici_paramiktar" , String.valueOf(x),"kullanicisifre =40");



}
}
