package linecomparison;

public class CompareTo {

	public static void main(String[] args) 
	{
		int x1,x2,y1,y2;
		x1=2;x2=5;y1=4;y2=4;
		int a1,a2,b1,b2;
		a1=5;a2=3;b1=2;b2=6;
		double distance1 = Math.sqrt((x2-x1)*2 +(y2-y1)*2);
		System.out.println(distance1);
		double distance2 = (long)Math.sqrt((a2-a1)*2 +(b2-b1)*2);
		
		System.out.println(distance2);
		
		if (Double.compare(distance1, distance2)==0)
		{
			System.out.println("distance1 is compare to distance2 ");
		}
		else if (Double.compare(distance1, distance2)>0)
		{
			System.out.println("distance1 is greaterthen distance2");
		}
		else
		{
			System.out.println("distance1 is less then distance");
		}
	}
	
	
}
