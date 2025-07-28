public class Workers{

    private static int workerId;
    private String name;
    private String cpf;
    private String companyName;
    private double salary;

    public Workers(int workerId, String name, String cpf, String companyName, double salary){
        workerId++;
        this.name = name;
        this.cpf = cpf;
        this.companyName = companyName;
        this.salary = salary;
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