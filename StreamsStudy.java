import java.util.stream.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class StreamsStudy {

    private static List<String> workersList = new ArrayList<>();

    private void printWorkersInList(List<String> workers){
        for(int i = 0; i < workers.size(); i++){
            System.out.println(workers.get(i).toString());
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

    private void printWorkersStartingWithLetter(List<String> workers, String letter){
        List<String> worksStartsWithA = workers;
        worksStartsWithA.stream()
        .filter(w -> w.startsWith(letter))
        .forEach(System.out::println);
    }

    private List<String> getWorkers(){
        return workersList;
    }

    private Set<String> getWorkersWithoutRepetition(List<String> workers){
        Set<String> uniqueWorkers = new HashSet<>(workers);
        return uniqueWorkers;
    }

    public static void main(String[] args) {
        StreamsStudy workers = new StreamsStudy();
        
        workers.addWorkerInList("Albert Einsten");
        workers.addWorkerInList("Isaac Newton");
        workers.addWorkerInList("Robert Lewandowski");
        workers.addWorkerInList("Cristiano Ronaldo");
        workers.addWorkerInList("Cristiano Ronaldo");
        workers.addWorkerInList("Robert Lewandowski");
        workers.addWorkerInList("Adama Traore");
        workers.addWorkerInList("Adeyemi");
        workers.addWorkerInList("Lionel Messi");

        List<String> workersCopy = workers.getWorkers();

        // workers.printWorkersInList(workersCopy);
        // workers.printWorkersStartingWithLetter(workersCopy, "A");
        System.out.println(workers.getWorkersWithoutRepetition(workersCopy));

    }

}