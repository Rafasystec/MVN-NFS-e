package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlElement;

public class TcMensagemRetorno {

	@XmlElement(name="Codigo",required=true)
	private String codigo;
	@XmlElement(name="Mensagem",required=true)
	private String mensagem;
	@XmlElement(name="Correcao",required=false)
	private String correcao;
	
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
	public String getCorrecao() {
		return correcao;
	}
	public void setCorrecao(String correcao) {
		this.correcao = correcao;
	}
	
	
	
}
