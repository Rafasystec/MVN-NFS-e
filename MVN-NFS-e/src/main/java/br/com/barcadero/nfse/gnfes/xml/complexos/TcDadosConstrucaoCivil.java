package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TcDadosConstrucaoCivil {

	@XmlElement(name="CodigoObra",required=true)
	private String codigoObra;
	@XmlElement(name="Art",required=true)
	private String art;
	
	public String getCodigoObra() {
		return codigoObra;
	}
	public void setCodigoObra(String codigoObra) {
		this.codigoObra = codigoObra;
	}
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	
	
}
