package ar.com.agea.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.com.agea.app.dao.SistemaDAO;
import ar.com.agea.app.entity.SistemaEntity;

@Repository
public class SistemaDAOImpl extends AbstractDaoImpl<SistemaEntity, Long> implements SistemaDAO {
	
	public SistemaDAOImpl() {
		super(SistemaEntity.class);		
	}
}
