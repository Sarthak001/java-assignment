class Author{
    private String a_name;
    private String email;
    private char gender;

    Author(String a_name,String email,char gender){
        this.a_name = a_name;
        this.email = email;
        this.gender = gender;
    }
    String getdetails(){
        String str = "";
        str += ("Author Name: " + a_name + " Email Address: " + email + " Gender: " + gender);
        return str;
    }
}

class Book{
    private String b_name;
    private Author author;
    private Double price;
    private int qtyInStock;

    Book(String b_name, Author author, double price, int qtyInStock){
		this.b_name = b_name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

    public String alldetails(){
        String res = "";
        res += "Book Name: " + b_name + " Price: " + price  + " QuantityInStock: " + qtyInStock + "\n" ;
        res += author.getdetails() + "\n";
        return res;
    }
}


public class Assignment{
    public static void main(String[] args) {
        Author auth = new Author("vaibhav","vaibhav@123.com", 'M');
        Book book = new Book("biography", auth, 150.0, 69);
        System.out.println(book.alldetails());

    }
}