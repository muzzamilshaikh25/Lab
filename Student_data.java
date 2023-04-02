package Create_obj;

public class Student_data {
	    int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Student_data(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display()
	    {
	    	
	    	System.out.println(id+" "+name);
	    	//System.out.println("Displaying the Data of student!!!");
	    
	    }  
	   
	    public static void main(String args[]){  
	    //created object and we are passing values  
	    Student_data s1 = new Student_data(21,"Md Muzzamil Shaikh");  
	    Student_data s2 = new Student_data(22,"Lokiii");  
	    Student_data s3 = new Student_data(23,"Rajesh");  
	    Student_data s4 = new Student_data(24,"Sam");
	    //called method to display the values of object  
	    s1.display();  
	    s2.display();
	    s3.display();
	    s4.display();
	   }  
	}  


