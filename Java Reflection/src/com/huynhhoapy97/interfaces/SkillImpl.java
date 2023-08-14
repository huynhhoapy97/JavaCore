package com.huynhhoapy97.interfaces;

public class SkillImpl implements Skill{
    @Override
    public void doFightSkill() {
        System.out.println("===> FIGHT FROM CLASS Impl");
    }

    @Override
    public void doSupportSkill() {
        System.out.println("===> SUPPORT FROM CLASS Impl");
    }
}
