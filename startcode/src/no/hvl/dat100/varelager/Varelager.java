package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		
		antall = 0;
		varer = new Vare[n];
	}
	
	public Vare[] getVarer() {
		
		return varer;
	}
	
	public boolean leggTilVare(Vare v) {
		if (antall < varer.length) {
			varer[antall] = v;
			antall ++;
			return true;
		}
		return false;
	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
		
		Vare v = new Vare(varenr, navn, pris);
		
		return leggTilVare(v);

	}
	
	public Vare finnVare(int varenr) {
			for (int i = 0; i < varer.length; i++) {
				if (varer[i].getVarenr() == varenr)
					return varer[i];
			}
			return null;

	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
				System.out.println(SEP);
				for (int i = 0; i < varer.length; i++) {
					System.out.println(varer[i].toString());
				}
				System.out.println(SEP);
	}
	
}
