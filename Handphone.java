class Handphone {
	public void menyala() {
		System.out.println("Handphone bisa menyala");
	}
	public void menelfon() {
		System.out.println("Handphone bisa menelfon");
		
	}	
}

class SamsungGalaxy extends Handphone {
	@Override
	public void menyala(){
		System.out.println("SamsungGalaxy6 bisa menyala");
		super.menyala();
	}
	public void chat(){
		System.out.println("SamsungGalaxy6 bisa chat");
		super.chat();
}
