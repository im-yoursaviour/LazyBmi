package com.samuelNimoh;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
	out.println(" ***copyright ©*** ");
	out.println(" *** Samuel corp ©*** ");
	out.println(" *** This is a BMI Calculator*** ");
    Scanner keyboard = new Scanner(System.in);
    boolean isActive;
    double bmiValue = 0;
    System.out.print("What value is your wight in, type K for kg or P for Ibs ");
    char typeOfBmi = keyboard.next().charAt(0);


    if(typeOfBmi == 'k' || typeOfBmi == 'K') {
        out.print("type your weight in kg: ");
        double weight = keyboard.nextDouble();
        out.print("type your height in meters : ");
        double height = keyboard.nextDouble();
        bmiValue = checkBmiKg(weight, height);
    }else if(typeOfBmi == 'p' || typeOfBmi == 'P'){
        out.print("type your weight in Ibs: ");
        double weight = keyboard.nextDouble();
        out.print("type your height in inches : ");

        double height = keyboard.nextDouble();
        bmiValue = checkBmiImperial(weight, height);
    }
    if (bmiValue < 18.5){
        out.println("Bro go eat ");
    }else if( bmiValue <25){
        out.println("Your are okay and your Risk of getting a weird disease is down");
    }else if (bmiValue <30){
        out.println("You're overweight homie, go workout. Your risk of getting a lame disease is increased");
    }else if (bmiValue <35.0) {
        out.println("You're a type I obese sh*t go seek help. your risk of getting a lame disease in high");
    }else if (bmiValue <40.0) {
        out.println("You're Type II obese sh*t start eating well and seek help before you die. ");
    }else if (bmiValue >=40 ) {
        out.println("Bro WHAT THE FUCK, Why ain't you dead yet");
    }

    out.print("Thank you for  using my shit");
    }

    public static  double checkBmiKg(double weightInKG, double heightInMeters){
        double Bmi = weightInKG/(heightInMeters*heightInMeters);
        return Bmi;


    }
    public static double checkBmiImperial(double weightInIbs, double heightInInch ){
        double Bmi = 703* weightInIbs/(heightInInch* heightInInch);
        return Bmi;
    }
}
