package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * Representa dados do prestador do serviço
 * @author antoniorafael
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TcDadosPrestador {

	@XmlElement(name="IdentificacaoPrestador", required=true)
	private TcIdentificacaoPrestador identificacaoPrestador ;
	@XmlElement(name="RazaoSocial", required=true)
	private String razaoSocial ;
	@XmlElement(name="NomeFantasia", required=false)
	private String nomeFantasia ;
	@XmlElement(name="Endereco", required=true)
	private TcEndereco endereco ;
	@XmlElement(name="Contato", required=false)
	private TcContato contato ;
	public TcIdentificacaoPrestador getIdentificacaoPrestador() {
		return identificacaoPrestador;
	}
	public void setIdentificacaoPrestador(TcIdentificacaoPrestador identificacaoPrestador) {
		this.identificacaoPrestador = identificacaoPrestador;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public TcEndereco getEndereco() {
		return endereco;
	}
	public void setEndereco(TcEndereco endereco) {
		this.endereco = endereco;
	}
	public TcContato getContato() {
		return contato;
	}
	public void setContato(TcContato contato) {
		this.contato = contato;
	}

}
