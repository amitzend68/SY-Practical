import java.io.FileWriter;

public class WriteFile{
    public static void main(String[] args) {
        
        try{
            FileWriter fw = new FileWriter("Abc.txt");
            fw.write("Hello , this is an example of file writer");
            fw.close();

            System.out.println("Written Successfully");
        }catch (Exception e){
            System.out.println(e);
        }        }
    }
