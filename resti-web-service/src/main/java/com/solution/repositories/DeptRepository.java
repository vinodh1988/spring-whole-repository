package com.solution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solution.model.Dept;

public interface DeptRepository extends JpaRepository<Dept,Long> {
    public Dept findByDeptno(Integer deptno);
}
