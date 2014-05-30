package ar.com.agea.app.service.impl;

import org.springframework.stereotype.Service;

import ar.com.agea.app.bean.Sistema;
import ar.com.agea.app.service.TipoFormatoService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service("jsonFormatoService")
public class JSONFormatoServiceImpl implements TipoFormatoService {

	public String getFormato(Object _sistema) {

		Sistema sistemaForJSON = (Sistema) _sistema;
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonStr = gson.toJson(sistemaForJSON);
		
		return jsonStr;
	}

}
