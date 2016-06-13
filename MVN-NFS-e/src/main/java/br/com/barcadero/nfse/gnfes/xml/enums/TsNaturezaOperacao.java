package br.com.barcadero.nfse.gnfes.xml.enums;

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
public enum TsNaturezaOperacao {
	
	TRIB_MUNICIPIO,
	TRIB_FORA_MUNICIPIO,
	ISENCAO,
	IMUNE,
	SUSPENSA_LEGAL,
	SUSPENSA_ADMINISTRATIVO
}
