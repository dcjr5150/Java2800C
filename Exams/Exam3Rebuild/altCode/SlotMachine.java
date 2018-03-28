import javax.swing.*;

public class SlotMachine extends Player {

    private int counter;

    private double costPerPlay;

    private String slotMachineName;
    private double slotMachineBalance;

    private int slotMachineJackpotOdds;
    private int slotMachineJackpotCounter;
    private double slotMachineJackpotSize;

    private int slotMachineRegularCounter;
    private int slotMachineRegularOdds;
    private double slotMachineRegularSize;


    public SlotMachine(String slotMachineName, double costPerPlay, double slotMachineBalance, int slotMachineJackpotOdds, int slotMachineJackpotCounter, double slotMachineJackpotSize, int slotMachineRegularCounter, int slotMachineRegularOdds, double slotMachineRegularSize) {
        setSlotMachineName(slotMachineName);
        setCostPerPlay(costPerPlay);
        setSlotMachineBalance(slotMachineBalance);
        setSlotMachineJackpotOdds(slotMachineJackpotOdds);
        setSlotMachineJackpotCounter(slotMachineJackpotCounter);
        setSlotMachineJackpotSize(slotMachineJackpotSize);
        setSlotMachineRegularCounter(slotMachineRegularCounter);
        setSlotMachineRegularOdds(slotMachineRegularOdds);
        setSlotMachineRegularSize(slotMachineRegularSize);

    }

    public static double addFunds() {

        double funds = validateInputDouble("Amount to add");
        return funds;
    }

    public static SlotMachine makeSlotMachine() {

        int tempSlotMachineJackpotCounter = 0;
        int tempSlotMachineRegularCounter = 0;
        int tempSlotMachineJackpotOdds;
        int tempSlotMachineRegularOdds;

        String tempSlotMachineName;

        double costPerPlay;
        double tempSlotMachineBalance;
        double tempSlotMachineJackpotSize;
        double tempSlotMachineRegularSize;


        tempSlotMachineName = JOptionPane.showInputDialog("Machine Name");
        costPerPlay = validateInputDouble("Cost Per Play");
        tempSlotMachineBalance = validateInputDouble("Current Balance");
        tempSlotMachineJackpotOdds = validateInputInt("Jackpot Odds");
        tempSlotMachineJackpotSize = validateInputDouble("Jackpot Size");
        tempSlotMachineRegularOdds = validateInputInt("Regular Odds");
        tempSlotMachineRegularSize = validateInputDouble("Regular Win Size");


        SlotMachine slotMachine = new SlotMachine(tempSlotMachineName, costPerPlay, tempSlotMachineBalance, tempSlotMachineJackpotOdds, tempSlotMachineJackpotCounter, tempSlotMachineJackpotSize, tempSlotMachineRegularCounter, tempSlotMachineRegularOdds, tempSlotMachineRegularSize);

        return slotMachine;
    }

    public static int validateInputInt(String message) {
        int result = -1;
        boolean inputAccepted = false;
        while (!inputAccepted) {
            try {
                int input = Integer.parseInt(JOptionPane.showInputDialog(message));

                if (input <= 0 || input > Integer.MAX_VALUE) {

                } else {

                    result = input;
                    inputAccepted = true;

                }
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Please enter only a number", "Insane Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        return result;
    }

    public static double validateInputDouble(String message) {
        double result = -1.0;
        boolean inputAccepted = false;
        while (!inputAccepted) {
            try {
                double input = Double.parseDouble(JOptionPane.showInputDialog(message));

                if (input <= 0 || input > Double.MAX_VALUE) {

                } else {

                    result = input;
                    inputAccepted = true;
                }
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Please enter only a number", "Inane error", JOptionPane.ERROR_MESSAGE);
            }
        }

        return result;


    }


    public String getSlotMachineName() {
        return slotMachineName;
    }

    public void setSlotMachineName(String slotMachineName) {
        this.slotMachineName = slotMachineName;
    }

    public double getSlotMachineBalance() {
        return slotMachineBalance;
    }

    public void setSlotMachineBalance(double slotMachineBalance) {
        this.slotMachineBalance = slotMachineBalance;
    }

    public int getSlotMachineJackpotOdds() {
        return slotMachineJackpotOdds;
    }

    public void setSlotMachineJackpotOdds(int slotMachineJackpotOdds) {
        this.slotMachineJackpotOdds = slotMachineJackpotOdds;
    }

    public int getSlotMachineJackpotCounter() {
        return slotMachineJackpotCounter;
    }

    public void setSlotMachineJackpotCounter(int slotMachineJackpotCounter) {
        this.slotMachineJackpotCounter = slotMachineJackpotCounter;
    }

    public double getSlotMachineJackpotSize() {
        return slotMachineJackpotSize;
    }

    public void setSlotMachineJackpotSize(double slotMachineJackpotSize) {
        this.slotMachineJackpotSize = slotMachineJackpotSize;
    }

    public int getSlotMachineRegularCounter() {
        return slotMachineRegularCounter;
    }

    public void setSlotMachineRegularCounter(int slotMachineRegularCounter) {
        this.slotMachineRegularCounter = slotMachineRegularCounter;
    }

    public int getSlotMachineRegularOdds() {
        return slotMachineRegularOdds;
    }

    public void setSlotMachineRegularOdds(int slotMachineRegularOdds) {
        this.slotMachineRegularOdds = slotMachineRegularOdds;
    }

    public double getSlotMachineRegularSize() {
        return slotMachineRegularSize;
    }

    public void setSlotMachineRegularSize(double slotMachineRegularSize) {
        this.slotMachineRegularSize = slotMachineRegularSize;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public double getCostPerPlay() {
        return costPerPlay;
    }

    public void setCostPerPlay(double costPerPlay) {
        this.costPerPlay = costPerPlay;
    }


    public void assignPlayer() {

        setSlotMachineBalance(0.0);

        setSlotMachineBalance(getMoneyBal());

    }

    public void unassignPlayer() {

        setMoneyBal(getSlotMachineBalance());

        setSlotMachineBalance(0.0);

    }


    public void play() {

        if (slotMachineBalance > costPerPlay) {

            counter++;
            slotMachineBalance -= costPerPlay;
            if (checkForRegularWin()) {
                slotMachineBalance += slotMachineRegularSize;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error: Insufficient funds", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }

    private boolean checkForRegularWin() {

        boolean result = false;
        int math = 0;

        math = counter % slotMachineRegularOdds;

        if (math == 0) {
            result = true;
        } else {
            result = false;
        }


        return result;
    }


}
