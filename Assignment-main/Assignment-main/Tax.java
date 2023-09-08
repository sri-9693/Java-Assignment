// Tax Program


import java.util.Scanner;

class Tax 
{
    public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		int y = m * 12;

		if(y>=100000 && y<=250000)
                {
		    System.out.println("No tax");
		}
		else if(y>=250001 && y<=500000)
                {
		    y = y -250000;
		    int tax = y*10/100;
		    System.out.println(tax);
		}
		else if(y>=500001 && y<=1000000)
                {
		    y = y - 500000;
		    int tax = 250000*10/100 + y*20/100;
		    System.out.println(tax);
		}
                else if(y>=1000001)
                {
		    y = y-1000000;
		    int tax = 250000*10/100 + 250000*20/100 + y*30/100;
		    System.out.println(tax);
		}
    }
}
