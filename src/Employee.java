
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setB(int n){

		System.out.println(" เงินเดือน "+n+" โบนัส "+(bonusCalculator.computeBonus(n)));
	}
}