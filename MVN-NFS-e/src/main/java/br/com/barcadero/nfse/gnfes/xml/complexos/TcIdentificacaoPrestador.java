package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 
 * @author antoniorafael
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TcIdentificacaoPrestador {

	@XmlElement(name="Cnpj")
	private String cnpj;
	@XmlElement(name="InscricaoMunicipal")
	private String incricaoMunicipal;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIncricaoMunicipal() {
		return incricaoMunicipal;
	}
	public void setIncricaoMunicipal(String incricaoMunicipal) {
		this.incricaoMunicipal = incricaoMunicipal;
	}
	
	
}
