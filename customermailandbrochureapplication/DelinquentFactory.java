public class DelinquentFactory implements IFactory {
    @Override
    public IMail createCustomerMail(){
        return new DelinquentMail();
    }
    @Override
    public IBrochure createCustomerBrochure(){
        return new DelinquentBrochure();
    }
}
