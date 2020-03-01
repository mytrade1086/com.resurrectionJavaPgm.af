package Programs;

public class StringArraysorting {

	public static void main(String[] args) {


		   String[] names = {"Zamit", "sumit", "posco"};
		    int c = names.length;
		    for (int i = 0; i < c-1 ; i++) 
		    {
		        for (int j = 0; j < c-i-1 ; j++) 
		        {
		        /* For ascending order */
		          if (names[j].compareTo(names[j+1])>0) 
		          {
		            String temp   = names[j];
		            names[j]   = names[j+1];
		            names[j+1] = temp;
		          }
		        }
		    }
		    for (int i = 0; i < c ; i++) 
		    System.out.println(names[i]);

	}

}
