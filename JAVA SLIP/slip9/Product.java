//slip 23
public class Product
{
    private int no;
    private String name;
    private double price;
    private static int objcount=0;
    
    public Product(int id,String name,double price)
    {
         this.no=id;
         this.name=name;
         this.price=price;
         objcount++;
    }
    
    public static int getobjcount()
    {
          return objcount;
    }
    
    public void display()
    {
       System.out.println("Product no: "+no); 
       System.out.println("Product Name: "+name);
       System.out.println("Product price:"+price);
               
    }
    public static void main(String[] args)
    {
        Product item1=new Product(1,"abc",50000);
         item1.display(); 
         System.out.println("Object count  is: "+Product.getobjcount());
         System.out.println();
         Product item2=new Product(2,"xyz",75000);
         item2.display();
         System.out.println("Object count  is: "+Product.getobjcount());
         System.out.println();
         Product item3=new Product(4,"xvz",7000);
         item3.display();  
         System.out.println("Object count  is: "+Product.getobjcount());
    }
     
}


//System.out.println("");
