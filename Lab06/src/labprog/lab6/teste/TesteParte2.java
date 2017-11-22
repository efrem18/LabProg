package labprog.lab6.teste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import labprog.lab6.parte1.CD;
import labprog.lab6.parte2.MinhaCDteca;

/**
 * @author efrem
 *
 *         21 de nov de 2017
 */
public class TesteParte2 {
	private MinhaCDteca minhaCDteca;
	private CD cd1;
	private CD cd2;
	private CD cd3;
	private CD cd4;

	private String listaFaixas1[] = new String[3];
	private String listaFaixas2[] = new String[4];
	private String listaFaixas3[] = new String[7];
	private String listaFaixas4[] = new String[5];

	@Before
	public void criaObjeto() {
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
	
	@Test
	public void removeCD() {
		minhaCDteca.adicionaCD(cd1);
		Assert.assertEquals(null, minhaCDteca.removeCD("123"));
		
		Assert.assertEquals(null, minhaCDteca.removeCD("Album1"));
		
		
		minhaCDteca.adicionaCD(cd2);
		Assert.assertEquals(cd2, minhaCDteca.removeCD("Album1"));
	}
	
	@Test
	public void removeCDs() {
		List<CD> colecao = new ArrayList<>();
		CD cd5 = null;
		CD cd6 = null;
		
		colecao.add(cd2);
		colecao.add(cd5);
		colecao.add(cd6);
		
		minhaCDteca.adicionaCD(cd1);
		minhaCDteca.adicionaCD(cd2);
		minhaCDteca.adicionaCD(cd3);
		minhaCDteca.adicionaCD(cd4);
		
		Assert.assertEquals(true, minhaCDteca.removeCDs(colecao));
		
	}
	
	@Test
	public void pesquisaCD() {
		minhaCDteca.adicionaCD(cd1);
		minhaCDteca.adicionaCD(cd2);
		minhaCDteca.adicionaCD(cd3);
		minhaCDteca.adicionaCD(cd4);
		
		Assert.assertEquals(null, minhaCDteca.pesquisaCD("1wewn"));
		
		Assert.assertEquals(null, minhaCDteca.pesquisaCD(""));
		
		Assert.assertEquals(cd2, minhaCDteca.pesquisaCD("Album1"));
	}

}
