package org.example;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class MainTest {

@Test

    public void TestCase(){
        int[] spaceship = new int[]{6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3};
        Main main = new Main();
        int actualMaterial = main.material(spaceship);
    assertEquals(83,actualMaterial);
}
@Test
public void TestCase2(){
        int[] spaceship = new int[]{6, 2, 1, 1, 8, 0, 5, 5, 0, 1, 8, 9, 6, 9, 4, 8, 0, 0};
         Main main = new Main();
        int actualMaterial = main.material(spaceship);
    assertEquals(50,actualMaterial);
}
@Test
public void TestCase3(){
        int[] spaceship = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        Main main = new Main();
        int actualMaterial = main.material(spaceship);
    assertEquals(6,actualMaterial);
}

@Test
public void TestCase4(){
        int[] spaceship = new int[]{0,1,0,2,1,0,3,1,0,1,2};
        Main main = new Main();
        int actualMaterial = main.material(spaceship);
    assertEquals(8,actualMaterial);
}
@Test
public void TestCase5(){
        int[] spaceship = new int[]{4,2,0,3,2,5};
        Main main = new Main();
        int actualMaterial = main.material(spaceship);
    assertEquals(9,actualMaterial);
}
}