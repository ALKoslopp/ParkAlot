# ParkAlot

import java.util.Comparator;

public class Estacionar implements Comparator<Veiculo>{

	@Override
	public int compare(Veiculo v1, Veiculo v2) {
		return v1.getPlaca().compareTo(v2.getPlaca());
	}
