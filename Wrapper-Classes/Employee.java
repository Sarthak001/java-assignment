// class employee implements Cloneable {
//     private String name ;
//     private String email;
//     private String gender;

//     employee(String name , String email , String gender){

//         this.name = name;
//         this.email = email;
//         this.gender = gender;
//     }

//     public void printdetails(){
//         System.out.println("Employee Name: " + name + " \n " + "Email: " + email + "\n" + "Gender: " + gender + "\n");
//     }

//     public void setName(String name) {
// 		this.name = name;
// 	}
    
// }





// public class Assignment_4 {

//     public static void main(String[] args) {

//         employee obj = new employee("vaibhav", "newbie.gmail.com", "M");
//         employee obj_clone = obj.clone();     
//      }
    
// }


public class Employee implements Cloneable {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
	public static void main(String[] args) {

		Employee emp = new Employee("ABC");
		Employee empClone = emp.clone();
		
		empClone.setName("XYZ");
		
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}