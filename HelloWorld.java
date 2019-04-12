class HelloWorld 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) 
    { 
        int number = args[0];
        if(number==0){
        	System.out.println("Zero");
        } 
        else if (number>0) {

        	System.out.println("Positive");
        }
        else{
        	System.out.println("Negative");
        }
    } 
} 