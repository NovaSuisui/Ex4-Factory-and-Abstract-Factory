public class MainFactory {
    public static IFactory createFactory(String customeType){
        switch (customeType) {
            case "Regular":
                return new RegularFactory();
            case "Mountain":
                return new MountainFactory();
            case "Delinquent":
                return new DelinquentFactory();
        }
        return null;
    }
}
