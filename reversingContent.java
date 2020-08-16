import java.io.*;
import java.util.ArrayList;

public class reversingContent {
    public static void main(String[] args) {

        FileReader fileReader;
        BufferedReader bufferedReader;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        PrintWriter printWriter;

        ArrayList<String> arrayList = new ArrayList<>();

        try {

            fileReader = new FileReader("source.txt");
            bufferedReader = new BufferedReader(fileReader);


            while (bufferedReader.read() != -1) {
                arrayList.add(bufferedReader.readLine());
            }
            System.out.println(arrayList);

            fileWriter = new FileWriter("destination.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);

            for (String s : arrayList) {
                char[] chars = s.toCharArray();
                //System.out.println(chars.length);
                for (int j = chars.length; j > 0; j--) {
                    System.out.println(chars[j-1]);
                    printWriter.append(chars[j-1]);

                }
                printWriter.flush();

            }

            fileReader.close();
            fileWriter.close();
            bufferedReader.close();
            bufferedWriter.close();
            printWriter.close();







        }

         catch (IOException e) {

            e.printStackTrace();
        }
    }
    }
