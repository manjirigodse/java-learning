package accessmodifier.movable;


public class Bmw extends Car{

    public void setChassisNumber(int chessiNumber, int chassiSeq)  {
        this.chassiNumber = chessiNumber;
    }

    public int getChessisNumber() {
        return this.chassiNumber;
    }
}
