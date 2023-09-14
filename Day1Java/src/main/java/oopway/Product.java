package oopway;

public class Product {
    public String productname;
    String description;
    double price;
    boolean instock;
    public final float PRODUCT_TAX = 0.2f;
    char productCode = 'a';
    String productDescription[];
  public void printProductInfo (){
      System.out.println(this.productname +'\n'+ this.instock +'\n' + this.productCode);
  }
    /*
    a method in java has an access modifier
    return data type
    name of method
    brackets ()
    curly brackets {}
    using this will use whatever the product name is
     */
}
