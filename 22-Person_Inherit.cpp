// 22. Create the Person class. Create some objects of this class (by taking information from the user). Inherit the class Person to create two classes Teacher and Student class. Maintain the respective information in the classes and create, display and delete objects of these two classes (Use Runtime Polymorphism).

#include <iostream>
using namespace std;
class Person
{
    int age;
    string name;

public:
    void input()
    {
        cout << "Enter name" << endl;
        cin >> name;
        cout << "Enter age" << endl;
        cin >> age;
    }
    void print()
    {
        cout << name << "'s age is " << age << endl;
    }
};

class Teacher : public Person
{
    int salary;

public:
    void input()
    {
        Person::input();
        cout << "Enter techers salary" << endl;
        cin >> salary;
    }
    void print()
    {
        Person::print();
        cout << "And his salary is " << salary << endl;
    }
};
class Student : public Person
{
    int marks;

public:
    void input()
    {
        Person::input();
        cout << "Enter students marks " << endl;
        cin >> marks;
    }
    void print()
    {
        Person::print();
        cout << "And his marks is " << marks << endl;
    }
};
int main()
{
    Teacher a;
    Student b;
    cout << "Enter the details of teacher" << endl;
    a.input();
    cout << "Enter the details of student" << endl;
    b.input();
    cout << "Teacher details are:" << endl;
    a.print();
    cout << "Student details are:" << endl;
    b.print();
    return 0;
}