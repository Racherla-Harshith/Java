//  import java.util.*;

//  public class ifelse {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age > 18) {
//             System.out.println("Adult");
//         }   else{
//             System.out.println("Not Adult");
//         }
//     }
//  }


// import java.util.*;

// public class ifelse {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a == b) {
//             System.out.println("Equal");
//         }   
//         if(a > b) {
//             System.out.println("A is greater");
//         }
//         else{
//             System.out.println("B is greater");
//         }
//     }
// }


// import java.util.*;

// public class ifelse {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a == b) {
//             System.out.println("Equal");
//         }   else {
//             if(a > b) {
//                 System.out.println("A is greater");
//             }   else {
//                 System.out.println("A is lesser");
//             }
//         }
//     }
// }


// import java.util.*;

// public class ifelse {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a == b) {
//             System.out.println("Equal");
//         }else if(a > b) {
//             System.out.println("A is greater");            
//         }else{
//             System.out.println("A is lesser")
//         }
//     }
// }



import java.util.*;

public class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("vanakam");  
            break;          
            case 3 : System.out.println("namaste");
            break;
            default : System.out.println("Invalid button");
        }
    }
}

