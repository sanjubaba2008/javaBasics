package mitAssignments;

public class InheritanceDemo {
	
	//static int [] testScores = {20,60};
	
	
	
	public  char calculate(int [] testScores){
        int n = testScores.length;
        int total = 0;
        int average = 0;
        char c = 'a';
        for(int i = 0; i< n; i++){
            total = total + testScores[i];
        }
        average = total/n;
        
        if(average >= 90 && average <= 100)
            c = 'O';

        
        else if(average >= 80 && average < 90)
            c = 'E';

        
        else if(average >= 70 && average < 80)
            c = 'A';

        
        else if(average >= 55 && average < 70)
            c = 'P';

        
        else if(average >= 40 && average < 55)
            c = 'D';

        
        else if (average < 40)
            c = 'T';
        
        return c;
		
        
    }
	

}
