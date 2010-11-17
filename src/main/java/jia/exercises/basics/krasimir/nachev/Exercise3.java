package jia.exercises.basics.krasimir.nachev;
/**
 * Created by IntelliJ IDEA.
 * User: krasi
 * Date: Nov 17, 2010
 * Time: 2:40:03 PM
 * To change this template use File | Settings | File Templates.
 */
// Veroqtno dosta grozno i bugavo :)

class Rational {

   private double firstNumerator;
   private double firstDenominator;
   private double secondNumerator;
   private double secondDenominator;
   public Rational(double firstNumerator, double firstDenominator, double secondNumerator, double secondDenominator ) {

       this.firstNumerator = firstNumerator;
       this.firstDenominator = firstDenominator;
       this.secondNumerator = secondNumerator;
       this.secondDenominator = secondDenominator;



   }
   public Rational(double firstNumerator, double secondNumerator ) {
       this.firstNumerator = firstNumerator;
       this.firstDenominator = 1;
       this.secondNumerator = secondNumerator;
       this.secondDenominator = 1;

   }

   public Rational(double firstNumerator, double firstDenominator, double secondNumerator ) {
       this.firstNumerator = firstNumerator;
       this.firstDenominator = firstDenominator;
       this.secondNumerator = secondNumerator;
       this.secondDenominator = 1;

   }




   public void printRational() {
       System.out.println("First Rational:" + firstNumerator + "/" + firstDenominator + " " + "Second Rational:" + secondNumerator + "/" + secondDenominator );
   }
  public double plusRational() {

      return  ( firstNumerator / firstDenominator) + (secondNumerator / secondDenominator);

  }

 public double minuxRational() {
      return  ( firstNumerator / firstDenominator) - (secondNumerator / secondDenominator);
  }
  public double multiplicationRational() {
      return  ( firstNumerator / firstDenominator) * (secondNumerator / secondDenominator);
  }
  public double  divisionRational() {
         if(firstDenominator == 0 || secondDenominator == 0  ) {
           System.out.println("Denominator can't be 0  ");

       }
      return  ( firstNumerator / firstDenominator) / (secondNumerator / secondDenominator);
  }
        }


   class Exercise3 {
      public static void main(String args[]){
       Rational GetRational = new Rational(100,1,200,444.44);
       Rational GetInt = new Rational(100,110,2);
       GetRational.printRational();
       System.out.printf("Result Plus: %.2f Result Minus: %.2f Result Multiplication: %.2f, Result Division: %.2f %n",GetRational.plusRational(),GetRational.minuxRational(),GetRational.multiplicationRational(),GetRational.divisionRational());
       GetInt.printRational();
       System.out.printf("Result Plus: %.2f Result Minus: %.2f Result Multiplication: %.2f, Result Division: %.2f %n",GetInt.plusRational(),GetInt.minuxRational(),GetInt.multiplicationRational(),GetInt.divisionRational());

     }
   }
