package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import br.com.barcadero.nfse.gnfes.xml.complexos.ListaMensagemRetorno;
import br.com.barcadero.nfse.gnfes.xml.complexos.ListaNfse;

/**
 * Resposta do Servico ConsultarNfse {@link ConsultarNfseEnvio}
 * @author Rafael Rocha
 *
 */
@XmlRootElement(name="ConsultarNfseResposta")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultarNfseResposta {

	@XmlElements({
		@XmlElement(name="ListaNfse",type=ListaNfse.class),
		@XmlElement(name="ListaMensagemRetorno",type=ListaMensagemRetorno.class)
	})
	private Object lista;
	
	public Object getLista() {
		return lista;
	}

	public void setLista(Object lista) {
		this.lista = lista;
	}
	
	
}
