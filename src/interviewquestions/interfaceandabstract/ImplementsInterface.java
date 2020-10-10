package interviewquestions.interfaceandabstract;

public class ImplementsInterface extends AbstractClass implements InterfaceClass {

	final int finalVar = 20;
	
		// TODO Auto-generated constructor stub
	
	
	
	public int santhiya = 50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number ;
		String str;
		AbstractClass obj = new ImplementsInterface();
		InterfaceClass implInter = new ImplementsInterface();
		System.out.println("a");
		number = implInter.num;
		System.out.println(number);
		implInter.defaultMethod("default called");
		InterfaceClass.staticClass("Static called");
		
		for (int i = 0; i < 5; i++)
		{
		if (i == 3)
		{
		break;
		}
		System.out.println(i);
		}
		
		for (int i = 0; i < 5; i++)
		{
		if(i == 2)
		{
		continue;
		}
		System.out.println(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("santhiya");
		System.out.println("ab : "+sb);
		StringBuilder sb1 = new StringBuilder();
		sb1.append("jay");
		System.out.println(sb1);
		
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println(santhiya);
		System.out.println("abstract method");
	}



}
