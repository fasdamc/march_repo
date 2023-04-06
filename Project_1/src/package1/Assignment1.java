package package1;

public class Assignment1 {
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public int sum(int d,int e)
	{
		int f=d+e;
		return f;
	}
	public int mult(int g,int h)
	{
		int i=g*h;
		return i;
	}
	public float div(int x,int y)
	{
		int z=x/y;
		return z;
	}
	public static void main(String[] args) {
		
		Assignment1 obj=new Assignment1();
		//(((((10+2)+2)-2)*2)/2)
		int sumres1=obj.sum(10, 2);
		int sumres2=obj.sum(sumres1, 2);
		int subres=obj.sub(sumres2, 2);
		int multres=obj.mult(subres, 2);
		float result1=obj.div(multres,2);
		System.out.println("The result of (((((10+2)+2)-2)*2)/2) is ..."+result1);
		//(((((10*2)-2)+2)-2)/2)	
		
		int mulres2=obj.mult(10, 2);
		int subres2=obj.sub(mulres2, 2);
		int sumres3=obj.sum(subres2, 2);
		int subres3=obj.sub(sumres3, 2);
		float result2=obj.div(subres3, 2);		
		System.out.println("The result of (((((10*2)-2)+2)-2)/2) is ..."+result2);
	}
}
