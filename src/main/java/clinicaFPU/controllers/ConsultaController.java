package clinicaFPU.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import clinicaFPU.entity.Consulta;
import clinicaFPU.repository.ConsultaRepository;
import clinicaFPU.repository.MedicoRepository;
import clinicaFPU.repository.PacienteRepository;

@Controller
public class ConsultaController {
	
	@Autowired
	ConsultaRepository consultaRepository;
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@Autowired
	MedicoRepository medicoRepository;
	
	@RequestMapping(value="/")
	public String lista (Consulta consulta, Model model){
		model.addAttribute("pacientes", pacienteRepository.findAll());
		model.addAttribute("consultas", consultaRepository.findAll());
		model.addAttribute("medicos", medicoRepository.findAll());
		if (consulta.getId() != null){
			model.addAttribute("consulta", consultaRepository.findOne(consulta.getId()));
		} else {
			model.addAttribute("consulta", new Consulta());
		}		
		return "consulta";
	}
	

	@RequestMapping(value="/save")
	public String salvar (Consulta consulta){
		consultaRepository.save(consulta);
		return "redirect:/";
	}
	
	@RequestMapping(value="/del")
	public String deletar (Consulta consulta){
		consultaRepository.delete(consulta);
		return "redirect:/";
	}
	
}
