
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setB(int n){

		System.out.println(" �Թ��͹ "+n+" ⺹�� "+(bonusCalculator.computeBonus(n)));
	}
}