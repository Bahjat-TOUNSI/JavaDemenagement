package com.example.ondemenage;

public class OnDemenage {
    public static void main(String[] args) {
        int loadCapacity = 9;
        int boxes = 34;
        int boxesDelivered;

        while(boxes > 0){
            if(boxes >= loadCapacity){
                boxes -= loadCapacity;
                boxesDelivered = loadCapacity;
            }
            else{
                loadCapacity = boxes;
                boxesDelivered = loadCapacity;
                boxes -=boxesDelivered;

            }
            System.out.println("Voyage de " + boxesDelivered + " cartons.");
            if (boxes == 0){
                System.out.println("Plus de cartons");
            }
            else {
                System.out.println("cartons restant " + boxes);
            }
        }
    }
}

