package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TcInfSubstituicaoNfse {
	
	@XmlAttribute(name="Id")
	private String id;
	@XmlElement(name="NfseSubstituidora")
	private String nfseSubstituidora;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNfseSubstituidora() {
		return nfseSubstituidora;
	}
	public void setNfseSubstituidora(String nfseSubstituidora) {
		this.nfseSubstituidora = nfseSubstituidora;
	}
	
	

}
