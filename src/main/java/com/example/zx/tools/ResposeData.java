package com.example.zx.tools;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResposeData implements Serializable {

    private Integer code;
    private String message;
    private Boolean success;
    private Object data;

    public ResposeData(Boolean status,String message,Object data){
        super();
        this.success = status;

        this.message = message;
        this.data=data;
    }

}
