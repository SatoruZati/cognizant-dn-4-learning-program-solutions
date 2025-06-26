// Exercise 3: Stored Procedures

import java.util.*;

class SavingsAccount {
    int id;
    double balance;

    SavingsAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}

class Employee {
    int id;
    String dept;
    double salary;

    Employee(int id, String dept, double salary) {
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }
}

class Account {
    int id;
    double balance;

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}

public class exercise3 {
    public static void processMonthlyInterest(List<SavingsAccount> accounts) {
        for (SavingsAccount acc : accounts) {
            acc.balance = acc.balance * 1.01;
        }
    }

    public static void updateEmployeeBonus(List<Employee> employees, String dept, double bonusPercent) {
        for (Employee emp : employees) {
            if (emp.dept.equals(dept)) {
                emp.salary = emp.salary + emp.salary * bonusPercent / 100;
            }
        }
    }

    public static boolean transferFunds(Account from, Account to, double amount) {
        if (from.balance >= amount) {
            from.balance = from.balance - amount;
            to.balance = to.balance + amount;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<SavingsAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(1, 156000));
        accounts.add(new SavingsAccount(2, 292000));
        processMonthlyInterest(accounts);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "IT", 55000));
        employees.add(new Employee(2, "HR", 48000));
        updateEmployeeBonus(employees, "IT", 10);

        Account a1 = new Account(1, 82400);
        Account a2 = new Account(2, 37500);
        transferFunds(a1, a2, 20500);

        // print results
        System.out.println("Savings Account 1: " + accounts.get(0).balance);
        System.out.println("Savings Account 2: " + accounts.get(1).balance);
        System.out.println("Employee 1: " + employees.get(0).salary);
        System.out.println("Employee 2: " + employees.get(1).salary);
        System.out.println("Account 1: " + a1.balance);

        // object closed
        accounts.clear();
        employees.clear();

    }
}
