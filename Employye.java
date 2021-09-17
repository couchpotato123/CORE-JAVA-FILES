public class Employye {
    int id;
    String name;
    int Salary;
    
    void setid(int i)
    {
        id = i;
    }
    void setname(String n){
        name= n;

    }
    void setSalary(int s){
        Salary = s;

    }
    void getEmployye(){
        System.out.println(name+"'s salary is :" +Salary);

    }

     public static void main(String[] args) {
        Employye obj = new Employye();
        obj.setid(2000080007);
        obj.setSalary(123456);
        obj.setname("Surya Teja");
        obj.getEmployye();

    }
}
