
public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		SudentDemo S1 =new SudentDemo();
		S1.name="Anto";
		S1.studentID=001;
		S1.gender='M';
		S1.school="Carmel";
		S1.SubjectEnglish=95;
		S1.SubjectTamil=98;
		S1.showTotalMark();

System.out.println("percentage is  " +S1.getTotalPercentage());
System.out.println("Name of the Student " + S1.name);
System.out.println("ID of the Student " + S1.studentID);
System.out.println("gender of the Student " + S1.gender);
System.out.println("school of the Student " + S1.school);
System.out.println("SubjectEnglish of the Student " + S1.SubjectEnglish);
System.out.println("SubjectTamil of the Student " + S1.SubjectTamil);
		

/*
SudentDemo S2 =new SudentDemo();
S2.name="Babu";
S2.studentID=002;
S2.gender='M';
S2.school="Carmel";
S2.SubjectEnglish=50;
S2.SubjectTamil=50;
S2.getTotalMark();

System.out.println("Name of the Student " + S2.name);
System.out.println("ID of the Student " + S2.studentID);
System.out.println("gender of the Student " + S2.gender);
System.out.println("school of the Student " + S2.school);
System.out.println("SubjectEnglish of the Student " + S2.SubjectEnglish);
System.out.println("SubjectTamil of the Student " + S2.SubjectTamil);
*/
	}

}
