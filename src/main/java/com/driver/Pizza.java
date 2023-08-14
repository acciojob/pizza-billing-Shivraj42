package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private boolean cheeseAdded=false;
    private boolean toppingsAdded=false;
    private boolean paperBag= false;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            price+=300;
            bill+="Base Price Of The Pizza: 300\n";
        }
        else{
            price+=400;
            bill+="Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!cheeseAdded)price+=80;
        this.cheeseAdded=true;
    }

    public void addExtraToppings(){
        // your code goes here

        if(!toppingsAdded)price+= isVeg?70:120;
        this.toppingsAdded=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBag)price+=20;
        this.paperBag=true;
    }

    public String getBill(){
        // your code goes here
        if(cheeseAdded)bill+="Extra Cheese Added: 80\n";
        if(toppingsAdded){
            bill+="Extra Toppings Added: ";
            bill+=this.isVeg?"70":"120";
            bill+="\n";
        }
        if(paperBag=true)bill+="Paperbag Added: 20\n";
        bill+="Total Price: "+this.price;
        return this.bill;
    }
}
