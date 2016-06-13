package br.com.barcadero.nfse.gnfes.xml.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Código de status da NFS-e 
 	1 – Normal 
   	2 – Cancelado 
 * @author Rafael Rocha
 *
 */
@XmlEnum
@XmlType
public enum TsStatusNfse {
	@XmlEnumValue("1") NORMAL,
	@XmlEnumValue("2") CANCELADO
}
