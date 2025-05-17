public class Sphere{
    double radius;
    
    //add here
    void printVolume(){
	System.out.println("球の体積 V:"+(4*Math.PI*this.radius*this.radius*this.radius)/3);
    }
     void printSurface(){
	 System.out.println("球の表面積 S:"+(4*Math.PI*this.radius*this.radius));
    }
}
