package com.joy.missyou.reflect;

import java.util.Scanner;

/**
 * Created by SongLiang on 2019-12-19
 */
public class TestHero {

    public static void main(String[] args) throws Exception {
        String name = TestHero.getHeroName();
        ISkill iSkill = HeroFactory.getHero(name);
        iSkill.q();
    }

    public static String getHeroName() {
        System.out.println("Please enter a hero: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
