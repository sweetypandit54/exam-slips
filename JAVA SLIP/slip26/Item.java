//slip 23
public class Item
{
    private int no;
    private String name;
    private double price;
    private static int objcount=0;
    
    public Item(int id,String name,double price)
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
       System.out.println("Item no: "+no); 
       System.out.println("Item Name: "+name);
       System.out.println("Item price:"+price);
               
    }
    public static void main(String[] args)
    {
        Item item1=new Item(1,"abc",50000);
         item1.display(); 
         System.out.println("Object count  is: "+Item.getobjcount());
         System.out.println();
         Item item2=new Item(2,"xyz",75000);
         item2.display();
         System.out.println("Object count  is: "+Item.getobjcount());
         System.out.println();
         Item item3=new Item(4,"xvz",7000);
         item3.display();  
         System.out.println("Object count  is: "+Item.getobjcount());
    }
     
}


//System.out.println("");
