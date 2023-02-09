package kajol.com;

public class Student {
	 private int id;
	    private String name;

	    public Student(){
	        id = 0;
	        name = "Your-Name-Here";
	    }
	    public  Student(String myName, int myId){
	        id = myId;
	        name = myName;
	    }
	    public  Student(String myName){
	        id = 1;
	        name = myName;
	    }
	    public String getName(){
	        return name;
	    }
	    public void setName(String n){
	        this.name = n;
	    }
	    public void setId(int i){
	        this.id = i;
	    }
	    public int getId(){
	        return id;
	    }
	

	public class cwh_42_constructors { 
	    public static void main(String[] args) {
	        //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
	    	 Student harry = new Student();
	        //harry.setName("CodeWithHarry");
	        //harry.setId(34);
	        System.out.println(harry.getId());
	        System.out.println(harry.getName());
	    }
	}}


