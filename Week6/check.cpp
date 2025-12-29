#include <iostream>
#include <fstream>
#include <string>
#include <iomanip>
using namespace std;

/* ================= BASE CLASS ================= */
class Details
{
protected:
    int empId;
    string name;
    string designation;
    double salary;

public:
    Details() : empId(0), salary(0) {}

    Details(int id, string n, string d, double s)
    {
        empId = id;
        name = n;
        designation = d;
        salary = s;
    }

    int getId() { return empId; }
    string getName() { return name; }

    // Table display (USED IN VIEW ALL)
    virtual void display()
    {
        cout << left << setw(10) << empId
             << setw(20) << name
             << setw(15) << designation
             << setw(12) << fixed << setprecision(2) << salary
             << endl;
    }

    // Detailed display (USED IN SEARCH)
    void displayDetailed()
    {
        cout << "\n=== Employee Details ===\n";
        cout << "ID          : " << empId << endl;
        cout << "Name        : " << name << endl;
        cout << "Designation : " << designation << endl;
        cout << "Salary      : Rs. " << fixed << setprecision(2) << salary << endl;
    }
};

/* ================= DERIVED CLASS ================= */
class Employee : public Details
{
public:
    Employee() : Details() {}

    Employee(int id, string n, string d, double s)
        : Details(id, n, d, s) {}
};

/* ================= LOGIN CLASS ================= */
class Login
{
private:
    string username = "admin";
    string password = "1234";

public:
    bool authenticate()
    {
        string u, p;
        cout << "=== EMPLOYEE MANAGEMENT SYSTEM ===\n";
        cout << "Enter Username: ";
        cin >> u;
        cout << "Enter Password: ";
        cin >> p;

        if (u == username && p == password)
        {
            cout << "\nLogin Successful!\n";
            return true;
        }
        cout << "\nInvalid Credentials!\n";
        return false;
    }
};

/* ================= MANAGEMENT CLASS ================= */
class EmployeeManagement
{
private:
    Employee employees[100];
    int total;

public:
    EmployeeManagement()
    {
        total = 0;
        loadData();
    }

    /* ---------- ADD EMPLOYEE ---------- */
    void addEmployee()
    {
        if (total >= 100)
        {
            cout << "Employee limit reached!\n";
            return;
        }

        int id;
        string name, des;
        double sal;

        cout << "\n--- Add Employee ---\n";
        cout << "Enter ID: ";
        cin >> id;

        for (int i = 0; i < total; i++)
        {
            if (employees[i].getId() == id)
            {
                cout << "Employee ID already exists!\n";
                return;
            }
        }

        cin.ignore();
        cout << "Enter Name: ";
        getline(cin, name);
        cout << "Enter Designation: ";
        getline(cin, des);
        cout << "Enter Salary: ";
        cin >> sal;

        employees[total++] = Employee(id, name, des, sal);
        saveData();

        cout << "Employee added successfully!\n";
    }

    /* ---------- VIEW ALL ---------- */
    void viewAllEmployees()
    {
        if (total == 0)
        {
            cout << "\nNo employees found!\n";
            return;
        }

        cout << "\n--- All Employees ---\n";
        cout << left << setw(10) << "ID"
             << setw(20) << "Name"
             << setw(15) << "Designation"
             << setw(12) << "Salary" << endl;
        cout << string(57, '-') << endl;

        for (int i = 0; i < total; i++)
        {
            employees[i].display();
        }
    }

    /* ---------- SEARCH ---------- */
    void searchEmployee()
    {
        int id;
        cout << "\nEnter Employee ID: ";
        cin >> id;

        for (int i = 0; i < total; i++)
        {
            if (employees[i].getId() == id)
            {
                employees[i].displayDetailed();
                return;
            }
        }
        cout << "Employee not found!\n";
    }

    /* ---------- DELETE ---------- */
    void deleteEmployee()
    {
        int id;
        cout << "\nEnter Employee ID to delete: ";
        cin >> id;

        for (int i = 0; i < total; i++)
        {
            if (employees[i].getId() == id)
            {
                for (int j = i; j < total - 1; j++)
                {
                    employees[j] = employees[j + 1];
                }
                total--;
                saveData();
                cout << "Employee deleted successfully!\n";
                return;
            }
        }
        cout << "Employee not found!\n";
    }

    /* ---------- FILE SAVE (TEXT SAFE) ---------- */
    void saveData()
    {
        ofstream file("employees.txt");
        for (int i = 0; i < total; i++)
        {
            file << employees[i].getId() << endl
                 << employees[i].getName() << endl
                 << employees[i].designation << endl
                 << employees[i].salary << endl;
        }
        file.close();
    }

    /* ---------- FILE LOAD ---------- */
    void loadData()
    {
        ifstream file("employees.txt");
        if (!file)
            return;

        while (file >> employees[total].empId)
        {
            file.ignore();
            getline(file, employees[total].name);
            getline(file, employees[total].designation);
            file >> employees[total].salary;
            total++;
        }
        file.close();
    }
};

/* ================= MAIN ================= */
int main()
{
    Login login;
    if (!login.authenticate())
        return 0;

    EmployeeManagement ems;
    int choice;

    do
    {
        cout << "\n=== MAIN MENU ===\n";
        cout << "1. Add Employee\n";
        cout << "2. View All Employees\n";
        cout << "3. Search Employee\n";
        cout << "4. Delete Employee\n";
        cout << "5. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
            ems.addEmployee();
            break;
        case 2:
            ems.viewAllEmployees();
            break;
        case 3:
            ems.searchEmployee();
            break;
        case 4:
            ems.deleteEmployee();
            break;
        case 5:
            cout << "Thank you for using EMS!\n";
            break;
        default:
            cout << "Invalid choice!\n";
        }
    } while (choice != 5);

    return 0;
}
