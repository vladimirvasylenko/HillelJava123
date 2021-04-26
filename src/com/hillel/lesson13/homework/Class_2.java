package com.hillel.lesson13.homework;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_2 extends Class_1{

    private List listInClass_2;
    private Set setInClass_2;
    private Map mapInClass_2;

//    public Class_2(List listInClass_1, Set setInClass_1, Map mapInClass_1, List listInClass_2, Set setInClass_2, Map mapInClass_2) {
//        super(listInClass_1, setInClass_1, mapInClass_1);
//        this.listInClass_2 = listInClass_2;
//        this.setInClass_2 = setInClass_2;
//        this.mapInClass_2 = mapInClass_2;
//    }

    public List getListInClass_2() {
        return listInClass_2;
    }

    public void setListInClass_2(List listInClass_2) {
        this.listInClass_2 = listInClass_2;
    }

    public Set getSetInClass_2() {
        return setInClass_2;
    }

    public void setSetInClass_2(Set setInClass_2) {
        this.setInClass_2 = setInClass_2;
    }

    public Map getMapInClass_2() {
        return mapInClass_2;
    }

    public void setMapInClass_2(Map mapInClass_2) {
        this.mapInClass_2 = mapInClass_2;
    }

    @Override
    public String toString() {
        return super.toString() + "Class_2{" +
                "listInClass_2=" + listInClass_2 +
                ", setInClass_2=" + setInClass_2 +
                ", mapInClass_2=" + mapInClass_2 +
                '}';
    }
}
