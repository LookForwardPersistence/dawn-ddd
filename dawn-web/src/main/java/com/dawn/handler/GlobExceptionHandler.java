package com.dawn.handler;

import com.dawn.infra.InvokeResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Optional;

/**
 * Created by Dawn on 2020-06-21.
 */
@RestControllerAdvice
public class GlobExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
   public InvokeResult handlerException(Exception ex){
     InvokeResult invokeResult = new InvokeResult();
     if(ex instanceof MethodArgumentNotValidException){
         StringBuilder stringBuilder = new StringBuilder();
         ((MethodArgumentNotValidException) ex).getBindingResult()
                 .getFieldErrors()
                 .forEach(err-> {
                     stringBuilder.append(err.getField())
                             .append(":")
                             .append(err.getDefaultMessage())
                             .append(",");
                 });
         stringBuilder.deleteCharAt(stringBuilder.length()-1);
         invokeResult.setErrorMessage(stringBuilder.toString());
     }else if(ex instanceof IllegalArgumentException){

     }
     String errorMessage = Optional.ofNullable(invokeResult.getErrorMessage())
             .filter(StringUtils::isNoneBlank)
             .orElse(ex.getMessage());
     invokeResult.setErrorMessage(errorMessage);
     invokeResult.setSuccess(false);
     return invokeResult;
   }
}
