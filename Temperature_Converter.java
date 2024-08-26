import java.util.Scanner;

public class Temperature_Converter extends Converter
{
    public static void main(String [] args)
    {
        int option;
        double celsius , fahrenheit;
        char ask;

        System.out.println("-Welcome to my Temperature Converter-");
        System.out.println("*************************************");
        do
        {
            Scanner s = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Select 1 if you want to convert from Celsius to Fahrenheit");
            System.out.println("Select 2 if you want to convert from Fahrenheit to Celsius");
            System.out.println(" ");
            System.out.println("--------------------Choose your option--------------------");
            option=s.nextInt();
            System.out.println(" ");
            Temperature_Converter convert = new Temperature_Converter();

            //Wrong Option
            while(option != 1 && option != 2)
            {
                System.out.println("Oops !! Sorry..Wrong option. Kindly choose again!!");
                System.out.println("Select 1 if you want to convert from Celsius to Fahrenheit");
                System.out.println("Select 2 if you want to convert from Fahrenheit to Celsius");
                System.out.println(" ");
                System.out.println("--------------------Choose your option--------------------");
                System.out.println("Choose your option -");
                option=s.nextInt();
                System.out.println(" ");
            }

            //According to option convert
            if(option == 1)
            {
                System.out.println("You want to convert from Celsius to Fahrenheit");
                System.out.println("Enter the temperature in Celsius");
                celsius = s.nextDouble();
                fahrenheit = convert.celsiusToFahrenheit(celsius);
                System.out.println(" ");
                System.out.println("Temperature in Fahrenheit is : "+ fahrenheit + " °F");
            }
            else
            {
                System.out.println("You want to convert from Fahrenheit to Celsius");
                System.out.println("Enter the temperature in Fahrenheit");
                fahrenheit = s.nextDouble();
                celsius = convert.FahrenheitToCelsius(fahrenheit);
                System.out.println("Temperature in Celsius is : "+ celsius+ " °C");
            }
            // Ask user they want to convert it again ot not.
            Scanner sc=new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Do you want to convert temperature again ? (Y/N)");
            ask=sc.next().charAt(0);
        }
        while(ask =='Y' || ask == 'y');//If they select Y then it will repeat again
        System.out.println(" ");
        System.out.println("Thank you !!");
    }
}
