package br.com.barcadero.nfse.gnfes.xml.basicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TsPeriodoEmissao {
	
	@XmlElement(name="Datainicial")
	private String datainicial;
	@XmlElement(name="DataFinal")
	private String dataFinal;
	
	public String getDatainicial() {
		return datainicial;
	}
	public void setDatainicial(String datainicial) {
		this.datainicial = datainicial;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	
}
