package Module1;


import java.util.Random;

public class Loops {

    // Generate
    public static int randomNumber()
    {
        Random random = new Random();
        int day = random.nextInt(7)+1;
        System.out.println("Day is " + day);
        return day;
    }


    public static void main (String[] args)
    {

        int [] demoArray = {1, 2, 3, 4, 5, 6};
        String [] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int demoVar1 = 10;
        int demoVar2 = 12;

        // if else
        if (demoVar1 > demoVar2)
            System.out.println("Greater");
        else
            System.out.println("Lower");

        // for each
        for (int i: demoArray)
            System.out.println(i);


        // for loop
        for (int i = 0; i < demoArray.length; i++)
            System.out.println("For loop "+ demoArray[i]);


        // switch
        switch (demoVar2)
        {
            case 1:
                System.out.println("it is 1");
            case 2:
                System.out.println("It is 2");
            default:
                System.out.println("It is more than 2");
        }

        // while
        while (demoVar2 > 10)
        {
            System.out.println("Greater than 10");
            demoVar2--;
        }

        // do while
        do {
            System.out.println("It is greater than 9");
            demoVar2--;
        }
        while (demoVar2 > 9);

        // switch for weekdays
        int day = randomNumber();
        switch (day){
            case 1 -> System.out.println(weekDays[day-1]);
            case 2 -> System.out.println(weekDays[day-1]);
            case 3 -> System.out.println(weekDays[day-1]);
            case 4 -> System.out.println(weekDays[day-1]);
            case 5 -> System.out.println(weekDays[day-1]);
            case 6 -> System.out.println(weekDays[day-1]);
            case 7 -> System.out.println(weekDays[day-1]);
            default -> System.out.println("Wrong weekday, enjoy weekend");

        }

    }

}