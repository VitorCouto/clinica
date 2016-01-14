package clinicaFPU.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Consulta {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;	
	private String dataConsulta;
	private String horarioInicio;
	@Column(length = 1000, nullable = false)
	private String observacao;
	
	@ManyToOne
	private Medico medic;
	@ManyToOne
	private Paciente pacient;
	
	public Consulta() {
		this.medic = new Medico();
		this.pacient = new Paciente();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Medico getMedic() {
		return medic;
	}
	public void setMedic(Medico medic) {
		this.medic = medic;
	}
	public Paciente getPacient() {
		return pacient;
	}
	public void setPacient(Paciente pacient) {
		this.pacient = pacient;
	}
	

	
	
	
}
