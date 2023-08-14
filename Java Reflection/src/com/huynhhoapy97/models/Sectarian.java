package com.huynhhoapy97.models;

import com.huynhhoapy97.interfaces.Skill;

import java.util.Random;

public class Sectarian extends Character implements Skill {
    private String name;

    @Override
    public void doFightSkill() {
        System.out.println("===> SKILL FIGHT");
    }

    @Override
    public void doSupportSkill() {
        System.out.println("===> SKILL SUPPORT");
    }

    @Override
    public double getLevelPoints() {
        return new Random().nextDouble();
    }
}
