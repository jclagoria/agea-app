package ar.com.agea.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import ar.com.agea.app.bean.Sistema;
import ar.com.agea.app.service.SistemaService;
import ar.com.agea.app.service.TipoFormatoService;

@Controller
@SessionAttributes("listaSistemas")
public class SistemaController {
	
    @Autowired
    private SistemaService sistemaService;
    
    @Autowired
    private TipoFormatoService jsonFormatoService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showUserForm(Model model) {
    	
        List<Sistema> listSistemas = getSistemaService().getAllSistemas();

        model.addAttribute("sistema", new Sistema());
        model.addAttribute("listaSistemas", listSistemas);

        return "index";
    }

    @RequestMapping(value = "/jsonAction", method = RequestMethod.POST)
    public String jsonAction( Model model, Sistema sistema) {

    	Sistema findSistema = getSistemaSelected(sistema);
    	
    	String texto = getJsonFormatoService().getFormato(sistema);
    	
    	findSistema.setTextoFormateado(texto);
    	
    	model.addAttribute("sistema", findSistema);
    	    	
        return "index";
    }

    private Sistema getSistemaSelected(Sistema _sistema){
    	
    	return sistemaService.findById(_sistema.getIdSistema());
    }

	/**
	 * @return the sistemaService
	 */
	public SistemaService getSistemaService() {
		return sistemaService;
	}

	/**
	 * @param sistemaService the sistemaService to set
	 */
	public void setSistemaService(SistemaService sistemaService) {
		this.sistemaService = sistemaService;
	}

	/**
	 * @return the jsonFormatoService
	 */
	public TipoFormatoService getJsonFormatoService() {
		return jsonFormatoService;
	}

	/**
	 * @param jsonFormatoService the jsonFormatoService to set
	 */
	public void setJsonFormatoService(TipoFormatoService jsonFormatoService) {
		this.jsonFormatoService = jsonFormatoService;
	}

}
