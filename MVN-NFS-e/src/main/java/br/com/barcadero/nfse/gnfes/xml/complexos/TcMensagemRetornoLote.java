package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TcMensagemRetornoLote {

	@XmlElement(name="IdentificacaoRps",required=true)
	private TcIdentificacaoRps identificacaoRps;
	@XmlElement(name="Codigo",required=true)
	private String codigo ;
	@XmlElement(name="Mensagem",required=true)
	private String mensagem;
	
	public TcIdentificacaoRps getIdentificacaoRps() {
		return identificacaoRps;
	}
	public void setIdentificacaoRps(TcIdentificacaoRps identificacaoRps) {
		this.identificacaoRps = identificacaoRps;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
