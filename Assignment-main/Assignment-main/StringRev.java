STRING REVERSE PROGRAM.
TYPE 1

class StringRev{
	public static void main(String[] args){
		
		String s = "VATHSA";
		
		for(int i = s.length() - 1;i >= 0; i--)
			System.out.print(s.charAt(i));
	
	}
}



TYPE 2

class StringRev{
	public static void main(String[] args)
{
           String s1="VATHSA";
           char a[]=s1.tocharArray();
           string b = "";
             for(int i=a.length-1;i>=0;i--)
               {
                 b=b+a[i];
               }
              Sysytem.out.println(b);
}