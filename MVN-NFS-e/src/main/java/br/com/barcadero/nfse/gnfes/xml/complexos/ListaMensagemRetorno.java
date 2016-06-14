package br.com.barcadero.nfse.gnfes.xml.complexos;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ListaMensagemRetorno {
	
	@XmlElement(name="MensagemRetorno")
	private List<TcMensagemRetorno> MensagemRetorno;

}
