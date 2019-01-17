package com.nf.lc.service;

import com.nf.lc.entity.ComputerSystem;

import java.util.List;

public interface ComputerSystemService {
    int deleteByPrimaryKey(Integer computerSystemId);

    int insert(ComputerSystem record);

    ComputerSystem selectByPrimaryKey(Integer computerSystemId);

    List<ComputerSystem> selectAll();

    int updateByPrimaryKey(ComputerSystem record);
}
