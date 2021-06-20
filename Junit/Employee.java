import java.util.Arrays;

public class Employee {

    public String findName(ArraysList employee,String name){
        String res = "";
        if(employee.contains(name)){
            res += "found";
        }else{
            res += "not found";
        }
        return res;
    }
    
    public static void main(String[] args) {
        
        Employee obj = new Employee();
        System.out.println(obj.findName(employee, name));
    }
}
