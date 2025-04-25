import java.util.*; 
import java.io.*; 

abstract class Publication { 
    int nofpages; 
    String publishername; 
    double price; 

    Publication() { 
        System.out.println("abstract class called "); 
    } 

    abstract void info(int x, String y, double z); 
    abstract void disp(); 
} 

class Book extends Publication { 
    void info(int x, String y, double z) { 
        this.nofpages = x; 
        this.publishername = y; 
        this.price = z; 
    } 

    void disp() {
	System.out.println("The Info of the Book is:"); 
        System.out.println("The no. of pages is " + this.nofpages); 
        System.out.println("The name of publisher is " + this.publishername); 
        System.out.println("The price is " + this.price); 
    } 
} 

class Journel extends Publication { 
    void info(int x, String y, double z) { 
        this.nofpages = x; 
        this.publishername = y; 
        this.price = z; 
    } 

    void disp() { 
	 System.out.println("The Info of the Journel is:");
        System.out.println("The no. of pages is " + this.nofpages); 
        System.out.println("The name of publisher is " + this.publishername); 
        System.out.println("The price is " + this.price); 
    } 
} 

class Library { 
    ArrayList<Publication> lib; 

    Library() { 
        lib = new ArrayList<>(); 
    }

    void add(Publication pb) { 
        lib.add(pb); 
    }

    void show() { 
        for (Publication pb : lib) { 
            pb.disp(); 
        } 
    }

    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        Library lib = new Library();

        for (int i = 0; i < 5; i++) {
	    System.out.println("no of pages :");
            int x = ob.nextInt();
            ob.nextLine(); 
	    System.out.println("publisher name :");
            String y = ob.nextLine(); 
	    System.out.println("price :");
            double z = ob.nextDouble();

            if (i < 3) {
                Publication pb = new Book(); 
                pb.info(x, y, z);
                lib.add(pb);
            } else {
                Publication pb = new Journel(); 
                pb.info(x, y, z);
                lib.add(pb);
            }
        }

        lib.show();
    } 
}

