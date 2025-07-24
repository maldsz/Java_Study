import java.util.ArrayList;

public class ArrayListStudy {

    private ArrayList<String> workersList = new ArrayList<>();
    
    private void addWorkerInList(String worker){
        if(!isWorkerInList(worker)){
            workersList.add(worker);
        }
    }

    private boolean isWorkerInList(String worker){
        for(String w : workersList){
            if(worker.equalsIgnoreCase(w)){
                return false;
            }
        }
        return true;
    }

    private String getWorkerByIndex(int index){
        return workersList.get(index);
    }

    public static void main(String[] args){

    }

}