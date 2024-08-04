package HomeWorkDSTLUjava;

import javax.lang.model.type.ArrayType;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Locale;
import java.util.Random;

public class client {
    private static final int serverPort = 5555;
    private static final String localhost = "127.0.0.1";

    public static void main(String[] args) {
        Socket socket = null;
        try {
            try {
                System.out.println("Добро пожаловать на клиентскую сторону\n>> Подключение к серверу" );
                InetAddress ipAddress = InetAddress.getByName(localhost);
                socket = new Socket(ipAddress, serverPort);
                System.out.println(">> Соединение установлено");

                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader keyboard = new BufferedReader(isr);

                String line;

                while (true){
                    System.out.print("Хотите получить цитату дня? (Yes/No) ");
                    line = keyboard.readLine();
                    out.writeUTF(line);
                    out.flush();
                    line = in.readUTF();

                    if(line.endsWith("No") || line.endsWith("no")){
                        System.out.println("Спасибо за использование ресурса!");
                        break;
                    } else {
                        if (line.endsWith("Yes") || line.endsWith("yes")){
                            Random random = new Random();
                            int numberRandom = random.nextInt(5);
                            String[] arrayString = new String[5];
                            arrayString[0] = "Пробивайся к успеху шаг за шагом.";
                            arrayString[1] = "Будь мягок, но не покорен. Будь твёрд, но не жесток.";
                            arrayString[2] = "Жизнь сбивает нас с ног, но мы можем выбирать, вставать или нет.";
                            arrayString[3] = "Не бойся провала. Бойся того, что не попытался.";
                            arrayString[4] = "Успех не является конечной точкой. Успех — это непрерывный процесс.";
                            System.out.println("\nСервер отправил мне эту цитату:\n\t" + arrayString[numberRandom]);
                            System.out.println();
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Исключение: " + e);
            }
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}