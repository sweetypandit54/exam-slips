class continent
{ 
    String cont;   
    public continent(String cont)  
      {
           this.cont=cont;
      }
      public void display_continent()
      {
        System.out.println("Continent: "+cont);
      }
}
class country extends continent
{
    String countryname;
    public country(String countryname,String cont)
    {
        super(cont);
        this.countryname=countryname;
    }
    public void display_country()
    {
        display_continent();
        System.out.println("Country:"+countryname);
    }
}

class state extends country
{
    String staten;
    public state(String countryname,String cont,String staten)
    {
        super(countryname,cont);
        this.staten=staten;
    }
    public void display_state()
    {
        display_country();
        System.out.println("State: "+staten);
    }
}
class place extends state
{
    String placen;
    public place(String cont,String countryname,String staten,String placen)
    {
        super(placen,countryname,cont);
        this.placen=placen;
    }
    public void display_place()
    {
        display_state();
        System.out.println("Place: "+placen);
    }
}

class inheritance
{
    public static void main(String args[])
    {
        place p=new place("Asia","India","Maharshtra","Nashik");
        p.display_place();
    }
}
//System.out.println("");