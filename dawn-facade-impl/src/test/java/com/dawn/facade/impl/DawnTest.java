package com.dawn.facade.impl;

import com.dawn.command.DawnCommand;
import com.dawn.facade.DawnFacade;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Dawn on 2020-04-05.
 */
public class DawnTest extends BaseTest {

    @Autowired
     DawnFacade dawnFacade;
    @Test
    public void save(){
        DawnCommand command = new DawnCommand();
        command.setAddr("PingNan");
        command.setJob("Engineer");
        command.setName("Dawn");
        dawnFacade.save(command);
    }
}
