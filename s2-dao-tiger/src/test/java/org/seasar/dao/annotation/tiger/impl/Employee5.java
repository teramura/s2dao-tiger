/*
 * Copyright 2004-2009 the Seasar Foundation and the Others.
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

import java.io.Serializable;
import java.sql.Timestamp;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Column;
import org.seasar.dao.annotation.tiger.Relation;

@Bean(table = "EMP")
public class Employee5 implements Serializable {

    private static final long serialVersionUID = -5861661752749334295L;

    private long empno;

    private String ename;

    private String job;

    private Short mgr;

    private java.util.Date hiredate;

    private Float sal;

    private Float comm;

    private int deptno;

    private byte[] password;

    private String dummy;

    private Department department;

    private Timestamp timestamp;

    public Employee5() {
    }

    public Employee5(long empno) {
        this.empno = empno;
    }

    public long getEmpno() {
        return this.empno;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    public java.lang.String getEname() {
        return this.ename;
    }

    public void setEname(java.lang.String ename) {
        this.ename = ename;
    }

    public java.lang.String getJob() {
        return this.job;
    }

    public void setJob(java.lang.String job) {
        this.job = job;
    }

    public Short getMgr() {
        return this.mgr;
    }

    public void setMgr(Short mgr) {
        this.mgr = mgr;
    }

    public java.util.Date getHiredate() {
        return this.hiredate;
    }

    public void setHiredate(java.util.Date hiredate) {
        this.hiredate = hiredate;
    }

    public Float getSal() {
        return this.sal;
    }

    public void setSal(Float sal) {
        this.sal = sal;
    }

    public Float getComm() {
        return this.comm;
    }

    public void setComm(Float comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return this.deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public byte[] getPassword() {
        return this.password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public String getDummy() {
        return this.dummy;
    }

    public void setDummy(String dummy) {
        this.dummy = dummy;
    }

    public Department getDepartment() {
        return this.department;
    }

    @Relation(relationNo = 0, relationKey = "deptno:deptno, ename:dname")
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Column("tstamp")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Employee5))
            return false;
        Employee5 castOther = (Employee5) other;
        return this.getEmpno() == castOther.getEmpno();
    }

    public int hashCode() {
        return (int) this.getEmpno();
    }

    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append(empno).append(", ");
        buf.append(ename).append(", ");
        buf.append(job).append(", ");
        buf.append(mgr).append(", ");
        buf.append(hiredate).append(", ");
        buf.append(sal).append(", ");
        buf.append(comm).append(", ");
        buf.append(deptno).append(", ");
        buf.append(timestamp).append(" {");
        buf.append(department).append("}");
        return buf.toString();
    }
}
