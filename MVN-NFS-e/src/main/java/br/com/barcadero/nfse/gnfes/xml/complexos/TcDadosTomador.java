package br.com.barcadero.nfse.gnfes.xml.complexos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * Representa dados do tomador de serviço
 * @author antoniorafael
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class TcDadosTomador {
	
	@XmlElement(name="IdentificacaoTomador")
	private TcIdentificacaoTomador tcIdentificacaoTomador;
	@XmlElement(name="RazaoSocial")
	private String razaoSocial;
	@XmlElement(name="Endereco")
	private TcEndereco tcEndereco;
	@XmlElement(name="Contato")
	private TcContato tcContato;
	
	public TcIdentificacaoTomador getTcIdentificacaoTomador() {
		return tcIdentificacaoTomador;
	}
	public void setTcIdentificacaoTomador(TcIdentificacaoTomador tcIdentificacaoTomador) {
		this.tcIdentificacaoTomador = tcIdentificacaoTomador;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public TcEndereco getTcEndereco() {
		return tcEndereco;
	}
	public void setTcEndereco(TcEndereco tcEndereco) {
		this.tcEndereco = tcEndereco;
	}
	public TcContato getTcContato() {
		return tcContato;
	}
	public void setTcContato(TcContato tcContato) {
		this.tcContato = tcContato;
	}
	
}
