package homework.lab9.ex1_1;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }
    public Rent getLongestRent(){
        int maxDuration = rents[0].getEnd().getDay() - rents[0].getBegin().getDay();
        Rent max = rents[0];
        for (Rent rent : rents){
            if(rent.getEnd().getDay() - rent.getBegin().getDay() > maxDuration){
                max = rent;
                maxDuration = rent.getEnd().getDay() - rent.getBegin().getDay();
            }
        }
        return max;
    }
}
