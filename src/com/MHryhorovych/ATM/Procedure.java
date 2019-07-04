package com.MHryhorovych.ATM;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor Maksym Hryhorovych
 */

public class Procedure {
    static Notes notes = new Notes();
    static InputAmount input = new InputAmount();

    public Procedure() {

    }

    static void calculate() {

        List<Integer> list = new ArrayList<>();

        while (input.getAmount() != 0) {
            int result500 = InputAmount.getAmount() % notes.getBanknoteFaceValue500();
            list.add(result500);
            int notes500 = input.amount / notes.BANKNOTE_FACE_VALUE_500;
            System.out.println("500 denominations necessary: " + notes500);
            //-----------------------------------------------

            int result200 = result500 % notes.getBanknoteFaceValue200();
            list.add(result200);
            int note200 = (input.amount - notes500 * notes.getBanknoteFaceValue500())
                    /
                    notes.BANKNOTE_FACE_VALUE_200;
            System.out.println("200 denominations necessary: " + note200);
            //-----------------------------------------------

            int result100 = result200 % notes.getBanknoteFaceValue100();
            list.add(result100);
            int note100 = (input.amount - notes500 * notes.getBanknoteFaceValue500()
                    -
                    note200 * notes.getBanknoteFaceValue200())
                    /
                    notes.getBanknoteFaceValue100();

            System.out.println("100 denominations necessary: " + note100);
            //-----------------------------------------------

            int result50 = result100 % notes.getBanknoteFaceValue50();
            list.add(result50);
            int note50 = (input.amount - notes500 * notes.getBanknoteFaceValue500()
                    -
                    note200 * notes.getBanknoteFaceValue200()
                    -
                    note100 * notes.getBanknoteFaceValue100())
                    /
                    notes.getBanknoteFaceValue50();

            System.out.println("50 denominations necessary: " + note50);
            //-----------------------------------------------

            int result20 = result50 % notes.getBanknoteFaceValue20();
            list.add(result20);
            int note20 = (input.amount - notes500 * notes.getBanknoteFaceValue500()
                    -
                    note200 * notes.getBanknoteFaceValue200()
                    -
                    note100 * notes.getBanknoteFaceValue100()
                    -
                    note50 * notes.getBanknoteFaceValue50())
                    /
                    notes.getBanknoteFaceValue20();

            System.out.println("20 denominations necessary: " + note20);
            //-----------------------------------------------

            int result10 = result20 % notes.getBanknoteFaceValue10();
            list.add(result10);
            int note10 = (input.amount - notes500 * notes.getBanknoteFaceValue500()
                    -
                    note200 * notes.getBanknoteFaceValue200()
                    -
                    note100 * notes.getBanknoteFaceValue100()
                    -
                    note50 * notes.getBanknoteFaceValue50()
                    -
                    note20 * notes.getBanknoteFaceValue20())
                    /
                    notes.getBanknoteFaceValue10();
            System.out.println("10 denominations necessary: " + note10);
            //-----------------------------------------------

            int result5 = result10 % notes.getBanknoteFaceValue5();
            list.add(result5);
            int note5 = (input.amount - notes500 * notes.getBanknoteFaceValue500()
                    -
                    note200 * notes.getBanknoteFaceValue200()
                    -
                    note100 * notes.getBanknoteFaceValue100()
                    -
                    note50 * notes.getBanknoteFaceValue50()
                    -
                    note20 * notes.getBanknoteFaceValue20()
                    -
                    note10 * notes.getBanknoteFaceValue10())
                    /
                    notes.getBanknoteFaceValue5();
            System.out.println("5 denominations necessary: " + note5);
            //-----------------------------------------------

            int result2 = result5 % notes.getBanknoteFaceValue2();
            list.add(result2);
            int note2 = (input.amount - notes500 * notes.getBanknoteFaceValue500()
                    -
                    note200 * notes.getBanknoteFaceValue200()
                    -
                    note100 * notes.getBanknoteFaceValue100()
                    -
                    note50 * notes.getBanknoteFaceValue50()
                    -
                    note20 * notes.getBanknoteFaceValue20()
                    -
                    note10 * notes.getBanknoteFaceValue10()
                    -
                    note5 * notes.getBanknoteFaceValue5())
                    /
                    notes.getBanknoteFaceValue2();
            System.out.println("2 denominations necessary: " + note2);
            //-----------------------------------------------

            int result1 = result2 % notes.getBanknoteFaceValue1();
            list.add(result1);
            int note1 = (input.amount - notes500 * notes.getBanknoteFaceValue500()
                    -
                    note200 * notes.getBanknoteFaceValue200()
                    -
                    note100 * notes.getBanknoteFaceValue100()
                    -
                    note50 * notes.getBanknoteFaceValue50()
                    -
                    note20 * notes.getBanknoteFaceValue20()
                    -
                    note10 * notes.getBanknoteFaceValue10()
                    -
                    note5 * notes.getBanknoteFaceValue5()
                    -
                    note2 * notes.getBanknoteFaceValue2())
                    /
                    notes.getBanknoteFaceValue1();
            System.out.println("1 denominations necessary: " + note1);
            //-----------------------------------------------
            break;

        }
    }
}



