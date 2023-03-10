package main.randomQuestions;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Test
{
	public static void main(String[] args){
		String s="xyz abc mnp \"abc xyz\" and \"abc axy\"";
		
//		Scanner s1 = new Scanner(System.in);
//		s1.hasNextLine();
		
		String[] arr=s.split(" ");
		String ans="";
		boolean flag=false;
		List<String> list=new ArrayList<>();
		for(String st:arr){
			if(st.startsWith("\"") && !flag){
				ans=ans+st+" ";
				flag=true;
			}
			else{
				if(flag){
					if(st.endsWith("\"")){
						flag=false;
						ans = ans+st;
						list.add(ans);
						ans="";
					} 
					else {
						
						ans=ans+st+" ";
					}

					
					
				}
				else{
					list.add(st);
					}
				
				
				
			}
		}
		
		
		System.out.println(list);
	}
}
					
				