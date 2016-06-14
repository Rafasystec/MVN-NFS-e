package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Resposta do servico RecepcionarLoteRps {@link EnviarLoteRpsEnvio}
 * @author Rafael Rocha
 *
 */
@XmlRootElement(name="EnviarLoteRpsResposta")
@XmlAccessorType(XmlAccessType.FIELD)
public class EnviarLoteRpsResposta {

	@XmlElement(name="NumeroLote",required=true)
	private String numeroLote;
	@XmlElement(name="DataRecebimento",required=true)
	private String datRecebimento;
	@XmlElement(name="Protocolo",required=true)
	private String protocolo;
	@XmlElement(name="ListaMensagemRetorno",required=true)
	private String listaMensagemRetorno;
	
	public String getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}
	public String getDatRecebimento() {
		return datRecebimento;
	}
	public void setDatRecebimento(String datRecebimento) {
		this.datRecebimento = datRecebimento;
	}
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public String getListaMensagemRetorno() {
		return listaMensagemRetorno;
	}
	public void setListaMensagemRetorno(String listaMensagemRetorno) {
		this.listaMensagemRetorno = listaMensagemRetorno;
	}
	
	
}
