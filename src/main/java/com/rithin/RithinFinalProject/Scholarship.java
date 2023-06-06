package com.rithin.RithinFinalProject;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Scholarship extends Application {
    private int amountGiven;
    private String type;
    private String school;


    public Scholarship(String name, String deadline, String link, String importance, int numOfQuestion, int amountGiven, String type, String school){
        super(name, deadline, link, importance, numOfQuestion);
        this.amountGiven = amountGiven;
        this.type = type;
        this.school = school;
    }

    public String setSchedule(){
        return "The application of " + super.getName() + " is due by " + super.getDeadline() + ". The link to the application is: " + super.getLink() + ". You have ranked it as " + super.getImportance() + " and has these many questions on the application " + super.getNumofQuestion() + "." + "The amount of money given for this scholarship is " + amountGiven + ". The type of scholarship is " + type + " and this scholarship is for " + school + ".";
    }

}
