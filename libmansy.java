//in the bengingging
import java.util.Scanner;
import java.util.ArrayList;

interface libraryItem {
    Scanner sc = new Scanner(System.in);
    void borrowitem();
    void returnitem();
    boolean isBorrowed();
}

class book implements libraryItem{
    String title;
    String author;
    String pubYear;
    boolean status = false;
    book(){
        System.out.println("Enter the Name of the book");
        title = sc.nextLine();
        System.out.println("Enter the Author of the book");
        author = sc.nextLine();
        System.out.println("Enter the Publishing year of the book");
        pubYear = sc.nextLine();
    }
    book(String name, String maker, String year){
        title = name;
        author = maker;
        pubYear = year;
    }

    public void borrowitem(){
        status = true;
        System.out.println("Item Borrowed");
    }
    public void returnitem(){
        status = false;
        System.out.println("Item returned");
    }
    public boolean isBorrowed(){
        return status;
    }

}

class dvd implements libraryItem{
    String title;
    String director;
    String runtime;
    boolean status = false;
    dvd(){
        System.out.println("Enter the Name of the Movie");
        title = sc.nextLine();
        System.out.println("Enter the Author of the Movie");
        director = sc.nextLine();
        System.out.println("Enter the Publishing year of the Movie");
        runtime = sc.nextLine();
    }
    dvd(String name, String maker, String year){
        title = name;
        director = maker;
        runtime = year;
    }


    public void borrowitem(){
        status = true;
        System.out.println("Item Borrowed");
    }
    public void returnitem(){
        status = false;
        System.out.println("Item returned");
    }
    public boolean isBorrowed(){
        return status;
    }
    
}

public class libmansy {
    public Scanner sc = new Scanner(System.in);

    static ArrayList<book> shelf = new ArrayList<book>();
    static ArrayList<dvd> stack = new ArrayList<dvd>();

    void menu(){

    }
    
    void additem(){
        String num = sc.nextLine();
        switch (num) {
            case "1":

                break;
        
            default:
                menu();
                break;
        }
    }
    public static void main(String[] args) {
        
    }
}
