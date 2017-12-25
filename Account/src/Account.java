public class Account {
    private String name; // instance variable

    // constructor initialize name with parameter name
    public Account(String name) // constructor name is class name
    {
        this.name = name;
    }

    // method to set the name
    public void setName(String name){
        this.name = name;
    }

    // method to retrive the name

    public String getName() {
        return name;
    }
} // end class Account
