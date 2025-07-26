import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
        StreamsStudy workers = new StreamsStudy();
        
        workers.addWorkerInList("Albert Einsten");
        workers.addWorkerInList("Isaac Newton");
        workers.addWorkerInList("Cristiano Ronaldo");
        workers.addWorkerInList("Robert Lewandowski");
        workers.addWorkerInList("Adama Traore");
        workers.addWorkerInList("Adeyemi");

        List<String> workersCopy = workers.getWorkers();

        workers.printWorkersInList(workersCopy);
        workers.printWorkersStartingWithLetter(workersCopy, "A");
        
    }

}