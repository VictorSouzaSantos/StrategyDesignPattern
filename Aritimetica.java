package Strategy;

public class Aritimetica implements ICalcMedia{
	
	private double p1, p2;

	public Aritimetica(double p1, double p2) {
	
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public double CalcMedia() {
		return (p1+p2)/2;
	}

	@Override
	public String Situacao() {
		if(CalcMedia() < 5) {
			return "Reprovado";
		}else {
			return "Aprovado";
		}
	
	}

}

