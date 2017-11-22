package labprog.lab6.parte2;

import java.util.ArrayList;
import java.util.List;

import labprog.lab6.parte1.CD;

/**
 * @author efrem
 *
 *         21 de nov de 2017
 */
public class MinhaCDteca {
	List<CD> colecaoCDs;
	int numeroCDs;

	public MinhaCDteca() {
		this.colecaoCDs = new ArrayList<>();
	}

	/**
	 * @param novoCD
	 */
	public void adicionaCD(CD novoCD) {
		colecaoCDs.add(novoCD);
	}

	/**
	 * @param colecao
	 */
	public void adicionaCDs(List<CD> colecao) {
		for (CD cd : colecao) {
			colecaoCDs.add(cd);
		}
	}

	/**
	 * @param tituloCD
	 * @return cd
	 */
	public CD removeCD(String tituloCD) {
		for (CD cd : colecaoCDs) {
			if (cd.getTitulo().equals(tituloCD)) {
				colecaoCDs.remove(cd);
				return cd;
			}
		}

		return null;
	}

	/**
	 * @param colecao
	 * @return boolean
	 */
	public boolean removeCDs(List<CD> colecao) {
		int cont = 0;
		for (CD cd : colecao) {
			if (colecaoCDs.contains(cd)) {
				colecaoCDs.remove(cd);
				cont++;
			}
		}

		if (cont == 0) {
			return false;
		}

		return true;
	}

	/**
	 * @param titulo
	 * @return cd
	 */
	public CD pesquisaCD(String titulo) {
		for (CD cd : colecaoCDs) {
			if (cd.getTitulo().equals(titulo)) {
				return cd;
			}
		}
		return null;
	}

	public int getNumeroCDs() {
		return this.colecaoCDs.size();
	}

	public void setNumeroCDs(int numeroCDs) {
		this.numeroCDs = numeroCDs;
	}

	public List<CD> getColecaoCDs() {
		return colecaoCDs;
	}

	public void setColecaoCDs(List<CD> colecaoCDs) {
		this.colecaoCDs = colecaoCDs;
	}

	@Override
	public String toString() {
		return "MinhaCDteca [colecaoCDs=" + colecaoCDs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colecaoCDs == null) ? 0 : colecaoCDs.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MinhaCDteca other = (MinhaCDteca) obj;
		if (colecaoCDs == null) {
			if (other.colecaoCDs != null)
				return false;
		} else if (!colecaoCDs.equals(other.colecaoCDs))
			return false;
		return true;
	}

	public static void main(String[] args) {
		MinhaCDteca minhaCDteca;
		CD cd1;
		CD cd2;
		CD cd3;
		CD cd4;

		String listaFaixas1[] = new String[3];
		String listaFaixas2[] = new String[4];
		String listaFaixas3[] = new String[7];
		String listaFaixas4[] = new String[5];

		listaFaixas1[0] = "Nao sei";
		listaFaixas2[0] = "Always";
		listaFaixas3[0] = "Dear";
		listaFaixas4[0] = "September";

		cd1 = new CD("Safadao", "Principal", "Nao sei", listaFaixas1);
		cd2 = new CD("Bryan", "Album1", "Always", listaFaixas2);
		cd3 = new CD("AVX", "Album2", "Dear", listaFaixas3);
		cd4 = new CD("GreenDay", "Album3", "September", listaFaixas4);

		minhaCDteca = new MinhaCDteca();

	}
}
