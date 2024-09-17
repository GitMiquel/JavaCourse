package chapter6;

public class PhoneBill {

    private double id;
    private double allowance;
    private double cost;
    private double overage;
    private double tax;
    private double total;


    public PhoneBill(){
        id = 0;
        allowance = 0;
        cost = 0;
        overage = 0;
        tax = 0;
        total = 0;

        System.out.println("Phone Bill Statement\n" + "Id: " + id + "\n" +
                "Allowance: " + allowance + "\n" + "Cost: " + cost + "\n" +
                "Overage: " + overage + "\n" + "Tax: " + tax + "\n" + "Total: " + total);
    }

    public PhoneBill(double id, double allowance, double cost, double overage, double tax, double total){
        setId(id);
        setAllowance(allowance);
        setCost(cost);
        setOverage(overage);
        setTax(tax);
        setTotal(total);
    }
    
    public double getId(){
        return id;
    }

    public void setId(double id){
        this.id = id;
    }
    
    
    public void setAllowance(double allowance){
        this.allowance = allowance;
    }

    public double getAllowance(){
        if (this.id == 1){
            allowance = 60;
        } else if (this.id== 2){
            allowance = 90;
        } else if (this.id == 3){
            allowance = 120;
        } else {
            allowance = -1;
        }
        return allowance;
    }


    public void setCost(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return switch ((int) this.id) {
            case 1 -> cost = 42.5;
            case 2 -> cost = 57.5;
            case 3 -> cost = 72.5;
            default -> -1;
        };
    }


    public void setOverage(double overage){
        this.overage = overage * 0.25;
    }

    public double getOverage(){
        return this.overage * 0.25;
    }


    public void setTax(double tax){
        this.tax = tax;
    }

    public double getTax(){
        return (this.cost + this.overage) * 0.2;
    }


    public void setTotal(double total){
        this.total = total;
    }

    public double getTotal(){
        return  this.cost + this.overage + this.tax;
    }

   /* public String billCalculator(){
        Return "Phone Bill Statement\n" + "Id: " + id + "\n" +
                "Allowance: " + allowance + "\n" + "Cost: " + cost + "\n" +
                "Overage: " + overage + "\n" + "Tax: " + tax + "\n" + "Total: " + total);

    }

*/
}
