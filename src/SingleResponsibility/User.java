package SingleResponsibility;

public class User {
    int userId;
    String name;
    String address;
    int contactNumber;
    User(){
        userId=1234;
        name="Shashikant Tyagi";
        address="Muzaffarnagar";
        contactNumber= 123456789;
    }

//    void showDetails(){
//        System.out.println("The userID  is "+userId);
//        System.out.println("The Name of the "+userId+ "is "+name);
//        System.out.println("The " +name+ "'s address is "+address);
//        System.out.println("The " +name+ "'s contact number is "+contactNumber);
//
//    }

//    void enterDetails(){
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the ID of the new user");
//        userId = sc.nextInt();
//        System.out.print("Enter the name of the new user");
//        name = sc.next();
//        System.out.print("Enter the address of the new user");
//        address= sc.next();
//        System.out.print("Enter the contact number of the new user");
//        contactNumber= sc.nextInt();
    //}

}
