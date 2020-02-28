package com.joy.missyou.reflect.hero;

import com.joy.missyou.reflect.ISkill;

/**
 * Created by SongLiang on 2019-12-19
 */
public class GaiLun implements ISkill {
    @Override
    public void q() {
        System.out.println("GaiLun q");
    }

    @Override
    public void w() {
        System.out.println("GaiLun w");
    }

    @Override
    public void e() {
        System.out.println("GaiLun e");
    }

    @Override
    public void r() {
        System.out.println("GaiLun r");
    }
}
