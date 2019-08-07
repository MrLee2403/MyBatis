package com.company.dao;

import com.company.dao.pojo.Dept;
import com.company.dao.pojo.Student;
import com.company.dao.pojo.StudentM2M;

public interface ORMDao {
    Student findBySid (Integer sid);
    Dept findByDid(Integer did);
    StudentM2M findMany2Many(Integer sid);
}
