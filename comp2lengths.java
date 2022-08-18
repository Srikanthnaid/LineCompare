public class comp2lengths {

	public static void main(String[] args)
	{
		int x1,x2,y1,y2;
		x1=2;x2=5;y1=4;y2=3;
		int a1,a2,b1,b2;
		a1=5;a2=3;b1=2;b2=6;
		double distance1 = Math.sqrt((x2-x1)*2 +(y2-y1)*2);
		System.out.println(distance1);
		double distance2 = (long)Math.sqrt((a2-a1)*2 +(b2-b1)*2);
		
		System.out.println(distance2);
		//equals method using to check 2 length 
		if (distance1 == distance2)
		{
			System.out.println("length of distance1 is equalls to distance2");
			
		}
		else
		{
			System.out.println("length of distance1 is not equalls to distance2");
			
		}

	}

}
