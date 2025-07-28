import java.util.HashMap;
import java.util.Map;

public class Worker{

    private int countId;
    private static int workerId;
    private String name;
    private String cpf;
    private String companyName;
    private double salary;
    private static Map<Integer, String> workersIdNameList = new HashMap<>();

    public Worker(String name, String cpf, String companyName, double salary){
        workerId = ++ countId;
        this.name = name;
        this.cpf = cpf;
        this.companyName = companyName;
        this.salary = salary;
        workersIdNameList.put(workerId, this.name);
    }

    public String toString(){
        return "Name: " + name + "Cpf: " + cpf + "Company: " + companyName + "Salary: " + salary;  
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String getCompanyName(){
        return this.companyName;
    }
    
    public double getSalary(){
        return this.salary;
    }

    public boolean isWorkerInList(int id){
        return workersIdNameList.containsKey(id);
        
    }

    public Map<Integer, String> getWorkerFromId(int id){
        Map<Integer, String> worker = new HashMap<>();
        String workerName;
        if(isWorkerInList(id)){
            workerName = workersIdNameList.get(id);
            worker.put(id, workerName);
        }
        return worker;
    }

}