package br.com.barcadero.nfse.gnfes.xml.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum
public enum TsIndicacaoCpfCnpj {

	@XmlEnumValue("1") CPF,
	@XmlEnumValue("2") CNPJ,
	@XmlEnumValue("3") NAO_INFORMADO
}
