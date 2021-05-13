package com.Geekteck;

public class Skeleton extends  Boss{
    private int quantityOfArrows;

    public void setQuantityOfArrows(int quantityOfArrows) {
        this.quantityOfArrows = quantityOfArrows;
    }

    public int getQuantityOfArrows() {
        return quantityOfArrows;
    }

    public String printInfo(){
        return super.printInfo() +"  "+ getQuantityOfArrows();

    }
}
