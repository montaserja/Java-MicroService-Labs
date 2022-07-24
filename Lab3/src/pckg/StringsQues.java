package pckg;

public class StringsQues {

	public int how_many_chars(char[] arr, char ch){
        int counter  =0;
        for(int i =0; i < arr.length ; ++i){
            if(arr[i] == ch)
                counter++;
        }

        return counter;
    }
	
	
	 public void printArray(char[] arr){
	       
	        for(int i = 0; i < arr.length-1 ; ++i){
	           System.out.print(arr[i]+", ");
	                
	        }
	        System.out.println(arr[arr.length-1]);
	    }
	 
	 
	 public char[] convert_toChar_arr(String str){
	        char[] arr = new char[str.length()];
	        
	        for(int i =0 ;i < str.length();++i){
	            arr[i] = str.charAt(i);
	        }
	        return arr;
	    }
}
