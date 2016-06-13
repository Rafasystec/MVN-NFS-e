package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.enums.TsNaturezaOperacao;
import br.com.barcadero.nfse.gnfes.xml.enums.TsRegimeEspecialTributacao;
import br.com.barcadero.nfse.gnfes.xml.enums.TsSimNao;
import br.com.barcadero.nfse.gnfes.xml.enums.TsStatusRps;
/**
 * Representa dados informativos do Recibo Provisório de Serviço (RPS)
 * @author antoniorafael
 *
 */
@XmlRootElement(name="InfRps")
@XmlAccessorType(XmlAccessType.FIELD)
public class TcInfRps {

	@XmlAttribute(name="Id", required=true)
	private String id;
	@XmlElement(name="IdentificacaoRps",required=true)
	private String identificacaoRps;
	@XmlElement(name="DataEmissao",required=true)
	private String dataEmissao;
	@XmlElement(name="NaturezaOperacao",required=true)
	private TsNaturezaOperacao naturezaOperacao;
	@XmlElement(name="RegimeEspecialTributacao",required=true)
	private TsRegimeEspecialTributacao regimeEspecialTributacao;
	@XmlElement(name="OptanteSimplesNacional",required=true)
	private TsSimNao optanteSimplesNacional;
	@XmlElement(name="IncentivadorCultural",required=true)
	private TsSimNao incentivadorCultural;
	@XmlElement(name="Status",required=true)
	private TsStatusRps status;
	@XmlElement(name="RpsSubstituido",required=false)
	private TcIdentificacaoRps rpsSubstituido;
	@XmlElement(name="Servico",required=true)
	private String servico;
	@XmlElement(name="Prestador",required=true)
	private String prestador;
	@XmlElement(name="Tomador",required=true)
	private String tomador;
	@XmlElement(name="IntermediarioServico",required=true)
	private String intermediarioServico;
	@XmlElement(name="ConstrucaoCivil",required=true)
	private String contrucaoCivil;
	
}
