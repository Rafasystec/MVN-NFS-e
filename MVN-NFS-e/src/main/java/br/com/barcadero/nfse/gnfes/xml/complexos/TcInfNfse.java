package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import br.com.barcadero.nfse.gnfes.xml.enums.TsNaturezaOperacao;
import br.com.barcadero.nfse.gnfes.xml.enums.TsRegimeEspecialTributacao;
import br.com.barcadero.nfse.gnfes.xml.enums.TsSimNao;

@XmlAccessorType(XmlAccessType.FIELD)
public class TcInfNfse {

	@XmlAttribute(name="Id",required=true)
	private String Id ;
	@XmlElement(name="Numero",required=true)
	private String numero;
	@XmlElement(name="CodigoVerificacao",required=true)
	private String codigoVerificacao;
	@XmlElement(name="DataEmissao",required=true)
	private String dataEmissao;
	@XmlElement(name="IdentificacaoRps",required=true)
	private TcIdentificacaoRps identificacaoRps ;
	@XmlElement(name="DataEmissaoRps",required=true)
	private String dataEmissaoRps;
	@XmlElement(name="NaturezaOperacao",required=true)
	private TsNaturezaOperacao naturezaOperacao ;
	@XmlElement(name="RegimeEspecialTributacao",required=true)
	private TsRegimeEspecialTributacao regimeEspecialTributacao ;
	@XmlElement(name="OptanteSimplesNacional",required=true)
	private TsSimNao optanteSimplesNacional ;
	@XmlElement(name="IncetivadorCultural",required=true)
	private TsSimNao incetivadorCultural ;
	@XmlElement(name="Competencia",required=true)
	private String competencia ;
	@XmlElement(name="NfseSubstituida",required=true)
	private String nfseSubstituida ;
	@XmlElement(name="OutrasInformacoes",required=true)
	private String outrasInformacoes ;
	@XmlElement(name="Servico",required=true)
	private TcDadosServico servico ;
	@XmlElement(name="ValorCredito",required=true)
	private String valorCredito ;
	@XmlElement(name="PrestadorServico",required=true)
	private TcDadosPrestador prestadorServico ;
	@XmlElement(name="TomadorServico",required=true)
	private TcDadosTomador tomadorServico ;
	@XmlElement(name="IntermediarioServico",required=true)
	private TcIdentificacaoIntermediarioServico intermediarioServico;
	@XmlElement(name="OrgaoGerador",required=true)
	private TcIdentificacaoOrgaoGerador orgaoGerador;
	@XmlElement(name="ConstrucaoCivil",required=true)
	private TcDadosConstrucaoCivil construcaoCivil;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCodigoVerificacao() {
		return codigoVerificacao;
	}
	public void setCodigoVerificacao(String codigoVerificacao) {
		this.codigoVerificacao = codigoVerificacao;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public TcIdentificacaoRps getIdentificacaoRps() {
		return identificacaoRps;
	}
	public void setIdentificacaoRps(TcIdentificacaoRps identificacaoRps) {
		this.identificacaoRps = identificacaoRps;
	}
	public String getDataEmissaoRps() {
		return dataEmissaoRps;
	}
	public void setDataEmissaoRps(String dataEmissaoRps) {
		this.dataEmissaoRps = dataEmissaoRps;
	}
	public TsNaturezaOperacao getNaturezaOperacao() {
		return naturezaOperacao;
	}
	public void setNaturezaOperacao(TsNaturezaOperacao naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}
	public TsRegimeEspecialTributacao getRegimeEspecialTributacao() {
		return regimeEspecialTributacao;
	}
	public void setRegimeEspecialTributacao(TsRegimeEspecialTributacao regimeEspecialTributacao) {
		this.regimeEspecialTributacao = regimeEspecialTributacao;
	}
	public TsSimNao getOptanteSimplesNacional() {
		return optanteSimplesNacional;
	}
	public void setOptanteSimplesNacional(TsSimNao optanteSimplesNacional) {
		this.optanteSimplesNacional = optanteSimplesNacional;
	}
	public TsSimNao getIncetivadorCultural() {
		return incetivadorCultural;
	}
	public void setIncetivadorCultural(TsSimNao incetivadorCultural) {
		this.incetivadorCultural = incetivadorCultural;
	}
	public String getCompetencia() {
		return competencia;
	}
	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}
	public String getNfseSubstituida() {
		return nfseSubstituida;
	}
	public void setNfseSubstituida(String nfseSubstituida) {
		this.nfseSubstituida = nfseSubstituida;
	}
	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}
	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}
	public TcDadosServico getServico() {
		return servico;
	}
	public void setServico(TcDadosServico servico) {
		this.servico = servico;
	}
	public String getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(String valorCredito) {
		this.valorCredito = valorCredito;
	}
	public TcDadosPrestador getPrestadorServico() {
		return prestadorServico;
	}
	public void setPrestadorServico(TcDadosPrestador prestadorServico) {
		this.prestadorServico = prestadorServico;
	}
	public TcDadosTomador getTomadorServico() {
		return tomadorServico;
	}
	public void setTomadorServico(TcDadosTomador tomadorServico) {
		this.tomadorServico = tomadorServico;
	}
	public TcIdentificacaoIntermediarioServico getIntermediarioServico() {
		return intermediarioServico;
	}
	public void setIntermediarioServico(TcIdentificacaoIntermediarioServico intermediarioServico) {
		this.intermediarioServico = intermediarioServico;
	}
	public TcIdentificacaoOrgaoGerador getOrgaoGerador() {
		return orgaoGerador;
	}
	public void setOrgaoGerador(TcIdentificacaoOrgaoGerador orgaoGerador) {
		this.orgaoGerador = orgaoGerador;
	}
	public TcDadosConstrucaoCivil getConstrucaoCivil() {
		return construcaoCivil;
	}
	public void setConstrucaoCivil(TcDadosConstrucaoCivil construcaoCivil) {
		this.construcaoCivil = construcaoCivil;
	}

}
