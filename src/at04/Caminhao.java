package at04;

public class Caminhao extends Veiculo {

	public Caminhao (boolean motor) {
		super(motor);
		
	}
	
	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caminhao [eixos=");
		builder.append(eixos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
