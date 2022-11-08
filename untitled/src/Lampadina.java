public class Lampadina {
    Interruttore stato = Interruttore.OFF;


    public void accendi(){
        if(stato == Interruttore.OFF){
            stato = Interruttore.ON;
        }

    }

    public void spegni(){
        if(stato == Interruttore.ON){
            stato = Interruttore.OFF;
        }
    }

}


