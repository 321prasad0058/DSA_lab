public class salary{
	public static void main(String[]args){
	int empno=345;
	String empname= "Nihit Sahu";
	
	float basic=40000;
	float DA,HRA,PF,NS,GS;
	float CCA=240;
	float PT=100;
	
	DA=(70*basic)/100;
	HRA=(30*basic)/100;
	PF=(10*basic)/100;
	
	GS=basic+DA+HRA+PF+CCA+PT;
	NS=GS-(PF+PT);
	
	System.out.println(" GROSS SALARY= "+GS);
	System.out.println(" NET SALARY= "+NS);
	
	}
}
