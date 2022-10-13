
public class TeachercreditManager implements BaseCreditManager,ICreditManager
{

	@Override
	public override void Calculate() {
		// hesaplamalar var
		System.out.println("Öğreymen kredisi hesaplandı.");

	}

	@Override
	public override void Save() {
		base.Save();
		
	}
	/*
	public override void Save() {
		base.Save();
	}
	*/

	

}
