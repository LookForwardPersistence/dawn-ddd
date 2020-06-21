package com.dawn.controller;

import com.dawn.command.DawnCommand;
import com.dawn.facade.DawnFacade;
import com.dawn.infra.InvokeResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dawn on 2020-04-04.
 */
@RestController
@RequestMapping("dawn")
public class DawnController {

    final static Logger logger = LoggerFactory.getLogger(DawnController.class);
    @Autowired
    DawnFacade dawnFacade;
    @RequestMapping(value = "/saveDawn",method = RequestMethod.POST)
    public InvokeResult saveDawn(@RequestBody @Validated DawnCommand command){
        try{
          return dawnFacade.save(command);
        }catch (Exception ex){
         logger.error(ex.getMessage());
         return InvokeResult.failure(ex.getMessage());
        }

    }
}
