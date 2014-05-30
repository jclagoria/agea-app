package ar.com.agea.app.formato.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class SistemaXML {

	@XmlElement  
	private Long id;

	@XmlElement  
	private String descripcion;

	public SistemaXML(){
		
	} 
	
	public SistemaXML(Long _id, String _descripcion){
		this.id = _id;
		this.descripcion = _descripcion;	
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}