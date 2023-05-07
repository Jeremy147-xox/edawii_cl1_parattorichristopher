package pe.edu.cibertec.dawii_cl1_parattorichristopher.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Curso")
public class Curso {
    @Id
    private String idcurso;
    @Column(name = "NomCurso")
    private String nomCurso;
    @Column(name = "Credito")
    private Integer credito;
}
