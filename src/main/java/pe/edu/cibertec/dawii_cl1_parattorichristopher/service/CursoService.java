package pe.edu.cibertec.dawii_cl1_parattorichristopher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dawii_cl1_parattorichristopher.model.bd.Curso;
import pe.edu.cibertec.dawii_cl1_parattorichristopher.repository.CursoRepository;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }

    public void registrarCurso(Curso curso){
        cursoRepository.save(curso);
    }

    public void eliminarCurso(Curso curso){
        cursoRepository.deleteById(curso.getIdcurso());
    }

}
