public class Customer {
    private String idCustomer;
    private String nameCustomer, sex, DOB, address;
    static int idx = 1;
    
    public Customer(String name, String sex, String DOB, String address){
        this.idCustomer = String.format("KH%03d", idx);
        idx++;
        this.nameCustomer = name;
        this.sex = sex;
        this.DOB = DOB;
        this.address = address;
    }
    
    public String getIdCus(){
        return this.idCustomer;
    }
    
    public String getName(){
        return this.nameCustomer;
    }
    
    public String getAddress(){
        return this.address;
    }
}
