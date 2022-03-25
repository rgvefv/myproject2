import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Ticket ticket=new Ticket(Ticket.TAIPEI_STATION,Ticket.KAOHSTUNG_STATION);
        Scanner scanner=new Scanner(System.in);
        int startStation=Integer.parseInt(scanner.next());
    }
}
