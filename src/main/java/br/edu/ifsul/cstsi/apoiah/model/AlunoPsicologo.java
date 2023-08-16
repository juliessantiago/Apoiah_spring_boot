package br.edu.ifsul.cstsi.apoiah.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "aluno_psicologo", schema = "apoiah", catalog = "")
public class AlunoPsicologo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Timestamp createdAt;

    private Timestamp updatedAt;

    private Long psicologoId;

    private String parecer;

    private Timestamp dataEntrada;
    @ManyToOne
    @JoinColumn(name="aluno_id", referencedColumnName = "id")
    private Alunos aluno;

    @ManyToOne
    @JoinColumn(name="psicologo_id", referencedColumnName = "id")
    private Psicologos psicologos;


}
