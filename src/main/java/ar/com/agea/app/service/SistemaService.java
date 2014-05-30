package ar.com.agea.app.service;

import java.util.List;

import ar.com.agea.app.bean.Sistema;

public interface SistemaService {

	public Sistema findById(Long _id);
	public void saveSistema(Sistema _sistema);
	public void deleteSistema(Long _id);
	public List<Sistema> getAllSistemas();
	
}
