package br.com.barcadero.nfse.gnfes.xml.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Código de status do RPS 
 	1 – Normal 
   	2 – Cancelado 
 * @author root
 *
 */
@XmlEnum
@XmlType
public enum TsStatusRps {
	
	@XmlEnumValue("1") NORMAL,
	@XmlEnumValue("2") CANCELADO

}
