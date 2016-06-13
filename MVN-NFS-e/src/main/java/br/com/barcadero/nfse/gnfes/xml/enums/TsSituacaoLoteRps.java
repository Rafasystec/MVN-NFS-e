package br.com.barcadero.nfse.gnfes.xml.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
/**
 * 
 * @author antoniorafael
 *
 */
@XmlType
@XmlEnum
public enum TsSituacaoLoteRps {

	@XmlEnumValue("1") NAO_RECEBIDO,
	@XmlEnumValue("2") NAO_PROCESSADO,
	@XmlEnumValue("3") PROCESSADO_COM_ERRO,
	@XmlEnumValue("4") PROCESSADO_SUCESSO
}
