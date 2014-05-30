package ar.com.agea.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.agea.app.bean.Sistema;
import ar.com.agea.app.dao.SistemaDAO;
import ar.com.agea.app.entity.SistemaEntity;
import ar.com.agea.app.service.SistemaService;
import ar.com.agea.app.service.transformer.SistemaTransformer;

@Service("sistemaService")
@Transactional(readOnly = true)
public class SistemaServiceImpl implements SistemaService {

	@Autowired
	private SistemaDAO sistemaDAO;
	
	private SistemaTransformer transformer;
	
	public SistemaServiceImpl(){
		this.transformer = new SistemaTransformer();
	}
	
	public Sistema findById(Long _id) {
		
		SistemaEntity entity = sistemaDAO.findById(_id);
		Sistema sistema = getTransformer().entitiToBean(entity);
		
		return sistema;
	}

	@Transactional(readOnly = false)
	public void saveSistema(Sistema _sistema) {
		
		SistemaEntity entity = getTransformer().beanToEntity(_sistema);
		
		sistemaDAO.saveOrUpdate(entity);
	}

	public void deleteSistema(Long _id) {
		SistemaEntity sistema = sistemaDAO.findById(_id);
		if(sistema != null)
			sistemaDAO.delete(sistema);
	}

	public List<Sistema> getAllSistemas() {
		
		List<SistemaEntity> listEntity = sistemaDAO.findAll();
		
		return getTransformer().listEntityToListToBean(listEntity);
	}

	/**
	 * @return the transformer
	 */
	public SistemaTransformer getTransformer() {
		return transformer;
	}

	/**
	 * @param transformer the transformer to set
	 */
	public void setTransformer(SistemaTransformer transformer) {
		this.transformer = transformer;
	}

}
