package object;


interface a{
	public int ia = 15;
}

interface b{
	static int i = 5;
}
class Create implements a,b{
	public static void main(String[] args) {
		System.out.println(i);
	}
//	private String name;
//	private String privateField =  "secret";
//	public String publicField = "open";
//	
//	private void privateMethod() {
//		System.out.println(privateField);
//	}
//	
//	public void publicMethod() {
//		System.out.println(publicField);
//	}
//	
//	Create(){
//		System.out.println("Constructor method called");
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//	this.name = name;
//	}
}
