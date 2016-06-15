package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.complexos.TcIdentificacaoPrestador;

/**
 * 3.5.5 Consulta de Lote de RPS
Esse serviço será executado através da chamada ao método
ConsultarLoteRps, passando a mensagem XML como parâmetro com a
estrutura definida na tabela que segue.

 * @author Rafael Rocha
 * @since dia 14/06/2016 as 21:59
 */
@XmlRootElement(name="ConsultarLoteRpsEnvio")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultarLoteRpsEnvio {

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
