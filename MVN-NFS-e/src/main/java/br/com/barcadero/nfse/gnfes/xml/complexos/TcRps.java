package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TcRps {

	@XmlElement(name="InfRps", required=true)
	private TcInfRps tcInfRps;

	public TcInfRps getTcInfRps() {
		return tcInfRps;
	}

	public void setTcInfRps(TcInfRps tcInfRps) {
		this.tcInfRps = tcInfRps;
	}
}
