package TestExample_Exception;

public class MessageUtil {
    
   private String message;

   //Constructor
   //@param message to be printed
   public MessageUtil(String message){
      this.message = message; 
   }

   // prints the message
   public void printMessage(){
      System.out.println(message);
      int a = 0;
      int b = 1/a; // ngoại lệ cho chỗ này, không thể chia cho 0
   }   

   // add "Hi!" to the message
   public String salutationMessage(){
      message = "Hi!" + message;
      System.out.println(message);
      return message;
   }   
}
