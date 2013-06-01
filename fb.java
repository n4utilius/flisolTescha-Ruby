public class fb{

  public void fizzbuzz(int n){
    for (int i = 1; i <= n; i++){
  		String result = "";
      String numc=Integer.toString(i);
      if(numc.contains("3")||i % 3 == 0 ){
        result += "Fizz";}
      if(numc.contains("5")||i % 5 == 0){ 
        result += "Buzz";}
     
  		System.out.println( (result == "") ? Integer.toString(i) : result );
    }
	}

	public static void main(String args[]){    
    fb my_fb = new fb();
    my_fb.fizzbuzz(100);
	}
}