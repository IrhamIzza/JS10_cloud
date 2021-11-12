import java.util.Scanner;
import java.util.Calendar;
public class tugas {
    public static void main(String[] args){
        System.out.println("Nama  : Irham Izza Syany");
        System.out.println("Kelas : TI-3B");
        System.out.println("NIM   : 1941720129");
         Scanner sc = new Scanner(System.in);
	    int cdate, cmonth, cyear; //current date, month, year
	    int bdate, bmonth, byear; //birth date, month, year
	    int feb;
	    int i;
	    int rdate, rmonth, ryear; //temporary data for calculation
	    int bcdate, bcmonth, bcyear; //result date, month, year
	    feb = 0;

	    System.out.println("-------What is your age?-------");
	    System.out.println(" ");
	    System.out.print("Current date: ");
	    cdate = sc.nextInt ();
	    System.out.print ("Current month: ");
	    cmonth = sc.nextInt ();
	    System.out.print ("Current year: ");
	    cyear = sc.nextInt ();
	    System.out.print ("Birth date: ");
	    bdate = sc.nextInt ();
	    System.out.print("Birth month: ");
	    bmonth = sc.nextInt ();
	    System.out.print("Birth year: ");
	    byear = sc.nextInt ();

	    for(i = byear; i <= cyear; i++){
	            if(i%4==0)
	                    feb = 29;
	            else
	                    feb = 28;
	    }

	    rdate = 30 * 11 + feb;

	    ryear = cyear - byear;

	    if(cmonth > bmonth) {
	            rmonth = bmonth - cmonth;
	    }else{
	            rmonth = cmonth - bmonth;
	    }

	    if(cmonth > bmonth && cdate > bdate) {
	            bcyear = ryear;
	    }else if(rmonth < 0) {
	            bcyear = ryear - 1;
	    }else if(rmonth == 0 && cdate < bdate) {
	            bcyear = ryear - 1;
	    }else if(cmonth == bmonth && cdate == bdate) {
	            bcyear = ryear;
	    }else{
	            bcyear = ryear;
	    }

	    if(cmonth > bmonth && cdate > bdate) {
	            bcmonth = cmonth + 1;
	    }else if(rmonth == 0 && cdate < bdate){
	            bcmonth = cmonth - 1;
	    }else if(rmonth < 0) {
	            bcmonth = cmonth;
	    }else{
	            bcmonth = rmonth;
	    }

	    if(bcmonth > 0 && bdate >= cdate) {
	            bcdate = rdate / 12 - (bdate - cdate);
	    }else if(cdate > bdate) {
	            bcdate = rdate / 12 - (cdate - bdate);	
	    }else if(rmonth == 0 && cdate <= bdate) {
	            bcdate = rdate / 12 - (bdate - cdate);
	    }else{
	            bcdate = rdate / 12 - (bdate - cdate);
	    }

	    System.out.println("-----------");
	    System.out.println("AGE");
	    System.out.println("-----------");
	    System.out.print("Your age is: " + bcyear);
	    System.out.print(" year " + bcmonth);
	    System.out.print(" month " + bcdate);
	    System.out.print(" day");
	    System.out.println("");
	    
    }
}
