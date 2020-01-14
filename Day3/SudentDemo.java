
public class SudentDemo {
	
	
	String name ;
	int studentID ;
	char gender;
	String school;
	double SubjectTamil ;
	double SubjectEnglish ;
	double total;
	double percentage;
	
	
	
	
	public void showTotalMark() 
	{
		
		total =SubjectTamil + SubjectEnglish;
		System.out.println("total mark is " + total);
		
	}
	
	
	public double getTotalPercentage () {
		
		percentage = ((SubjectTamil + SubjectEnglish)/2);
		
		return percentage;
		
	}
	
	
	
	/*getTotalPercentage;
	getGrade;*/
	
	
	

}
