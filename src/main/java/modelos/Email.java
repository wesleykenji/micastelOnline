package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table
public class Email {
	
	@Column
	private Integer idEmail;
	
	@Column
	private String email;
	
	@ManyToOne( fetch = FetchType.EAGER )
	@JoinColumn(name="cliente", insertable=true, updatable=true, referencedColumnName="idCliente")
	@Fetch(FetchMode.JOIN)
	private Cliente cliente;
	
	public Integer getIdEmail() {
		return idEmail;
	}
	public void setIdEmail(Integer idEmail) {
		this.idEmail = idEmail;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
