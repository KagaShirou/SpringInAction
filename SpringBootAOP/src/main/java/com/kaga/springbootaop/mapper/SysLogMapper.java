package com.kaga.springbootaop.mapper;

import com.kaga.springbootaop.entity.SysLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.Date;

//import java.sql.Date;

@Component
@Mapper
public interface SysLogMapper {

    @Update("update sys_log set id=#{id},username=#{username},operation=#{operation},time=#{time},method=#{method},params=#{params},ip=#{ip},create_time=#{createTime}")
    int saveSysLog(SysLog sysLog);

    @Select("select * from sys_log where id=#{id}")
    @Results(id = "syslog",value= {
            @Result(property = "id", column = "id", javaType = Integer.class),
            @Result(property = "username", column = "username", javaType = String.class),
            @Result(property = "operation", column = "operation", javaType = String.class),
            @Result(property = "time", column = "time", javaType = Integer.class),
            @Result(property = "method", column = "method", javaType = String.class),
            @Result(property = "params", column = "params", javaType = String.class),
            @Result(property = "ip", column = "ip", javaType = String.class),
            @Result(property = "create_time", column = "createTime", javaType = Date.class)
    })
    SysLog querySysLogById(int id);
}
