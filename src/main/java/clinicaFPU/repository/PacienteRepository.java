package clinicaFPU.repository;

import org.springframework.data.repository.CrudRepository;

import clinicaFPU.entity.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Long> {

}
