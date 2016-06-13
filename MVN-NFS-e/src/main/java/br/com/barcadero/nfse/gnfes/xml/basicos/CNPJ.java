package br.com.barcadero.nfse.gnfes.xml.basicos;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="Cnpj")
public class CNPJ extends CpfCnpj {

	public CNPJ(String value) {
		this.cnpj = value;
	}
	
	@XmlValue
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
