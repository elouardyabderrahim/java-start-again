package org.brief.simplon;

public class Main {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.

        //			The class "owns" the static member



        StaticKeyWord friend1 = new StaticKeyWord("Sponegbob");

        StaticKeyWord friend2 = new StaticKeyWord("Patrick");

        StaticKeyWord friend3 = new StaticKeyWord("Patrick");

        StaticKeyWord.desplayNumOfFriend();


        System.out.println(StaticKeyWord.numberOfFriends);
    }
}
