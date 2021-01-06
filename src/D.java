import java.io.*;
import java.lang.String;
public class D {

    public static void main(String[] args) {
        File sorceFile=new File("sourceFile");
        File targetFile = new File("targetFile");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            FileReader fileReader = new FileReader(sorceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            fileWriter = new FileWriter(targetFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            while ((line=bufferedReader.readLine())!=null){
                bufferedWriter.write(line +"\n");
            }


        }catch (IOException e){
            System.out.println(e);
        }finally {
            try {
                bufferedWriter.close();
                System.out.println(targetFile.length());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
