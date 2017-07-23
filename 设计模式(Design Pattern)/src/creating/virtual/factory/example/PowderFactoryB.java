/**
 * 
 */
package creating.virtual.factory.example;

/**
 * @author breezefaith
 *
 */
public class PowderFactoryB implements PowderFactory {

	/* （非 Javadoc）
	 * @see virtual.factory.example.PowderFactory#createGun()
	 */
	@Override
	public Gun createGun() {
		return new GunB();
	}

	/* （非 Javadoc）
	 * @see virtual.factory.example.PowderFactory#createBullet()
	 */
	@Override
	public Bullet createBullet() {
		return new BulletB();
	}

}
