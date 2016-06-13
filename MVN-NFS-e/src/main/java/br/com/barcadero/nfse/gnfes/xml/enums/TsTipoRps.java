package br.com.barcadero.nfse.gnfes.xml.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Código de tipo de RPS
1 - RPS
2 – Nota Fiscal Conjugada (Mista)
3 – Cupom
 * @author antoniorafael
 *
 */
@XmlType
@XmlEnum
public enum TsTipoRps {

	@XmlEnumValue("1") RPS,
	@XmlEnumValue("2") NF_CONJUGADA,
	@XmlEnumValue("3") CUPOM
}
