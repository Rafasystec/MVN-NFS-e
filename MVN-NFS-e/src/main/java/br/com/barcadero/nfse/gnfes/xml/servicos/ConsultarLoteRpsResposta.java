package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.complexos.ListaMensagemRetorno;
import br.com.barcadero.nfse.gnfes.xml.complexos.ListaNfse;

@XmlRootElement(name="ConsultarLoteRpsResposta")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultarLoteRpsResposta {

	@XmlElement(name="ListaNfse",required=true)
	private ListaNfse listaNfse;
	@XmlElement(name="ListaMensagemRetorno",required=true)
	private ListaMensagemRetorno listaMensagemRetorno;
	
	public ListaNfse getListaNfse() {
		return listaNfse;
	}
	public void setListaNfse(ListaNfse listaNfse) {
		this.listaNfse = listaNfse;
	}
	public ListaMensagemRetorno getListaMensagemRetorno() {
		return listaMensagemRetorno;
	}
	public void setListaMensagemRetorno(ListaMensagemRetorno listaMensagemRetorno) {
		this.listaMensagemRetorno = listaMensagemRetorno;
	}
	
	
}
