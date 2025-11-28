package LatihanCleanCode.SwitchStatements;

abstract class EmployeeType {
    abstract int payAmount(Employee employee);
}

class Salesman extends EmployeeType {
    @Override
    int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getCommission();
    }
}

class Manager extends EmployeeType {
    @Override
    int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getBonus();
    }
}

class Engineer extends EmployeeType {
    @Override
    int payAmount(Employee employee) {
        return employee.getMonthlySalary();
    }
}

class Employee {
    private EmployeeType employeeType;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public Employee(EmployeeType employeeType, int monthlySalary, int commission, int bonus) {
        this.employeeType = employeeType;
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }

    public int payAmount() {
        return employeeType.payAmount(this);
    }
}

