package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.complexos.TcIdentificacaoPrestador;
/**
 * 3.5.2 Consulta de Situação de Lote de RPS
	Esse serviço será executado através da chamada ao método
	ConsultarSituacaoLoteRps, passando a mensagem XML como parâmetro
	com a estrutura definida na tabela que segue.
	
 *  Esse serviço será executado através da chamada ao método
	ConsultarSituacaoLoteRps, passando a mensagem XML como parâmetro
	com a estrutura definida na tabela que segue.
 * @author root
 *
 */
@XmlRootElement(name="ConsultarSituacaoLoteRpsEnvio")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultarSituacaoLoteRpsEnvio {

	@XmlElement(name="Prestador")
	private TcIdentificacaoPrestador prestador;
	@XmlElement(name="Protocolo")
	private String protocolo;
	
	public TcIdentificacaoPrestador getPrestador() {
		return prestador;
	}
	public void setPrestador(TcIdentificacaoPrestador prestador) {
		this.prestador = prestador;
	}
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	
	
}
