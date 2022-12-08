import java.util.ArrayList;

public class GradeBook
{
   private double[] scores;
   private int scoresSize;

   public GradeBook(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   public double minimum()
   {
      if (scoresSize == 0) return 0;
      double smallest = scores[0];
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < smallest)
         {
            smallest = scores[i];
         }
      }
      return smallest;
   }

   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
   
   public int getScoreSize() {
	   return scoresSize;
   }
   
   public String toString() {
	   
	   String answer = "";
	   for(int i = 0; i < scoresSize; i++) {
		   answer += scores[i] + " ";
	   }
	   
	   return answer;
   }
}