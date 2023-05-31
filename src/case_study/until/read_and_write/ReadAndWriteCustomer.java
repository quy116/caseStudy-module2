package case_study.until.read_and_write;

import case_study.model.person.Customer;
import case_study.model.person.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    public void write(String Path, List<Customer> customerList) {
        File file = new File(Path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer c : customerList) {
                bufferedWriter.write(c.getInfoCsv());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Customer> read(String Path) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(Path);
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arr = line.split(",");
                Customer customer = new Customer(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }
}
