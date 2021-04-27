package com.hillel.lesson13.homework;

import com.hillel.lesson12.classwork.ObjectExample;

import java.util.*;

public class Class_1 {

    private List listInClass_1;
    private Set setInClass_1;
    private Map mapInClass_1;

    public List getListInClass_1() {
        return listInClass_1;
    }

    public void setListInClass_1(List listInClass_1) {
        this.listInClass_1 = listInClass_1;
    }

    public Set getSetInClass_1() {
        return setInClass_1;
    }

    public void setSetInClass_1(Set setInClass_1) {
        this.setInClass_1 = setInClass_1;
    }

    public Map getMapInClass_1() {
        return mapInClass_1;
    }

    public void setMapInClass_1(Map mapInClass_1) {
        this.mapInClass_1 = mapInClass_1;
    }

    @Override
    public String toString() {
        return "Class_1{" +
                "listInClass_1=" + listInClass_1 +
                ", setInClass_1=" + setInClass_1 +
                ", mapInClass_1=" + mapInClass_1 +
                '}';
    }
}
