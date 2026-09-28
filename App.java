import java.util.Arrays;
import java.util.List;



public class App {
    public static void main(String[] args) throws Exception {
        
        // Create inputs for Account obj
        List<String> secQuestions = Arrays.asList("What is your favorite computer?", "What is this?");
        
        // Account obj
        Account test = new Account(101, 1000, "Jeff", "jeff@gmail.com", secQuestions);
        
        // User
        DateOfBirth dob = new DateOfBirth(15, 12, 2000);
        User user = new User(test, dob);
        
        Account userAcc = user.getAccount();
        
        int balance = userAcc.getBalance();
        
        //PreparedStatement ps = conn.prepareStatement("INSERT INTO Usersss (id) VALUES (?)");
        //ps.setInt(1, balance);
           
        
    }
}
