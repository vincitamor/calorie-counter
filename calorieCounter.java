import java.io.*;
import java.util.Scanner;

public class calorieCounter {



        static class caloriesIntake {
        int calories;
        String dayOfTheWeek;

            Scanner sc = new Scanner(System.in);


            caloriesIntake(int calories, String dayOfTheWeek) {
                this.calories=calories;
                this.dayOfTheWeek=dayOfTheWeek;
            }

         void menu(){
            Scanner sc = new Scanner(System.in);

            char options;
        do{
        System.out.println("......................");
        System.out.println("Number of meal(s) consumed?\t");
        System.out.println("......................");
        System.out.println();


        System.out.println(" 1");
        System.out.println(" 2");
        System.out.println(" 3");
        System.out.println(" 4");
        System.out.println("f) Exit application");



            options=sc.next().charAt(0);

        switch(options){
            case'1':
            System.out.println("......................");
            System.out.println("Great job! You consumed "+options+" meals, totaling " + calories + " calories, keep up the consistency!" +
                " keep up the consistency!");
            break;
            case'2':
                System.out.println("......................");
                System.out.println("Great job! You consumed "+options+" meals, totaling " + calories + " calories, keep up the consistency!");
                break;
                case'3':
            System.out.println("......................");
            System.out.println("Great job! You consumed "+options+" meals, totaling " + calories + " calories, keep up the consistency!");
            break;
            case'4':
                System.out.println("......................");
                System.out.println("Great job! You consumed "+options+" meals, totaling " + calories + " calories, keep up the consistency!");
                break;
            case'f':
                System.exit(0);
        }
        }while(options <= 1);
            System.out.println();
        System.out.println("Your input has been recorded, reference the file " + dayOfTheWeek + ".txt");
        return;
        }
        }
            public static void main(String[] args) throws IOException {

                Scanner sc = new Scanner(System.in);


                System.out.print("Enter the day & time of day, Ex: (MondayNight):\t");
                String dayOfTheWeek = sc.nextLine();

                System.out.println();
                System.out.print("Enter the amount of calories you consumed:\t");
                int calories=sc.nextInt();
                caloriesIntake obj= new caloriesIntake(calories, dayOfTheWeek);
                obj.menu();

                BufferedWriter writer = new BufferedWriter(new FileWriter(dayOfTheWeek + ".txt"));
                writer.write(calories + " calories were consumed on " + dayOfTheWeek + ".");
                writer.close();

            }
        }






