
public class Program {

	public static void main(String[] args) {

		/*CreditManager creditmanager = new CreditManager();
		creditmanager.Calculate();
		creditmanager.Save();

		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "Ordu";

		CustmerManager custmermanager = new CustmerManager(customer);
		custmermanager.Save();
		custmermanager.Delete();

		Company company = new Company();
		company.TaxNumber = "100000";
		company.companyName = "arçelik";
		company.id = 100;

		CustmerManager custmermanager2 = new CustmerManager(new Person());

		Person person = new Person();
		person.firstName = person.nationalIdentity = "12345";

		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();*/

		// SONAR QUBE
		//IoC Container
		CustmerManager custmermanager = new CustmerManager(new Customer(), new TeachercreditManager());
		custmermanager.GiveCredit();

	}

}
