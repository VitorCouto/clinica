package clinicaFPU.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import clinicaFPU.entity.Consulta;

public interface ConsultaRepository extends CrudRepository<Consulta, Long> {
	
	@Query("from Consulta order by data")
	public List<Consulta> findAllOrderByData();

}
