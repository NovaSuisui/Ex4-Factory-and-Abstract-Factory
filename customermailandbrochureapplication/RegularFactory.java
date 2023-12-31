public class RegularFactory implements IFactory {
    @Override
    public IMail createCustomerMail(){
        return new RegularMail();
    }
    @Override
    public IBrochure createCustomerBrochure(){
        return new RegularBrochure();
    }
}
