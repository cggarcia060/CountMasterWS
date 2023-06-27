package com.project.countmasterws.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de proceso
 */
@Getter @Setter
@Entity
@Table(name = "procesos")
public class Process {

    /**
     * id del proceso
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * proceso del proceso
     */
    @Column(name = "nombre")
    private String name;

    /**
     * codigo del proceso
     */
    @Column(name = "codigo")
    private String code;

}
