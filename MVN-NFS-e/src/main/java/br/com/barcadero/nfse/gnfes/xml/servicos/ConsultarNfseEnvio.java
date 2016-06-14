package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.basicos.TsPeriodoEmissao;
import br.com.barcadero.nfse.gnfes.xml.complexos.TcIdentificacaoIntermediarioServico;
import br.com.barcadero.nfse.gnfes.xml.complexos.TcIdentificacaoPrestador;
import br.com.barcadero.nfse.gnfes.xml.complexos.TcIdentificacaoTomador;

@XmlRootElement(name="ConsultarNfseEnvio")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultarNfseEnvio {
	
	@XmlElement(name="Prestador", required=true)
	private TcIdentificacaoPrestador prestador;
	@XmlElement(name="NumeroNfse",required=false)
	private String numeroNfse;
	@XmlElement(name="PeriodoEmissao",required=false)
	private TsPeriodoEmissao periodoEmissao;
	@XmlElement(name="Tomador",required=false)
	private TcIdentificacaoTomador tomador;
	@XmlElement(name="IntermediarioServico",required=false)
	private TcIdentificacaoIntermediarioServico intermediarioServico;
	
	public TcIdentificacaoPrestador getPrestador() {
		return prestador;
	}
	public void setPrestador(TcIdentificacaoPrestador prestador) {
		this.prestador = prestador;
	}
	public String getNumeroNfse() {
		return numeroNfse;
	}
	public void setNumeroNfse(String numeroNfse) {
		this.numeroNfse = numeroNfse;
	}
	public TsPeriodoEmissao getPeriodoEmissao() {
		return periodoEmissao;
	}
	public void setPeriodoEmissao(TsPeriodoEmissao periodoEmissao) {
		this.periodoEmissao = periodoEmissao;
	}
	public TcIdentificacaoTomador getTomador() {
		return tomador;
	}
	public void setTomador(TcIdentificacaoTomador tomador) {
		this.tomador = tomador;
	}
	public TcIdentificacaoIntermediarioServico getIntermediarioServico() {
		return intermediarioServico;
	}
	public void setIntermediarioServico(TcIdentificacaoIntermediarioServico intermediarioServico) {
		this.intermediarioServico = intermediarioServico;
	}

}
