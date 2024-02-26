class VolumeCalculator
{
public DoubleCalculateVolume(Double radius,Double height)
  {
          return Math.PI* radius* radius*Height;
  }

   
    public double calculateVolume(double length,Double width,Double height)
    {
        return Length*width*height;
    }

} 
public class PracticalNo3
{
   public static main(string[] args)
{
   VolumeCalculator calculator=new VolumeCalculator();

   
        double cubeVolume = calculator.calculateVolume(5.0);
        System.out.println("Volume of Cube width side 5.0 units:"  cubeVolume);

       
        double cylinderVolume = calculator.calculateVolume(3.0, 5.0);
        System.out.println("Volume of Cylinder with radius 3.0 units and height 5.0 units: " + cylinderVolume);

        
        double boxVolume = calculator.calculateVolume(4.0, 6.0, 2.0);
        System.out.println("Volume of Box with length 4.0 units, width 6.0 units, and height 2.0 units: " + boxVolume);
    }
}
