import java.util.Scanner;
 class test
    {
        public static void main(String args[]){

        
        Scanner MyObj= new Scanner(System.in);
        System.out.println("Enter name,age and Salary");
        String name=MyObj.nextLine();
        int age = MyObj.nextInt();
        double Salary = MyObj.nextDouble();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+Salary);
}
    }

