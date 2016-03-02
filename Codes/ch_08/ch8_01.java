class main_01{
    public static void main(String args[]){
        String s1 = new String("Vinay");
        String s2 = "Vinay";
        
        System.out.println(s1 == s2);   // compares the refernces not values
        System.out.println(s1.equals(s2));  // compares values in two strings
    }
}
