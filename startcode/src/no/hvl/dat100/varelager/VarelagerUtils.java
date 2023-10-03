package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		
		Vare billigste = varer[0];
		for (int i = 0; i < varer.length; i++) {
			if (varer[i].erBilligereEnn(billigste)) {
				billigste = varer[i];
			}	
		}
		return billigste;
	}
	
	public static double totalPris(Vare[] varer) {		
		
		double tPris = 0.0;
		
		for (Vare v : varer) {
			tPris = tPris + v.getPris();
		}
		return tPris;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
		
		int[] varenumre = new int[varer.length];
		
		for (int i = 0; i< varer.length; i++) {
			varenumre[i] = varer[i].getVarenr();
		}
		return varenumre;
	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
		
		double[] prisDiff = new double[varer.length-1];		
		
		for (int i = 0; i < varer.length-1; i++) {
			prisDiff[i] = varer[i+1].getPris() - varer[i].getPris();
		}
		
		return prisDiff;
	}
}
