public class Lesson07_3 {
    public static void main(String[] args){
        Sphere sph = new Sphere();
        sph.radius = Double.parseDouble(args[0]);
        sph.printVolume();
        sph.printSurface();
    }
}