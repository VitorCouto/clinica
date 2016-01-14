package clinicaFPU.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import clinicaFPU.entity.Medico;
import clinicaFPU.repository.MedicoRepository;

@Controller
public class MedicoController {
	
	@Autowired
	MedicoRepository medicoRepository;
	
	@RequestMapping(value="/medico")
	public String lista (Medico medico, Model model){
		
		model.addAttribute("medicos", medicoRepository.findAll());
		if (medico.getId() != null){
			model.addAttribute("medico", medicoRepository.findOne(medico.getId()));
		} else {
			model.addAttribute("medico", new Medico ());
		}
		
		return "medico";
	}
	
	@RequestMapping(value="/medico/save")
	public String salvar (Medico medico){
		medicoRepository.save(medico);
		return "redirect:/medico";
	}
	
	@RequestMapping(value="/medico/del")
	public String deletar (Medico medico){
		medicoRepository.delete(medico);
		return "redirect:/medico";
	}

}
