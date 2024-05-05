package week2;

import java.util.Scanner;

// HackerLand University has the following grading policy:
//• Every student receives a grade in the inclusive range from 0 to 100.
//• Any grade less than 40 is a failing grade.
// Sam is a professor at the university and likes to round each student's grade according to these rules:
//• If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
//• If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
// Examples
//• grade = 84 round to 85(85 - 84 is less than 3)
//• grade = 29 do not round (result is less than 40)
//• grade = 57 do not round (60 - 57 is 3 or higher)
// Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
// Function Description
// Complete the function gradingStudents in the editor below.
// gradingStudents has the following parameter(s):
//• int grades[n]: the grades before rounding
public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the grade: ");
        double theGrade = scanner.nextDouble();
        double round = (theGrade / 5 + 1 ) * 5;
        double minGrade = 0;
        double maxGrade = 100;
        while (minGrade < theGrade && theGrade < maxGrade){
            if (theGrade < 38){
                System.out.println("You failed.");
            }else if ( (round - theGrade) < 3 ){
                return;
            }
        }
    }
}
