
public class MelSort {

	
	public static void sort(int [] list) {


		for (int j = 0; j < list.length; ++j) {

			for (int i= j+1; i < list.length; ++i)	{

				if(list[i] < list[j] ) {


					int tmp = list[j];

					list[j] = list[i];

					list[i] = tmp; 

				}
			}

		}

	}
	        
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] mylist = {7,3,5,1,4,2,8,9,6,10,13,12,20,22,25};
		
		sort(mylist);
		
		for (int i = 0; i < mylist.length; i++) {
			
			System.out.print(mylist[i] + " ");
			 		
		}
		
	
	}

}
