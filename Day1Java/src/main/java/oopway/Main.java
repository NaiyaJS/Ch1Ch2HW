package oopway;

public class Main {
    public static void main (String[] args){
        Product car = new Product();
        car.productname = "Nissan"; //assigned a value to our property
        car.instock = true;
        car.productCode = 'N';
        car.printProductInfo("================");


        Product cake = new Product();
        cake.productname = "vanilla"; //assigned a value to our property
        cake.instock = false;
        cake.productCode = 'C';
        cake.printProductInfo();
        System.out.println(cake.productname +'\n'+ cake.instock +'\n' + cake.productCode);
    }
}
