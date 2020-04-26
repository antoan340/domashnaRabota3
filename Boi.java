import sun.security.mscapi.CPublicKey;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Boi {
    public static void main(String[] args) {
        orientaciq();//2.1
    }
    public static void Navigaciq() {

        System.out.println("Kakvo ima pred vas stena/stol/nishto");
        Scanner neshto = new Scanner(System.in);
        String predmet = neshto.nextLine();
        switch (predmet) {
            case "stol":

                System.out.println("Jump");
                break;
            case "stena":
                System.out.println("Go sideways");
                break;
            case "nishto":
                System.out.println("Foward");
                break;
            default:
                System.out.println("napishete duma");
        }
    }
    public static void orientaciq(){

        int pikseli,hit =0;
        String produljenie;
        do {
            Navigaciq();
            pikseli = ThreadLocalRandom.current().nextInt(0, 10);
            if (pikseli % 2 == 0) {
                System.out.println(" Bounty Eliminate Splinter");
                System.out.println("kolko udara e napravil do momenta");
                nivoBateriq(hit);
                if (hit < 4) {
                    int udar = ThreadLocalRandom.current().nextInt(0, 10);
                    if (udar == 5) {
                        System.out.println("Cant hit ");
                    } else {
                        System.out.println("RIP splinter");
                        talk();
                        hit++;
                        bateryChek(hit);

                    }
                } else System.out.println("Splinter ne e otkrit qvno se e skril");

            } else {
                System.out.println("Nqma tok");
                shtepsel();
            }
            Scanner duma = new Scanner(System.in);
            System.out.println("Da produlja li da tursq da/ne");
            produljenie = duma.nextLine();

        }while (pikseli%2!=0|| hit<4 || produljenie == "da");
    }
    public static void nivoBateriq(int shibai ){

        switch (shibai) {
            case 0: {
                System.out.println("bateriqta e napulno zaredena moje da shiba");

                break;
            }
            case 1: {
                System.out.println("V bateriqta ima oshte zarqd moje da shiba 3/4");
                break;
            }
            case 2: {
                System.out.println("V bateriqta ima oshte zarqd moje da shiba 2/4");
                break;
            }
            case 3: {
                System.out.println("V bateriqta ima oshte zarqd moje da shiba 1/4");
                break;
            }
            default: {
                System.out.println("ne moje da udrq poveche");
                break;
            }
        }
    }
    public static void bateryChek(int level){
        switch (level) {
            case 0: {
                System.out.println("ima bateriq 4/4");
                break;
            }
            case 1: {
                System.out.println("ima bateriq 3/4");
                break;
            }
            case 2: {
                System.out.println("ima bateriq 2/4");
                break;
            }
            case 3: {
                System.out.println("ima bateriq 1/4 ");
                break;
            }
            default: {
                System.out.println("nujno e zarejdane");
                shtepsel();
                break;
            }
        }
    }
    public static void shtepsel() {

        int zarqdi1;
        int zarqdi2;
        do {
            zarqdi1 = ThreadLocalRandom.current().nextInt(0, 1000);
            zarqdi2 = ThreadLocalRandom.current().nextInt(0, 1000);
            if (zarqdi1 > zarqdi2) {
                System.out.println("ima tok durpai sine");
            }
            else if(zarqdi1==zarqdi2){
                System.out.println("povtoren opit");
            }
            else System.out.println("RIP tok potursi drug");
        }while (zarqdi1==zarqdi2);
    }
    public static void talk(){
        int count = 10;
        while(count>0){
            if(count%2==0){
                System.out.println("I am a Robottttt "+ count);
            }
            count--;
        }
    }
    }
// Здравейте ако тука ще обясня задачата ако случайно нещо не ми разбирате
// Методите са подредени по начина в който са дадени в заданието
// Navigaciq() - първо условие
// orientaciq() + nivoBateriq() - второ условие като проверката дали мебелите ще са здрави е в ориентацията
// bateryChek() - трето
// shtepsel()- четвърто
// talk()- пето
// програмата може да продължи докато батрията на робота се изтожти или собственика му не му даде команда да спре
