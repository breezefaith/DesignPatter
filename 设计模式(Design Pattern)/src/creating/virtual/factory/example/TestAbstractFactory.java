package creating.virtual.factory.example;

public class TestAbstractFactory {

	public static void main(String[] args) {
		PowderFactory factory=new PowderFactoryA();
		Gun gun=factory.createGun();
		System.out.println(gun.getClass().getName());
		Bullet bullet=factory.createBullet();
		System.out.println(bullet.getClass().getName());

		factory=new PowderFactoryB();
		GunB gunB=(GunB) factory.createGun();
		System.out.println(gunB.getClass().getName());
	}

}
