public class Staff {
    private int id;
    private String name, sex, birthDay, address, taxcode, contractDay;
    public Staff(String name, String sex, String birthDay, String address, String taxcode, String contractDay){
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
        this.address = address;
        this.taxcode = taxcode;
        this.contractDay = contractDay;
    }
    public void setBirthday(String birthDay){
        this.birthDay = birthDay;
    }
    public void setContracday(String contractDay){
        this.contractDay = contractDay;
    }
    public String getBirthday(){
        return this.birthDay;
    }
    public String getContractday(){
        return this.contractDay;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        return String.format("%05d %s %s %s %s %s %s", id, name, sex, birthDay, address, taxcode, contractDay);
    }
}