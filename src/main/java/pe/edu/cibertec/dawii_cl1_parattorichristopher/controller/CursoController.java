package pe.edu.cibertec.dawii_cl1_parattorichristopher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.dawii_cl1_parattorichristopher.model.bd.Curso;
import pe.edu.cibertec.dawii_cl1_parattorichristopher.service.CursoService;

import java.util.List;

@Controller
@RequestMapping("/Curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/frmMantCursos")
    public String frmMantCurso(Model model){
        model.addAttribute("listaCursos",cursoService.listarCursos());
        return "Curso/frmMantCurso";
    }
}
