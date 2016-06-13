package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import br.com.barcadero.nfse.gnfes.xml.basicos.CNPJ;
import br.com.barcadero.nfse.gnfes.xml.basicos.CPF;
import br.com.barcadero.nfse.gnfes.xml.basicos.CpfCnpj;
/**
 * 
 * @author antoniorafael
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TcCpfCnpj {

	@XmlElements({
		@XmlElement(name="Cpf"	,type=CPF.class),
		@XmlElement(name="Cnpj"	,type=CNPJ.class),
	})
	private CpfCnpj cpfcnpj;

	public CpfCnpj getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(CpfCnpj cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}
}
