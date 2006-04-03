/*
 * Copyright 2004-2006 the Seasar Foundation and the Others.
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
package examples.dao.tiger;

import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;
import org.seasar.dao.annotation.tiger.Sql;
/**
 * 
 * @author �㌴�@�c�O
 */
@S2Dao(bean=Employee.class)
public interface EmployeeDao {
	
	public List getAllEmployees();
	
	/**
	 * @param empno
	 * @return
	 */
	@Arguments("empno")
	public Employee getEmployee(int empno);
	
	/**
	 * @param empno
	 * @return
	 */
	@Sql("SELECT count(*) FROM emp")
	public int getCount();
		
	/**
	 * @param empno
	 * @return
	 */
	@Arguments({"job","deptno"})
	public List getEmployeeByJobDeptno(String job, Integer deptno);
	
	public int update(Employee employee);
}
