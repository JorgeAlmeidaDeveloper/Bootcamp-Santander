package com.dio.controledeacesso.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {

    @Id
    private Long id;
    //Nivel de acesso para o banco 1/n
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
