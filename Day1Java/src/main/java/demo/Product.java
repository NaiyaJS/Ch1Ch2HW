package demo;

public class Product {
    public static void main(String[] args){

      //  String productName;
      //  productName = "BMW"; //declared a variable
      //  System.out.println(productName); //initialized the variable
      //  String productName = "BMW";
      //  System.out.println(productName);
        /* product must have a Name, Price, list of options,
         list of discriptions, says if product is in stock,
         must have a code thats a single letter character,discount percentage, fixed taxes"
         */
        String productName1 = "Apple";
        double appleCost = 2.99d;
        String productDescription1[] = {"red apples", "best apples in town","organic"};
        char productCode1 = 'a';
        final float PRODUCT_TAX = 0.09f;
        boolean inStock = true;

        System.out.println(productName1 + '\n' + productDescription1[2] + '\n' + productCode1);

        String productName2 = "Cake";
        Double cakeCost = 12.99d;
        String productDescription2[] = {"strawberry icing", "oreoicecream filling"};
        char productCode2 = 'C';
        final float PRODUCT_TAX2 = 0.11f;
        boolean instock2 = false;

    }
}
