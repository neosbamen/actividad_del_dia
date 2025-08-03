import service.WheaterService;

public class Main {
    public static void main(String[] args) {

        WheaterService wheaterService=new WheaterService();
        System.out.println(wheaterService.findWheater("new jersey"));
    }
}