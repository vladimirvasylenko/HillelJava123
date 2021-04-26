package com.hillel.lesson13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_3 extends Class_2{

    private List listInClass_3;
    private Set setInClass_3;
    private Map mapInClass_3;
    List<String> myList = new ArrayList<>();

//    public Class_3(List listInClass_1, Set setInClass_1, Map mapInClass_1, List listInClass_2, Set setInClass_2, Map mapInClass_2, List listInClass_3, Set setInClass_3, Map mapInClass_3) {
//        super(listInClass_1, setInClass_1, mapInClass_1, listInClass_2, setInClass_2, mapInClass_2);
//        this.listInClass_3 = listInClass_3;
//        this.setInClass_3 = setInClass_3;
//        this.mapInClass_3 = mapInClass_3;
//    }

    public List getListInClass_3() {
        return listInClass_3;
    }

    public void setListInClass_3(List listInClass_3) {
        this.listInClass_3 = listInClass_3;
    }

    public Set getSetInClass_3() {
        return setInClass_3;
    }

    public void setSetInClass_3(Set setInClass_3) {
        this.setInClass_3 = setInClass_3;
    }

    public Map getMapInClass_3() {
        return mapInClass_3;
    }

    public void setMapInClass_3(Map mapInClass_3) {
        this.mapInClass_3 = mapInClass_3;
    }

    @Override
    public String toString() {
        return super.toString() + "Class_3{" +
                "listInClass_3=" + listInClass_3 +
                ", setInClass_3=" + setInClass_3 +
                ", mapInClass_3=" + mapInClass_3 +
                '}';
    }
}
