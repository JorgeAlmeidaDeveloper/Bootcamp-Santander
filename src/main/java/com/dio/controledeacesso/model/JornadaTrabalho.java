package com.dio.controledeacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

//Nesta classe atraves do lombok não precisamos criar os gette e setter e tb os contr
// construtores minimizando o codigo
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class JornadaTrabalho {
    @Id
    @Generated
    private Long id;
    private String descricao;


}
