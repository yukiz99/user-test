package com.zhu.user.handler;

import com.zhu.user.entity.ErrorEnum;
import lombok.Data;

@Data
public class MyException extends RuntimeException {

        private int code;
        private String message;

        public MyException(ErrorEnum errorEnum){
            super(errorEnum.getMessage());
            this.code=errorEnum.getCode();
        }

        public MyException(int code,String message){
            this.code=code;
            this.message=message;
        }
}
