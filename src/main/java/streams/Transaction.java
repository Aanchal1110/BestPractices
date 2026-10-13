package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Transaction {
    String name;
    int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Transaction(String name) {
        this.name = name;
    }

    public Transaction(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public static void sumOfSameTransactions(List<Transaction> list){
        Map<String, Integer> collect = list.stream().collect(Collectors.groupingBy(trs -> trs.getName(), Collectors.summingInt(trs -> trs.getAmount())));
        collect.forEach((key,value)->{
            System.out.println("Transaction type: "+key+" Total amount: "+value);
        });
    }

    public static void main(String[] args) {
        List<Transaction> transactions=new ArrayList<>(Arrays.asList(
                new Transaction("Food",5000),
                new Transaction("Food", 100),
                new Transaction("Food", 200),
                new Transaction("Food", 150),
                new Transaction("Shopping", 300),
                new Transaction("Shopping", 250),
                new Transaction("Shopping", 100),
                new Transaction("Utilities", 400),
                new Transaction("Utilities", 300),
                new Transaction("Entertainment", 500),
                new Transaction("Entertainment", 200),
                new Transaction("Travel", 700),
                new Transaction("Travel", 300)
        ));
        sumOfSameTransactions(transactions);
    }

}
