import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class employee extends trackInfo{
     static int date() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
         return 0;

     }



    static Scanner scanInput=new Scanner(System.in);
    static trackInfo call=new trackInfo();

    public static void controlEmployee1(){

        try {
            FileReader readsAbstence=new FileReader("abstence.txt");

            FileWriter here=new FileWriter("here.txt",true);
            FileWriter absent=new FileWriter("abstence.txt",true);
            Scanner scantext=new Scanner(readsAbstence);




        System.out.println("Enter your id: ");
        String employee1Id1 = null;
        String employee1Id=scanInput.nextLine();

            if(employee1Id.equals("admin")){
                System.out.println("what is the admin password?");
                String adminPass=scanInput.nextLine();
                if (adminPass.equals("admin123")){
                System.out.println("welcome boss here is the absent list: \n");
                while(scantext.hasNext()){
                    String data =scantext.nextLine();


                    System.out.println(data);

                    readsAbstence.close();

                }
                }
                else {
                    System.out.println("System will be executed...");
                    System.out.println("3");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("2");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("1");
                    TimeUnit.SECONDS.sleep(1);
                    System.exit(0);
                    System.out.println("System executed...");

                }
            }
            else {
            System.out.println("************WELCOME TO THE SYSTEM***************");
                System.out.println("Please wait");
                System.out.println("3");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("2");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("1");
                TimeUnit.SECONDS.sleep(1);

            System.out.println("Write 'here' word after you see welcome screen\nor type'absent'word for not attendance work");

            String inputAbstence=scanInput.nextLine().toLowerCase(Locale.ROOT);





        if(inputAbstence.equals("here")){


            System.out.println("welcome to our company");
           call.setAbsenteeism(true);


            System.out.println("You are late! Work starts at 09:00:00");
            date();
            here.write(employee1Id+" "+call.getAbsenteeism()+"\n");//writes employee name and attendance in txt file.

            here.close();

        }
        else  if(inputAbstence.equals("absent")){
            System.out.println("Employee did not attend to the job today...");
            call.setAbsenteeism(false);

            absent.write(employee1Id+" "+call.getAbsenteeism()+"\n");//writes employee name and attendance in txt file.
            absent.close();
        }
            }

        } catch (IOException e) {
            System.out.println("couldn't write on file..");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }



}
