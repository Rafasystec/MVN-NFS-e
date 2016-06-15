package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.barcadero.nfse.gnfes.xml.complexos.TcPedidoCancelamento;

/**
 * 3.5.6 Cancelamento NFS-e
	Esse serviço será executado através da chamada ao método CancelarNfse,
	passando a mensagem XML como parâmetro com a estrutura definida na
	tabela que segue.
 * @author Rafael Rocha
 *
 */
@XmlRootElement(name="CancelarNfseEnvio")
@XmlAccessorType(XmlAccessType.FIELD)
public class CancelarNfseEnvio {

	@XmlElement(name="Pedido")
	private TcPedidoCancelamento pedidoCancelamento;

	public TcPedidoCancelamento getPedidoCancelamento() {
		return pedidoCancelamento;
	}

	public void setPedidoCancelamento(TcPedidoCancelamento pedidoCancelamento) {
		this.pedidoCancelamento = pedidoCancelamento;
	}
}
