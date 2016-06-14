package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.complexos.ListaMensagemRetorno;
import br.com.barcadero.nfse.gnfes.xml.complexos.TcCompNfse;

@XmlRootElement(name="ConsultarNfseRpsResposta")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultarNfseRpsResposta {
	
	@XmlElement(name="CompNfse",required=true)
	private TcCompNfse compNfse;
	@XmlElement(name="ListaMensagemRetorno",required=true)
	private ListaMensagemRetorno listaMensagemRetorno;
	
	public TcCompNfse getCompNfse() {
		return compNfse;
	}
	public void setCompNfse(TcCompNfse compNfse) {
		this.compNfse = compNfse;
	}
	public ListaMensagemRetorno getListaMensagemRetorno() {
		return listaMensagemRetorno;
	}
	public void setListaMensagemRetorno(ListaMensagemRetorno listaMensagemRetorno) {
		this.listaMensagemRetorno = listaMensagemRetorno;
	}
}
