package br.com.barcadero.nfse.gnfes.xml.basicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;
/**
 * Número da Nota Fiscal de Serviço Eletrônica,
formado pelo ano com 04 (quatro) dígitos e um
número seqüencial com 11 posições – Formato
AAAANNNNNNNNNNN. Tamanho: 15
 * @author antoniorafael
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TsNumeroNfse {

	@XmlValue
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
