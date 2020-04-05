package com.dawn.facade.impl.dawn;

import com.dawn.facade.DawnFacade;
import com.dawn.application.DawnApplication;
import com.dawn.command.DawnCommand;
import com.dawn.core.entity.DawnEntity;
import com.dawn.facade.assembler.DawnAssembler;
import com.dawn.infra.InvokeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Dawn on 2020-04-05.
 */
@Component
public class DawnFacadeImpl implements DawnFacade {

    @Autowired
    DawnAssembler dawnAssembler;

    @Autowired
    DawnApplication dawnApplication;
    @Override
    public InvokeResult save(DawnCommand command) {
        try {
            DawnEntity dawnEntity = dawnAssembler.toDawn(command);
            dawnApplication.save(dawnEntity);
           return InvokeResult.success();
        }catch (Exception ex){
            ex.printStackTrace();
           return InvokeResult.failure(ex.getMessage());
        }
    }
}
