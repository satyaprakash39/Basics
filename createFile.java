import java.io.*;

public class createFile{
    public static void main(String[] args)
            //throws Exception
    {
        System.out.println("File handeling in java");
//        File file=new File("learn.txt");
//        //create
//        file.createNewFile();
//        //exitance
//        System.out.println(file.exists());
//        //writing
//        FileWriter fw=new FileWriter(file);
//        fw.write("Hi i am a learner");
//        fw.close();
//        //reading
//        FileReader fr= new FileReader(file);
//        System.out.println(fr.read());
        try {
            //write from file
            FileWriter fw=new FileWriter("learn.txt");
            BufferedWriter bw = new BufferedWriter (fw);
            bw.write("hi i am a learner");
            bw.close();


            // read from file
            FileReader fr= new FileReader("learn.txt");
            BufferedReader bf = new BufferedReader(fr);
            System.out.println(fr.read());
            System.out.println(bf.readLine());

        } catch (IOException e) {
            System.err.println("Read error: " + e.getMessage());
        }



    }
}