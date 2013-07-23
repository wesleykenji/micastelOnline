package modelos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table
public class Cliente {
	
	@GeneratedValue
	@Column
	private Integer idCliente;
	
	@Column
	private String nome;
	
	@Column
	private String cpfCnpj;
	
	@Column
	private String inscricaoEstadual;
	
	@Column
	private Date clienteDesde;
	
	@OneToMany(mappedBy="cliente")
	@Cascade(CascadeType.ALL)
	private List<Telefone> telefones;
	
	@OneToMany(mappedBy="cliente")
	@Cascade(CascadeType.ALL)
	private List<Email> emails;
	
	@Column
	private Endereco endereco;
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public Date getClienteDesde() {
		return clienteDesde;
	}
	public void setClienteDesde(Date clienteDesde) {
		this.clienteDesde = clienteDesde;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
