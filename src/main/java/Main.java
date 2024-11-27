import ru.netology.javaqa.javaqamvn.services.RestCalculateService;

public class Main {
    public static void main(String[] args) {
        RestCalculateService service = new RestCalculateService();
        System.out.println(service.calculate(100000,60000,150000));
    }
}
