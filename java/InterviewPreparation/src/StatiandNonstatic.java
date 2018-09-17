
public class StatiandNonstatic {
	
	public StatiandNonstatic() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor");
	}
	
	int i=10;
	static int j=20;
	
	public void meth1()
	{
		System.out.println("Non static");
		System.out.println(j);
	}

	public static void meth2()
	{
		System.out.println("Static");
		//System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		meth2();
		
		StatiandNonstatic sn=new StatiandNonstatic();
		System.out.println(sn.i);
		sn.meth1();
		
		System.out.println("changes");

	}

}
