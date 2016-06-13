package br.com.barcadero.nfse.gnfes.xml.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Código de natureza da operação 
   1 – Tributação no município 
	2 - Tributação fora do município 
   	3 - Isenção 
    4 - Imune 
    5 –Exigibilidade suspensa por decisão judicial 
    6 – Exigibilidade suspensa por procedimento 
          administrativo 

 * @author root
 *
 */
@XmlType
@XmlEnum
public enum TsNaturezaOperacao {
	
	@XmlEnumValue("1") TRIB_MUNICIPIO,
	@XmlEnumValue("2") TRIB_FORA_MUNICIPIO,
	@XmlEnumValue("3") ISENCAO,
	@XmlEnumValue("4") IMUNE,
	@XmlEnumValue("5") SUSPENSA_LEGAL,
	@XmlEnumValue("6") SUSPENSA_ADMINISTRATIVO
}
