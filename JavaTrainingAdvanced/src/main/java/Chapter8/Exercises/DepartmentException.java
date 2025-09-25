package Chapter8.Exercises;

/**
 * @author Philelo Mphaga
 * exercise 8.2 DepartentException class file
 */

public class DepartmentException extends Exception {
    private final String department;
    private final int departmentId;
    private final int maxEmployees;

    public DepartmentException(String department, int departmentId, int maxEmployees, String message) {
        super(message);
        this.department = department;
        this.departmentId = departmentId;
        this.maxEmployees = maxEmployees;
    }

    public String getDepartment()   { return department; }
    public int getDepartmentId()    { return departmentId; }
    public int getMaxEmployees()    { return maxEmployees; }
}

