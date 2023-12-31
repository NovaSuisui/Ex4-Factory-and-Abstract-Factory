import java.util.Scanner;

public class Client {
    private MailController mc;
    private BrochureController bc;
    public Client(IFactory factory) {
        mc = new MailController();
        mc.setMail(factory.createCustomerMail());
        bc = new BrochureController();
        bc.setBrochure(factory.createCustomerBrochure());
    }
    public static String getCustomerTypeFromUser() {
        String customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
        }
        inp.close();
        return customerType;
    }
    public void generateMsg() {
        mc.createMail();
        bc.createBrochure();
    }
    
    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        IFactory factory = MainFactory.createFactory(customerType);

        Client app = new Client(factory);
        app.generateMsg();        
    }
}
