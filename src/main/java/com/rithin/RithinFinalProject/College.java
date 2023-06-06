package com.rithin.RithinFinalProject;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class College extends Application {
    private int numOfRecom;
    private int numOfessays;
    private String rigor;
    private String deadForrecom;
    private String location;

    public College(String name, String deadline, String link, String importance, int numOfQuestion, int numOfRecom, int numOfessays, String rigor, String deadForrecom, String location){
        super(name,deadline, link, importance,numOfQuestion);
        this.numOfRecom = numOfRecom;
        this.numOfessays = numOfessays;
        this.rigor = rigor;
        this.deadForrecom = deadForrecom;
        this.location = location;
    }

    public String setSchedule(){
        return "The application of " + super.getName() + " is due by " + super.getDeadline() + ". The link to the application is: " + super.getLink() + ". You have ranked it as " + super.getImportance() + " and has these many questions on the application " + super.getNumofQuestion() + "." + "The number of recommendations needed is " + numOfRecom + " and this is due by " + deadForrecom + ". " + "The number of essays for this college is " + numOfessays + " and the rigor is " + rigor + ". This college is located in " + location;
    }

}