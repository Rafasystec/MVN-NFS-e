package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TcInfPedidoCancelamento {

	@XmlAttribute(name="Id")
	private String id;
	@XmlElement(name="IdentificacaoNfse")
	private TcIdentificacaoNfse identificacaoNfse;
	@XmlElement(name="CodigoCancelamento")
	private String codigoCancelamento;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TcIdentificacaoNfse getIdentificacaoNfse() {
		return identificacaoNfse;
	}
	public void setIdentificacaoNfse(TcIdentificacaoNfse identificacaoNfse) {
		this.identificacaoNfse = identificacaoNfse;
	}
	public String getCodigoCancelamento() {
		return codigoCancelamento;
	}
	public void setCodigoCancelamento(String codigoCancelamento) {
		this.codigoCancelamento = codigoCancelamento;
	}
	
	
}
