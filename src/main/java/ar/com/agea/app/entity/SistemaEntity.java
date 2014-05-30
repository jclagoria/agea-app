package ar.com.agea.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "L_SISTEMA")
public class SistemaEntity {
	
	@Id
	@Column(name = "ID")
	private Long idSistema;
	
	@Column(name="DESCRIPCION")
	private String descripcionSistema;
	
	public SistemaEntity(){
		
	}
	
	public SistemaEntity(Long _idSistema, String _descipcionSistema){
		this.idSistema = _idSistema;
		this.descripcionSistema = _descipcionSistema;
	}

	/**
	 * @return the idSistema
	 */
	public Long getIdSistema() {
		return idSistema;
	}

	/**
	 * @param idSistema the idSistema to set
	 */
	public void setIdSistema(Long idSistema) {
		this.idSistema = idSistema;
	}

	/**
	 * @return the descripcionSistema
	 */
	public String getDescripcionSistema() {
		return descripcionSistema;
	}

	/**
	 * @param descripcionSistema the descripcionSistema to set
	 */
	public void setDescripcionSistema(String descripcionSistema) {
		this.descripcionSistema = descripcionSistema;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((descripcionSistema == null) ? 0 : descripcionSistema
						.hashCode());
		result = prime * result
				+ ((idSistema == null) ? 0 : idSistema.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SistemaEntity other = (SistemaEntity) obj;
		if (descripcionSistema == null) {
			if (other.descripcionSistema != null)
				return false;
		} else if (!descripcionSistema.equals(other.descripcionSistema))
			return false;
		if (idSistema == null) {
			if (other.idSistema != null)
				return false;
		} else if (!idSistema.equals(other.idSistema))
			return false;
		return true;
	}
	
}
