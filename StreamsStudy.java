import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

public class StreamsStudy {

    private String name;
    private static List<String> workersList = new ArrayList<>();

    @Override
    public String toString(){
        return name;
    }

    private void PrintWorkersInList(ArrayList workers){
        for(int i = 0; i < workers.size(); i++){
            System.out.println(workers.toString());
        }
    }

    private void addWorkerInList(String worker){
        if(!isWorkerInList(worker)){
            workersList.add(worker);
        }
    }

    private boolean isWorkerInList(String worker){
        for(String w : workersList){
            if(worker.equalsIgnoreCase(w)){
                return true;
            }
        }
        return false;
    }

    private List getWorkers(){
        return workersList;
    }

    public static void main(String[] args) {
        StreamsStudy workers = new StreamsStudy();
        
        workers.addWorkerInList("Albert Einsten");
        workers.addWorkerInList("Isaac Newton");
        workers.addWorkerInList("Cristiano Ronaldo");
        workers.addWorkerInList("Robert Lewandowski");
        workers.addWorkerInList("Adama Traore");
        workers.addWorkerInList("Adeyemi");

        List<String> workersCopy = new ArrayList<>();
        workersCopy = workers.getWorkers();
        
        List<String> worksStartsWithA = workersCopy;
        worksStartsWithA.stream().filter(w -> w.startsWith("A")).map(String::toUpperCase)
        .forEach(System.out::println);
    }

}