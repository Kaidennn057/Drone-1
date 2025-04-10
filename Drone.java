class Drone {
    
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    void terbang() {
        if (energi > 10) {  
            energi--;
            ketinggian++;
            System.out.println("Drone Terbang");
        } else {
            System.out.println("Energi lemah: Drone tidak bisa terbang");
        }
    }
    
    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");    
        }else{
            System.out.println("Mesin bisa dimatikan karena sudah mendarat");
        }
    }
    
    void turun(){
        ketinggian--;
        energi--;
        System.out.println("Drone Turun");
    }
    
    void belok(){
        energi--;
        System.out.println("Drone Belok");
    }
    
    void maju(){
        energi--;
        System.out.println("Drone maju Ke Depan");
        kecepatan++;
    }
    
    void mundur(){
        energi--;
        System.out.println("Drone Mundur ke belakang");
        kecepatan++;

     void aceng(){
        energi--;
        System.out.println("Drone Mundur ke belakang");
        kecepatan++;
    }   
}
