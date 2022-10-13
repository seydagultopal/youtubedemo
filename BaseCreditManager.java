
public abstract class BaseCreditManager implements ICreditManager {

	@Override
	public abstract void Calculate();

	@Override
	public virtural void Save() {
		System.out.println("kaydedildi");

	}

}
