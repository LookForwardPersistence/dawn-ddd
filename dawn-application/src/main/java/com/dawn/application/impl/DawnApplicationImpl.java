package com.dawn.application.impl;

import com.dawn.application.DawnApplication;
import com.dawn.core.entity.DawnEntity;
import org.springframework.stereotype.Component;

/**
 * Created by Dawn on 2020-04-05.
 */
@Component
public class DawnApplicationImpl implements DawnApplication {
    @Override
    public void save(DawnEntity dawnEntity) {
        dawnEntity.save();
    }
}
