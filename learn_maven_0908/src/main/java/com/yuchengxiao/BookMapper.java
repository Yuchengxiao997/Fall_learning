package com.yuchengxiao;

public interface EmployeeMapper {
    /**
     * 根据员工id查询员工数据方法
     * @param empId  员工id
     * @return 员工实体对象
     */
    EmployeeMapper
    Employee selectEmployee(Integer empId);
}
