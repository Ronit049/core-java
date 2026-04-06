public class reverse_string {
    public static void main (String [] args) {
        String name = "Ronit";
        char arr[] = name.toCharArray();

        int length = name.length();
        String emp = " ";

        for(int i = 0; i< length; i++){
            emp = arr[i] + emp;
        }
        System.out.println(emp);
        //palandrom check
        if(name.equals(emp)){
            System.out.println("its palandrom");
        } else{
            System.out.println("No its not");
        }
    
    } 
    
}
