/**
 * 
 */
package creating.builder.example;
/**
 * @author breezefaith
 *
 */
public class CarDirector {
	CarBuilder builder=null;
	public Benz buildBenz() {
		builder=new BenzBuilder();
		builder.buildPart1("benz part1");
		builder.buildPart2("benz part2");
		return (Benz) builder.buildCar();
	}
	public Ford buildFord() {
		builder=new FordBuilder();
		builder.buildPart2("ford part2");
		return (Ford) builder.buildCar();
	}
}
