import java.util.Scanner;

public class find_miss_arr {
    public static void main(String[] args) {
       int x;
       do {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter 1 to start search data : ");
           x = sc.nextInt();
           switch (x)
           {
               case 1:
                   String [] Emp_Name = {"Sujal","Manish","Akshit","Aditya","Aryann","Adarsh","Ayush"};

                   Scanner s = new Scanner(System.in);
                   System.out.println("Enter your name : ");
                   String Name = s.nextLine();

                   boolean Array = false;

                   for(String Element : Emp_Name)
                   {
                       if(Name.equals(Element))  // This conditN check the names which i'll enter is in array or not..
                       {
                           Array = true;   // If a name is in array then it is true.
                           break;
                       }
                   }
                   if(Array) // This conditN says if it is true then It print below statement otherwise it'll not..
                   {
                       System.out.println("This name is available in array..");
                   }
                   else{
                       System.out.println("This name is not available in array");
                   }
                   break;
           }
           System.out.println("_________________________________________________________");
       }while (x != 2);  // I use Do while bcos if i want to search again.
    }
}
