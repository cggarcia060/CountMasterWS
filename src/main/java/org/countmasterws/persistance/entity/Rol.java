package org.countmasterws.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de rol
 */
@Getter @Setter
@Entity
@Table(name = "roles")
public class Rol {
    /**
    * id del rol
     **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * nombre del rol
     */
    @Column(name = "nombre")
    private String name;
    /**
     * nombre del rol
     */
    @Column(name="rol_nombre")
    private String code;
}
