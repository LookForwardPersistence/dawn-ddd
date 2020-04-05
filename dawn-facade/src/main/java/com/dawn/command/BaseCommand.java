package com.dawn.command;

import java.io.Serializable;

/**
 * Created by Dawn on 2020-04-05.
 */
public class BaseCommand implements Serializable {
    private static final long serialVersionUID = -7850199084231563540L;

    /**
     * */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
