/*
 * Copyright 2004-2011 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.dao.annotation.tiger.impl;

import java.util.List;
import java.util.Map;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;
import org.seasar.dao.annotation.tiger.Sql;
import org.seasar.dao.annotation.tiger.SqlFile;
import org.seasar.dao.impl.EmployeeDto;

@S2Dao(bean = Employee.class)
public interface EmployeeDao {

    public List getAllEmployees();

    public Employee[] getAllEmployeeArray();

    @Sql("SELECT empno, ename, dname FROM emp, dept where emp.deptno = dept.deptno")
    public EmployeeDto[] findAll();

    public Map[] getAllEmployeeMap();

    /**
     * @param empno
     * @return
     */
    @Arguments("empno")
    public Employee getEmployee(int empno);

    @SqlFile
    public int getCount();

    @SqlFile("org/seasar/dao/impl/sqlfile/getCount.sql")
    public int getCount2();

    public void update(Employee employee);

    public Employee[] getEmployeesByDeptno(int deptno);
}
