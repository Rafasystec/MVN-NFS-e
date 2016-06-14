package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.complexos.TcIdentificacaoPrestador;
import br.com.barcadero.nfse.gnfes.xml.complexos.TcIdentificacaoRps;
/**
 * 3.5.3 Consulta de NFS-e por RPS
	Esse serviço será executado através da chamada ao método
	ConsultarNfsePorRps, passando a mensagem XML como parâmetro com a
	estrutura definida na tabela que segue.
 * @author Rafael Rocha
 */
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
