public class App {
    public static void main(String[] args) throws Exception {
       
        int ika = 100;

             if (ika > 39 && ika < 51 ) {

             System.out.println("Parasta keski-ikää.");
                
            }

            else if (ika == 65 ) {

                System.out.println("Hyviä eläkepäiviä.");
            }

            if (ika >= 58) {

                System.out.println("Voit mennä varhaiseläkkeelle.");
            }

             if (ika == 100) {

                System.out.println("onnea");
                System.out.println("onnea");
                System.out.println("onnea");
            }
            //Tasa iät
            if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60 || ika == 70 || ika == 80 || ika == 90 || ika == 100 ) {

            System.out.println("Onnea tasavuosikymmenistä");
            }

             if (ika == 18) {

            System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa");
            }

            if (ika > 0 && ika < 18) { 
                System.out.println("Olet alaikäinen");
                if (ika >= 15) {

                    System.out.println("Saat ajaa mopoa");
                }
                 if (ika >= 16) {

                    System.out.println("Saat ajaa kevaria");
                }
            }
            else if (ika >= 65) {
                System.out.println("Olet eläkeläinen");
            }
            else {
                System.out.println("Olet aikuinen");
            }    
    }
}
