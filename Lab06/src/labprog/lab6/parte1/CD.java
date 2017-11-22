package labprog.lab6.parte1;

import java.util.Arrays;

/**
 * @author efrem
 *
 *         21 de nov de 2017
 */
public class CD {
	private String artista;
	private String titulo;
	private String trilhaPrincipal;
	private String listaFaixas[];
	
	/**
	 * @param artista
	 * @param titulo
	 * 
	 */
	public CD(String artista, String titulo) {
		this.artista = artista;
		this.titulo = titulo;
		this.listaFaixas = new String[10];
	}
	
	/**
	 * @param artista
	 * @param titulo
	 * @param trilhaPrincipal
	 * @param listaFaixas
	 */
	public CD(String artista, String titulo, String trilhaPrincipal, String[] listaFaixas) {
		this.artista = artista;
		this.titulo = titulo;
		this.trilhaPrincipal = trilhaPrincipal;
		this.listaFaixas = listaFaixas;
	}
	
	/**
	 * Pegar a musica atraves do index e retorna ele
	 * @param indexMusica
	 * @return String
	 */
	public String getFaixa(int indexMusica) {
		for (int i = 0; i < listaFaixas.length; i++) {
			if (indexMusica == i) {
				return listaFaixas[i];
			}
		}
		return null;
	}
	
	/**
	 * Cadastrar musica
	 * @param musica
	 * @return boolean
	 */
	public boolean cadastraMusica(String musica) {
		int tamanhoAtual = 0;

		for (int i = 0; i < listaFaixas.length; i++) {
			if (listaFaixas[i] != null) {
				tamanhoAtual++;
			}
		}

		if (tamanhoAtual < listaFaixas.length && !musica.equals("")) {
			for (int i = 0; i < listaFaixas.length; i++) {
				if (listaFaixas[i] == null) {
					listaFaixas[i] = musica;
					return true;
				}
			}
		}
		return false;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTrilhaPrincipal() {
		return trilhaPrincipal;
	}

	public void setTrilhaPrincipal(String trilhaPrincipal) {
		this.trilhaPrincipal = trilhaPrincipal;
	}

	public String[] getListaFaixas() {
		return listaFaixas;
	}

	public void setListaFaixas(String[] listaFaixas) {
		this.listaFaixas = listaFaixas;
	}

	@Override
	public String toString() {
		return "CD [artista=" + artista + ", titulo=" + titulo + ", trilhaPrincipal=" + trilhaPrincipal
				+ ", listaFaixas=" + Arrays.toString(listaFaixas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CD other = (CD) obj;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
