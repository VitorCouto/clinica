package clinicaFPU.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import clinicaFPU.entity.Medico;
import clinicaFPU.entity.Paciente;
import clinicaFPU.repository.PacienteRepository;

@Controller
public class PacienteController {

	@Autowired
	PacienteRepository pacienteRepository;	
	
	@RequestMapping(value="/paciente")
	public String lista (Paciente paciente, Model model){
		
		model.addAttribute("pacientes", pacienteRepository.findAll());
		if (paciente.getId() != null){
			model.addAttribute("paciente", pacienteRepository.findOne(paciente.getId()));
		} else {
			model.addAttribute("paciente", new Medico ());
		}
		
		return "paciente";
	}
	
	@RequestMapping(value="/paciente/save")
	public String salvar (Paciente paciente){
		pacienteRepository.save(paciente);
		return "redirect:/paciente";
	}
	
	@RequestMapping(value="/paciente/del")
	public String deletar (Paciente paciente){
		pacienteRepository.delete(paciente);
		return "redirect:/paciente";		
	}
	
}
