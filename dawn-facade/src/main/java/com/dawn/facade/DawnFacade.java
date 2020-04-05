package com.dawn.facade;

import com.dawn.command.DawnCommand;
import com.dawn.infra.InvokeResult;

/**
 * Created by Dawn on 2020-04-05.
 */
public interface DawnFacade {

    /**
     * 保存dawn
     * */
    InvokeResult save(DawnCommand command);
}
