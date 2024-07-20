import java.util.Scanner;

public class MarksLevels{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the mark for your student");
            int marks = scanner.nextInt();
            
            if (marks >= 80) {
                System.out.print("level 7-outstanding achievement!");
            } else if (marks >= 70) {
                System.out.print("level 6-meritorious achievement!");
            } else if (marks >= 60) {
                System.out.print("level 5- substantial achievement!");
            } else if (marks >= 50) {
                System.out.print("level 4 - moderate achievement!");
            } else if (marks >= 40) {
                System.out.print("level 3 - aequate achievement!");
            } else if (marks >= 30) {
                System.out.print("level 2 - elementary achievement!");
            } else {
                System.out.print("fail!");
            }
    }}
            
            
            
            