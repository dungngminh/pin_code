package c2;

class main_class 
    {
        public static void main(String args[])
        {
            int x = 9;
            if (x == 9) 
            { 
                int x = 8;
                System.out.println(x);
            }
        } 
    }
//     $ javac main_class.java
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
// Duplicate local variable x