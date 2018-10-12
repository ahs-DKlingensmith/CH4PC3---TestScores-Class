
/*
 * TestScores class
 */

public class TestScores {
    
    //Establish attributes
    private int score1;
    private int score2;
    private int score3;
    private double average;
    
    private char letterGrade;
    
    /**
     * The TestScores constructor accepts arguments for the
     * score1, score2, and score3 fields
     */
    public TestScores(int s1, int s2, int s3)   {
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }
    
    /**
     * The getScore1 method returns the value stored in the 
     * score1 field
     */
    public int getScore1()  {
        return score1;
    }
    
    /**
     * The getScore2 method returns the value stored in the 
     * score2 field
     */
    public int getScore2()  {
        return score2;
    }
    
    /**
     * The getScore3 method returns the value stored in the
     * score3 field
     */
    public int getScore3()  {
        return score3;
    }
    
    /**
     * The getAverage method calculates the average of the 
     * three test scores and returns the value
     */
    public double getAverage()  {
        average = (score1 + score2 + score3)/3;
        return average;
    }
    
    public char getLetterGrade()    {
        if (average >= 90)  {
            letterGrade = 'A';
        } else if (average >= 80)   {
            letterGrade = 'B';
        } else if (average >= 70)   {
            letterGrade = 'C';
        } else if (average >= 60)   {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        
        return letterGrade;
    }
}
