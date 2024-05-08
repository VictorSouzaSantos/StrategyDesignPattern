package Strategy;

public class Disciplina {
	
	private ICalcMedia calculo;
	private String nome;
	private double p1;
	private double p2;
	
	public Disciplina(ICalcMedia calculo, String nome) {
		
	this.calculo = calculo;
	this.nome = nome;
	
	}
	public Disciplina() {
		
	}
	
	public void setNome(String nome) {
		
	this.nome = nome;
	
	}
	
	public String getNome() {
		return nome;
	}
	public double getP1() {
		
	return p1;
	
	}
	
	public double getP2() {
		
	return p2;
	
	}
	
	public void setP1(double p1) {
		
	this.p1 = p1;
	
	}
	
	public void setP2(double p2) {
		
	this.p2 = p2;
	
	}
	
	public void calcularMedia(ICalcMedia calculo) {
		
	this.calculo = calculo;
	
	}
	
	public double getMedia() {
		
	return calculo.CalcMedia();
	
	}
	
	public String getSituacao() {
		
	return calculo.Situacao();
	
	}

}
