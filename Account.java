public class Account{
    private String name;
    public Account(String name){ //constructor to initialize the name
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}