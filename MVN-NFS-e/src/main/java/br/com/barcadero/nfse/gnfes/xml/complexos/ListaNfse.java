package br.com.barcadero.nfse.gnfes.xml.complexos;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ListaNfse {

	@XmlElement(name="CompNfse",required=true)
	private List<TcCompNfse> compNfse;

	public List<TcCompNfse> getCompNfse() {
		return compNfse;
	}

	public void setCompNfse(List<TcCompNfse> compNfse) {
		this.compNfse = compNfse;
	}
	
	
}
