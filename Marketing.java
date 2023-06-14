import java.util.Objects;

public class Marketing {

    private String employeename;
    private String productname;
    private double salesamount;

    public Marketing(String employeename, String productname, int salesamount) {
        this.employeename=employeename;
        this.productname=productname;
        this.salesamount=salesamount;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getProductname() {
        return productname;
    }

    public double getSalesamount() {
        return salesamount;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setSalesamount(double salesamount) {
        this.salesamount = salesamount;
    }

    @Override
    public String toString(){
        return "Employee name: "+ employeename
                + "Product name: " + productname
                + "Sales amount: " + salesamount;
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj)return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Marketing m = (Marketing) obj;
        return salesamount==m.salesamount
                && Objects.equals (employeename,m.employeename)
                && Objects.equals (productname, m.productname);
    }

    @Override
    public int hashCode(){
        return Objects.hash(employeename,productname,salesamount);
    }
}
