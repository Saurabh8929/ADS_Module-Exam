class Q3
{
	static final int max1 = 10;
	int stack1[]=new int[max1];
	int top1;
	
	boolean isEmpty1()
	{
		return(top1<0);
		
	}
	
	boolean push1(int x)
	{
		if (top1>=max1-1)
		{
			System.out.println("Overflow");
			
		}
		return false;
	}
	
	int pop1()
	{
		if (top1<0)
		{
			System.out.println("Underflow");
			return 0;
		}
	
		else
		{
			int x=stack1[top1];
			return x;
		}
	}
	
	static final int max2 = 10;
	int stack2[]=new int[max2];
	int top2;
	
	boolean isEmpty2()
	{
		return(top2<0);
		
	}
	
	boolean push2(int x)
	{
		if (top2>=max2-1)
		{
			System.out.println("Overflow");
			
		}
		return false;
	}
	
	int pop2()
	{
		if (top2<0)
		{
			System.out.println("Underflow");
			return 0;
		}
	
		else
		{
			int x=stack2[top2];
			return x;
		}
	}
}
	
class Stack
{
	public static void main(String args[])
	{
		Q3 s1 = new Q3();
		
		s1.push1(5);
		s1.push2(10);
		s1.push2(15);
		s1.push1(11);
		s1.push2(7);
		s1.push2(40);
		
		s1.pop1();
		System.out.println("Popped element from stack 1 is "+s1.top1);
		s1.pop2();
		System.out.println("Popped element from stack 2 is "+s1.top2);
	}
}