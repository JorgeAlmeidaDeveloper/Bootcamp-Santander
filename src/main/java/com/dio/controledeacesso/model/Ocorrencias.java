package com.dio.controledeacesso.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocorrencias {

    @Id
    private long id;
    private String nome;
    private String descricao;


}
