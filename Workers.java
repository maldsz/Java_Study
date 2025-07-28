import java.util.List;
import java.util.ArrayList;

public class Workers{

    private static int workerId;
    private String name;
    private String cpf;
    private String companyName;
    private double salary;
    private static List<Workers> workersList = new ArrayList<>();

    public Workers(String name, String cpf, String companyName, double salary){
        workerId++;
        this.name = name;
        this.cpf = cpf;
        this.companyName = companyName;
        this.salary = salary;
        workersList.add(this);
    }

    public String toString(){
        return "Name: " + name + "Cpf: " + cpf + "Company: " + companyName + "Salary: " + salary;  
    }

    public int getWorkerId(){
        return workerId;
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

    public record RecordWorkers(int workerId, String name) {
        //
    }
}