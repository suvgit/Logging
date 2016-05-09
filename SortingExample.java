public class SortingExample {
	
	public static void main() {
		
		int array[] = {12, 5, 34, 8, 89, 56, 23};
		for (int i = 0; i<array.length; i++) {
	        for (int j = 0; j < array.length; j++){
	        	
	            /* add your bubble sort code here  */ 
	            if (array[i] < array[j]) {	            	
	                int buffer = array[i];
	                array[i] = array[j];
	                array[j] = buffer; 	                
	            }
	            
	        }	       
	    }
		for(int j = 0; j<array.length; j++) {
			System.out.println(array[j]);
		}	
	}
}
