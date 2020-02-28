package com.joy.missyou.reflect.hero;

import com.joy.missyou.reflect.ISkill;

/**
 * Created by SongLiang on 2019-12-19
 */
public class Miss implements ISkill {
    @Override
    public void q() {
        System.out.println("Miss q");
    }

    @Override
    public void w() {
        System.out.println("Miss w");
    }

    @Override
    public void e() {
        System.out.println("Miss e");
    }

    @Override
    public void r() {
        System.out.println("Miss r");
    }
}
