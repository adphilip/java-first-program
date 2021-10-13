package com.h2;

public class SavingsCalculator {

    private float [] credits;
    private float [] debits;

    public SavingsCalculator(float [] credits, float [] debits){
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits(){

        float sum = 0;

        for (float f : credits) {
            sum += f;
        }
        return sum;
    }


    private float sumOfDebits(){

        float sum = 0;

        for (float f : debits) {
            sum += f;
        }
        return sum;
    }
    
}
