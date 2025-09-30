package com.adso.aprendiz.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //genera los metodos getters
@Setter // genera los metodos setters
@AllArgsConstructor // const
@NoArgsConstructor
@Entity
@Table(name = "aprendiz")

public class AprendizEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generamos el valor de la llave primaria automaticamente
    private long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email",  unique = true)
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

}
