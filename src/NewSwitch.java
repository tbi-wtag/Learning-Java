public class NewSwitch {
      public static void main(String[] args) throws Exception {
        String day = "Monday";
        String result = ""; 
        result = switch(day){
            case "Saturday","Sunday" -> "6am";

            case "Monday" ->  "7am";

            default -> "8am";
        };
        System.out.println(result);
        
        
    }
}



 