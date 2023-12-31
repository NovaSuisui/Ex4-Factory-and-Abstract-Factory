public class CustomerMailFactory {
    public static Customer createCustomer(String customeType){
        switch (customeType) {
            case "Regular":
                return new RegularCustomer();
            case "Mountain":
                return new MountainCustomer();
            case "Delinquent":
                return new DelinquentCustomer();
        }
        return null;
    }
}
