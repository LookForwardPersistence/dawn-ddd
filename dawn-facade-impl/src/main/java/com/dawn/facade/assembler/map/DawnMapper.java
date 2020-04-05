package com.dawn.facade.assembler.map;

import com.dawn.command.DawnCommand;
import com.dawn.core.entity.DawnEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

/**
 * Created by Dawn on 2020-04-05.
 */
@Mapper(componentModel = "spring")
public interface DawnMapper {

    @Mappings(
            @Mapping(ignore = true,target = "id")
    )
    public DawnEntity toDawnEntity(@MappingTarget DawnEntity dawnEntity, DawnCommand command);
}
