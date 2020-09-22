package org.example.stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@SmokeTest")
    public void beforeValidation(){

        System.out.println("smoke test before Hook");
    }
    @After("@SmokeTest")
    public void afterValidation(){

        System.out.println("smoke test after Hook");
    }
}
