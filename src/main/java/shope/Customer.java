package shope;

public class Customer {
    String id;
    int amount;
    //int offmoney=(amount/1000)*100;
    public Customer(){

    }
    public Customer(String id,int amount){
        this.id=id;
        this.amount=amount;
    }
    public void print(){
        int offmoney=(amount/1000)*100;
        System.out.print(id+"\t"+amount+"\t"+(amount-offmoney));
        System.out.println();
    }
}
