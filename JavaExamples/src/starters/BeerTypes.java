package starters;

class BeerTypesDemo {
	enum beerNames{ALE, PORTER, HEFEWEISEN}
	beerNames names;
	String str1 = "trinoy";
}

public class BeerTypes {
	
	public static void main(String[] arg)
	{
		
		// 1. Simple Enum Demo
		BeerTypesDemo bt = new BeerTypesDemo();
		bt.names = BeerTypesDemo.beerNames.PORTER;
		System.out.println(bt.names);
		
		// 2. Enum in loop
		for(BeerTypesDemo.beerNames bt1 : BeerTypesDemo.beerNames.values())
		{
		System.out.println(bt1);	
		}
		
		// 3. enum in switch
		switch(bt.names)
		{
		case ALE: System.out.println("Ale is a good beer"); break;
		case PORTER: System.out.println("Porter is a good beer"); break;
		case HEFEWEISEN: System.out.println("Hefeweisen is a good beer"); break;
		}
		
		// 4. enum in if
		if (bt.names == BeerTypesDemo.beerNames.ALE)
			System.out.println("Success");
		else
			System.out.println("error");
		
	}
	
}

