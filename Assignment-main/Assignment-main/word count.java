Word count




import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length-1;i++)
        {
            if(i == 0 && s.charAt(i)!=' ')
            {
             count++;  
            }
            else if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
            {
                count+=1;
               
            }
        }

   
        System.out.println(count);
    }
}