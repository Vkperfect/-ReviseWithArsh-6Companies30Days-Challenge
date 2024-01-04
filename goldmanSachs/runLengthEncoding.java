class GfG
 {
	String encode(String str)
	{
          int n=str.length();
          StringBuilder result=new StringBuilder();
          int i=0;
          while(i<n){
              int count=1;
              while(i+1<n && str.charAt(i)==str.charAt(i+1)){
                  i++;
                  count++;
              }
              result.append(str.charAt(i)).append(count);
              i++;
          }
          return result.toString();
	}
	
 }
