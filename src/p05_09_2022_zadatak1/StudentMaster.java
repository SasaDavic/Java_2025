package p05_09_2022_zadatak1;

public class StudentMaster extends Student{

	public StudentMaster(String punoIme, int brIndexa, int godStudija) {
		super(punoIme, brIndexa, godStudija);
	}
	
	@Override
	public double cenaSkolarine() {
		return 100000;
	}
	
	@Override
	public boolean naBudzetu() {
		if (super.godStudija < 2) {
			return true;
		}
		return false;
	}
	
}
