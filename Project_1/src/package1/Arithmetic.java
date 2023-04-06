package package1;

public class Arithmetic {
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	
	public int sub(int a1, int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("sub result is "+c1);
		return c1;
	}
	public void mult(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("final result is "+z);
	}
	public static void main(String[] args) {
		Arithmetic obj=new Arithmetic();
		int sumresult=obj.sum(10,2);
		int subresult=obj.sub(10,2);
		obj.mult(sumresult, subresult);
	}
}
