package com.nf.lc.service;

import com.nf.lc.dao.ComputerMapper;
import com.nf.lc.entity.Computer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration("/spring/spring-dao.xml")
public class ComputerServiceTest {

    @Autowired
    private ComputerMapper computerMapper;

    @Test
    public void deleteByPrimaryKey() {

    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
        Computer computer = computerMapper.selectByPrimaryKey(1);
        System.out.println(computer.getComputerImageList());

    }

    @Test
    public void selectAll() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}