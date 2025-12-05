package entities;

public class OutsourcedEmployee extends Employee
{
    private Double additionalCharge;

    public OutsourcedEmployee(){}
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge)
    {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() { return additionalCharge; }
    public void setAdditionalCharge(Double additionalCharge) { this.additionalCharge = additionalCharge; }

    @Override
    public Double payment()
    {
        double employeePayment = super.payment();
        return employeePayment + (1.10 * additionalCharge);
    }

}