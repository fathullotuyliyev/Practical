package trainSchedule;

import java.util.ArrayList;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 22/02/2023.
 */
// Poyezdlar Jadvali
public class TrainSchedule {

    private ArrayList<Train> trains;

    public TrainSchedule() {
        this.trains = new ArrayList<>();
    }

    public void addTrain(Train train) {
        this.trains.add(train);
    }

    public ArrayList<Train> getTrains() {
        return this.trains;
    }

    public static void main(String[] args) {
        //  namunaviy poezdlarni yaratish
        Train train1 = new Train("Business Class", "A001", "Tashkent", "Navoiy");
        Train train2 = new Train("Local", "B002", "Ziyovuddin", "Tashkent");
        Train train3 = new Train("Business Class", "C003", "Navoiy", "Tashkent");

        // poezdlar jadvalini tuzish va unga poyezdlarni qo'shish
        TrainSchedule schedule = new TrainSchedule();
        schedule.addTrain(train1);
        schedule.addTrain(train2);
        schedule.addTrain(train3);

        // poyezdlar jadvalini chop etish
        for (Train train : schedule.getTrains()) {
            System.out.println(train.toString());
        }
    }
}

class Train {
    private String type;//tipi -- biznes klass/lyuks /uzoq masofalik/kupe
    private String number;//vagon raqami
    private String departure;//ketish joyi,manzili
    private String destination;//borish joyi

    public Train(String type, String number, String departure, String destination) {
        this.type = type;
        this.number = number;
        this.departure = departure;
        this.destination = destination;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Poyezd " + number + ": " + type + " from " + departure + " to " + destination;
    }
}
