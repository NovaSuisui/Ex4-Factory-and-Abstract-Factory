public class MountainFactory implements IFactory {
    @Override
    public IMail createCustomerMail(){
        return new MountainMail();
    }
    @Override
    public IBrochure createCustomerBrochure(){
        return new MountainBrochure();
    }
}
