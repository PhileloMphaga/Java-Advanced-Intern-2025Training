package Chapter8.Exercises;

/**
 * @author Philelo Mphaga
 * Exercise 8.2 ThrowDepartmentException class file
 */

// package Chapter8.Exercises;

public class ThrowDepartmentException {

    public static void main(String[] args) {
        // Test data: mix of valid and invalid values
        Object[][] data = new Object[][]{
                {"IT", 101, 5},     // valid
                {"HR", 250, 10},    // valid
                {"AI", 500, 6},     // invalid id (>=500)
                {"ENG", 120, 7},    // invalid name (3 letters)
                {"DS", 99, 6},      // invalid id (<100)
                {"QA", 180, 3},     // invalid employees (<4)
                {"UX", 300, 11}     // invalid employees (>10)
        };

        Department[] departments = new Department[data.length];

        for (int i = 0; i < data.length; i++) {
            String name = (String) data[i][0];
            int id = (Integer) data[i][1];
            int maxEmp = (Integer) data[i][2];

            try {
                departments[i] = new Department(name, id, maxEmp);
                System.out.println("Created SUCCESSFULLY: " + departments[i]);
            } catch (DepartmentException ex) {
                System.err.println("FAILED to create Department("
                        + name + ", " + id + ", " + maxEmp + "): " + ex.getMessage());
            }
        }
    }
}

