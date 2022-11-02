package Assigiment2.baithijp2;

import Assigiment2.Assigiment2.Assigiment2.com.t2108M.companyname.project.enties.Product;
import Assigiment2.Assigiment2.Assigiment2.com.t2108M.companyname.project.model.CrudProduct;

import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner input =  new Scanner(System.in);
        CrudProduct crudProduct = new CrudProduct();
        while (true){
            menu();
            int choice = input.nextInt();
            switch (choice){
                case 1->{
                    System.out.println("Add book ");
                    System.out.println("Enter BookId : ");
                    int BookId = input.nextInt();
                    System.out.println("Enter BookName: ");
                    String BookName = input.next();
                    System.out.println("Enter Author : ");
                    String Author = input.next();
                    System.out.println("Enter Price : ");
                    int Price = input.nextInt();
                    Product product = new Product(BookId,BookName,Author,Price);
                    crudProduct.insert(product);

                }
                case 2 -> {
                    System.out.println("Save book ");
                    System.out.println("enter BookId : ");
                    int BookId = input.nextInt();
                    System.out.println("Enter BookName: ");
                    String BookName = input.next();
                    System.out.println("Enter Author : ");
                    String Author = input.next();
                    System.out.println("Enter Price : ");
                    int Price = input.nextInt();
                    Product product2 = new Product(BookId,BookName,Author,Price);
                    crudProduct.insert(product2);
                }
                case 3 ->{
                    System.out.println("Display book");
                    crudProduct.getAll();
                }
                case 4 ->{
                    return;
                }

            }
        }

    }
    private static void menu() {
        System.out.println("==========Menu=======");
        System.out.println("1.Add book records");
        System.out.println("2. Save");
        System.out.println("3. Display book records");
        System.out.println("4. Exit");
        System.out.println("#:");
    }
}