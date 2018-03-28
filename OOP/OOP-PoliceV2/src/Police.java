public class Police {

    private Name name;
    private int badgeNumber;
    private boolean goodCop;

    public Police(Name name, int badgeNumber, boolean goodCop) {
        setName(name);
        setBadgeNumber(badgeNumber);
        setGoodCop(goodCop);
    }


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public boolean isGoodCop() {
        return goodCop;
    }

    public void setGoodCop(boolean goodCop) {
        this.goodCop = goodCop;
    }

    //    toString
    public String toString() {
        String result;

        result = name.toString() + "\n";


        result += "Badge Number: " + badgeNumber + "\n";
        if(goodCop){
            result += "Is a good cop.\n";
        }else {
            result += "Is a bad cop.\n";
        }
        result += "———————————————————————————————————————————————";

        return result;
    }


}// end of police
