import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPower {
    public static void main(String[] args){
        List<Account> accounts= Arrays.asList(
                new Account("Kofi",6000),
                new Account("Ama",2000),
                new Account("Ekow",8000),
                new Account("Abena",1500)
        );

        List<String> wealthyUsers=accounts
                .stream()
                .filter(acc->acc.getBalance()>5000)
                .map(Account::getOwner)
                .sorted()
                .toList();

        System.out.println("Wealthy customers are :" + wealthyUsers);
    }
}
