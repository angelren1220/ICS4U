class Message{
  void message(String msg){
    System.out.println(msg);
  }

  void message(String msg, String user){
    System.out.println(msg + ", " + user);
  }
}

public class Messenger{
  public static void main(String[] args){
    Message message = new Message();
    message.message("Hello");
    message.message("Hello", "Shiro");
  }
}
