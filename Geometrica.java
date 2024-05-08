package Strategy;

public class Geometrica implements ICalcMedia{
	
	private double p1, p2;

	public Geometrica(double p1, double p2) {

		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public double CalcMedia() {
		return Math.sqrt(p1*p2);
	}

	@Override
	public String Situacao() {
		if(CalcMedia() < 7) {
			return "Reprovado";
		}else {
			return "Aprovado";
		}
	}

}
