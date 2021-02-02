package banc.gb.compte;

import java.io.*;

public class Bank {
    private Account[] clients = {new Account(150, 100, "Maria", "pass"),
                new Account(150, 100, "Toto", "123")};

    public Bank() {

    }
    public Bank(String fileName) throws IOException {
        initilizeClients(fileName);
    }

    public void initilizeClients(String fileName) throws IOException {
        File fileObject = new File(fileName);
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileObject);
            ois = new ObjectInputStream(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fis!=null){
                fis.close();
            }
            if(ois!=null){
                ois.close();
            }
        }
    }

    public Account getAccount(String identifiant, String code) {
        for(Account account: clients){
            if(account.getIdentifiantClient().equals(identifiant) && account.getCode().equals(code)){
                return account;
            }
        }
        return null;
    }

    public Account createAccount() {
        return null;
    }

    public void saveData() {
        File fileObject = new File("clients");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileObject))){
            int x = 5;
            oos.writeObject(clients);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
