package br.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.model.Cliente;
import br.service.ClienteService;

@Controller
public class ClienteBean {

	
	 @Autowired
	    private ClienteService service;
	 
	 
	 @RequestMapping(value = "clientes", method = RequestMethod.GET)
	    public String lista(Model model) {
	        model.addAttribute("lista", service.todos());

	        return "/clientes";
	    }
	 @RequestMapping(value = "cadastro", method = RequestMethod.GET)
	    public String cadastro( Model model){
		   model.addAttribute("clienteObj", new Cliente());
		return "/cadastro";
	    }
	 
	 @RequestMapping(value = "/salvar", method = RequestMethod.POST)
	    public String salvar(@ModelAttribute("cliente") Cliente cliente, Model model){
	    	service.salvar(cliente);
		return "redirect:/clientes";
	    }
	 
	 
}
