package org.brief.simplon;

public class StaticKeyWord {
    String name;



    static int numberOfFriends;



    StaticKeyWord(String name){

        this.name=name;

        numberOfFriends++;

    }

    static void desplayNumOfFriend(){
        System.out.println("you have "+ numberOfFriends + " friends.");
    }

}










