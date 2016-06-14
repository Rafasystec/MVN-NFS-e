package br.com.barcadero.nfse.gnfes.xml.rps.consulta;

import javax.xml.bind.annotation.XmlElement;

public class ConsultarSituacaoLoteRpsRe {

	@XmlElement(name="NumeroLote")
	private String numeroLote;
	@XmlElement(name="Situacao")
	private String situacao;
	@XmlElement(name="ListaMensagemRetorno")
	private String listaMensagemRetorno;
}
