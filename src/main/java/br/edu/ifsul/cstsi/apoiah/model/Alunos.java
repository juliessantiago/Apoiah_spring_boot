package br.edu.ifsul.cstsi.apoiah.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alunos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    private String numProtoc;

    private String nome;

    private String cpf;

    private String matricula;

    private Integer idade;

    private String turma;

    private Byte vulnerSocial;

    private String dataNasc;

    private Object turno;

    private String motivoEnc;

    private String responsavel;

    @ManyToOne
    @JoinColumn(name="orientador_id", referencedColumnName = "id")
    private Orientadors orientador;

    @OneToMany(mappedBy = "aluno")
    private List <AlunoPsicologo> prontuarios;

}
