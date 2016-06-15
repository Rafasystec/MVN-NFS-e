package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TcPedidoCancelamento {
	
	@XmlElement(name="InfPedidoCancelamento",required=true)
	private TcInfPedidoCancelamento infPedidoCancelamento;

	public TcInfPedidoCancelamento getInfPedidoCancelamento() {
		return infPedidoCancelamento;
	}

	public void setInfPedidoCancelamento(TcInfPedidoCancelamento infPedidoCancelamento) {
		this.infPedidoCancelamento = infPedidoCancelamento;
	}
}
