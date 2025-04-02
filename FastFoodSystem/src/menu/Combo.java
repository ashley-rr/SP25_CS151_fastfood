package menu;

public class Combo extends MenuItem{

  private static final int MAX_COMBOS = 100;
  private static int objectCount = 0;

  public Combo() {
    super.setPrice(Math.round((new Burger().getPrice() + new Fry().getPrice() + new Milkshake().getPrice())) - 1.5);
    super.setVegetarian(false);
    if(objectCount >= MAX_COMBOS) {
            throw new IllegalStateException("Max # of combos is 100. Creation failed.");
        }
		objectCount++;
  }
  
  @Override
	public String getName() {
		return "Combo";
	}
	@Override
	public double getPrice() {
		return (new Burger().getPrice() + new Fry().getPrice() + new Milkshake().getPrice() - 1.5);
	}
	@Override
	public String toString() {
		return super.toString() +"\nName: " +getName();

	}
}
