public class Ejer_53 extends Bse {
    public static void main(String[] args) {
        String numRom="";
        String numRomtemp="";
        int numAra=0;
        screen.println("Ingrese un numero romano en I(1) y MMMCMXCIX (3999)");
        numRom= keyboard.nextLine().trim().toUpperCase();
        numRomtemp=numRom;
        if (numRomtemp.startsWith("MMM")) {
            numAra +=3000;
            numRomtemp=numRomtemp.substring(3);            
        }
        else if (numRomtemp.startsWith("MM")) {
            numAra +=2000;
            numRomtemp=numRomtemp.substring(2);
        }
        else if(numRomtemp.startsWith("M")){
            numAra +=1000;
            numRomtemp=numRomtemp.substring(1);
        }
        if (numRomtemp.startsWith("CM")){
            numAra +=900;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("DCCC")) {
            numAra +=800;
            numRomtemp=numRomtemp.substring(4);
        }
        if(numRomtemp.startsWith("DCC")){
            numAra +=700;
            numRomtemp=numRomtemp.substring(3);
        }
        else if (numRomtemp.startsWith("DC")){
            numAra +=700;
            numRomtemp=numRomtemp.substring(2);
        }
        if (numRomtemp.startsWith("D")) {
            numAra +=500;
            numRomtemp=numRomtemp.substring(1);
        }
        else if (numRomtemp.startsWith("CD")) {
            numAra +=400;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("CCC")) {
            numAra +=300;
            numRomtemp=numRomtemp.substring(3);
        }
        else if (numRomtemp.startsWith("CC")) {
            numAra +=200;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("C")){
            numAra +=100;
            numRomtemp=numRomtemp.substring(1);
        }
        if (numRomtemp.startsWith("XC")) {
            numAra +=90;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("LXXX")) {
            numAra +=80;
            numRomtemp=numRomtemp.substring(4);
        }
        else if (numRomtemp.startsWith("LXX")) {
            numAra +=70;
            numRomtemp=numRomtemp.substring(3);
        }
        else if (numRomtemp.startsWith("LX")) {
            numAra +=60;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("L")) {
            numAra +=50;
            numRomtemp=numRomtemp.substring(1);
        }
        else if (numRomtemp.startsWith("XL")) {
            numAra +=40;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("XXX")) {
            numAra +=30;
            numRomtemp=numRomtemp.substring(3);
        }
        else if (numRomtemp.startsWith("XX")) {
            numAra +=20;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("X")) {
            numAra +=10;
            numRomtemp=numRomtemp.substring(1);
        }
        
        if (numRomtemp.startsWith("IX")) {
            numAra +=9;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("VIII")) {
            numAra +=8;
            numRomtemp=numRomtemp.substring(4);;
        }
        else if (numRomtemp.startsWith("VII")) {
            numAra +=7;
            numRomtemp=numRomtemp.substring(3);
        }
        else if (numRomtemp.startsWith("VI")) {
            numAra +=6;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("V")) {
            numAra +=5;
            numRomtemp=numRomtemp.substring(1);;
        }
        else if (numRomtemp.startsWith("IV")) {
            numRomtemp +=4;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("III")) {
            numRomtemp +=3;
            numRomtemp=numRomtemp.substring(3);
        }
        else if (numRomtemp.startsWith("II")) {
            numRomtemp +=2;
            numRomtemp=numRomtemp.substring(2);
        }
        else if (numRomtemp.startsWith("I")) {
            numAra +=1;
            numRomtemp=numRomtemp.substring(1);
        }
        


screen.println("El numero romano en arabico es: " + numAra);
    }   
}
    

