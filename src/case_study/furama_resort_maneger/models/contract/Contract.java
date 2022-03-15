package case_study.furama_resort_maneger.models.contract;

public class Contract {
    private int contractID;
    private int bookingID;
    private double deposit;
    private int totalPayment;
    private int customerID;

    public Contract() {
    }

    public Contract(int contractID, int bookingID, double deposit, int totalPayment, int customerID) {
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customerID = customerID;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractID=" + contractID +
                ", bookingID=" + bookingID +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                ", customerID=" + customerID +
                '}';
    }
}
