package TASK;

public class Star_A {
	public static void main(String[] args) {
		String s1="ManojKumar";
		String s2="";
		char ch[]=s1.toCharArray();
		int count1=0;
		for(int i=0;i<=ch.length-1;i++) {
				int count=0;
				
				for(int j=0;j<i;j++) {
					if(ch[i]==ch[j]) {
						
					count++;
					}
				}
				/*
				 * if(ch[i]=='a') { //s2=s2+ch[i]; System.out.println("*"); }
				 */
					/*
					 * else { s2=s2+ch[i]; System.out.println(s2); }
					 */
					
					 if(count==1) { 
						 s2=s2+ch[i]; 
						 count1++; }
					 
					 s2=s2+ch[i];
		
		}
		/*
		 * if(ch[i]=='a') { System.out.println("*"); }
		 */
		
		/*if(ch[i]=='a') {
			System.out.println("*");
		}
		
		else {*/
				System.out.println(s2);
				//if(s2[i]=='a') {
		
				
		//}		
	 
}}
//}
