package br.com.barcadero.nfse.gnfes.xml.rps.consulta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.complexos.TcIdentificacaoPrestador;
import br.com.barcadero.nfse.gnfes.xml.complexos.TcIdentificacaoRps;

@XmlRootElement(name="ConsultarNfseRpsEnvio")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultarNfseRpsEnvio {
	@XmlElement(name="IdentificacaoRps")
	private TcIdentificacaoRps identificacaoRps;
	@XmlElement(name="Prestador")
	private TcIdentificacaoPrestador prestador;
	public TcIdentificacaoRps getIdentificacaoRps() {
		return identificacaoRps;
	}
	public void setIdentificacaoRps(TcIdentificacaoRps identificacaoRps) {
		this.identificacaoRps = identificacaoRps;
	}
	public TcIdentificacaoPrestador getPrestador() {
		return prestador;
	}
	public void setPrestador(TcIdentificacaoPrestador prestador) {
		this.prestador = prestador;
	}
	
	
}
