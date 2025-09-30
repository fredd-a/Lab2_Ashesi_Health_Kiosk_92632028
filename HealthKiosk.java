import java.util.Random;
import java.util.Scanner;

public class HealthKiosk{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! We hope you have a great experience.");

        //task 1
        System.out.println("Please select a service(P,L,T,C):");
        char serviceCode = input.next().toUpperCase().charAt(0);

        double bmiValue;
        double roundedBmiValue = 0.0;

        switch (serviceCode){
            case 'P':
            System.out.println("Go to: Pharmacy Desk");
            break;
            case 'L':
            System.out.println("Go to: Lab Desk");
            break;
            case 'T':
            System.out.println("Go to: Triage Desk");
            System.out.print("Enter weight(kg):");
            double weight = input.nextDouble();
            
            System.out.print("Enter height(m):");
            double height = input.nextDouble();

            bmiValue = weight/(Math.pow(height,2));
            roundedBmiValue = Math.round(bmiValue*10)/10.0;
            System.out.println("BMI: "+ roundedBmiValue);

            System.out.println("1 for BMI");
            System.out.println("2 for Dosage round-up");
            System.out.println("3 for simple trig helper");
            System.out.println("Enter the health metric:");
            int healthMetric = input.nextInt();
            
            if (healthMetric== 1){
                if(roundedBmiValue <18.5){
                    System.out.println("Category: Underweight");
                }else if (roundedBmiValue>=18.5 && roundedBmiValue <=24.9){
                    System.out.println("Category: Normal");
                }else if (roundedBmiValue >=25.0 && roundedBmiValue <= 29.9){
                    System.out.println("Category: Overweight");
                }else{ 
                    System.out.println("Category: Obese");
                }

            }else if(healthMetric==2){
                System.out.println("Enter the required dosage(mg):");
                double dosage = input.nextDouble(); 
                int numOfTablets = (int)Math.ceil(dosage/250);
                System.out.println("Number of tablets needed:"+ numOfTablets);

            }else if(healthMetric==3){
                System.out.println("Enter an angle in degrees:");
                double degrees = input.nextDouble();
                double sinOfDegrees = Math.sin(degrees);
                double cosOfDegrees = Math.cos(degrees);

                double roundedSinAngle = Math.round(sinOfDegrees*1000)/1000.0;
                double roundedCosAngle = Math.round(cosOfDegrees*1000)/1000.0;

                System.out.println("Sin of angle:"+ roundedSinAngle);
                System.out.println("Cos of angle:"+ roundedCosAngle);

            }else{
                System.out.println("Invalid input");
        }
                break;
                case 'C':
                System.out.println("Go to: Counseling Desk");
        
                break;
                default:
                System.out.println("Invalid service code");
            }

            
        Random rand = new Random();
        int letterIndex = rand.nextInt(26);
        char randomChar = (char) ('A'+ letterIndex);

        int num1 = rand.nextInt(7)+3;
        int num2 = rand.nextInt(7)+3;
        int num3 = rand.nextInt(7)+3;
        int num4 = rand.nextInt(7)+3;

        String studentID = "" + randomChar + num1 + num2 + num3 + num4;
        System.out.println("Student ID: " + studentID);

        if (studentID.length()!= 5){
            System.out.println("Invalid lenght");  
        }else{
            char firstChar = studentID.charAt(0);
            if (!Character.isLetter(firstChar)){
                System.out.println("Invalid: first character must be a letter");    
            } else { 
                boolean allDigits = true;
                for(int i=1; i<5; i++){
                    if (!Character.isDigit(studentID.charAt(i))){
                        allDigits = false;
                    }
                }
                if (!allDigits){
                    System.out.println("Invalid: last 4 must be diits");
                } else {
                    System.out.println("ID OK");
                }

        }

    }
        System.out.println("Enter your first name");
        String name = input.nextLine();
        char firstLetter = input.nextLine().toUpperCase().charAt(0);
        System.out.println("Base code:"+ firstLetter);
        char letterShift = (char)('A' +(firstLetter - 'A' + 2) %26);
        System.out.println("Shifted letter of base code = " + letterShift);
        String lastTwoChars = studentID.substring(studentID.length()-2);
        System.out.println("Last two characters for ID:"+ lastTwoChars);
        String displayCode = letterShift + lastTwoChars + "-" + roundedBmiValue;

        System.out.println("Display Code: "+ displayCode);

        System.out.printf("TRIAGE| ID= %s | BMI = %.1f | CODE = %s",studentID, roundedBmiValue, displayCode);

        input.close();



    }
}








        


            


        

        
    
        




        
    
    
