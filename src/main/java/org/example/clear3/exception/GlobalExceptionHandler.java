package org.example.clear3.exception;

import org.example.clear3.util.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

/**
 * @Program: jatpeo-vhrback
 * @Description: 全局异常处理   比如删除 外键无法删除
 * @Author: Jatpeo
 * @Create: 2021-05-20 22:29
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({SQLException.class})
    public RespBean sqlException(SQLException e){
//       if (e instanceof MySQLIntegrityConstraintViolationException){
//           return RespBean.error("该数据有关联数据，操作失败！");
//       }
       return RespBean.error("数据库异常，操作失败！");
    }
}