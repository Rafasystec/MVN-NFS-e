package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.complexos.TcLoteRps;
/**
 * 3.5.1 Recepção de Lote de RPS
	Esse serviço será executado, inicialmente, através da chamada ao método
	RecepcionarLoteRps, passando a mensagem XML como parâmetro com a
	estrutura definida na tabela que segue.
 * @author Rafael Rocha
 *
 */
@XmlRootElement(name="EnviarLoteRpsEnvio")
@XmlAccessorType(XmlAccessType.FIELD)
public class EnviarLoteRpsEnvio {

	@XmlElement(name="LoteRps",required=true)
	private TcLoteRps tcLoteRps;

	public TcLoteRps getTcLoteRps() {
		return tcLoteRps;
	}

	public void setTcLoteRps(TcLoteRps tcLoteRps) {
		this.tcLoteRps = tcLoteRps;
	}
}
