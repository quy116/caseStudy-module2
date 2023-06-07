package case_study.model;

public class Contract {
    private String numberContract;
    private String codeBooking;
    private double advanceAmount;
    private double totalPaymentAmount;

    public Contract() {
    }

    public Contract(String numberContract, String codeBooking, double advanceAmount, double totalPaymentAmount) {
        this.numberContract = numberContract;
        this.codeBooking = codeBooking;
        this.advanceAmount = advanceAmount;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getAdvanceAmount() {
        return advanceAmount;
    }

    public void setAdvanceAmount(double advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract='" + numberContract + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", advanceAmount=" + advanceAmount +
                ", totalPaymentAmount=" + totalPaymentAmount +
                '}';
    }
}
