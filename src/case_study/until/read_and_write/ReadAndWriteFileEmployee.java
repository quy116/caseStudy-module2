package case_study.until.read_and_write;

import case_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileEmployee {
        public void write(List<Employee> employeeList, String Path){
            File file = new File(Path);
            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for (Employee e: employeeList) {
                    bufferedWriter.write(e.getInfoCsv());
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public List<Employee> read(String Path){
            List<Employee> employeeList = new ArrayList<>();
            File file = new File(Path);
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                    String[] arr = line.split(",");
                    Employee employee = new Employee(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8],Double.parseDouble(arr[9]) );
                    employeeList.add(employee);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return employeeList;
        }
}
