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
public class TcIdentificacaoTomador {

	@XmlElement(name="CpfCnpj")
	private TcCpfCnpj tcCpfCnpj;
	@XmlElement(name="InscricaoMunicipal")
	private String inscricaoMunicipal;
	
	public TcCpfCnpj getTcCpfCnpj() {
		return tcCpfCnpj;
	}
	public void setTcCpfCnpj(TcCpfCnpj tcCpfCnpj) {
		this.tcCpfCnpj = tcCpfCnpj;
	}
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	
	
	
}
