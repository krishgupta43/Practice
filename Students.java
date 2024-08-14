package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Students {
	private String  studentName;
	private List<Integer> marks;
	
	//Constructors
	public Students(String studentName,List<Integer>marks) {
		this.studentName=studentName;
		this.marks=marks;
	}
	
	// Method to calculate total score
    public int getTotalScore() {
        int totalScore = 0;
        for (Integer mark : marks) {
            totalScore += mark;
        }
        return totalScore;
    }
    
    public static void main(String[] args) {
		List<Students>st=Stream.of(new Students("Krishna",Arrays.asList(12,32));
	}

}
