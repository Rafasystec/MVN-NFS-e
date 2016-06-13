package br.com.barcadero.nfse.gnfes.xml.basicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class CPF extends CpfCnpj {
	
	public CPF(String value) {
		this.cpf = value;
	}
	
	@XmlValue
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
