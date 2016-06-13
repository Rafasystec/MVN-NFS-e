package br.com.barcadero.nfse.gnfes.xml.rps.envio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.complexos.TcLoteRps;

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
