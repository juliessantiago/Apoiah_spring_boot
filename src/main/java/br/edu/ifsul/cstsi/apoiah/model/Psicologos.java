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
public class Psicologos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String nome;
    private String instituicao;
    private String email;
    private String senha;
    private String cpf;
    @OneToMany(mappedBy = "psicologos")
    private List<AlunoPsicologo> prontuarios;

}
