package com.dio.controledeacesso.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Empresa {

    @Id
    private Long id;
    private String descricao;
    private String cnpj;
    private String end;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;


}
