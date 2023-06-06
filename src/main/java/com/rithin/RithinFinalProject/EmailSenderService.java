package com.rithin.RithinFinalProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;
    public void sendEmail(String toEmail, String subject){
        SimpleMailMessage message = new SimpleMailMessage();
        int number = 0;
        String typeOfapp = "";
        ArrayList<Application> applications = new ArrayList<Application>();
        ArrayList<College> colleges = new ArrayList<College>();
        ArrayList<SummerProgram> summerprograms = new ArrayList<SummerProgram>();
        ArrayList<Scholarship> scholarships = new ArrayList<Scholarship>();
        String Aname;
        String Adeadline;
        String Alink;
        String Aimportance;
        int AnumOfQuestion;
        int CnumOfRecom;
        int CnumOfessays;
        String Crigor;
        String CdeadForrecom;
        String Clocation;
        int SPnumOfRecom;
        String SPdeadForrecom;
        int SPprice;
        String SPdates;
        String SPlocation;
        boolean SPpaid = true;
        int SamountGiven;
        String Stype;
        String Sschool;


        // Application Chicfila = new Application("Chic-fil-A", Date deadline, String link, String importance, int numOfQuestion);
        // College Duke = new College(String name, Date deadline, String link, String importance, int numOfQuestion, int numOfRecom, int numOfessays, String rigor,Date deadForrecom, String location);
        // Scholarship Coke = new Scholarship(String name, Date deadline, String link, String importance, int numOfQuestion, int amountGiven, String type, String school);
        // SummerProgram Microsoft = new SummerProgram(String name, Date deadline, String link, String importance, int numOfQuestion, int numOfRecom, Date deadForrecom, int price,String dates, String location, boolean paid);
        //The setSchedule method is basically the toString method/summary
        Scanner in = new Scanner (System.in);
        System.out.print("How many applications are you planning to schedule? ");
        String statement = in.nextLine();
        number = Integer.valueOf(statement);
        for (int x = 0; x < number; x++){
            System.out.print("What is your type of application? (Application, College, Summer Program, Scholarship) ");
            statement = in.nextLine();
            typeOfapp = statement;
            if (typeOfapp.equals("Application")){
                System.out.print("What is the name of the application? ");
                Aname = in.nextLine();
                System.out.print("What is the deadline of the application? ");
                Adeadline = in.nextLine();
                System.out.print("What is the link of the application? ");
                Alink = in.nextLine();
                System.out.print("What is the importance of the application? (Low, Medium, High) ");
                Aimportance = in.nextLine();
                System.out.print("What is the number of questions on the application? ");
                statement = in.nextLine();
                AnumOfQuestion = Integer.valueOf(statement);
                applications.add(new Application(Aname, Adeadline,  Alink, Aimportance, AnumOfQuestion));
            }
            else if (typeOfapp.equals("College")){
                System.out.print("What is the name of the application? ");
                Aname = in.nextLine();
                System.out.print("What is the deadline of the application? ");
                Adeadline = in.nextLine();
                System.out.print("What is the link of the application? ");
                Alink = in.nextLine();
                System.out.print("What is the importance of the application? (Low, Medium, High) ");
                Aimportance = in.nextLine();
                System.out.print("What is the number of questions on the application? ");
                statement = in.nextLine();
                AnumOfQuestion = Integer.valueOf(statement);
                System.out.print("What is the importance of the application? (Low, Medium, High) ");
                Aimportance = in.nextLine();
                System.out.print("What is the number of recommendations needed for this? ");
                statement = in.nextLine();
                CnumOfRecom = Integer.valueOf(statement);
                System.out.print("What is the number of essays needed for this? ");
                statement = in.nextLine();
                CnumOfessays = Integer.valueOf(statement);
                System.out.print("What is the rigor for this college (Low, Medium, High)? ");
                Crigor = in.nextLine();
                System.out.print("What is deadline for the recommendation? ");
                CdeadForrecom = in.nextLine();
                System.out.print("What is location for the college? ");
                Clocation = in.nextLine();
                colleges.add(new College(Aname, Adeadline,  Alink, Aimportance, AnumOfQuestion, CnumOfRecom, CnumOfessays, Crigor, CdeadForrecom, Clocation));
            }
            else if (typeOfapp.equals("Summer Program")){
                System.out.print("What is the name of the application? ");
                Aname = in.nextLine();
                System.out.print("What is the deadline of the application? ");
                Adeadline = in.nextLine();
                System.out.print("What is the link of the application? ");
                Alink = in.nextLine();
                System.out.print("What is the importance of the application? (Low, Medium, High) ");
                Aimportance = in.nextLine();
                System.out.print("What is the number of questions on the application? ");
                statement = in.nextLine();
                AnumOfQuestion = Integer.valueOf(statement);
                System.out.print("What is the number of recommendations needed for this? ");
                statement = in.nextLine();
                SPnumOfRecom = Integer.valueOf(statement);
                System.out.print("What is deadline for the recommendation? ");
                SPdeadForrecom = in.nextLine();
                System.out.print("What is the price for this summer program? ");
                statement = in.nextLine();
                SPprice = Integer.valueOf(statement);
                System.out.print("What are the dates for this summer program? ");
                SPdates = in.nextLine();
                System.out.print("What is the location for this summer program? ");
                SPlocation = in.nextLine();
                System.out.print("Is this summer program paid (Y/N)?");
                statement = in.nextLine();
                if (statement.equals("N")){
                    SPpaid = false;
                }
                summerprograms.add(new SummerProgram(Aname, Adeadline,  Alink, Aimportance, AnumOfQuestion, SPnumOfRecom, SPdeadForrecom, SPprice, SPdates, SPlocation, SPpaid ));
            }
            else if (typeOfapp.equals("Scholarship")){
                System.out.print("What is the name of the application? ");
                Aname = in.nextLine();
                System.out.print("What is the deadline of the application? ");
                Adeadline = in.nextLine();
                System.out.print("What is the link of the application? ");
                Alink = in.nextLine();
                System.out.print("What is the importance of the application? (Low, Medium, High) ");
                Aimportance = in.nextLine();
                System.out.print("What is the number of questions on the application? ");
                statement = in.nextLine();
                AnumOfQuestion = Integer.valueOf(statement);
                System.out.print("What is the amount given for the scholarship? ");
                statement = in.nextLine();
                SamountGiven = Integer.valueOf(statement);
                System.out.print("What is the type of the Scholarship? ");
                Stype = in.nextLine();
                System.out.print("What school is this scholarship for (N/A if not a school)? ");
                Sschool = in.nextLine();
                scholarships.add(new Scholarship(Aname, Adeadline,  Alink, Aimportance, AnumOfQuestion,  SamountGiven, Stype, Sschool));
            }
        }
        if (applications != null){
            for (int x = 0; x<applications.size(); x++){
                message.setFrom("Rithinteja.aechan@gmail.com");
                message.setTo(toEmail);
                message.setSubject(subject);
                message.setText(applications.get(x).setSchedule());
                mailSender.send(message);
            }
        }
        if (colleges != null){
            for (int x = 0; x<colleges.size(); x++){
                message.setFrom("Rithinteja.aechan@gmail.com");
                message.setTo(toEmail);
                message.setSubject(subject);
                message.setText(colleges.get(x).setSchedule());
                mailSender.send(message);
            }
        }
        if (summerprograms != null){
            for (int x = 0; x<summerprograms.size(); x++){
                message.setFrom("Rithinteja.aechan@gmail.com");
                message.setTo(toEmail);
                message.setSubject(subject);
                message.setText(summerprograms.get(x).setSchedule());
                mailSender.send(message);
            }
        }
        if (scholarships != null){
            for (int x = 0; x<scholarships.size(); x++){
                message.setFrom("Rithinteja.aechan@gmail.com");
                message.setTo(toEmail);
                message.setSubject(subject);
                message.setText(scholarships.get(x).setSchedule());
                mailSender.send(message);
            }
        }
        System.out.println("Mail Sent successfully");
    }
}
