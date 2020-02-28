package com.joy.missyou.reflect;

/**
 * Created by SongLiang on 2019-12-19
 */
public class HeroFactory {

    public static ISkill getHero(String name) throws Exception {
        String classStr = "com.joy.missyou.reflect.hero."+name;
        Class<?> clazz = Class.forName(classStr);
        Object obj = clazz.newInstance();
        return (ISkill)obj;
    }

}
