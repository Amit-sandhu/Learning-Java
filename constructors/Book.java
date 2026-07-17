package constructors;

public class Book {
   int bookId;
   String name;

   Book(int var1, String var2) {
      this.bookId = var1;
      this.name = var2;
   }

   public static void main(String[] var0) {
      Book var1 = new Book(123, "Book1");
      Book var2 = new Book(145, "Book2");
      System.out.println(var1.name);
      System.out.println(var1.bookId);
      System.out.println(var2.name);
      System.out.println(var2.bookId);
   }
}
