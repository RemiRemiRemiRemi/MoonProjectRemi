//Remi-Laurent Guy, 9/15/25, Moon Project

class Moon {
    public static void main(String[] args) {
        
        //1. TRAVELING TO THE MOON WITH NO GRAVITY
        double distance = 380000;
        double rocketSpeed = 10; //kilometers per second
        double hoursToMoon = (distance/rocketSpeed)/3600; //3600 seconds in an hour
        System.out.println("It would take " + hoursToMoon + " hours to get to the moon");
        
        //2. TRAVELING TO THE MOON USING ORBITS
        int horrizontalSpeed = 2000;
        int verticalSpeed = 3000;
        double totalSpeedChange = Math.sqrt((horrizontalSpeed * horrizontalSpeed) + (verticalSpeed * verticalSpeed));
        System.out.println("The total speed change necessary to reach the correct orbit is " + totalSpeedChange + " meters per second");
        
        //3. WATER  ON THE MOON
        double radius = 1731000;
        double surfaceArea = 4 * 3.14 * (radius * radius);
        double surfaceVolume = surfaceArea * 0.001;
        System.out.println("The surface volume of the entire Moon 1mm thick is: " + surfaceVolume + " cubic meters");
        double surfaceMass = (surfaceVolume * 3000)/1000;
        System.out.println("The mass of this layer on the lunar surface is " + surfaceMass + " metric tons");
        double surfaceWater = surfaceMass * 0.25;
        System.out.println(surfaceWater + " liters of water could be recovered from this 1mm thick layer");
        
        
    }
}


