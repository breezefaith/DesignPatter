/**
 * 
 */
package creating.builder.example;

/**
 * @author breezefaith
 *
 */
public class FordBuilder implements CarBuilder {
	Car ford=new Ford();
	/* （非 Javadoc）
	 * @see builder.example.CarBuilder#buildPart1(java.lang.String)
	 */
	@Override
	public void buildPart1(String part1) {
		// TODO 自动生成的方法存根
		ford.setPart1(part1);
	}

	/* （非 Javadoc）
	 * @see builder.example.CarBuilder#buildPart2(java.lang.String)
	 */
	@Override
	public void buildPart2(String part2) {
		// TODO 自动生成的方法存根
		ford.setPart2(part2);
	}

	/* （非 Javadoc）
	 * @see builder.example.CarBuilder#buildCar()
	 */
	@Override
	public Car buildCar() {
		// TODO 自动生成的方法存根
		return ford;
	}

}
