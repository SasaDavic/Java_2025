package p05_09_2022_zadatak1;

public class StudentOsnovnih extends Student{

	public StudentOsnovnih(String punoIme, int brIndexa, int godStudija) {
		super(punoIme, brIndexa, godStudija);
	}

	@Override
	public double cenaSkolarine() {
		return 90000;
	}

	@Override
	public boolean naBudzetu() {
		if (super.godStudija < 5) {
			return true;
		}
		return false;
	}
	
}
