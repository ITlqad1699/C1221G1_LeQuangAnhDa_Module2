package case_study.furama_resort_maneger.util;

import case_study.furama_resort_maneger.models.person.Employee;

import java.io.File;
import java.io.*;
import java.util.List;

public class ReaderAndWriter {
    private static final String  EMPLOYEES_FILE = "D:\\codegym\\module2_codegym\\src\\case_study\\furama_resort_maneger\\data\\employee_data\\employee.csv";
    private static void writeListStringToCSV(String filePath, List<String> stringList, boolean append){
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList){
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //write target file: employees into file.csv:
    public static void writeListCustomerToCSV(List<Employee> employeeList, boolean append){
        // chuyển đổi employeeList => stringList;
        List<String> stringList = new ArrayList<>();
        for (Employee employee: employeeList ) {
            stringList.add(employee.getInfoToCSV());
        }
        // gọi phương thức dùng chung để ghi file
        writeListStringToCSV(EMPLOYEES_FILE,stringList,append);
    }
    // đọc ra một danh sách Customer
    public static List<Employee> readCustomerListFromCSV(){
        List<Employee> employeeList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(EMPLOYEES_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            Employee employee = new Employee(Integer.parseInt(arr[0]),arr[1],arr[2]);
            employeeList.add(customer);
        }
        return employeeList;
    }

}
