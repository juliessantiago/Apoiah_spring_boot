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
public class Orientadors {
    @Id //identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String nome;
    private String email;
    private String cpf;
    private String escola;
    private String senha;

    @OneToMany(mappedBy = "orientador")
    private List<Alunos> alunos;
}
