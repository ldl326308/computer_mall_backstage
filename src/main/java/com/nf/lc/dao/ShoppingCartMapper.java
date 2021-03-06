package com.nf.lc.dao;

import com.nf.lc.entity.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public interface ShoppingCartMapper {
    int deleteByPrimaryKey(Integer shoppingId);

    int insert(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer shoppingId);

    List<ShoppingCart> selectAll(int userId);

    int updateByPrimaryKey(ShoppingCart record);

    int updateByPrimaryKeyIsState(int shoppingId);

    ShoppingCart selectShoppingCartIsComputerIdAndUserId(ShoppingCart shoppingCart);

    List<ShoppingCart> selectShoppingCartIsTotalPrice(int[] shoppingIds);

}