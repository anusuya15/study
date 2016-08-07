
public class Arr {
	public static void main(String[] args) {
		

			

			    int [][] twodArray = new int[][]{{2,3,4},{4,5,6},{5,4,3}};
			      

			        for (int i = 0; i < twodArray.length; i++){
			        for (int j = 0; j < twodArray[i].length; j++){
			            
			        }
			    }

			    System.out.println("2 - The 2D array: ");
			    for (int i = 0; i < twodArray.length; i++){
			        for (int j = 0; j < twodArray[i].length; j++){
			            System.out.print(twodArray[i][j] + " ");
			        }
			        System.out.println("");
			    }
			    int maxValue = 1;
			    System.out.println("\nMax values in 2D array: ");
			    for (int i = 0; i < twodArray.length; i++) {
			        for (int j = 0; j < twodArray.length; j++)
			        if (twodArray[i][j] > maxValue) {
			        maxValue = twodArray[i][j];
			        }
			            System.out.println(maxValue);
			        }



			}

			

	}


