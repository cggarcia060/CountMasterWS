package com.project.countmasterws.domain.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * Pojo de proceso
 */
@Getter @Setter
public class ProcessPojo {
    /**
     * id del proceso
     */
    private Integer id;
    /**
     * nombre del proceso
     */

    private String name;
    /**
     * codigo del proceso
     */
    private String code;
}
