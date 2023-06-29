package org.countmasterws.domain.dto.proceso;

import lombok.Getter;
import lombok.Setter;

/**
 * Pojo de proceso
 */
@Getter @Setter
public class ProcessDto {
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
