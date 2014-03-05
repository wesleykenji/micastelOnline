package main.java.modelos.enumeration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public enum TipoTelefone {
	
	CELULAR (1, "Celular"),
	CASA(2, "Casa"),
	COMERCIAL(3, "Comercial");
	
	@Column
	private final Integer idTipoTelefone;
	
	@Column
	private final String tipoTelefone;

	private TipoTelefone(Integer idTipoTelefone, String tipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
		this.tipoTelefone = tipoTelefone;
	}

	public Integer getIdTipoTelefone() {
		return idTipoTelefone;
	}

	public String getTipoTelefone() {
		return tipoTelefone;
	}
	
}
