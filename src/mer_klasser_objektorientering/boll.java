package mer_klasser_objektorientering;

class boll
{
	int radie = 0;
	String farg = " ";
	boll(int r, String f)
	{
		radie = r;
		farg = f;
	}
	boll(int r)
	{
		radie = r;
		farg = "Röd och Orange";
	}
	boll()
	{
		radie = 22;
		farg = "Äckligt turkos";
	}
	void skrivutBollInfo()
	{
		System.out.println("Bollfärg: " + farg + ", Radie = " + radie);
	}
	void skrivutBollInfo(int x)
	{
		for(int i = 0; i < x; i++)
		{
			System.out.println("Bollfärg: " + farg + ", Radie = " + radie);
		}
	}
}
