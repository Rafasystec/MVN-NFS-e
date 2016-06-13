package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Representa dados para identificação de intermediário do serviço
 * @author antoniorafael
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TcIdentificacaoIntermediarioServico {

	@XmlElement(name="RazaoSocial",required=true)
	String razaoSocial;
	@XmlElement(name="CpfCnpj",required=true)
	TcCpfCnpj tcCpfCnpj;
	@XmlElement(name="InscricaoMunicipal",required=true)
	String inscricaoMunicipal;
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
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
