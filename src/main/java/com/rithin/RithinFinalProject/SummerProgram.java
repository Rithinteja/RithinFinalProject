package com.rithin.RithinFinalProject;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class SummerProgram extends Application {
    private int numOfRecom;
    private String deadForrecom;
    private int price;
    private String dates;
    private String location;
    private boolean paid;

    public SummerProgram(String name, String deadline, String link, String importance, int numOfQuestion, int numOfRecom, String deadForrecom, int price, String dates, String location, boolean paid){
        super(name,deadline,link,importance,numOfQuestion);
        this.numOfRecom = numOfRecom;
        this.deadForrecom = deadForrecom;
        this.dates = dates;
        this.location = location;
        this.paid = paid;
    }


    public String setSchedule(){
        return "The application of " + super.getName() + " is due by " + super.getDeadline() + ". The link to the application is: " + super.getLink() + ". You have ranked it as " + super.getImportance() + " and has these many questions on the application " + super.getNumofQuestion() + "." + "The number of recommendations needed is " + numOfRecom + " and this is due by " + deadForrecom + ". " + "The dates of the summer program is " + dates + " and the location is at " + location + ". The status of this program that get you paid is " + paid;
    }


}
