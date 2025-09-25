package Chapter8.Exercises;

/**
 * @author Philelo Mphaga
 * Exercise 8.2 Department class file
 */

// package Chapter8.Exercises;

public class Department {
    private final String name;      // e.g., "IT"
    private final int id;           // 100..499 inclusive
    private final int maxEmployees; // 4..10 inclusive

    public Department(String name, int id, int maxEmployees) throws DepartmentException {
        // name must be exactly 2 letters
        if (name == null || !name.matches("[A-Za-z]{2}")) {
            throw new DepartmentException(name, id, maxEmployees,
                    "Invalid department name: must consist of exactly two letters.");
        }
        // id must be 3 digits between 100 and 499 inclusive
        if (id < 100 || id > 499) {
            throw new DepartmentException(name, id, maxEmployees,
                    "Invalid department ID: must be a three-digit number between 100 and 499 inclusive.");
        }
        // employees must be in [4, 10]
        if (maxEmployees < 4 || maxEmployees > 10) {
            throw new DepartmentException(name, id, maxEmployees,
                    "Invalid number of employees: must be between 4 and 10 inclusive.");
        }

        this.name = name;
        this.id = id;
        this.maxEmployees = maxEmployees;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public int getMaxEmployees() { return maxEmployees; }

    @Override
    public String toString() {
        return String.format("Department{name='%s', id=%d, maxEmployees=%d}", name, id, maxEmployees);
    }
}

