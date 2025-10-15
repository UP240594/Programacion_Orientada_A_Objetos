class E11login{
   public static int checkLogin(String reqEmail){
      String[] emails = new String[5];
      emails[0] = "caca@gmail.com";
      emails[1] = "caca@gmail.com";
      emails[2] = "caca@gmail.com";
      emails[3] = "caca@gmail.com";
      emails[4] = "caca@gmail.com";
      for(String email : emails){
      if (reqEmail.equals(emails)){
         return 1;
      }else{
      return -1;
      }
      }
   }

   public static void main(String[] args){

   }
}

