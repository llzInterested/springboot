package com.llz.springboot.mapper;

import com.llz.springboot.entity.Dept;

public interface DeptMapper {
    public Dept getDeptById(Integer id);

    public void insertDept(Dept dept);
}
