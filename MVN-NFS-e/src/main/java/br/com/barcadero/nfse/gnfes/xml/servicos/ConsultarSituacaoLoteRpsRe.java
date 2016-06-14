package br.com.barcadero.nfse.gnfes.xml.servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Em resposta ao servico ConsultarSituacaoLoteRps {@link ConsultarSituacaoLoteRpsEnvio}
 * @author Rafael Rocha
 * @since 1.0 14/06/2016 as 09:35
 */
@XmlRootElement(name="ConsultarSituacaoLoteRpsResposta")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultarSituacaoLoteRpsRe {

	@XmlElement(name="NumeroLote")
	private String numeroLote;
	@XmlElement(name="Situacao")
	private String situacao;
	@XmlElement(name="ListaMensagemRetorno")
	private String listaMensagemRetorno;
}
