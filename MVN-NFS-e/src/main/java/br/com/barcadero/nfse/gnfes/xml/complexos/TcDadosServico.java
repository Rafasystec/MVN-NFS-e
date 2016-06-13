package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * Representa dados que compõe o serviço prestado
 * @author antoniorafael
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TcDadosServico {

	@XmlElement(name="Valores",required=true)
	private TcValores valores;
	@XmlElement(name="ItemListaServico",required=true)
	private String itemListaServico;
	@XmlElement(name="CodigoCnae",required=false)
	private String codigoCnae;
	@XmlElement(name="CodigoTributacaoMunicipio",required=false)
	private String codigoTributacaoMunicipio;
	@XmlElement(name="Discriminacao",required=true)
	private String discriminacao;
	@XmlElement(name="CodigoMunicipio",required=true)
	private String codigoMunicipio;
	public TcValores getValores() {
		return valores;
	}
	public void setValores(TcValores valores) {
		this.valores = valores;
	}
	public String getItemListaServico() {
		return itemListaServico;
	}
	public void setItemListaServico(String itemListaServico) {
		this.itemListaServico = itemListaServico;
	}
	public String getCodigoCnae() {
		return codigoCnae;
	}
	public void setCodigoCnae(String codigoCnae) {
		this.codigoCnae = codigoCnae;
	}
	public String getCodigoTributacaoMunicipio() {
		return codigoTributacaoMunicipio;
	}
	public void setCodigoTributacaoMunicipio(String codigoTributacaoMunicipio) {
		this.codigoTributacaoMunicipio = codigoTributacaoMunicipio;
	}
	public String getDiscriminacao() {
		return discriminacao;
	}
	public void setDiscriminacao(String discriminacao) {
		this.discriminacao = discriminacao;
	}
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}
	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
}
