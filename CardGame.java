package lesson_3.task4;

import java.util.Random;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {

        final int cardsForPlayer = 6; //Переменая
        int players = 0; //Переменая

        final Scanner sc = new Scanner(System.in); //Создания екземпляр scanner
        final Random random = new Random(); //Создания екземпляр random

        final String[] suits = {"clubs", "diamonds", "hearts", "spades"}; //Масив
        final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; //Масив

        final int numberOfCards = suits.length * rank.length; // резултат умножения 2х массивов

        System.out.println("Enter the number of players: ");
        players = Check (sc,players,cardsForPlayer,numberOfCards);

        // Создоется массив строк и указываем колво карт всё возможних.На 43 строке будет присвоения яцейке масиво по index
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }

        DeckShuffling (numberOfCards,random,deck);
        Display (players,cardsForPlayer,deck);
    }



    // deck shuffling
    static void DeckShuffling(int numberOfCards, Random random, String[] deck) {
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card]; //Сохраняет переменую deck[card] в temp.
            deck[card] = deck[i]; //Меняем местами
            deck[i] = temp; //Меняем местами
        }

    }
    // the shuffled deck is displayed
    static void Display (int players,int cardsForPlayer,String[] deck) {
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1) //Делим остаток
                System.out.println();
        }
    }

    static int Check (Scanner sc, int players,int cardsForPlayer,int numberOfCards) {
        if (sc.hasNextInt()) { //Проверает если ведоное с клавиотуры строка явлается number
            players = sc.nextInt(); //Переменая players принемает число ведоное с клавиотуры
            if (cardsForPlayer * players >= numberOfCards) { // Карты игроков * игроков >= Масиву карт
                if (players == 0) {
                    System.out.println("The game has been terminated.");

                } else if (players < 0) {
                    System.out.println("The number of players cannot be less than 0");
                } else {
                    System.out.println("Too many players!");
                }
            }
        } else {
            System.out.println("You have not entered a number, or your number is too large!");
        }
        return players;
    }


}