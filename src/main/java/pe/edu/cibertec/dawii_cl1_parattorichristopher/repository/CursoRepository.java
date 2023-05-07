package pe.edu.cibertec.dawii_cl1_parattorichristopher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dawii_cl1_parattorichristopher.model.bd.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, String> {
}
