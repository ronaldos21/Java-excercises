
public class RangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {1,2,3,4,5,6,7,8,9,10};

		int Startrange = 3;
		int Endrange = 7;

		for(int i = 0; i < numbers.length; ++i) {

			if (!(numbers[i] > Startrange && numbers[i] < Endrange )){
				System.out.print(numbers[i] + " ");
			}	

		}

	}

}
