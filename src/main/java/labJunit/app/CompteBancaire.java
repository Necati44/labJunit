package labJunit.app;

public class CompteBancaire {
	private double solde;

	public CompteBancaire(double solde) {
		this.solde = solde;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public double debiterSolde(double a) {
		if (a < 0) throw new IllegalArgumentException("On ne peut débité le solde par une valeur négative.");
		return solde - a;
	}
	
	public double crediterSolde(double a) {
		if (a < 0) throw new IllegalArgumentException("On ne peut crédité le solde par une valeur négative.");
		return solde + a;
	}
}
