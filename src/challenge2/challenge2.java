package challenge2;

public class challenge2 {

	public challenge2() {}
		public static boolean contains(int[] arr, int item) {

			 for (int n : arr) {

		         if (item == n) {

		            return true;

		         }

		      }

		      return false;

		   }

		   public static void main(String[] args) {

		      int[] myArray = {1,2,3,4,6,7,8,9,10};

		     for (int i = 1; i<myArray.length; i++) {

		     System.out.println(i + ";" + contains(myArray, i));

		     }

		     }

	
	}


	


