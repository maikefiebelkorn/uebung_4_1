package uebung_4_1;

public class uebung_4_1 {

	public static void bruchDarstellen(int nenner, int zaehler)
	{
	double nenn = nenner;
	double zaeh = zaehler;
	double kommazahl = zaeh/nenn;
	System.out.println(zaehler);
	System.out.println("- = " + (kommazahl));
	System.out.println(nenner);
	}
	
	public static void main (String[]args){
		bruchDarstellen(3,2);
		bruchDarstellen(1,6);
		bruchDarstellen(2,4);
	}

}
