package prak6;
import bintangfilm.kelas;
    class Player {
        public String name;
        public int exp;
        private int health;

        Player (String name, int exp, int health){
            this.name = name;
            this.exp = exp;
            this.health = health;
        }
        void display (){
            tambahExp();
            System.out.println("\nname\t : " + this.name);
            System.out.println("exp\t : " + this.exp);
            System.out.println("health\t : " + this.health);

        }
        public void ubahName (String namaBaru){
            this.name = namaBaru;

        }
        private void tambahExp(){
            this.exp += 100;
        }


        public static void main(String[]args){
            Player pemain = new Player("kirito",0, 100);

            System.out.println(pemain.name);
            pemain.name = "maou";
            System.out.println(pemain.name);
            
            System.out.println(pemain.exp);
            pemain.exp = 200;
            System.out.println(pemain.exp);

            System.out.println(pemain.health);
            pemain.health = 200;
            System.out.println(pemain.health);

            pemain.display();

            pemain.ubahName("shigatsu no yanto");
            pemain.display();

            pemain.tambahExp();
        }
    }
