package com.dawn.facade.assembler;

import com.dawn.command.DawnCommand;
import com.dawn.core.entity.DawnEntity;
import com.dawn.facade.assembler.map.DawnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Dawn on 2020-04-05.
 */
@Component
public class DawnAssembler {

    @Autowired
    DawnMapper dawnMapper;
    public DawnEntity toDawn(DawnCommand command){
        DawnEntity dawnEntity =null;
     if(command.getId()==null){
         dawnEntity=new DawnEntity();
     }else {
         dawnEntity=DawnEntity.get(DawnEntity.class,command.getId());
     }
     dawnEntity = dawnMapper.toDawnEntity(dawnEntity,command);
     command.setId(dawnEntity.getId());
     return dawnEntity;
    }
}
