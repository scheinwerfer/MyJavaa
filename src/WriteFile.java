import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("C:\\Users\\Владислав\\Desktop\\tam.txt");
            BufferedWriter buffer = new BufferedWriter(file);

            buffer.write("Hello World!");
            buffer.newLine();
            buffer.write("Salamalekum");
            buffer.close();
            }
        catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
    }
}
