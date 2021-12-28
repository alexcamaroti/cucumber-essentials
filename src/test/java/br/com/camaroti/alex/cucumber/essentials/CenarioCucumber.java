package br.com.camaroti.alex.cucumber.essentials;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CenarioCucumber {

	@Dado("que criei um arquivo corretamente")
	public void queCrieiUmArquivoCorretamente() {
	
	}
	
	@Quando("executa-lo")
	public void executaLo() {
	
	}
	
	@Entao("a especificacao deve finalizar com sucesso")
	public void aEspecificacaoDeveFinalizarComSucesso() {
	
	}

	
	private Integer contador = 0;
	@Dado("que o valor do contador e {int}")
	public void queOValorDoContadorE(Integer int1) {
	    contador = int1;
	}
	@Quando("eu incrementar em {int}")
	public void euIncrementarEm(Integer int1) {
	    contador = contador + int1;
	}
	@Entao("o valor o contador sera {int}")
	public void oValorOContadorSera(Integer int1) {
	    Assert.assertEquals(int1, contador);
	}






}
