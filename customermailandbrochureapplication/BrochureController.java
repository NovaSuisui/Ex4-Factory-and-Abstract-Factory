public class BrochureController {
    private IBrochure customerBrochure;
	
	public void setBrochure(IBrochure customerBrochure) {
		this.customerBrochure = customerBrochure;
	}
	
	public void createBrochure() {
		customerBrochure.createBrochure();
	}
}
