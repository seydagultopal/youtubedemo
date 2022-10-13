//katmanlı mimariler
public class CustmerManager {
	private Customer _customer;
	public ICreditManager _creditmanager;

	public CustmerManager(Customer customer, ICreditManager creditmanager) {
		_customer = customer;
		_creditmanager = creditmanager;
	}

	public void Save() {

		System.out.println("müşteri kaydedildi: ");
	}

	public void Delete() {

		System.out.println("müşteri silindi : ");
	}

	public void GiveCredit() {
		_creditmanager.Calculate();
		System.out.println("kredi verildi.");

	}

}
