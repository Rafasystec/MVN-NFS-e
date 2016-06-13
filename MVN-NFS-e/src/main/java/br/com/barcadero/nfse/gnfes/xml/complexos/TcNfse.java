package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Representa a estrutura da Nota Fiscal de Serviços Eletrônica assinada
 * @author antoniorafael
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TcNfse {
	
	@XmlElement(name="InfNfse")
	private TcInfNfse tcInfNfse;

	public TcInfNfse getTcInfNfse() {
		return tcInfNfse;
	}

	public void setTcInfNfse(TcInfNfse tcInfNfse) {
		this.tcInfNfse = tcInfNfse;
	}
	
}
