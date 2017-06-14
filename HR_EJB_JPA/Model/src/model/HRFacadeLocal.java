package model;

import java.util.List;

import javax.ejb.Local;

@Local
public interface HRFacadeLocal {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    <T> T persistEntity(T entity);

    <T> T mergeEntity(T entity);

    Employees persistEmployees(Employees employees);

    Employees mergeEmployees(Employees employees);

    void removeEmployees(Employees employees);

    List<Employees> getEmployeesFindAll();

    Departments persistDepartments(Departments departments);

    Departments mergeDepartments(Departments departments);

    void removeDepartments(Departments departments);

    List<Departments> getDepartmentsFindAll();

    List<Employees> getEmployeesFindByName(String p_name);

    List<Employees> getEmployeesFindBySal(Integer p_sal);
}
