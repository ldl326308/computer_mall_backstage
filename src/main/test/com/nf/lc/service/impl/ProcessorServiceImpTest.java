package com.nf.lc.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("/spring/spring-dao.xml")
public class ProcessorServiceImpTest {

    @Autowired
    private ProcessorServiceImp processorServiceImp;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectAll() {
        assert processorServiceImp.selectAll() != null;
    }

    @Test
    public void updateByPrimaryKey() {
    }
}