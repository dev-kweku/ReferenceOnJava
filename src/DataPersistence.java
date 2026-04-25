import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class DataPersistence {
    public static void saveAccounts(HashMap<Integer,Account> account){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("bank_data.txt"))){
            for(Integer id:account.keySet()){
                Account acc=account.get(id);

                writer.write(id + acc.getOwner() +","+ acc.getBalance());
                writer.newLine();
            }

            System.out.println("Data successfully saved to bank_data.txt");

        }catch(IOException e){
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}
