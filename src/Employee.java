import java.util.*;

public class Employee {
    boolean managerFlag;
    String name;
    Date dateHired;
    int id;
    boolean isPartTimeFlag;

    public Employee(boolean managerFlag, String name, Date dateHired, int id, boolean isPartTimeFlag){
        managerFlag = managerFlag;
        name = name;
        dateHired = dateHired;
        id = id;
        isPartTimeFlag = isPartTimeFlag;
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return String.valueOf(id);
    }

    public Date getDateHired(){
        return this.dateHired;
    }

    public boolean isManager(){
        return this.managerFlag;
    }

    public boolean isPartTime() { return this.isPartTimeFlag; }

}
