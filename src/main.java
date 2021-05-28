public class main {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.3";

        Book book1 = new Book("W pustyni i w Puszczy", "Henryk Sienkiewicz",
                2010, 269, "Greg","43434343443" );
        Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Jakub Bloch",
                2009, 352, "Helion","764578364" );
        Book book3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, 851, "McGaw-Hill Osbourne Media");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibiliotece");

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();


    }
}
