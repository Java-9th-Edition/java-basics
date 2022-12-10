class GalToLitTable {
    public static void main(String[] args) {
        double gallons, litres;
        int counter;
        counter = 0;
        for (gallons = 1; gallons <= 50; gallons++){
            litres = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + litres + " litres");

            counter++;
            // every 10th line print a blank line

            if (counter == 10){
                System.out.println();
                counter = 0;  // reset counter to 0
            }
        }
    }
}