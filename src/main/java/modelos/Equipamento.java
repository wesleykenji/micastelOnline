package main.java.modelos;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table
public class Equipamento {
	
	@Column
	private Integer idEquipamento;
	
	@Column
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="idOrdemServico", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	private OrdemDeServico ordemDeServico;
	
	@Column
	private String numeroSerie;
	
	@Column
	private String condicoesRecebimento;
	
	@Column
	private String defeitoDeclarado;
	
	@Column
	private BigDecimal valor;

	public Integer getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(Integer idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public OrdemDeServico getOrdemDeServico() {
		return ordemDeServico;
	}

	public void setOrdemDeServico(OrdemDeServico ordemDeServico) {
		this.ordemDeServico = ordemDeServico;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getCondicoesRecebimento() {
		return condicoesRecebimento;
	}

	public void setCondicoesRecebimento(String condicoesRecebimento) {
		this.condicoesRecebimento = condicoesRecebimento;
	}

	public String getDefeitoDeclarado() {
		return defeitoDeclarado;
	}

	public void setDefeitoDeclarado(String defeitoDeclarado) {
		this.defeitoDeclarado = defeitoDeclarado;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
}
