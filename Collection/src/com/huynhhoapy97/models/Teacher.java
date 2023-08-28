package com.huynhhoapy97.models;

public class Teacher implements Comparable<Teacher>{
    private Integer id;
    private String name;

    public Teacher() {
    }

    public Teacher(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.name.compareTo(o.name);
    }
}
