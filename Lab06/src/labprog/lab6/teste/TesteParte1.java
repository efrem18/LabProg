package labprog.lab6.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import labprog.lab6.parte1.CD;

/**
 * @author efrem
 *
 *         21 de nov de 2017
 */
public class TesteParte1 {
	private String artista = "Safadao";
	private String titulo = "Principal";
	private String trilhaPrincipal = "Nao sei";
	private String listaFaixas[] = new String[3];
	private CD cd;

	@Before
	public void criaObjetos() throws Exception {
		cd = new CD(artista, titulo, trilhaPrincipal, listaFaixas);
		listaFaixas[0] = "Nao sei";
	}

	@Test
	public void testaAdicionaMusica() {
		Assert.assertFalse(cd.cadastraMusica(""));
		Assert.assertEquals(true, cd.cadastraMusica("qwe"));
	}

	@Test
	public void testaGetFaixa() {
		Assert.assertEquals(null, cd.getFaixa(-1));
		Assert.assertEquals(null, cd.getFaixa(1));
		Assert.assertEquals("Nao sei", cd.getFaixa(0));
	}

	@SuppressWarnings("null")
	@Test
	public void testaEquals() {
		CD outraCD = null;
		Assert.assertFalse(outraCD.equals(cd));
	}

}
