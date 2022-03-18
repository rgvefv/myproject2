public class Customer {
    String id;
    int amount;
    int offmoney=100*(amount/1000);
    public Customer(){

    }
    public Customer(String id,int amount){
        this.id=id;
        this.amount=amount;
    }
    public void print(){

        System.out.print(id+"\t"+amount+"\t"+(amount-offmoney));
    }
}
