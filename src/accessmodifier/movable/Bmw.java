package accessmodifier.movable;


public class Bmw extends Car{

    public void setChassisNumber(int chassiNumber, int chassiSeq)  {
        this.chassiNumber = chassiNumber;
    }

    public int getChessisNumber() {
        return this.chassiNumber;
    }

}
