import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchMail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> mails = new ArrayList<>();
		
		mails.add("abhishekghute@gmail.com");
		mails.add("ajay@gmail.com");
		mails.add("omshankar@gmail.com");
		mails.add("abhi.ghute@gmail.com");
		mails.add("ram123@gmail.com");
		mails.add("bheema98raju@gmail.com");
		mails.add("ravindra12.patil@gmail.com");
		
		System.out.println(mails);
		System.out.println();
		
		System.out.println("Enter Mail Id to search from above list (saerch is case insensetive)");
		
		String mailToSearch = sc.nextLine();
		
		int result = search(mails, mailToSearch);
		
		if(result==-1)
			System.out.println("Specified emailId is not present inside the List");
		else 
			System.out.println("Specified email is presnt in the list at index :"+result);
	}
	
	static int search(List<String> mails,String mailToSearch) {
		
		int index = mails.indexOf(mailToSearch.toLowerCase());
		
		return index;
		
	}
}
