import java.util.*;

class ArrayList{
	public int a[] = new int[5];
	int i = 0;
	public void insert(int num){

		if(i == a.length-1){

			int temp[] = new int[a.length];
			temp = a.clone();
			a = new int[i+1];
			a[i+1] = num;
			i++;
		} 		
		else {

			a[i] = num;
			i++;
		}
	}
	public void delete(){
			
		int temp[] = new int[a.length];
		temp = a.clone();
		a = new int[temp.length-1];
		for(int i = 0;i<temp.length;++i){

			a[i] = temp[i];
		}
	}
	public void print(){

		for(int i = 0;i<a.length;++i){

			System.out.println(a[i]);
		}
	}
}
public class Manipulation{

	public static void main(String[] args){
		
		ArrayList list = new ArrayList();
		while(true){
	
			System.out.println("If you want insert press 'Y' Otherwise you delete press 'N'");
			char c = new Scanner(System.in).next().charAt(0);
			if(c == 'Y'||c == 'y'){

				int num = new Scanner(System.in).nextInt();
				list.insert(num);
				list.print();
			}
			else if (c == 'N' || c == 'n'){

				list.delete();
				list.print();
			}
			else {
	
				System.out.println("wrong input");
				break;
			}
		}
	}
}