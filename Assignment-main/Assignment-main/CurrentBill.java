Current bill 



import java.util.Scanner;
class CurrentBill {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int presentMeter = sc.nextInt();
        int prevMeter = sc.nextInt();
        
        int units = presentMeter - prevMeter;
        
        char a = sc.next().charAt(0);
        
        switch(a){
            case 'D':
                if(units>=1 && units<=100){
                    System.out.println("the amount is: "+( units *1));
                }
                else if(units>=101 && units <=200){
                    System.out.println("the amount is: "+ (100*1 + (units-100) *2));
                }
                else if(units>=201){
                    System.out.println("the amount is: "+ (100*1 + 100*2 + (units-200)*3));
                }
                break;
            case 'C':
                if(units>=1 && units<=100){
                    System.out.println("the amount is: "+( units *2));
                }
                else if(units>=101 && units <=200){
                    System.out.println("the amount is: "+ (100*2 + (units-100) *4));
                }
                else if(units>=201){
                    System.out.println("the amount is: "+ (100*2 + 100*4 + (units-200)*6));
                }
                break;
            case 'I':
                if(units>=1 && units<=100){
                    System.out.println("the amount is: "+( units *3));
                }
                else if(units>=101 && units <=200){
                    System.out.println("the amount is: "+ (100*3 + (units-100) *6));
                }
                else if(units>=201){
                    System.out.println("the amount is: "+ (100*3 + 100*6 + (units-200)*9));
                }
                break;
            default:
                System.out.println("Enter proper value");
        }
    }
}
