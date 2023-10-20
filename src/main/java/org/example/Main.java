package org.example;

public class Main {

    public int material(int[] spaceShip) {
        int length = spaceShip.length;
        int[] leftMax = new int[length];
        int[] rightMax = new int[length];
        leftMax[0] = spaceShip[0];
        rightMax[length - 1] = spaceShip[length - 1];

        for (int i = 1; i < length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], spaceShip[i]);
            rightMax[length - i - 1] = Math.max(rightMax[length - i], spaceShip[length - i - 1]);
        }

        int materialCounter = 0;
        for (int i = 0; i < length; i++) {
            materialCounter += Math.min(leftMax[i], rightMax[i]) - spaceShip[i];
        }

        return materialCounter;
    }


}