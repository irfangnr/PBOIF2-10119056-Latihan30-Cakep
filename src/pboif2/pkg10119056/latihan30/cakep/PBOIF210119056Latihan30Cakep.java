/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan30.cakep;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Cakep
 */
public class PBOIF210119056Latihan30Cakep {
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String PURPLE = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";

    public static void main(String[] args) {
    
    Scanner masukan=new Scanner(System.in);
    System.out.println(RED+"Kamu"+GREEN+" ngerjain sendiri"+YELLOW+" latihan 17 sampe"+BLUE+" latihan 30 in?");
    System.out.print(BLUE+"Jawab"+RED+"(Yoi/Enggak) : ");
    String jawab=masukan.next();
    
    if("Yoi".equals(jawab)){
        System.out.println("CAKEP");
    }else{
        System.out.println(RED+"Tetap cakep sih");
        System.out.println(RED+"Sing penting paham konsep nya yee");
        System.out.println("Keep the code works dude");
    }
    
    }
    
}
