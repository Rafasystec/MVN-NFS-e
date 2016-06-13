package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlElement;

import br.com.barcadero.nfse.gnfes.xml.enums.TsSimNao;

/**
 * 
 * @author antoniorafael
 *
 */
public class TcValores {
	
	@XmlElement(name="ValorServicos",required=true)
	private String valorServicos;
	@XmlElement(name="valorDeducoes",required=false)
	private String valorDeducoes;
	@XmlElement(name="valorPis",required=false)
	private String valorPis;
	@XmlElement(name="ValorCofins",required=false)
	private String valorCofins;
	@XmlElement(name="ValorInss",required=false)
	private String valorInss;
	@XmlElement(name="ValorIr",required=false)
	private String valorIr;
	@XmlElement(name="ValorCsll",required=false)
	private String valorCsll;
	@XmlElement(name="IssRetido",required=true)
	private TsSimNao issRetido;
	@XmlElement(name="ValorIss",required=false)
	private String valorIss;
	@XmlElement(name="OutrasRetencoes",required=false)
	private String outrasRetencoes;
	@XmlElement(name="BaseCalculo",required=false)
	private String baseCalculo;
	@XmlElement(name="Aliquota",required=false)
	private String aliquota;
	@XmlElement(name="ValorLiquidoNfse",required=false)
	private String valorLiquidoNfse;
	@XmlElement(name="ValorIssRetido",required=false)
	private String valorIssRetido;
	@XmlElement(name="DescontoCondicionado",required=false)
	private String descontoCondicionado;
	@XmlElement(name="DescontoIncondicionado",required=false)
	private String descontoIncondicionado;
	public String getValorServicos() {
		return valorServicos;
	}
	public void setValorServicos(String valorServicos) {
		this.valorServicos = valorServicos;
	}
	public String getValorDeducoes() {
		return valorDeducoes;
	}
	public void setValorDeducoes(String valorDeducoes) {
		this.valorDeducoes = valorDeducoes;
	}
	public String getValorPis() {
		return valorPis;
	}
	public void setValorPis(String valorPis) {
		this.valorPis = valorPis;
	}
	public String getValorCofins() {
		return valorCofins;
	}
	public void setValorCofins(String valorCofins) {
		this.valorCofins = valorCofins;
	}
	public String getValorInss() {
		return valorInss;
	}
	public void setValorInss(String valorInss) {
		this.valorInss = valorInss;
	}
	public String getValorIr() {
		return valorIr;
	}
	public void setValorIr(String valorIr) {
		this.valorIr = valorIr;
	}
	public String getValorCsll() {
		return valorCsll;
	}
	public void setValorCsll(String valorCsll) {
		this.valorCsll = valorCsll;
	}
	public TsSimNao getIssRetido() {
		return issRetido;
	}
	public void setIssRetido(TsSimNao issRetido) {
		this.issRetido = issRetido;
	}
	public String getValorIss() {
		return valorIss;
	}
	public void setValorIss(String valorIss) {
		this.valorIss = valorIss;
	}
	public String getOutrasRetencoes() {
		return outrasRetencoes;
	}
	public void setOutrasRetencoes(String outrasRetencoes) {
		this.outrasRetencoes = outrasRetencoes;
	}
	public String getBaseCalculo() {
		return baseCalculo;
	}
	public void setBaseCalculo(String baseCalculo) {
		this.baseCalculo = baseCalculo;
	}
	public String getAliquota() {
		return aliquota;
	}
	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
	}
	public String getValorLiquidoNfse() {
		return valorLiquidoNfse;
	}
	/**
	 * (ValorServicos - ValorPIS -
		ValorCOFINS - ValorINSS -
		ValorIR - ValorCSLL -
		OutrasRetençoes -
		ValorISSRetido -
		DescontoIncondicionado -
		DescontoCondicionado)
	 * @param valorLiquidoNfse
	 */
	public void setValorLiquidoNfse(String valorLiquidoNfse) {
		this.valorLiquidoNfse = valorLiquidoNfse;
	}
	public String getValorIssRetido() {
		return valorIssRetido;
	}
	public void setValorIssRetido(String valorIssRetido) {
		this.valorIssRetido = valorIssRetido;
	}
	public String getDescontoCondicionado() {
		return descontoCondicionado;
	}
	public void setDescontoCondicionado(String descontoCondicionado) {
		this.descontoCondicionado = descontoCondicionado;
	}
	public String getDescontoIncondicionado() {
		return descontoIncondicionado;
	}
	public void setDescontoIncondicionado(String descontoIncondicionado) {
		this.descontoIncondicionado = descontoIncondicionado;
	}
	
	
}
