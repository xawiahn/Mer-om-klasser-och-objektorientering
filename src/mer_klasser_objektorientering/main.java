package mer_klasser_objektorientering;

public class main {

	public static void main(String[] args) {

		boll minaBollar[] = new boll[3];
		minaBollar[0] = new boll(5, "Grön");
		minaBollar[1] = new boll(9);
		minaBollar[2] = new boll();
		for(int i = 0; i < 3; i++)
		{
			minaBollar[i].skrivutBollInfo(2);
		}
	}
}