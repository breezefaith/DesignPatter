/**
 * 
 */
package creating.builder.example;

/**
 * @author breezefaith
 *
 */
public abstract class Car {
	private String part1;
	private String part2;
	public String getPart1() {
		return part1;
	}
	public void setPart1(String part1) {
		this.part1 = part1;
	}
	public String getPart2() {
		return part2;
	}
	public void setPart2(String part2) {
		this.part2 = part2;
	}
	void run(){
		System.out.println(this.getClass().getName()+" is running!");
		System.out.println("Part1:"+getPart1());
		System.out.println("Part2:"+getPart2());
		System.out.println("");
	}
}
