package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="LoteRps")
@XmlAccessorType(XmlAccessType.FIELD)
public class TcLoteRps {
	
	@XmlAttribute(name="Id")
	private String id;
	@XmlElement(name="NumeroLote",required=true)
	private String numeroLote;
	@XmlElement(name="Cnpj",required=true)
	private String cnpj;
	@XmlElement(name="InscricaoMunicipal",required=true)
	private String inscricaoMunicipal;
	@XmlElement(name="QuantidadeRps",required=true)
	private String quantidadeRps;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	public String getQuantidadeRps() {
		return quantidadeRps;
	}
	public void setQuantidadeRps(String quantidadeRps) {
		this.quantidadeRps = quantidadeRps;
	}
}
