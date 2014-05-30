package ar.com.agea.app.bean;

public class Sistema {

	private Long idSistema;
	private String descripcionSistema;
	private String textoFormateado;
	
	public Sistema(){
		
	}
	
	public Sistema(Long _id, String _descripcion){
		this.idSistema = _id;
		this.descripcionSistema = _descripcion;
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
	/**
	 * @return the textoFormateado
	 */
	public String getTextoFormateado() {
		return textoFormateado;
	}
	/**
	 * @param textoFormateado the textoFormateado to set
	 */
	public void setTextoFormateado(String textoFormateado) {
		this.textoFormateado = textoFormateado;
	}
	
}
