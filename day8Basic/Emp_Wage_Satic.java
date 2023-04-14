package day8Basic;

public class Emp_Wage_Satic {

	static final int PART_TIME = 1;
	static final int FULL_TIME = 2;
	static final int EMP_RATE_PER_HRS = 20;
	static final int NUMBER_OF_WORKINF_DAYS = 2;
	static final int MAX_HRS_MONTH = 20;
	static int empHrs = 0;
	static int empWage = 0;
	static int totalEmpHrs = 0;
	static int totalWorkingDays = 0;

	static int empCheck = (int) (Math.floor(Math.random() * 10 % 3));

	public static void main(String[] args) {
		employeeWage();
	}

	public static void employeeWage() {

		while (totalEmpHrs <= MAX_HRS_MONTH && totalWorkingDays < NUMBER_OF_WORKINF_DAYS) {
			totalWorkingDays++;

			switch (empCheck) {

			case PART_TIME:
				empHrs = 4;
				break;
			case FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;

			System.out.println("Day" + totalWorkingDays + "Emp Hr " + empHrs);
		}
		System.out.println("Total Emp Wage" + " " + totalEmpHrs);

	}
}
