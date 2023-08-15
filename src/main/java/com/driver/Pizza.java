package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private boolean cheeseAdded=false;
    private boolean toppingsAdded=false;
    private boolean paperBag= false;
    private int  basePrice;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int extraPaperBagPrice;
    private boolean isBillGiven=false;


    /**
     * menu
     *
     * Veg pizza base price = 300
     * Non-veg pizza base price = 400
     * Extra Cheese Price = 80
     * Extra Toppings For Veg Pizza = 70
     * Extra Toppings For Non-veg Pizza = 120
     * Paper bag Price = 20
     */

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheesePrice=80;
        this.extraPaperBagPrice=20;
        // your code goes here
        if(isVeg==true){
            this.basePrice=300;
            this.extraToppingsPrice=70;
        }
        else{
            this.basePrice=400;
            this.extraToppingsPrice=120;
        }
        this.price= this.basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded)price+=extraCheesePrice;
        this.cheeseAdded=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdded)price+=extraToppingsPrice;
        this.toppingsAdded=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBag)price+=extraPaperBagPrice;
        this.paperBag=true;
    }

    public String getBill(){
        // your code goes here
        if(!isBillGiven){
            if(isVeg)bill+="Base Price Of The Pizza: 300\n";
            else bill+="Base Price Of The Pizza: 400\n";
            if(cheeseAdded)bill+= "Extra Cheese Added: 80\n";
            if(toppingsAdded){
                if(isVeg) bill+="Extra Toppings Added: 70\n";
                else bill+="Extra Toppings Added: 120\n";
            }
            if(paperBag) bill+="Paperbag Added: 20\n";
            bill+="Total Price: "+this.price+"\n";
            isBillGiven=true;
        }
        return this.bill;
    }
}
