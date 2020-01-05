package Set3_50;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*24) String i/p1=2012;
sTRING i/p2=5
IF EXPERIENCE IS GREATER THAN INPUT 2 THEN TRUE;
*/

public class Q24_Date {
public static void main(String[] args) throws ParseException {
	
	String ip1="2012";
	String ip2="5";
	
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy");
	Date d1=sdf.parse(ip1);
	Date d2=new Date();
	int year1=d1.getYear();
	int year2=d2.getYear();
	
	int n=Integer.parseInt(ip2);
	
	if((year2-year1)> n ) 
		System.out.println("True");
	else
		System.out.println("False");
	
}
}
