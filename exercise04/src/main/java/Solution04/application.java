/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Eric Moore
 */
package Solution04;
/*
    This program requests a noun, verb, adjective, and adverb from the user.
    The program then takes those inputs and prints out a silly sentence.
 */

import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();

        System.out.print("Enter a verb: ");
        String verb = in.nextLine();

        System.out.print("Enter an adjective: ");
        String adj = in.nextLine();

        System.out.print("Enter an adverb: ");
        String adv = in.nextLine();

        System.out.print(" Do you " + verb + " your " + adj + noun + adv + "? That's Hilarious!");

    }
}
