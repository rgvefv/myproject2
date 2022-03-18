public class SliverCustomer extends Customer{
    int backmoney;
    public SliverCustomer(String id,int amount) {
        super(id, amount);
        this.backmoney=100*(amount/1000);

    }
    @Override
    public void print(){
        int offmoney=(amount/1000)*100;
        System.out.print(id+"\t"+amount+"\t"+(amount-offmoney)+"("+backmoney+")");
    }
}
