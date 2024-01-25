import java.util.Scanner;

public class LoginPage
{
    public static void login()
    {
        Scanner keyboard = new Scanner(System.in);
        String username = "Zulham";
        String password = "TemveGorenk";
        Double num = (Math.random() * 255);
        String captcha = num.toString();
        boolean on = true;
        String input;

        System.out.println("");
        System.out.println("SELAMAT DATANG DI SUPERMARKET ZAHARA");
        System.out.println("====================================");
        System.out.println("Log In");

        while (on)
        {
            System.out.print("Username: ");
            input = keyboard.nextLine();

            if (input.equals(username))
            {
                System.out.print("Password: ");
                input = keyboard.nextLine();

                if (input.equals(password))
                {
                    boolean onCaptcha = true;
                    while (onCaptcha)
                    {
                        System.out.println("CAPTCHA: " + captcha);
                        input = keyboard.nextLine();

                        if (input.equalsIgnoreCase(captcha))
                        {
                            System.out.println("Logged in.");
                            System.out.println("------------------------------------\n");
                            on = false;
                            onCaptcha = false;
                        }
                        else
                        {
                            System.out.println("Wrong captcha!");
                            // onCaptcha = false;
                            num = (Math.random() * 255);
                            captcha = num.toString();
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong username or password!");
                }
            }
            else
            {
                System.out.println("Wrong username or password!");
            }
        }

        // https://stackoverflow.com/questions/7209110/java-util-nosuchelementexception-no-line-found
        // https://stackoverflow.com/questions/27286690/in-java-is-it-possible-to-re-open-system-in-after-closing-it
        // keyboard.close();
    }
    
}
