package ar.com.agea.app.service.transformer;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;

import ar.com.agea.app.bean.Sistema;
import ar.com.agea.app.entity.SistemaEntity;

/**
 * Clase en la cual se tratan los datos que retornan de la 
 * base de datos o van a ella.
 * 
 * @author jclagoria
 *
 */
public class SistemaTransformer {

	public Sistema entitiToBean(SistemaEntity _entity){
		
		Sistema sistemaBean = new Sistema(_entity.getIdSistema(), 
				_entity.getDescripcionSistema());
		
		return sistemaBean;
	}
	
	public SistemaEntity beanToEntity(Sistema _sistema){
		
		SistemaEntity entity = new SistemaEntity(_sistema.getIdSistema(), 
				_sistema.getDescripcionSistema());
		
		return entity;
	}
	
	public List<Sistema> listEntityToListToBean(List<SistemaEntity> _listEntity){
		
		List<Sistema> listSistemas = new ArrayList<Sistema>();
		
		for (SistemaEntity sistemaEntity : _listEntity) {
			Sistema newSistema = new Sistema();
			newSistema.setIdSistema(sistemaEntity.getIdSistema());
			newSistema.setDescripcionSistema(sistemaEntity.getDescripcionSistema());
			
			listSistemas.add(newSistema);
		}
		
		return listSistemas;
	}
	
}
