package ro.ctrln.classes;

public class PlanetUsage {
    public static void main(String[] args) {
        Planet mercury = new Planet();
        System.out.println(mercury.getPlanetName());
        System.out.println(mercury.getNumberOfMoons());
        System.out.println(mercury.getNumberOfOceans());
        System.out.println(mercury.getMass());

        mercury.setPlanetName("Mercur");
        mercury.setNumberOfMoons((short) 3);
        mercury.setNumberOfOceans(5);
        mercury.setMass(100d);

        System.out.println(mercury.getPlanetName());
        System.out.println(mercury.getNumberOfMoons());
        System.out.println(mercury.getNumberOfOceans());
        System.out.println(mercury.getMass());

        System.out.println(mercury);

        Planet venus = new Planet("Venus", 5, 5_000_000d, (short) 6);
        System.out.println(venus);

        System.out.println("Mercury hascode: " + mercury.hashCode());
        System.out.println("Venus hascode: " + venus.hashCode());

        System.out.println("mercury.equals(venus) " + mercury.equals(venus));

//        mercury.setPlanetName(venus.getPlanetName());
//        mercury.setMass(venus.getMass());
//        mercury.setNumberOfOceans(venus.getNumberOfOceans());
//        mercury.setNumberOfMoons(venus.getNumberOfMoons());

        System.out.println("mercury.equals(venus) " + mercury.equals(venus));






    }
}
