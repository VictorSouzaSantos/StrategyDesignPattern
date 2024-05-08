package Strategy;

public class Main {

	public static void main(String[] args) {
		
		double p1 = 7;
		double p2 = 5;
		Aritimetica calculoAritimetica = new Aritimetica(p1, p2);
		Geometrica calculoGeometrica = new Geometrica(p1, p2);
	
		Disciplina d = new Disciplina(calculoGeometrica, "Padrões de Desenvolvimento");
		
		d.setP1(p1);
		d.setP2(p2);
		d.calcularMedia(calculoGeometrica);
		System.out.println(String.format("Nome: %s P1:%.2f P2:%.2f Media:%.2f Situacao: %s",d.getNome(), d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
		}
}
