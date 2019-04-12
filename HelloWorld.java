class HelloWorld 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(Stri args[]) 
    { 
        int number = args[0];
        if(args[0]==0){
        	System.out.println("zero");
        } 
        else if (args[0]>0) {

        	System.out.println("positive");
        }
        else{
        	System.out.println("negative");
        }
    } 
} 