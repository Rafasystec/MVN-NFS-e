package br.com.barcadero.nfse.gnfes.xml.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Código de identificação do regime especial de 
   tributação 
    1 – Microempresa municipal 
   	2 - Estimativa 
   	3 – Sociedade de profissionais 
    4 – Cooperativa 
    5 - Microempresário Individual (MEI) 
    6 - Microempresário e Empresa de Pequeno Porte (ME EPP) 
 * @author RAFAEL ROCHA
 *
 */
@XmlType
@XmlEnum
public enum TsRegimeEspecialTributacao {

	@XmlEnumValue("1") MICRO_EMP_MUNICIPAL,
	@XmlEnumValue("2") ESTIMATIVA,
	@XmlEnumValue("3") SOCIEDADE_PROFISSIONAIS,
	@XmlEnumValue("4") COOPERATIVA,
	@XmlEnumValue("5") MEI,
	@XmlEnumValue("6") MICRO_EMP_PEQ_PORTE
}
