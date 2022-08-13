public class bikers{
	public static void main(String[]args){
    int b=5;
    int s1=100,s2=120,s3=140,s4=160,s5=120;
    int avg;

    avg=(s1+s2+s3+s4+s5)/5;

    if(s1>avg)
        System.out.println("Biker 1 qualified ");
    if(s2>avg)
        System.out.println("Biker 2 qualified ");
    if(s3>avg)
        System.out.println("Biker 3 qualified "); 
    if(s4>avg)
        System.out.println("Biker 4 qualified ");
    if(s5>avg)
        System.out.println("Biker 5 qualified ");   
   
    }
}
