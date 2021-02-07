package com.zhu.user.handler;

import com.zhu.user.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Result handlerMyException(MyException e){
        return Result.error(e.getCode(),e.getMessage());
    }

}