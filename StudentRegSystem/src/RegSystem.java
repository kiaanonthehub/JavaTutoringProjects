
/**
 *
 * @author kiaanmaharaj
 */
public class RegSystem {

    /*
    Scenario :
    You've just passed matric.
    You decided that you want to study at VC.
    Kiaan I asked you to build a registration system to help the staff,
    reg. students for the 2025 academic year.
    Criteria:
    1. Student details
    --> Name 
    --> Id_Number
    --> Surname
    --> Physical_Address 
    --> Payment_Method -> Cash/Cards
    --> Course
    --> Aggregate 
    --> isAccepted?
    2. RegisterAStudent
    3. CheckIfTheStudentIsAccepted
     */
    // declare your fields / variables
    public RegSystem(String Name, String Id_Number, String Surname, String Physical_Address, String Payment_Method, int Aggregate, String Course) {
        this.Name = Name;
        checkIdNumber(Id_Number);
        this.Surname = Surname;
        this.Physical_Address = Physical_Address;
        this.Payment_Method = Payment_Method;
        
        if(RegisterTheStudent(Aggregate) == true){System.out.println("You have registered with VC");}
    }

    public RegSystem(String Name, String Id_Number, String Surname, String Course) {
        this.Name = Name;
        this.Id_Number = Id_Number;
        this.Surname = Surname;
        this.Course = Course;
    }
    
    private String Name; 

    public RegSystem(String Id_Number) {
        checkIfStudetntExists(Id_Number);
    }
    
    public void checkIfStudetntExists(String id ){
        if (id == "0000"){
            System.out.println("You are already registered with VC");
         }else{
            System.out.println("You need to come back and reg. with the req. documents");
        }
    }
            
            
    private String Id_Number;
    private String Surname;
    private String Physical_Address; 
    private String Payment_Method; 
    private String Course;
    private int Aggregate;
    private boolean isAccepted;

    // getters and setters ( which is more or less a variable that we assign a value to,
    // and we can get the value from the variable 
    
    public void checkIdNumber(String id){
    if (id == "0101011234556678"){
        System.out.println("You entered the wrong id number");
    }else{
        setId_Number(id);
     }
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getId_Number() {
        return Id_Number;
    }

    public void setId_Number(String Id_Number) {
        this.Id_Number = Id_Number;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getPhysical_Address() {
        return Physical_Address;
    }

    public void setPhysical_Address(String Physical_Address) {
        this.Physical_Address = Physical_Address;
    }

    public String getPayment_Method() {
        return Payment_Method;
    }

    public void setPayment_Method(String Payment_Method) {
        this.Payment_Method = Payment_Method;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public int getAggregate() {
        return Aggregate;
    }

    public void setAggregate(int Aggregate) {
        this.Aggregate = Aggregate;
    }

    public boolean isIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
    
    public boolean RegisterTheStudent(int aggregate){
     if (aggregate >= 50){
         setIsAccepted(true);
     }
         
         return true;
     }
       
}
