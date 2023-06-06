package com.rithin.RithinFinalProject;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Application {
    private String name;
    private String deadline;
    private String link;
    private String importance;
    private int numOfQuestion;

    public Application (String name, String deadline, String link, String importance, int numOfQuestion){
        this.name = name;
        this.deadline = deadline;
        this.link = link;
        this.importance = importance;
        this.numOfQuestion = numOfQuestion;
    }


    public String getName(){
        return name;
    }
    public String getDeadline(){
        return deadline;
    }
    public String getLink(){
        return link;
    }
    public String getImportance(){
        return importance;
    }
    public int getNumofQuestion(){
        return numOfQuestion;
    }

    public String setSchedule(){
        return "The application of " + name + " is due by " + deadline + ". The link to the application is: " + link + ". You have ranked it as " + importance + " and has these many questions on the application " + numOfQuestion + ".";
    }

}
