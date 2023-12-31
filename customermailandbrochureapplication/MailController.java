public class MailController {
    private IMail customerMail;
	
	public void setMail(IMail customerMail) {
		this.customerMail = customerMail;
	}
	
	public void createMail() {
		customerMail.createMail();
	}
}
