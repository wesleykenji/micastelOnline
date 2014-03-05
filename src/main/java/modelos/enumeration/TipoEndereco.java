package main.java.modelos.enumeration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public enum TipoEndereco {
	
	CASA (1, "Casa"),
	APARTAMENTO (2, "Apartamento"),
	COMERCIAL(3, "Comercial");
	
	@Column
	private final Integer idTipoEndereco;
	
	@Column
	private final String tipoEndereco;

	private TipoEndereco(Integer idTipoEndereco, String tipoEndereco) {
		this.idTipoEndereco = idTipoEndereco;
		this.tipoEndereco = tipoEndereco;
	}

	public Integer getIdTipoEndereco() {
		return idTipoEndereco;
	}

	public String getTipoEndereco() {
		return tipoEndereco;
	}


}
