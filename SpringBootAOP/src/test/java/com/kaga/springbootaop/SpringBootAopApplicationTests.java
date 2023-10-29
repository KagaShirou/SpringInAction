package com.kaga.springbootaop;

import com.kaga.springbootaop.entity.SysLog;
import com.kaga.springbootaop.mapper.SysLogMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootAopApplicationTests {

    @Autowired
    SysLogMapper sysLogMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void mapperTest() {
        System.out.println(sysLogMapper.querySysLogById(1));
    }

}
