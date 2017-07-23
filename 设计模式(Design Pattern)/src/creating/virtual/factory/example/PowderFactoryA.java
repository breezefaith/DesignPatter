/**
 * 
 */
package creating.virtual.factory.example;

/**
 * @author breezefaith
 *
 */
public class PowderFactoryA implements PowderFactory {

	@Override
	public Gun createGun() {
		return new GunA();
	}

	@Override
	public Bullet createBullet() {
		return new BulletA();
	}
	
}
